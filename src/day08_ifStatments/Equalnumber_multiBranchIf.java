package day08_ifStatments;

public class Equalnumber_multiBranchIf {
    public static void main(String[] args) {

        double n1= 100.5;
        double n2= 200.5;
        double n3=20.5;

        boolean n1Equaln2= n1==n2 && n2 !=n3;
        boolean n1Equaln3=  n1==n3 && n1 != n2;
        boolean n2Equaln3= n2 ==n3&& n2 != n1;
        boolean allEqual= n1==n2 && n1 ==n3; //all of them are equal
        String result = " ";
        if(n1Equaln2){
            //System.out.println("n1 is equal n2");
            result= "n1 is equal n2";
        }
        else if(n1Equaln3){
            //System.out.println("n1 is equal n3");
            result= "n1 is equal n3";
        }
        else if(n2Equaln3){
            //System.out.println("n2 is equal n3");
            result= "n2 is equal n3";
        }
        else if(allEqual){
            //System.out.println("n1 equal n2 and equal n3");
            result= "all of them are equal";
        }
        else{
           // System.out.println("none of them are equal");
            result= "none of them is equal";
        }
        System.out.println(result);
    }

}
