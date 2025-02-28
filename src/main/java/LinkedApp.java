import java.util.LinkedList;
import java.util.List;

import static javax.print.attribute.standard.MediaSizeName.A;

public class LinkedApp {
    public static void main(String[] args) {
        List<String> names=List.of("Senuber","Tural","Aynur","Rena","Ibrahim","Eli","Fexri","Yeter","Dilber","Lale","Seyran");

        names.stream().filter(element->element.startsWith("A")||element.length()<5).forEach(System.err::println);
    }
}
