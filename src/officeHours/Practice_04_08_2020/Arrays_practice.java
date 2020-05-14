package officeHours.Practice_04_08_2020;
import java.util.Arrays;
public class Arrays_practice {
    public static void main(String[] args) {
        String s1 = "today is a beautiful day";
        String s2 = "a beautiful day is today";

        char[] ch1= s1.toCharArray();
        char[] ch2= s2.toCharArray();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        System.out.println();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean equal= Arrays.equals(ch1,ch2);
        System.out.println(equal);

        int [] i={1,3,2,5,4,7,6,8,0};
        int [] k={0,7,8,6,4,5,2,3,1,};

        Arrays.sort(i);
        Arrays.sort(k);
        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(k));

        boolean equal1= Arrays.equals(i,k);
        System.out.println(equal1);

        System.out.println("================================");




    }
}
