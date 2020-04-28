package officehours_05_15;

import java.util.Arrays;

public class SingleDarray {
    public static void main(String[] args) {
        String []  names= {"Andi","John","Luis"};

        int length= names.length;
        String[] namesRev = new  String[length];

        namesRev[0] = names[2] ;
        namesRev[1] = names[1];
        namesRev[2] = names[0];

        System.out.println(Arrays.toString(namesRev));
int j=0;

for(int i=0; i>= length;i++){
    namesRev[i]=names[j];
}


        System.out.println(Arrays.toString(namesRev));
    }
}
