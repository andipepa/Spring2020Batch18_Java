package day41_Inheritance;

public class Ebook extends Book {
    /*
    title (inheritet)
    author (inheritet)
    price (inheritet)
    toString (inherited)
    size (declared)
    pages (declared)
    readbook (declared)
     */

    public String size;
    public int pages;

    public void readbook(){
        System.out.println("I'm reading "+title + " by "+author);
    }



}
