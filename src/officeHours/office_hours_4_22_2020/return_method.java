package officeHours.office_hours_4_22_2020;

public class return_method {
    public static void main(String[] args) {
        sum(20,32);

      int num=  sum2(34,65);


    }



    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    public static int sum2(int a, int b){
        System.out.println(a+b);
        return 23;
    }

}
