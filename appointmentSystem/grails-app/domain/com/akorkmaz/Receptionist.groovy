package com.akorkmaz

class Receptionist extends Worker {

	String receptionistUsername
	String receptionistPassword
	

	
    static constraints = {
 	receptionistUsername size: 5..20
 	receptionistPassword size: 5..50
    }
    

}
