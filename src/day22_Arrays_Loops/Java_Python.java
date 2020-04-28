package day22_Arrays_Loops;
/*
3. write a program that can return the number of appearances of "java"
 and "python" anywhere in the sentence
 (it's similar to the task 97 in repl.it, But this time you MUST use arrays and
 */
public class Java_Python {
    public static void main(String[] args) {

        String sentence= "I like java and python and javascript";

        sentence= sentence.toLowerCase();

        int countJava = 0;
        int countPython=0;
     String[] words = sentence.split(" ");

   for (String each:words){
       if(each.contains("java")){
           countJava++;

       }
       if(each.contains("python")){
           countPython++;
       }



   }
        System.out.println(countJava);
        System.out.println(countPython);


    }
}
