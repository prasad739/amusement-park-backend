package com.amusementBookingApplication.Service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.amusementBookingApplication.Dto.LoginDto;
import com.amusementBookingApplication.Dto.LoginResponseDto;
import com.amusementBookingApplication.Entity.Login;
import com.amusementBookingApplication.Exception.EmailNotFoundException;
import com.amusementBookingApplication.Exception.InvalidCredentialsException;
import com.amusementBookingApplication.Exception.PasswordNotSameException;
import com.amusementBookingApplication.Exception.UserAlreadyLogInException;
import com.amusementBookingApplication.Pojos.LoginUpdate;
import com.amusementBookingApplication.Repository.ILoginRepository;


@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private ILoginRepository loginRepo;
	
	@SuppressWarnings("unused")
	//login Method
	@Override
	public LoginResponseDto login(LoginDto loginDto) throws InvalidCredentialsException, PasswordNotSameException {
		Optional<Login> dbLoginOpt = loginRepo.findByLoginEmail(loginDto.getLoginEmail());
		
		// compare database email with user provided email
		
		if (dbLoginOpt.isPresent()) {
			Login log = dbLoginOpt.get();
			
			//checks whether the user is already logged in or not
			
			if(log.isLoggedIn()==false) {
					if (log.getLoginPassword().equals(loginDto.getLoginPassword())) {
					    
					// if credentials matches, set loggedIn flag as true and save
						
						log.setLoggedIn(true);
						Login updatedLogin = loginRepo.save(log);
						LoginResponseDto resDto = new LoginResponseDto();
						resDto.setEmail(log.getLoginEmail());
						resDto.setLoggedIn(log.isLoggedIn());
						log.setLoggedIn(true);
						return resDto;
					}
					else {
						//throw exception if the given password is not present in the database
						throw new InvalidCredentialsException("Incorrect Password");
					}
			}
			else {
				// throw exception if already user logged in 
				throw new UserAlreadyLogInException("User Already logged in");
			}
					
		}
		
		else {
			// throw exception if given email not present in the database.
			throw new InvalidCredentialsException("User not found with email: "+loginDto.getLoginEmail());
		}
	}
	
	
	
	
		@SuppressWarnings("unused")
		@Override
		//Logout method
		public LoginResponseDto logout(String email) throws EmailNotFoundException {
			Optional<Login> dbLoginOpt = loginRepo.findByLoginEmail(email);
			
			//checks whether the email exists in the database or not
			
			if(dbLoginOpt.isPresent()) {
				Login login = dbLoginOpt.get();
				
				// Update flag to false and save
				
				login.setLoggedIn(false);
				
				// update isLoggedIn flag as false and save
				
				Login updatedLogin = loginRepo.save(login);
				
				// Convert Login obj to LoginRespDto
				
				LoginResponseDto resDto = new LoginResponseDto();
				resDto.setEmail(email);
				resDto.setLoggedIn(false);
				
				// return LoginRespDto object
				
				return resDto;
			}
			else {
				throw new EmailNotFoundException("User not found with email: "+email);
			}
		}
	
		
		@Override
		//Login update method
		public Login updateLogIn(LoginUpdate log) {
			Optional<Login> l1 = loginRepo.findById(log.getUpdateId());
			if(l1.isPresent()) {
				Login l2 = l1.get();
				l2.setId(log.getUpdateId());
				l2.setLoginEmail(log.getEmail());
				l2.setLoginPassword(log.getPassword());
				return loginRepo.save(l2);
			}else {
				throw new InvalidCredentialsException("User not found with that id");
			}
		}
		
		
		
		
		
		
		
		

}
