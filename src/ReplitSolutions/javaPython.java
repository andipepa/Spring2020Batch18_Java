package ReplitSolutions;
import java.util.Scanner;
public class javaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
sentence.toLowerCase();
        int countJava=0;
        int countPython=0;

        for(int i=0; i<=sentence.length()-1;i++){
            if(sentence.contains("java")){
                countJava++;
                sentence= sentence.replaceFirst("java","");
            }
            if(sentence.contains("python")){
                countPython++;
                sentence= sentence.replaceFirst("python","");
            }
            System.out.println(countJava==countPython);
        }




    }
}
