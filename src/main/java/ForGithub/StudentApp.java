package ForGithub;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentApp extends Student {
    public StudentApp(String name, Long id) {
        super(id,name);
    }

    public static void main(String[] args) {


        Map<Student, String> map = new LinkedHashMap<>();

        map.put(new Student(1L, "Ali"), "A");
        map.put(new Student(2L, "Ali"), "B");
        map.put(new Student(3L, "Fexri"), "C");


        System.out.println(map);
    }
}
