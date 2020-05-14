package officeHours.officeHourPractice_03_18_2020;

public class maxAndMinName {
    public static void main(String[] args) {

        String[] names={"Andi","Laura","Nurefsan","Halil","Suleymani"};

        int maxlength =names[0].length();
        int minlength =names[0].length();
        String maxname="";
        String minname="";
        for(int i=0; i<names.length;i++){
            if(names[i].length()>maxlength){
                maxlength=names[i].length();
                maxname=names[i];
            }
if(names[i].length()<minlength){
   minlength=names[i].length();
   minname=names[i];

} }
        System.out.println(maxname);

        System.out.println(minname);



    }
}
