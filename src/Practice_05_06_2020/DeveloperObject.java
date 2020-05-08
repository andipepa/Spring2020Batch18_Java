package Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class DeveloperObject {
    public static void main(String[] args) {
        Developer dev1 = new Developer();
        dev1.setDeveloperInfo("James", "Developer", 135, 120000);

        Developer dev2 = new Developer();
        dev2.setDeveloperInfo("Jane", "Developer", 125, 125000);

        Developer dev3 = new Developer();
        dev3.setDeveloperInfo("Jack", "Developer", 136, 120000);

        dev1.coding(" Java");
        dev3.fixingBugs();

        System.out.println("===================================================");

        Developer[] arr = {dev1, dev2, dev3};

       /* ArrayList<Developer> developers=new ArrayList<>(Arrays.asList(arr));

        System.out.println(developers); */


     /*  for (int i=0; i<arr.length;i++){

           System.out.println(arr[i]);  */


        for (Developer each : arr) {
            System.out.println(each.name + " " + each.salary);
        }

    }
}



