import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2Alternatesolution2 {
    int employeeId ;
    String employeeName;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> detail = new ArrayList<>();
        ArrayList<String> detail1 = new ArrayList<>();
        for (int i=0;i<3;i++){
            System.out.println("Enter employeeId");
            detail.add(scanner.nextInt());
            System.out.println("Enter employeeName");
            detail1.add(scanner.next());
        }

        System.out.println("employee Ids "+detail);
        System.out.println("employee names "+detail1);
    }
}
