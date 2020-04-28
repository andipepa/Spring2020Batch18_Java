package day08_ifStatments;

public class multiBranchIf {
    public static void main(String[] args) {
        int a=-10;
        boolean zero= a==0;
        boolean negative= a<0;
        boolean positive= a>0;


        /*if(zero){
            System.out.println(a+" is zero");
        }
        if(negative){
            System.out.println(a+" is negative");
        }
        if(positive){
            System.out.println(a+" is positive");
        }*/
        if(zero){
            System.out.println(a+" is zero");
        }
        else if(negative){
            System.out.println(a+ " is negative");
        }
else{
            System.out.println(a+ " is positive");
        }


    }
}
