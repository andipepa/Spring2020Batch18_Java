package day25_MethodsRecap;

public class Frequency {
    public static void main(String[] args) {
        String str1 = "AAAA";
        String str2 = "A";

        int count = 0;

        while (str1.contains(str2)) {
            count++;

            str1 = str1.replaceFirst(str2, "");
            //we need to make that we are not counting the same index over again
        }


        System.out.println(count);

        String a="hajgagegayetagaedageaeeaeaa";
        String b="a";

        int num1= Frequency(a,b);
        System.out.println(num1);

    }

    public static int Frequency(String a, String b) {

        int count = 0;

        while (a.contains(b)) {
            count++;

            a = b.replaceFirst(b, "");

        }

        return count;

    }
}