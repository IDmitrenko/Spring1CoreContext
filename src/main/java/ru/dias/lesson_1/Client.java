package ru.dias.lesson_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
//        CameraClient client = new CameraClient();
//        Camera camera = client.getCamera();
//        camera.doPhotograph();

//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        ICamera camera1 = context.getBean("camera", ICamera.class);
//        camera1.doPhotograph();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ICamera camera1 = context.getBean("camera", ICamera.class);
        camera1.doPhotograph();

        ICamera camera2 = context.getBean("camera", ICamera.class);
        camera2.doPhotograph();

//          ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//          HelloMan hm = context.getBean("helloman", HelloMan.class);
//         // hm.setName("Vaska");
//          hm.helloSay();


//        ICamera camera2 = context.getBean("camera", ICamera.class);
//        camera2.doPhotograph();
    }
}
