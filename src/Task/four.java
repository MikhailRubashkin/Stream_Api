package Task;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//	Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.

public class four {

    public static void main(String[] args) {

        String s = Stream.of(5, 2, 4, 2, 1)
                .map(String::valueOf)
                .collect(Collectors.joining("", "'", "'"));
        System.out.println(s);
    }
}
