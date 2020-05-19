package day41_Inheritance;

public class AudioBook extends Book {
     /*
    title (inherited)
    author(inherited)
    price (inherited)

    length
    narrator
    listen()
    toString()
     */
    public String length;
    public String narrator;

    public void listen(){
        System.out.println("Listening to "+title);
    }
}
