package day17_whileLoops;

public class whileloop_practice2 {
    //write a program use while loop to sup up all even number between 0~10
    public static void main(String[] args) {
        for(int i=0; i<=10;i++){

            if(i%2==0){
                System.out.println(i);//gives all even numbers
            }
        }
        int sum=0;
       int i=0;
        while (i<=10){
            if(i%2==2)
            System.out.println(i);
        }

        i++;

    }

}
