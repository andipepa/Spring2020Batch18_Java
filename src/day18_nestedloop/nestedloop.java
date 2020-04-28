package day18_nestedloop;

public class nestedloop {
    public static void main(String[] args) {


      for(int z= 0;z<=5; z++) {
          for(int i=1; i<=5; i++){

              System.out.print(i);
          }
          System.out.println();//to break the line
      }
        System.out.println("==================");

      for(int i=0; i<7; i++){

      int a =1;

      while(a<=7){

            System.out.print("*");

            a++;
        }
        System.out.println();
    }
}
}
