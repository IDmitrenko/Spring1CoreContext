package ru.dias.visitingapolyclinic;

public interface IRegistry {

    IPatientCard serpCard(String firstName, String lastName);

    ICabinet chooseCabinet(String doctor);

}
