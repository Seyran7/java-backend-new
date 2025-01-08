package az.edu.turing;

public class Thermostat extends Device {
    public Thermostat(int id, String name, boolean status, Device deviceType) {
        super(id, name, status, deviceType);
    }
    @Override
    public void  turnOn(){
        System.out.println("az.edu.turing.Thermostat turn on.");
    }
    @Override
    public void turnOff(){
        System.out.println("az.edu.turing.Thermostat turn off.");
    }
    public void setTemperature(int temperature){
        System.out.println("Temperature is"+ temperature+ "C");
    }
}
