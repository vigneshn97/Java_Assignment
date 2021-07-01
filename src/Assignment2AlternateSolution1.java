import java.util.ArrayList;
import java.util.List;

public class Assignment2AlternateSolution1 {
    public static void main(String[] args) {
        List<List> listOfMixedTypes = new ArrayList<List>();
        ArrayList<Integer> empIds = new ArrayList<Integer>();
        empIds.add(1);
        empIds.add(2);
        empIds.add(3);
        ArrayList<String> empNames = new ArrayList<String>();
        empNames.add("A");
        empNames.add("B");
        empNames.add("C");

        listOfMixedTypes.add(empIds);
        listOfMixedTypes.add(empNames);
        System.out.println(listOfMixedTypes);
    }
}
