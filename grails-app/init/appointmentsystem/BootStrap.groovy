package appointmentsystem

class BootStrap {

    def init = { servletContext ->
    
    println "runbootstrap"
    
    def Worker = new com.akorkmaz.Worker
    (
        email: 'lindahayne@gmail.com'
    ).save()

    def Surgery = new com.akorkmaz.Surgery
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

    def Doctor = new com.akorkmaz.Doctor
    (   

        qualifications: 'BSc Medicine',
        position: 'Doctor',
        password: 'HJ12jes',
        doctorOffice: 'A-12',
        bio: 'I am a doctor at George Medical Centre'
    ).save() 

    def Person = new com.akorkmaz.Person
    (
        name: 'Linda Hayne',
        phone:'07843754622'
    ).save()

    def Appointment = new com.akorkmaz.Appointment
    (
        appDateTime: '25/07/2023',
        appDuration: 5,
        roomNumber: 'A-13'
    ).save()

    def Nurse = new com.akorkmaz.Nurse
    (
        qualifications: 'BSc Nursing',
        nurseOffice: 'A-14'
    ).save()
    
    def Patient = new com.akorkmaz.Patient
    (
        patientAddress: '16 Tan Crescent',
        patientResidence: 'Holly Building',
        patientDob: '16/02/1999',
        patientID: '1254',
        dateRegistered: '13/12/2022'
    ).save()

    def Prescription = new com.akorkmaz.Prescription
    (
        pharmacyName: 'Mophel Pharmacy',
        prescripNumber: 12,
        medicine: 'Ibuprofen',
        daysSupply: 7,
        totalCost: 13,
        dateIssued: '25/07/2023',
        patientPaying: true
    ).save()

    def Receptionist = new com.akorkmaz.Receptionist
    (
        receptionistUsername: 'Angela12',
        receptionistPassword: 'AngelAngela01928'
    ).save()


    }

    def destroy = {
    }
}
