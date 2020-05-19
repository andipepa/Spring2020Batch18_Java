package day41_Inheritance;

public class BooksObjects {
    public static void main(String[] args) {
        Ebook book1= new Ebook();

        book1.title="Living Danishly";
        book1.author="Helen Russell";
        book1.price=15;

        book1.size="1.4 MB";

        book1.pages=654;

        System.out.println(book1);

        System.out.println("Size: "+book1.size);
        System.out.println("Pages: "+book1.pages);

        book1.readbook();

        System.out.println("=======================================");

        AudioBook book2= new AudioBook();

        book2.title="King Lear";
        book2.author="Shakspear";
        book2.price=13;

        book2.length="3 hours 45 min 12 sec";
        book2.narrator="John V";

        System.out.println(book2);
        System.out.println("Length of the audiobook \""+book2.title+ "\" is "+book2.length);
        System.out.println("\""+book2.title+"\" is narated by "+book2.narrator);
        book2.listen();

    }
}
