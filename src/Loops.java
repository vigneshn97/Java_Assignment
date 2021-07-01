public class Loops {
    public void loop() {
        primitive();
       }
    public  void primitive(){
        int a= 10;
        int b= 15;
        if(a>110){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public void forLoop1(){

        int[] vehicles = {1,2,3,4};
        for(int i = 0;i < vehicles.length;i++) {

            System.out.println(vehicles[i]);
        }

        String[] vehicles1 = {"qws","qwf","qwe"};
        for(int i = 0;i < vehicles1.length;i++) {

            System.out.println(vehicles1[i]);
        }
        for(String vehicle: vehicles1 ){
            System.out.println(vehicle);
        }
    }

    public void while1(){

        int i =1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
//
    }

    public void dowhile1(){

        int i =1;
        do{
            System.out.println(i);
            i++;
        }
        while (i<=10);
    }
}
