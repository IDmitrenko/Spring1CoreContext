package ru.dias.visitingapolyclinic;

public interface IRegistry {

    PatientCard serpCard(String firstName, String lastName);

    Cabinet chooseCabinet(String doctor);

}
