package day06_Shorthand_LogicalOperators;

public class IfStatementPractice {
    public static void main(String[] args) {
        int a= 100;
        int b= 200;

        if(a > b){
            System.out.println( a+ " is greater then b" +b);
        }
      if(b>a){
          System.out.println(b + " is greater then  " +a);
      }
        System.out.println("++++++++++++++++++++++++++++++++");
      int x= 300;
      int y= 200;
      boolean xGreater = x>y;
      boolean yGreater= y>x;

      if(xGreater){
          System.out.println(x + " is greater than " +y);
      }
     if(yGreater){
         System.out.println(y+ " is greater than " +x );
     }
     if(xGreater==yGreater){
         System.out.println(x+ " is equal to " +y );
     }

    }
}
