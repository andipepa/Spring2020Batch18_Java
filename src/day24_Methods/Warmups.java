package day24_Methods;
/*
1. write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20
	2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, '*') ==> 20;
			calculate(10, 2, '&') ==> Invalid operator
			NOTE: The method MUST take three arguments when it's called
	3. write a method that can identify if a string is palindrome
			ex: palindrom("level")  ==> true
				palindrome("Cybertek") ==> false
 */
public class Warmups {

    public static void Max(int num1,int num2){
        if(num1>num2){
            System.out.println("Max number is: "+num1);

        }else{
            System.out.println("Max number is: "+num2);
        }


    }

    public static void Calculation(double num1,double num2,char operator){

        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("invalid operator");
        }
    }

public static void palindrom(String str){

        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);

        }

    System.out.println(str.equalsIgnoreCase(reversed));

}

    public static void main(String[] args) {

        palindrom("Andi");



        Max(3,5);

        int n1=35;
        int n2=5;
        Calculation(n1,n2,'/');
    }



}
