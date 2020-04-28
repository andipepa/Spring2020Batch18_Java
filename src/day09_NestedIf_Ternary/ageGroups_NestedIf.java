package day09_NestedIf_Ternary;

public class ageGroups_NestedIf {
    /*
    write a program that can define age groups of a person
    Teenager( <21)
    adult(>=&& <55)
    senior (>55)
     */
    public static void main(String[] args) {

        int age=55;
        String ageGroup="";
        if(age<150&&age>0){
            if(age<21){
                ageGroup="Teenager";
            }else if(age<55){
                ageGroup="Adult";
            }else{
                ageGroup="senior";
            }



        }else{
            ageGroup="invalid group";
        }

        System.out.println(ageGroup);


    }

}
