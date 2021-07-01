import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment4ListOfIntegers2 {

    public static void main(String[] args)
    {
        int[] arr = {3, 4, 6, 12, 20};

        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        list.stream()
                .filter(n -> ((n * (n + 1)) / 4) == 5)
                .forEach( n -> System.out.println(n));
        System.out.println(list);

    }
}
