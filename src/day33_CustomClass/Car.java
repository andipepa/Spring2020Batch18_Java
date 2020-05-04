package day33_CustomClass;

import java.time.Year;

public class Car {
    String Brand;
    String Model;
    String Color;
    int year;

    public void start(){
        System.out.println(Brand+" is started");
    }

    public void drive(){

        System.out.println("Driving "+Brand+" "+Model);
    }

    public void getCarInfo(){
        System.out.println(year+" "+Brand+" "+Model+" "+Color);

    }
    public void setCarInfo(String carBrand , String carModel, int caryear, String carColor){
       Brand = carBrand;
       Model = carModel;
       Color = carColor;
       year= caryear;
    }

    public String toString(){
        String result= Brand+" "+Model+" "+Color+" "+year;
        return result ;
    }


}
