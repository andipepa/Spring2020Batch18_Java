package Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.setOfferInfo("New York","JPM",130000,true);

        Offer offer2=new Offer();
        offer2.setOfferInfo("Hartford","Etna",125000,true);

        Offer offer3=new Offer();
        offer3.setOfferInfo("NJ","Movado",80000,false);

        Offer offer4=new Offer();
        offer4.setOfferInfo("Virginia","GNC",95000,true);

        Offer offer5=new Offer();
        offer5.setOfferInfo("California","Apple",100000,false);


       ArrayList<Offer> offers= new ArrayList<>(Arrays.asList(offer1,offer2,offer3,offer4,offer5));
       // System.out.println(offers);

        offers.removeIf(p -> !p.isFulltime);

        offers.removeIf(p -> p.salary<100000);

        offers.removeIf(p -> !p.location.contains("New York"));

        for(Offer each : offers ){
            System.out.println(each);
        }



     /* Offer[] arr={offer1,offer2,offer3,offer4,offer5};

      for(int i=0;i<arr.length;i++){

          System.out.println(arr[i]);
      }     */

    }
}
