package Day05_Unary_ShorthandOperators;

public class Divisibility {
    public static void main(String[] args) {
        //Data type Variable= Data;
        int number= 65;
        boolean divisibleBy2= number % 2==0;
        boolean divisibleBy3= number % 3==0;
        boolean divisibleBy5= number %5==0;
        String result1 = number + " is divisible by 2: "+ divisibleBy2;
        String result2 = number +" is divisible by 3: "+ divisibleBy3;
        String result3 = number +" is divisible by 5: "+ divisibleBy5;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result1+"\n" + result2 + "\n" + result3);
        String finalResult= result1+"\n" + result2 + "\n" + result3;
        System.out.println(finalResult);

        int number1=86;
        boolean divisibleby3= number1%3==0;
        boolean divisibleby5= number1%5==0;
        boolean divisibleby6=number1%6==0;
        boolean divisibleby8=number1%8==0;
        String result4= number1 + " is divisible by 3: "+ divisibleBy3;
        String result5= number1 + " is divisible by 5: "+ divisibleby5;
        String result6= number1 + " is divisible by 6: "+ divisibleby6;
        String result8= number1 + " is divisible by 8: "+ divisibleby8;
        String finalresult1= result4 + "\n" + result5 + "\n" + result6 + "\n" +result8;

        System.out.println(finalresult1);

    }




}
/*
2. Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
			Ex:
				number = 65;  ==> int
				divisibleBy2 ==> true/false
				divisibleBy3 ==> true/false
				divisbileBy5 ==> true/false
			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
				number = 80;
			output:
				80 is divisible by 2: true
				80 is divisible by 3: false
				80 is divisible by 5: true
 */