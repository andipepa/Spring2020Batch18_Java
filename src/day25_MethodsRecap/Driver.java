package day25_MethodsRecap;
/*
Warm up tasks:
	1. write a return method named getDriver1 that accepts a string parameter
	 called Browser
	if the browser name matches with {"chrome", "firefox", "safari", "edge",
	 "Opera"}, then it returns the name of that specific browser' drive
	 	Ex: getDriver("chrome");  ==> "Chrome Driver"
	getDriver("fireFOX"); ==> "FireFox Driver"
							....
	if the browser name does not match with any of browsers above,
	the method should return "Invalid"
				APPLY SWITCH STATEMENTS
	2. do the first task with multi-branch if statement instead of switch statement
	3. do the first task with ternaries instead of switch statements
 */
public class Driver {
    /*
    method declaration:
    Acces- modifers Specifier return-Type MethodName(parameter){
    }
     */

    public static void main(String[] args) {

     String str=  getDriver1("Chrome"); //argument is mandatory
        System.out.println(str);
String str2= getDriver2("chrome");
        System.out.println(str2);

        String str3= getDriver3("chrome");
        System.out.println(str3);
    }


    public static String getDriver1(String browserName){
        String result ="";

switch (browserName.toLowerCase()){
    case "chrome": result="Chrome Driver";
    break;
    case "firefox": result="Firefox Driver";
    break;
    case "safari": result="Safari Driver";
    break;
    case "opera": result="Opera Driver";
    case "edge": result="Edge Driver";
    default:result="Invalid Driver";
}


        return result;



    }

   public static String getDriver2(String browserName){

        String result ="";
if(browserName.equalsIgnoreCase("chrome")){

    result="Chrome Driver";
}else if(browserName.equalsIgnoreCase("firefox")){
    result ="FireFox Driver";
}else if(browserName.equalsIgnoreCase("safari")){
    result="Safari Driver";
}else if(browserName.equalsIgnoreCase("edge")){
    result="Edge Driver";
}else if(browserName.equalsIgnoreCase("opera")){
    result="Opera Driver";
}else{
    result="Invalid browser";
}


        return result;

   }

   public static String getDriver3(String browserName){
        browserName=browserName.toLowerCase();

        String result=(browserName.equals("chrome"))?"Chrome Driver"
                :(browserName.equals("firefox"))?"FireFox Driver"
                :(browserName.equals("safari"))?"Safari Driver"
                :(browserName.equals("opera"))?"Opera Driver"
                :(browserName.equals("edge"))?"Edge Driver":"Invalid Driver";




       return result;
   }

}
