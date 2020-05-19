package Resource;
import day39_AccessModifiers.AccessModifiers;
public class AccessModifiers_Test {
    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();

       // System.out.println(obj.defaultAccess);

        System.out.println(obj.publicAccess);
        //so public can be used in ather packeges but default only same package

    }
}
