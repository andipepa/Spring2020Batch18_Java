package day06_Shorthand_LogicalOperators;

public class SingleIfStatement {
    public static void main(String[] args) {
     boolean coldWeather= true; //if the condition is false it doesnt execute
     if(coldWeather) {
         System.out.println("wear your hat ");
         System.out.println("wear your jacket ");
      boolean goodfood= true;
      if(goodfood) {
          System.out.println("I will eat a lot" + " and take away");

          boolean havelotmoney= true;
          if(havelotmoney){
              System.out.println("I will buy a new car and " + "help others");

          }
      }
     }
        System.out.println("+++++++++++++++++++++++++");
     int a=101;
     boolean evenNumber= a%2==0;
     boolean oddnumber= a%2!=0;
     if(evenNumber){
         System.out.println(a +" is an even number ");
     }
if(oddnumber) {
    System.out.println("a is odd number");

}




    }
}
