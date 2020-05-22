package Resource;

import day42_Inheritance.Accessmodifiers;

public class Inheritance2 extends Accessmodifiers {
    public static void main(String[] args) {
         /*
        publicVariable
        protectedVariable

    so only public and protected can be visible
     or inhereted in an other packadge



        publicMethod();
        protectedMethod();


         */
        System.out.println(Inheritance2.publicVariable);
        System.out.println(Inheritance2.protectedVariable);

        Inheritance2.protectedMethod();
        Inheritance2.publicMethod();

    }
}
