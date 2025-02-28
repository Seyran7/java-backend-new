import java.util.ArrayList;
import java.util.List;

public class ArrayApp {
    public static void main(String[] args) {


        List<Integer> list1 = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        for (int i = 1; i <=list1.size(); i++) {
            if(list1.get(i)%2==0){
                System.err.print(list1.get(i)*2+" ");
            }
        }
            list1.stream().filter(element->element%2==0).map(element->element*2).forEach(System.err::println);;
        }

    }