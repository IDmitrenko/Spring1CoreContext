package ru.dias.visitingapolyclinic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.dias.visitingapolyclinic.IDoctor;

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
    public void accept() {
        System.out.println(name + " принял посетителя!");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
