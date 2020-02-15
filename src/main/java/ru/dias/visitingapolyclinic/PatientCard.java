package ru.dias.visitingapolyclinic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class PatientCard implements IPatientCard{

    private String adress;

    private Patient patient;

    public PatientCard() {
    }

    public PatientCard(Patient patient, String adress) {
        this.patient = patient;
        this.adress = adress;
    }

    @Override
    public Patient getPatient() {
        return patient;
    }

    @Autowired
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}
