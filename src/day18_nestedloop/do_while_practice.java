package day18_nestedloop;

public class do_while_practice {
    /*
    print all even num 0~100in the same line seperated by a space
     */
    public static void main(String[] args) {
        int num = 0;

        do{
            if(num%2 !=0) {


                System.out.print(num + " ");
            }
          num++;
        }while (num<=100);
        System.out.println();

        System.out.println("===========================");

        int i=1;
        do{


            System.out.println(i);
            if(i==3){
                break;
            }

            i++;

        }while (i<=5);

        System.out.println("=============================");

        int y= 1;

         do {
             if(y==3){  ///skip 3 and continue

                 y++; //
                 continue;
             }

             System.out.println(y);

         y++;
         }while (y<=5);

        System.out.println("====================================");

        int t=1;

        do{
            if(t%2 !=0){

                t++;
                continue;

            }

            System.out.print(t+" ");
            t++;

        }while(t<=100);


    }


}
