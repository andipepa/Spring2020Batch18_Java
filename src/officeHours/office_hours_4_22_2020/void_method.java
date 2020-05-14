package officeHours.office_hours_4_22_2020;

public class void_method {
    public static void main(String[] args) {
print();
vote(18,true);
buyAlchohol(20);


    }

    public static void print(){
        for(int i=0;i<5;i++) {
            System.out.println("Hello Batch 18");

        }
        System.out.println("===================");

    }

    public static void vote(int age,boolean UScitizen){
        boolean eligibletovote= age>=18&&UScitizen==true;
        if(eligibletovote){
            System.out.println("Go and vote");
        }else{
            System.out.println("Stay home");
        }
    }
public static void buyAlchohol(int age){
        boolean eligible= age>=21;
        if(eligible){
            System.out.println("Here is your drink");
        }else{
            System.out.println("Drink milk");
        }
}

}
