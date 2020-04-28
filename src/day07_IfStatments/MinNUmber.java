package day07_IfStatments;

public class MinNUmber {
    public static void main(String[] args) {
        double a=10;
        double b=20;
        double c=1;
        if(a<b&&a<c){
            System.out.println("a is Minimum number");
        }
        if(b<a && b<c){
            System.out.println("b is Minimum number");
        }
        if(c<a&&c<b){
            System.out.println("c is Minimum number");
        }
    }

}
/*
write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
 */