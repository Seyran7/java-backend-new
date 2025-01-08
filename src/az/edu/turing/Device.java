package az.edu.turing;

public abstract class Device {

    public enum DeviceType {LIGHT, THERMOSTAT, CAMERA, DOORBELL}

    private int id;
    private String name;
    private boolean status;
    private Device deviceType;

    public Device(int id, String name, boolean status, Device deviceType) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.deviceType = deviceType;
    }

    public void turnOn() {

    }

    public void turnOff() {

    }

    public boolean getStatus(boolean status) {

        return status;
    }

    public String getName(String name) {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    public int getId(int id) {
        return id;
    }

}
