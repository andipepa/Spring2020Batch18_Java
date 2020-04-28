package day17_whileLoops;

public class remove_dublicates {
    public static void main(String[] args) {
        String str= "Java is Java fun,Java is Java cool";

        int count=0; //2
         while(str.contains("Java")){
             count++;
             str=str.replaceFirst("Java","");
        ///after it counts one we want to remove it

         }

        System.out.println(count);


    }
}
