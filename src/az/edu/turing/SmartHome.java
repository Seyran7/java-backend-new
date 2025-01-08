package az.edu.turing;

import java.util.ArrayList;

public class SmartHome implements Manageable{

    private ArrayList<User> users;
    private ArrayList<Device> devices;

    public SmartHome() {
        this.users = new ArrayList<>();
        this.devices = new ArrayList<>();

    }

    public void addUser(User user) {
        users.add(user);

    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void addDevice(Device device) {
        devices.add(device);

    }

    public void removeDevice(Device device) {
        devices.remove(device);

    }

    public Device getDeviceStatus(int id) {
        for (Device device : devices) {
            if (device.getId(id) == id) {
                return device;
            }
        }
        return null;
    }
}
