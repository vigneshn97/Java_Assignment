import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Assignment3 {

        public static void main(String args[]){
            HashMap<Integer,String> map=new HashMap<Integer,String>();
            map.put(1,"ONE");
            map.put(2,"TWO");
            map.put(3,"THREE");
            map.put(4,"Four");

            for(Map.Entry m : map.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
        }
    }


