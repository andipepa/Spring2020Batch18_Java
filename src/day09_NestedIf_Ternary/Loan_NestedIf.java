package day09_NestedIf_Ternary;

public class Loan_NestedIf {
    public static void main(String[] args) {
        double salary =120000;
        byte workHistory=1;
        if(salary>=30000){
            if(workHistory>=2){
                System.out.println("you are qualified for loan");
            }else{
                System.out.println("you must have worked at least 2 years");
            }


        }else {
            System.out.println("you must earn at least 30000");
        }





    }
}
