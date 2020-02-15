package ru.dias.visitingapolyclinic;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Doctor implements IDoctor {

    private String name;

    public Doctor() {
    }

    public Doctor(String name) {
        this.name = name;
    }

    @Override
    public void accept(IPatientCard card) {
        System.out.println(name + " принял посетителя " + card.getPatient().getFirstName());
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
