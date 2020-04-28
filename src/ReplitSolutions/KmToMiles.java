package ReplitSolutions;

public class KmToMiles {
    public static void main(String[] args) {

        CoverttKmToMiles(10);
        CovertLittresToGallons(10);
        Calculater(2,5,"*");
        Grades(78);


    }


    public static void CoverttKmToMiles(double km){

        double miles = km * 0.612;

        System.out.println(km +" km is equal "+ miles+"miles");
    }

public static void CovertLittresToGallons(double littres){

        double gallons = littres * 3.75;
    System.out.println(littres + " littres is equal "+gallons+" gallons");

}
public static void Calculater(int num1,int num2,String str){

int result= 0;

if(str.equals("+")){
    result+=(num1+num2);

}else if(str.equals("-")){
    result+=(num1-num2);

}else if(str.equals("*")){
    result+=(num1*num2);

}else if(str.equals("/")){
    result+=(num1/num2);
}else if(str.equals("%")){
    result+=(num1%num2);
}else{
    System.out.println("Invalid operater");
}
    System.out.println("Your result is: "+result);

}
public static void Grades(int grade){

        String str="Your grade is: ";

        if(grade>=90 && grade<=100){
            str+="A";
        }else if(grade>=80 && grade<=89){
            str+="B";
        }else if(grade>=70 && grade<=79){
            str+="C";
        }else if(grade>=60 && grade<=69){
            str+="D";
        }else if(grade>=0 && grade<=59){
            str+="F";
        }else {
            str+="Invalid score";
        }
    System.out.println(str);
}


}
