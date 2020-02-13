package ru.dias.lesson_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("camera")
public class Camera implements ICamera {
    private ICameraRoll cameraRoll;

    @Autowired
//    @Qualifier("ColorCameraRoll")
    public void setCameraRoll(ICameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        System.out.println("Щелк!");
        cameraRoll.processing();
    }
}
