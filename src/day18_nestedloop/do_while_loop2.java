package day18_nestedloop;

public class do_while_loop2 {
    public static void main(String[] args) {
        int num=10;//print numbers between 100~number
        while (num>=100){
            System.out.println(num);
            num--;
        }
        System.out.println("=====================================");
        int num2=103;

       do{
           System.out.println(num);
           num2--;
       } while(num2>=100);



    }
}
