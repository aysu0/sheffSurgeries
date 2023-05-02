package com.akorkmaz

class Doctor extends Worker {
	
	String qualifications
	String position 
	String password
	String doctorOffice
	String bio 
	

	
	
    static constraints = {
    	position()
    	password()
    	doctorOffice()
    	qualifications()
    	bio()
    }
    
    static hasMany=[prescriptions:Prescription, appointments:Appointment, nurses:Nurse]
    static belongsTo= Nurse
    
}
