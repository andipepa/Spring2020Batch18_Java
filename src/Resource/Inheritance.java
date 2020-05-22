package Resource;

import day42_Inheritance.Data;
import org.w3c.dom.ls.LSOutput;

public class Inheritance extends Data {
            //  sub               super

    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(protectedData);
        //only public and protected can be visible in other package as inheritence
        //System.out.println(defaultData);
        //System.out.println(privateData);
    }

}
