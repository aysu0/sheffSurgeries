package appointmentsystem

class BootStrap {

    def init = { servletContext ->
    def Surgery1 = new com.akorkmaz.Surgery
    (
        name: 'George Medical Centre',
        address: '23 George Street, Sheffield',
        postcode: 'S6 3YU',
        telephone: '0114 346 7129',
        numberOfPatients: 120,
        description: 'Your health, our priority',
        openingTime: '07:00 - 18:00',
        registeringNewPatients: true 
    ).save()

    def Doctor1 = new com.akorkmaz.Doctor
    (   
        name: 'Mila Patel',
        email: 'mila.patel83@gmail.com',
        phone: '07456382910',
        qualifications: 'BSc Medicine',
        position: 'Doctor',
        password: 'HJ12jes',
        doctorOffice: 'A-12',
        bio: 'I am a doctor at George Medical Centre',
        surgery: Surgery1
    ).save() 

    def Patient1 = new com.akorkmaz.Patient
    (   
        name: 'Samantha Lee', 
        phone: '0114 673 8290',
        patientAddress: '16 Tan Crescent',
        patientResidence: 'Holly Building',
        patientDob: '1999-02-16',
        patientID: '1254',
        dateRegistered: '2022-12-21',
        surgery: Surgery1
    ).save()

    def Appointment1 = new com.akorkmaz.Appointment
    (
        appDateTime: new Date (2023-1900,11,20,15,0,0),
        appDuration: 5,
        roomNumber: 'A-13',
        surgery: Surgery1,
        doctor: Doctor1,
        patient: Patient1
    ).save()

    def Nurse1 = new com.akorkmaz.Nurse
    (
        name: 'Ryan Davis',
        email: 'ryandavis94@gmail.com',
        phone: '02078564932',
        qualifications: 'BSc Nursing',
        nurseOffice: 'A-14',
        surgery: Surgery1
    ).save()
    


    def Prescription1 = new com.akorkmaz.Prescription
    (
        pharmacyName: 'Mophel Pharmacy',
        prescripNumber: 12,
        medicine: 'Ibuprofen',
        daysSupply: 7,
        totalCost: 13,
        dateIssued: '2023-07-23',
        patientPaying: true,
        doctor: Doctor1,
        patient: Patient1
    ).save()

    def Receptionist1 = new com.akorkmaz.Receptionist
    (
        name: 'Angela Wilson',
        email: 'angela.wilson_82@hotmail.com',
        phone: '07496382910',
        receptionistUsername: 'Angela12',
        receptionistPassword: 'AngelAngela01928',
        surgery: Surgery1
    ).save()
        


    
    def Surgery2 = new com.akorkmaz.Surgery
    (
        name: 'Vitality Medical Centre',
        address: '12 Station Road, Manchester',
        postcode: 'M12 6PL',
        telephone: '0161 555 1234',
        numberOfPatients: 150,
        description: 'Healthier tomorrow starts with us today',
        openingTime: '07:00 - 18:00',
        registeringNewPatients: true 
    ).save()

    
    def Doctor2 = new com.akorkmaz.Doctor
    (   
        name: 'Ava Thompson',
        email: 'ava.thompson@vitality.com',
        phone: '020 7634 2891',
        qualifications: 'MBChB Bachelor of Medicine and Surgery',
        position: 'Doctor',
        password: 'A4a7h0mp50n!',
        doctorOffice: 'A-17',
        bio: 'Dr. Ava Thompson is a renowned cardiologist with over 20 years of experience.',
        surgery: Surgery2
    ).save() 



    def Patient2 = new com.akorkmaz.Patient
    (
        name: 'Hans Muller',
        phone: '07632297988',
        patientAddress: '25 Park Lane, Millfield',
        patientResidence: 'London',
        patientDob: '1988-02-12',
        patientID: '1934',
        dateRegistered: '2020-05-16',
        surgery: Surgery2
    ).save()

    def Appointment2 = new com.akorkmaz.Appointment
    (
        appDateTime: new Date (2023-1900,11,20,15,0,0),
        appDuration: 6,
        roomNumber: 'A-11',
        surgery: Surgery2,
        doctor: Doctor2,
        patient: Patient2
    ).save()

    def Nurse2 = new com.akorkmaz.Nurse
    (   
        name: 'Ali Park',
        email: 'ali.park@vitality.com',
        phone: '0207 123 2125',
        qualifications: 'BSc Nursing',
        nurseOffice: 'A-10',
        surgery: Surgery2
    ).save()
    


    def Prescription2 = new com.akorkmaz.Prescription
    (
        pharmacyName: 'Medi-Plus Pharmacy',
        prescripNumber: 11,
        medicine: 'RelivaMax',
        daysSupply: 11,
        totalCost: 20,
        dateIssued: '2021-12-18',
        patientPaying: true,
        doctor: Doctor2,
        patient: Patient2
    ).save()

    def Receptionist2 = new com.akorkmaz.Receptionist
    (   
        name: 'Yasmine Khalil',
        email: 'yasmine.khalil@vitality.com',
        phone: '0207 387 9812',
        receptionistUsername: 'JennieWhite87',
        receptionistPassword: 'JenJ3n4312',
        surgery: Surgery2
    ).save() 

 
    }
    def destroy = {
    }
}
