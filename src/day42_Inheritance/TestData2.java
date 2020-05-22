package day42_Inheritance;

public class TestData2 extends Accessmodifiers {
    public static void main(String[] args) {

        /*
        publicVariable
        protectedVariable
        defaultVariable

        so this variables and method can be
        inherited in same packadge

        publicMethod();
        protectedMethod();
        defaultMethod()

         */


        System.out.println(TestData2.publicVariable);
        System.out.println(TestData2.protectedVariable);
        System.out.println(TestData2.defaultVariable);

        TestData2.publicMethod();
        TestData2.protectedMethod();
        TestData2.defaultMethod();


    }
}
