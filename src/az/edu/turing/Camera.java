package az.edu.turing;

public class Camera extends Device {
    public Camera(int id, String name, boolean status, Device deviceType) {
        super(id, name, status, deviceType);
    }

    @Override
    public void turnOn(){
        System.out.println("az.edu.turing.Camera is turned on.");
    }
    @Override
    public void turnOff(){
        System.out.println("az.edu.turing.Camera is turned  off.");
    }
    public void startRecording(){
        System.out.println("Started video recording.");
    }
    public void stopRecording(){
        System.out.println("Stopped video recording.");
    }
}
