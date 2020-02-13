package ru.dias.lesson_1;

public class CameraClient {
    public Camera getCamera() {
        Camera camera = new Camera();
        ICameraRoll cameraRoll = new BlackAndWhiteCameraRoll();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }
}
