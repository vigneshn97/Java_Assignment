import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assignment2Employee {
    int employeeId ;
    String employeeName;

    public Assignment2Employee(int employeeId, String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public Assignment2Employee(){
        this.employeeId = 0;
        this.employeeName = null;
    }

   void setEmployeeId(int employeeId){
       this.employeeId = employeeId;

   }

   void setEmployeeName(String employeeName){
       this.employeeName = employeeName;
   }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}
