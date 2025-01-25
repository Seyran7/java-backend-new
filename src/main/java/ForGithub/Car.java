package ForGithub;

public class Car implements Comparable<Car> {
    int year;
    String model;
    public Car(int year,String model){
        this.year=year;
        this.model=model;
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }
}
