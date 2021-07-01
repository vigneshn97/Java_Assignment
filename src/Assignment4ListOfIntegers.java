import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment4ListOfIntegers {

    public static void main(String[] args)
    {
        int[] arr = {34, 6, 3, 12, 65, 1, 8};

        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(list);
        list.removeIf(listNumber -> listNumber<5);

        System.out.println("List with Integers greater than 5 :" +list);
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List :"+sortedList);
    }
}
