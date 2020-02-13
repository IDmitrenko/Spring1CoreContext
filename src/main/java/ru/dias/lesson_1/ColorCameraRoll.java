package ru.dias.lesson_1;

import org.springframework.stereotype.Component;

import java.util.Random;

//@Component("ColorCameraRoll")
public class ColorCameraRoll implements ICameraRoll {
    Integer res = 0;
    Random random = new Random();

    public ColorCameraRoll() {
        res = random.nextInt();
    }

    public void processing() {
        System.out.println("-1 цветной кадр!");
        System.out.println(res);
    }
}
