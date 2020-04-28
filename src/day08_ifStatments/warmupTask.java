package day08_ifStatments;

public class warmupTask {
    public static void main(String[] args) {
        double n1= 200.5;
        double n2= 200.5;
        double n3=200.5;
        boolean n1Equaln2= n1==n2 && n2 !=n3;
        boolean n1Equaln3=  n1==n3 && n1 != n2;
        boolean n2Equaln3= n2 ==n3&& n2 != n1;
         boolean allEqual= n1==n2 && n1 ==n3; //all of them are equal
        boolean noneOfthemEqual= n1!=n2&& n1!= n3&& n2!= n3;


     if(n1Equaln2){
         System.out.println(n1+ " is equal " +n2);
     }
     if(n1Equaln3){
         System.out.println(n1+ " is equal " +n3);
     }
        if(n2Equaln3){
            System.out.println(n2+ " is equal " +n3);
        }
        if(noneOfthemEqual){
            System.out.println("none of them are equal");
        }
        else {
            System.out.println("all of them equal");
        }
    }
}
/*
 write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal
	2.. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
:+1:
13
 */