package officeHours;

import java.util.Scanner;

public class uniquePractice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word");
        String word=input.next();
        String result ="";

        for(int i=0; i<=word.length()-1; i++){

            int count=0;
            for(int j=0;j<=word.length()-1; j++){
                if(word.charAt(j)== word.charAt(i)){
                    count++;
                }
            }
            if(count==1){
                result+=word.charAt(i);
            }
        }
        System.out.println(result);
    }
}
