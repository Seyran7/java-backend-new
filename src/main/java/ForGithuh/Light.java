public class Light extends Device {
    public Light(int id, String name, boolean status, Device deviceType) {
        super(id, name, status, deviceType);
    }

    public void turnOn(){
        System.out.println(" Turns the light on.");
    }

    public void turnOff(){
        System.out.println(" Turns the light off.");
    }
}
