package com.akorkmaz

class Receptionist extends Worker {

	String receptionistUsername
	String receptionistPassword
	

	
    static constraints = {
 	receptionistUsername()
 	receptionistPassword()
    }
    

}
