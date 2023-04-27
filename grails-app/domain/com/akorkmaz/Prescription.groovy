package com.akorkmaz

class Prescription {
	
	String pharmacyName
	int prescripNumber
	String medicine
	int daysSupply
	double totalCost 
	Date dateIssued
	boolean patientPaying
	
	String toString()
	{
		return prescripNumber
	}
	
    static constraints = {
    	prescripNumber(unique: true)
    	pharmacyName()
    	medicine()
    	daysSupply()
		totalCost()
		dateIssued()
		patientPaying()
    }
    
    static hasOne = [doctor:Doctor, patient:Patient]
    
}
