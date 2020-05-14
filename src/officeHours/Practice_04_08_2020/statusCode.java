package officeHours.Practice_04_08_2020;

public class statusCode {
    public static void main(String[] args) {
        int statusCode=301;
        if(statusCode==200){
            System.out.println("Ok");
        }
        if(statusCode==201){
            System.out.println("Created");
        }
        if(statusCode==202){
            System.out.println("Accepted");
        }
        if(statusCode==301){
            System.out.println("Moved Permanently");
        }
        if (statusCode==303){
            System.out.println("See other");
        }
        if(statusCode==304){
            System.out.println("Not Modified");
        }
        if(statusCode==307){
            System.out.println("Temporary modified");
        }
        if(statusCode==400){
            System.out.println("Bad reques");
        }
        if(statusCode==401){
            System.out.println("Unauthorized");
        }
        if(statusCode==403){
            System.out.println("Forbiden");
        }
        if(statusCode==404){
            System.out.println("not found");
        }
        if(statusCode==410){
            System.out.println("Gone");
        }
        if(statusCode==500){
            System.out.println("Internal server error");
        }
        if(statusCode==503){
            System.out.println("Service Unavaileble");
        }
    }

}
/*
status code:
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable

1. declare an int variable called StatusCode
2. write a if statement that prints out, on a line by itself, the appropriate label from the above list based on status.
Example:
        if status code = 200
        output:
                ok

        if status code = 201:
        output:
                accepted

 */