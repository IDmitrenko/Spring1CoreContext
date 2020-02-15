package ru.dias.visitingapolyclinic;

public interface IDoctor {
    void accept(IPatientCard card);
    String getName();
}
