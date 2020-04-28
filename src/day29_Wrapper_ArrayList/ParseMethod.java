package day29_Wrapper_ArrayList;

public class ParseMethod {
    public static void main(String[] args) {
        String str= "123";

      int a=  Integer.parseInt(str); //123
        System.out.println(a+1);
        System.out.println(str+1);

      byte a1=  Byte.parseByte(str);
        System.out.println(a1+5);

        String str2 ="10.5";
       float f1= Float.parseFloat(str2);
        System.out.println(f1+1);

       double d1= Double.parseDouble(str2);
        System.out.println(d1);

        String str3= "3124356765";

        long num1 = Long.parseLong(str3);
        System.out.println(num1+2);

        String result1= "today"; //if not true or false it returns false
        boolean a2= Boolean.parseBoolean(result1);
        System.out.println(a2);

        String result2 = "trUE";  //its not case sensitive

        boolean r2= Boolean.parseBoolean(result2);
        System.out.println(r2);



    }
}
