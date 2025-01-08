package az.edu.turing;

public class Doorbell extends Device{

    public Doorbell(int id, String name, boolean status, Device deviceType) {
        super(id, name, status, deviceType);
    }
    @Override
    public void turnOn(){
        System.out.println(" Turned the doorbell on.");
    }
    @Override
    public void turnOff(){
        System.out.println("Turned the doorbell off.");
    }
    public void ring(){
        System.out.println("az.edu.turing.Doorbell rings.");
    }
}
