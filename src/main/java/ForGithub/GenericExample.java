package ForGithub;

public class GenericExample <T> {
    private T value;
    private T things;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getThings() {
        return things;
    }

    public void setThings(T things) {
        this.things = things;
    }

    public GenericExample(T value, T things) {
        this.value = value;
        this.things = things;
    }



    //public  Integer price(T input) {
      //  return input;

    //}
}
