package day27_DateTime;

public class unique_Arrays {
    /*
    	3. write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
		4. write a method that can print out the unique elements from a double array
					Note: Apply method overloading
     */
    public static void main(String[] args) {

        int[] arr = {11, 11, 11, 11, 11, 11, 33, 44, 55, 44, 55};

        for (int each2 : arr) {

            int count = 0;
            for (int each: arr) {
                if (each == each2) {
                    count++;
                }

            }

            if (count == 1) {
                System.out.println(each2);
            }
        }
        System.out.println("===================================");

        int[] arr1 = {11, 11, 11, 11, 11, 11, 33, 44, 55, 44, 55};
        uniqueElements(arr1);

        System.out.println("====================================");
        double[] arr2 = {11.2, 11.1, 11.4, 11.5, 11.6, 11.1, 33, 44, 55, 44, 55};
        uniqueElements(arr2);

    }


    public static void uniqueElements(int[] arr) {

        for (int each2 : arr) {

            int count = 0;
            for (int each : arr) {
                if (each == each2) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(each2);
            }

        }


    }
    public static void uniqueElements(double[] arr) {

        for (double each2 : arr) {

            int count = 0;
            for (double each : arr) {
                if (each == each2) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(each2);
            }

        }


    }

}
