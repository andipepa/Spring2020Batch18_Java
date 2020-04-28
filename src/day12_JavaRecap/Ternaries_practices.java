package day12_JavaRecap;

import java.util.Scanner;

public class Ternaries_practices {
    public static void main(String[] args) {

        // 200 "ok" 201 " created" 202 "accepted"

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter status code:");
        int statuscode = scan.nextInt();
        String result="";

        if(statuscode==200){
            result="ok";
        }else if(statuscode==201){
            result="created";
        }else if(statuscode==202){
            result="accepted";
        }else{
            result="invalid status code";
        }
        System.out.println(result);

        String result2=(statuscode==200)? "ok" :(statuscode==201)?
                "created":(statuscode==202)?"accepted":"invalid code";

        System.out.println(result2);

    }
}
