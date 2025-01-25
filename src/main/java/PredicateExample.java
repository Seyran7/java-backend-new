import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.Scanner;

public class PredicateExample {
    public static void main(String[] args) {
        //input
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number for arrays size: ");
        List<Integer> numbers = new ArrayList<>();
        Predicate<Integer> evenNumbers = arr -> arr % 2 == 0;
        int n= scan.nextInt();

        System.out.println("Enter numbers to fill up array: ");
        for(int i=0;i<n;i++){
            numbers.add(scan.nextInt());
        }

        for (Integer number : numbers) {
            if (evenNumbers.test(number)) {

                System.out.print(number+" ");
            }
        }
    }
}


