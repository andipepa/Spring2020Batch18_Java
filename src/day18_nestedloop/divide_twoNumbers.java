package day18_nestedloop;

public class divide_twoNumbers {
    /*
    write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication,
			or module operators
     */
    //10-3,7-3,4-3 =1

    public static void main(String[] args) {
int a=10;
int b=4;

if(b==0){
    System.out.println("divisor can not be  zero");
    System.exit(0);

}
  int count=0; //count the execution of the loop//how many time
  while ( a>=b ){
      a -=b;
      count++;
  }
if(a==0){
    System.out.println("The result is "+count);
}else {
    System.out.println("The result "+count+" whith a remainder of "+a);
}

    }


}
