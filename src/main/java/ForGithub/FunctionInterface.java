package ForGithub;

import java.util.function.Function;

public class FunctionInterface implements Function <Integer,Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> function=(n) -> n+n;
        {
            System.out.println(function.apply(5));
        }
    }
}





