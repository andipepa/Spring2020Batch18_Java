package day39_AccessModifiers;

public class PersonalInfo {
    public static String name="Andi";//can call evrywhere even other packedges
    public static char gender='M';

     static char grade='A';// iits default so can be called same packedge only
     static long SSN=12234;
    private static long ID= 5432; //private only in the same class
    private static int age=18;


}
