import java.util.Scanner;

public class Arrays {
    public void array(){
        System.out.println("enter the value");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();


        int[] studentId = new int[1];
        studentId[0] =a;
        System.out.println(studentId[0]);
    }

    public void array1(){

        String[] vehicles = {"car","bike"};
        System.out.println(vehicles[0]);

    }

    public void switch1(){

        String day = "sffs";
        switch (day){
            case "Monday":
            System.out.println("First day");
            break;
            case "Tues":
                System.out.println("second day");
                break;
            default:
                System.out.println("invalid");
                break;
        }

    }


}
