package day07_IfStatments;

public class mediumNum {
    public static void main(String[] args) {
        double a= 600;
        double b=400;
        double c=500;
        // a: if (a<b && a>c) or ( a>b && a<c)
        // b; if (b<c && b>a) or ( b>c && b<a)
        // c; if (c <b && c>a) or ( c>b && c<a)

        if((a<b && a>c) || ( a>b && a<c)){
            System.out.println("a is medium number");
        }
        if((b<c && b>a) || ( b>c && b<a)){
            System.out.println("b is medium number");
        }
        if((c <b && c>a) || ( c>b && c<a)){
            System.out.println("c is medium number");
        }
    }
}
//write a java program that accepts three numbers and rteurn the mediam number