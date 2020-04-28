package day30_ArrayList;

import java.util.ArrayList;

public class CombineTwoArrays {
    /*
    write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
     */
    public static void main(String[] args) {

        String [] arr1= {"A","B","C"};
        String [] arr2= {"D","E","F"};

        ArrayList<String> list= new ArrayList<>();

        for(int i =0; i<arr1.length; i++){

           String eachElement= arr1[i];
           list.add(eachElement);

        }
        for( String each:arr2){
            list.add(each);

        }



        System.out.println(list);
    }
}
