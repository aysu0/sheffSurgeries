package com.akorkmaz

class Appointment {
	
	Date appDateTime 
	int appDuration
	String roomNumber 
	
	String toString() 
	{ return appDateTime } 
	
    static constraints = {
    	appDuration()
    	roomNumber()
    	appDateTime()
    }
	static hasOne = [surgery: Surgery, doctor: Doctor, patient: Patient]
}

