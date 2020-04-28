package day24_Methods;

public class Returnmethod {

    public static void maxNum (int a, int b){

        if(a>b){

            System.out.println(a);
        }else{
            System.out.println(b);
        }

    }

    public static void main(String[] args) {

       // maxNum(10,20);
       int result = Addition(23,45);

        System.out.println(result);
           int a= result+32;



        System.out.println(a);
    }
                  //so we give data type here and it can be reusable
    public static int Addition(int a,int b){

        return a+b;
    }


}
