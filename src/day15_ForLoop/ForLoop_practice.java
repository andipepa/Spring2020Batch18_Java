package day15_ForLoop;

public class ForLoop_practice {
    public static void main(String[] args) {
        /*
        print odd numbers between 1~100 in a single line
         separated by a space
         */

        String resultOdd = "";
        for(int num=1;num<=100; num +=2){

           // System.out.print(num+" ");
            resultOdd+= num+" ";
        }
        System.out.println(resultOdd);

        /*
        even between 1~100
         */

        String resultEven="";
        for(int num1 =0; num1<=100;num1+=2 ){
            resultEven+= num1+" ";
        }
        System.out.println(resultEven);

    }
}
