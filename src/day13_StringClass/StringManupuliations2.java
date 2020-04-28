package day13_StringClass;

public class StringManupuliations2 {
    public static void main(String[] args) {

        String str ="Cybertek is the best"; //substring

         String schoolName= str.substring(0,8); // ending index is exluded
                                                // give one more index
        System.out.println(schoolName);         //if last is 7 we give 8

        String fullName = "Andi Pepa";
        ///////////////////012345678

        String firstName=fullName.substring(0,4);
        String lastName= fullName.substring(5,9);
        System.out.println(firstName);
        System.out.println(lastName);

        //full name == firstName and lastName
        //gmail: lastName_firstName@gmail.com
        String Andi = "Andi Pepa";
         String FirstName= Andi.substring(0,4);
         String LastName = Andi.substring(5,9);

        System.out.println(FirstName);
        System.out.println(LastName);

       // String gmail = LastName.concat("_").concat(firstName).concat("@gmail.com");
       String gmail= FirstName+"_"+ LastName+ "@gmail.com";
        System.out.println(gmail);

        String s1= "I love java class";
        String className= s1.substring(7); //if you want to take till end
        System.out.println(className);

        System.out.println("========================Replace metho");

        String r = " i love #C class";
        r= r.replace("#C","Java");
        System.out.println(r);

        String name= "COVID 18";
        name= name.replace("8","9");
        System.out.println(name);
        name=name.toLowerCase();
        System.out.println(name);


        String r1= "I like C#, C# is fun , C# is cool";
        ///r1= r1.replace("C#","Java"); //replaces all
       r1= r1.replaceFirst("C#","Java");//replace only first one
        System.out.println(r1);


        String r2= "Tomorrow is monday, Tomorrow is tuesday";
         r2=r2.replaceFirst("Tomorrow","Today");
        System.out.println(r2);

    }
}
