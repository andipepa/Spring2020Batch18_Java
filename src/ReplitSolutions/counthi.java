package ReplitSolutions;

public class counthi {
    public static void main(String[] args) {
        String str="hi man hi how are you hi";

       int count=0;

       while (str.contains("hi")){
           count++;
           str=str.replaceFirst("hi","");

       }

        System.out.println(count);

    }
}
