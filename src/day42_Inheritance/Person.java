package day42_Inheritance;
/*
create a class called Person
				attributes:  name, age, gender
				methods: eat, walk, sleep, setPersonInfo
 */
public class Person {
    public String name;
    public int age;
    public char gender;

    public void setPersonInfo(String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;

    }
    public void eat(){
        System.out.println(name+ " is eating lunch");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void walk(){
        System.out.println(name+" is walking");
    }
}
