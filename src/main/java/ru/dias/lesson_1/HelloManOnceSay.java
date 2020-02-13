package ru.dias.lesson_1;

import org.springframework.beans.factory.annotation.Value;
import ru.dias.lesson_1.HelloMan;

//@Component
public class HelloManOnceSay implements HelloMan {

    @Value("Jorick")
    private String name;

    public HelloManOnceSay(String name) {
        this.name = name;
    }

    @Override
    public void helloSay() {
        System.out.println("Hello " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
