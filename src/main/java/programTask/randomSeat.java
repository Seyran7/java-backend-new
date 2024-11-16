package programTask;

import java.util.Random;

public class randomSeat {
    public static void main(String[] args) {


        String[] students = {"Rəvan Agayev", "Gülər Əbilova", "Yetər Nəbiyeva", "Mirzəyeva Dilbər", "Ruslan Çərkəzov",
                "Sənubər Abbasova", "Fəxri Babayev", "Lalə Həmidova", "Günay İskəndərova", "Ramina Səlimova",
                "Tural Nəzərov", "Rəvan Əliyev", "İbrahim Ələkbərov", "Ella Piriyeva", "Aynur Məmmədova",
                "Ömər Ələkbərov", "Famil Məmmədov", "Rena Mehdiyeva", "ƏliMurad", "Seyran Xəlilzadə",
                "Hüseynov Məhəmməd", "Pərvin Bədəlova", "Nicat Məcidov"};


        Random rand = new Random();
        for (int i = 0; i < students.length; i++) {
            int RandomSeat = rand.nextInt(students.length);

            String temp = students[i];
            students[i] = students[RandomSeat];
            students[RandomSeat] = temp;
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ": " + students[i]);

        }
    }
}






