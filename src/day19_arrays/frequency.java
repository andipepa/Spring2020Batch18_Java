package day19_arrays;
/*
write a program that can return the frequency of the characters ina string
		Ex: "AABCBCA" ==> "A3B2C2"
 */
public class frequency {
    public static void main(String[] args) {
        String str = "AABCCC";
        String result="";
        String noDub = ""; //ABC

        for( int i =0; i<=str.length()-1; i++){
            ///this is for removing dublicate
            if(!noDub.contains(""+str.charAt(i))){
                noDub+=str.charAt(i);

            }

        }
        System.out.println(noDub);

       for(int j =0; j<= noDub.length()-1;j++){
          noDub.charAt(j) ;


            int count =0; //count how many time each character ocures

            for(int i=0; i<=str.length()-1; i++){
                if(str.charAt(i)==noDub.charAt(j)){
                    count++;
                }
            }

            result+=""+ noDub.charAt(j)+count; //this gives how many a are there


        }
        System.out.println(result);
    }
}
