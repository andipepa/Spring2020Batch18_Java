package officeHours;

public class dublicate {
    public static void main(String[] args) {
        String str = "BBNNUUIAAAMMMMPPPP";
        String noDub = "";
        String result = "";

        for(int i=0; i<=str.length()-1;i++) {
            if (!noDub.contains("" + str.charAt(i))) {
                noDub += str.charAt(i);
            }
        }

        System.out.println(noDub);

        for(int j=0; j<=noDub.length()-1;j++){
            noDub.charAt(j);

            int count=0;

            for(int i=0; i<=str.length()-1; i++){
               if(str.charAt(i)==noDub.charAt(j)) {

                   count++;
               }

            }

            result+=""+ noDub.charAt(j)+count;



        }
        System.out.println(result);
    }
}

