package day34_CustomClass2;

public class Dog {
    String breed;
    String size;
    String color;
    int age;
    String name;

    public void eating(String food){
        System.out.println(name+" is eating "+food);
    }
    public void drinking(String drink){
        System.out.println(name+" is drinking "+drink);
    }
    public void playing(String toy){
        System.out.println(name+" is playing "+ toy);

    }
public void studying(String subject){
    System.out.println(name+" is studying "+ subject);
}
    public void setDogInfo(String breed,String size,String color,int age,String name){
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.name = name;

    }
    public String toString(){
        return "Dog Name: "+name+" Dog size: "+size+" Dog Breed: "+breed+
                " Dog Color: "+color+" Dog Age: "+age+" Years old";
    }

}
