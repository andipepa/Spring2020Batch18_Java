package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1=new Offer();
        offer1.setOfferInfo("New York","JPM",130000,true);

        Offer offer2=new Offer();
        offer2.setOfferInfo("Chicago","Etna",125000,true);

        Offer offer3=new Offer();
        offer3.setOfferInfo("New Jersy","Movado",80000,false);

        Offer offer4=new Offer();
        offer4.setOfferInfo("Virginia","GNC",95000,true);

        Offer offer5=new Offer();
        offer5.setOfferInfo("California","Apple",100000,false);

        Offer[] offers={offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> Accept=new ArrayList<>(Arrays.asList(offers));

        Accept.removeIf(p -> p.salary < 100000 || p.isFulltime==false || p.location !="New York");




        System.out.println(Accept.size());

        for( Offer eachOffer : Accept){

            System.out.println(eachOffer);
        }

    }

}
