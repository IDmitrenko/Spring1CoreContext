package ru.dias.lesson_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.dias.lesson_1")
public class AppConfig {
//    @Bean(name = "cameraRoll")
//    public ICameraRoll cameraRoll() {
//        return new ColorCameraRoll();
//    }
//
//    @Bean(name = "camera")
//    public ICamera camera(ICameraRoll cameraRoll) {
//        Camera camera = new Camera();
//        camera.setCameraRoll(cameraRoll);
//        return camera;
//    }
}