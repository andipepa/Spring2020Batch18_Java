package day06_Shorthand_LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean r1 = true;
        System.out.println(!r1); //false
         boolean r2= !(10+15> 15); //false
        System.out.println(r2);
        boolean r3= !true == !false; //false
        System.out.println(r3);

        boolean R1 = "Corona virus" != "End of the world" && "Toilet paper" == "the cure";

        System.out.println(R1);
        boolean R2= 10> 15 && 15<13;  //it gives false
        System.out.println(R2);
        boolean R3= 23!=21 && 12>=11;
        System.out.println(R3);

        boolean R4= 'a' == 'b'-1 && 'b'+1 =='c';
                    //97=98-1 and 98+1=99 ===true
        System.out.println(R4);

        boolean R5= true!= false || false==!true;
                    // true ||  true==> true
        System.out.println(R5);

        boolean R6= true != false && !false==!true;
                     //true && false ==>> false
        System.out.println(R6);

         boolean R7= !!!!!false; // there 5 so true oposit



    }
}
