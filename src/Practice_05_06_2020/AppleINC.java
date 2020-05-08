package Practice_05_06_2020;

public class AppleINC {
    public static void main(String[] args) {

        Tester tester1= new Tester();
        tester1.setTesterInfo("Adam",123,"SDET",120000);

        Tester tester2= new Tester();
        tester2.setTesterInfo("Ali",134,"Junior Tester",110000);

        Tester tester3= new Tester();
        tester3.setTesterInfo("Muhtar",124,"QA",130000);

        ScrumTeam scrum1= new ScrumTeam();

        scrum1.hireTester(tester3);
        scrum1.hireTester(tester1);
        scrum1.hireTester(tester2);

        scrum1.fireTester(134);

       // scrum1.testersTeam return the array list of testersteam

        for( Tester each : scrum1.testersTeam){
            System.out.println(each);
        }



    }
}
