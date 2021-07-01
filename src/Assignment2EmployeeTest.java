import java.util.ArrayList;
import java.util.List;

public class Assignment2EmployeeTest {

    List<Assignment2Employee>  employeeList = new ArrayList<>();
    public static void main(String[] args) {


        Assignment2Employee employee1 = new Assignment2Employee(1,"aaa");


        Assignment2Employee e2 = new Assignment2Employee();
        e2.setEmployeeId(2);
        e2.setEmployeeName("BBBB");

        Assignment2EmployeeTest t = new Assignment2EmployeeTest();
        t.addEmployee(employee1);
        t.addEmployee(e2);

    }

    void addEmployee(Assignment2Employee employee) {
        employeeList.add(employee);
    }
    }
