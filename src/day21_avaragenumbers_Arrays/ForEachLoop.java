package day21_avaragenumbers_Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] nums= {1,2,3,4};

        for( int eachElement:nums){
            System.out.println(eachElement);
        }
     String[]names = {"Andi","Esat","Sulo","Muhtar" };
        for( String eachName : names) {
            System.out.println(eachName);

        }
      int [] arr1= {1,2,3,4,5,6,7,8,9,10};
        for(int each : arr1){

            if(each<5){
                continue;
            }

            System.out.println(each);
        }

        System.out.println("==========================================");String sentences= "I like java";

      String sentence = "I Like Java";

      String [] words= sentence.split(" ");

       for( String eachWord : words) {

           System.out.print(eachWord);

       }
        System.out.println();

       for( int i = words.length-1; i>=0; i--){


           System.out.print(words[i]);

       }




    }
}
