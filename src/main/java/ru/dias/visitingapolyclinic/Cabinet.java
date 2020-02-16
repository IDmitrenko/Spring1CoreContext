package ru.dias.visitingapolyclinic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Cabinet implements ICabinet {

    private int number;

    @Autowired
    private IDoctor doctor;

    public Cabinet(int number, IDoctor doctor) {
        this.number = number;
        this.doctor = doctor;
    }

    public Cabinet() {
    }

    @Override
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public IDoctor getDoctor() {
        return doctor;
    }

    public void setDoctor(IDoctor doctor) {
        this.doctor = doctor;
    }
}
