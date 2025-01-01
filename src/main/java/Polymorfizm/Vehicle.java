package Polymorfizm;

public class Vehicle {

        private String name;
        private String colour;
        private int year;

        public Vehicle(String name,String colour,int year) {
            this.name = name;
         //   this.calour = calour;
            this.year = year;
        }
            public String getName() {
                return name;
            }
            public void setName(String name){
            this.name=name;
    }
}
