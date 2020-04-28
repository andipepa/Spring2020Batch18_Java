package day14_stringClass2;
/*
valid address must start with www
must ends with, .com .edu .net . gov
 */
public class webadress {
    public static void main(String[] args) {

        String website= "WWW.amazon.gov";
      website= website.toLowerCase();

      boolean validEnding =website.endsWith(".com")||website.endsWith(".net")||
                           website.endsWith(".gov");
      if(website.startsWith("www.")&& validEnding){
          System.out.println("Valid address");
      }else{
          System.out.println("Invalid address");
      }

    }
}
