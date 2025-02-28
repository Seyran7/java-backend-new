import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SearchNumbersDivaded3and5 {
    public static void main(String[] args) {
    IntStream.rangeClosed(1,100).filter(element->element%3==0&&element%5==0).forEach(System.err::println);
    }
}
