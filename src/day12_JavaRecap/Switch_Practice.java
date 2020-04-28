package day12_JavaRecap;

public class Switch_Practice {
    public static void main(String[] args) {
       switch (3){
           case 1:
               System.out.println("Case 1");
               break;

           case 2:
               System.out.println("Case 2");
               break;
           default:
               System.out.println("Invalid case");

       }
        System.out.println("==========================================");
       String result="";
       int statusCode= 200;

       switch (statusCode){
           case 200:
              // System.out.println("ok");
               result="ok";
               break;

           case 201:
               //System.out.println("Created");
               result="created";
               break;

           case 202:
               //System.out.println("Accepted");
               result="Accepted";
               break;
           default:
               ///System.out.println("Invalid case");
               result="Invalid case";
       }

    }
}
