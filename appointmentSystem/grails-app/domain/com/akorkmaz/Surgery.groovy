package com.akorkmaz

class Surgery {
	
	String name 
	String address
	String postcode
	String telephone
	int numberOfPatients
	String description
	String openingTime
	boolean registeringNewPatients
	
	String toString()
	{
		return name 
	}
	
    static constraints = {
 	name()
 	address()
 	postcode()
 	telephone()
 	numberOfPatients(min: 1)
 	description()
 	openingTime()
 	registeringNewPatients()
    }
    
    static belongsTo = Patient
    
    static hasMany= [patients:Patient, appointments:Appointment, workers:Worker]


}
