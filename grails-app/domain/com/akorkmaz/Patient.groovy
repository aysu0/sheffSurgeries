package com.akorkmaz

class Patient extends Person{

	String patientAddress
	String patientResidence
	Date patientDob
	String patientID
	Date dateRegistered 

	

	
	
    static constraints = {
 	patientAddress()
	patientResidence()
	patientDob()
	patientID()
	dateRegistered()
    }
    
    static hasMany = [prescriptions:Prescription, appointments:Appointment, surgeries:Surgery]
}
