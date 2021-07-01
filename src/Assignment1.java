import java.util.ArrayList;
import java.util.Arrays;

public class Assignment1 {

    public Assignment1(){
        ArrayList<String> colorList = new ArrayList(Arrays.asList("red","green","blue","yellow"));
        System.out.println("color list is:"+ " " +colorList);

        for ( String c: colorList ) {
            System.out.println(c);
        }
    }

    static void checkCoulors(String str){
        ArrayList<String> colorList = new ArrayList(Arrays.asList("red","green","blue","yellow"));
        {
            System.out.println(colorList.contains(str));
        }
    }

    public static void main(String[] args) {
        Assignment1 colors = new Assignment1();
        checkCoulors("red");
    }
}
