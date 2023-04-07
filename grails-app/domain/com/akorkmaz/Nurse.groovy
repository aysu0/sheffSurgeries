package com.akorkmaz

class Nurse extends Worker {
	
	String qualifications
	String nurseOffice
	
	
    static constraints = {
 	qualifications()
 	nurseOffice()
    }
    
    static hasMany = [doctors:Doctor]

}
