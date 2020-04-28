package day09_NestedIf_Ternary;

public class Ternary_practice {
    public static void main(String[] args) {
       /* int num=100;
        char ch1=' ';
        if(num>0){
            ch1='+';
        }else if(num<0){
            ch1='-';
        }else{
            ch1='0';
        }*/
       int num=100;
        char ch2= (num>0) ? '+':(num<0)? '-':'0';
        System.out.println(ch2);
        System.out.println("===============================");
        byte score= 69;
        String grade="";
        String grade2= (score>=90&&score<=100)? "A":(score>=80&&score<90)?"B"
                :(score>=70&&score<80)?"C" :"Fail";
        System.out.println(grade2);


    }
}
