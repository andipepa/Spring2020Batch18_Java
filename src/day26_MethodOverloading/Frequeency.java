package day26_MethodOverloading;
/*
1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop

 */
public class Frequeency {
    public static void main(String[] args) {
        String str = "ABBAAAAAAAABBBAAAAAA";
        char ch = 'A';
        char[] arr = str.toCharArray();
        int count = 0;
        for (char each : arr) {
            if (each == ch) {
                count++;

            }
        }
        System.out.println(count);

        String str2= "ABCDABCDGDACBBRBB";
       int num1= frequency(str2,'A');
        System.out.println(num1);

    }

    public static int frequency(String str, char ch) {

        char[] arr = str.toCharArray();
        int count = 0;
        for (char each : arr) {
            if (each == ch) {
                count++;

            }


        }
return count;
    }
}