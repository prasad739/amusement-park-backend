package com.amusementBookingApplication.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.amusementBookingApplication.Entity.Activity;
import com.amusementBookingApplication.Exception.ActivityAlreadyExistsException;
import com.amusementBookingApplication.Exception.NoSuchActivityExistsException;
import com.amusementBookingApplication.Exception.NoSuchIdExistsException;
import com.amusementBookingApplication.Exception.ZeroChargeException;
import com.amusementBookingApplication.Repository.IActivityRepository;


@Service
public class ActivityServiceImpl implements ActivityService{

	@Autowired
	private IActivityRepository activityRepo;
	
	 public Activity addActivity(Activity activity) {
		Activity existingActivity = activityRepo.findById(activity.getActivityId()).orElse(null);
		if(existingActivity==null) {
			return activityRepo.save(activity);
		}
		else {
			throw new ActivityAlreadyExistsException("Activity already exists!");
		}
	} 
	
	 
	public Activity updateActivity(Activity activity,int id) {
		Activity existingActivity2 = activityRepo.findById(activity.getActivityId()).orElse(null);
		if(existingActivity2==null) {
			throw new NoSuchActivityExistsException("No such Activity  exists");
		}
		else {
			existingActivity2.setCharges(activity.getCharges());
			existingActivity2.setDescription(activity.getDescription());
			return activityRepo.save(existingActivity2);
		} 
	}
	
	@Override
	public String deleteActivity(int id) {
		Activity ac = activityRepo.findById(id).orElse(null);
		   if(ac==null) {
			throw new NoSuchIdExistsException("No such Id exists");
		}
		else {
			activityRepo.delete(ac);
			return "Activity Delated Successfully";
		}
	}
	
	
	@Override
	public List<Activity> viewActivitiesOfCharges(float charges) {
		if(charges != 0) {
			List<Activity> ac= (List<Activity>) activityRepo.findAll();
			List<Activity> act = new ArrayList<>();
			for(Activity a: ac) {
				if(a.getCharges()==charges) {
					act.add(a);
				}
			}
			return act;
		}else {
			throw new ZeroChargeException("Enter a Non-Zero value for charges");
		}
	}
	
	@Override
	public int countActivitiesOfCharges(float charges) {
		if(charges != 0) {
			List<Activity> ac= (List<Activity>) activityRepo.findAll();
			List<Activity> act = new ArrayList<>();
			for(Activity a: ac) {
				if(a.getCharges()==charges) {
					act.add(a);
				}
			}
			return act.size();
		}else {
			throw new ZeroChargeException("Enter a Non-Zero value for charges");
		}
	}


	@Override
    public List<Activity> viewAllActivities() {
        return (List<Activity>) activityRepo.findAll();
    }

	
	@Override
    public Activity getActivity(int id) {
        Optional<Activity> act = activityRepo.findById(id);
        if(act.isPresent()) {
            Activity viewActivity=act.get();
            activityRepo.findById(id);
            return viewActivity;
        }
        else {
            throw new NoSuchActivityExistsException("Activity not Found with the given ID: "+id);
        }
    }	

}
	
	
