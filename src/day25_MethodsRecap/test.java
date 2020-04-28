package day25_MethodsRecap;



public class test {
    public static void main(String[] args) {
        String str1 = getName1("ilia");
        System.out.println(str1);
       String str2= getName2("andi");
        System.out.println(str2);
      String str3= getName3("gerti");
        System.out.println(str3);
    }




    public static String getName1(String Name){

        String result= "";

        switch (Name.toLowerCase()){
            case "andi": result="Andi is a good guy";
            break;
            case "ilia": result="Ilia loves movies";
            break;
            case "gerti": result="Gerti is hard working";
            break;
            case "kevin": result="Kevin reads a lot";
            break;
            default:result="There is not such a name in our house";
        }

        return result;
    }

    public static String getName2(String Name){
        String result="";
        if(Name.equals("andi")){
            result="Andi is a good guy";

        }else if(Name.equals("ilia")){
            result="Ilia loves movies";
        }else if(Name.equals("gerti")){
            result="Gerti is very harworking";
        }else if(Name.equals("kevin")){
            result="Kevin reads a lot";
        }else{
            result="There is not such a guy in our home";
        }

        return result;
    }

    public static String getName3(String Name){

        String result=(Name.equals("andi"))?"Andi is a good guy"
                :(Name.equals("ilia"))?"Ilia loves movies"
                :(Name.equals("gerti"))?"Gerti is very hard working"
                :(Name.equals("kevin"))?"Kevin reads a lot":"There is not such A GUY";

        return result;

    }


}
