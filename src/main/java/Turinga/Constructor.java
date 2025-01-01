package Turinga;

public class Constructor {
    private int id;
    int age;
    String Surname;

    public  Constructor(int id, int age, String Surname) {
        this.id = id;
        this.age = age;
        this.Surname = Surname;
    }
    public int getId(){
        return id;
    }
    public void setId( int id){
       this.id=id;
    }


        @Override
                public String toString(){
            return "id: "+id+"\n"+"age: "+age+"\n"+"Surname: "+Surname;

    }
}