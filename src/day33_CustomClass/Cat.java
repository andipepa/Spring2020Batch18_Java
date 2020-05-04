package day33_CustomClass;

public class Cat {
    String breed;
    String color;
    String name;
    int age;


    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void eat(String catFood){
        System.out.println(name+ " is eating"+ catFood);

    }
    public void drink(String drink){
        System.out.println(name+ " is drinking"+ drink);
    }
    public void setCatInfo(String catBreed, String catColor,String catName,int catAge){
        breed=catBreed;
        color=catColor;
        name=catName;
        age=catAge;

    }

    public String toString(){
        return "Cat's name is "+name+",breed is  "+breed+", color is "+color+", it is "+age+" years old";
    }


}
