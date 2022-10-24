package com.amusementBookingApplication.Pojos;

public class FieldName {
	
	String field = "dateTime";
	String field1 = "customer";
	
	@Override
	public String toString() {
		return "FieldName [field=" + field + ", field1=" + field1 + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}
	
	
	
	
	
}
