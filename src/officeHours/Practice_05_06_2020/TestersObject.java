package officeHours.Practice_05_06_2020;

public class TestersObject {
    public static void main(String[] args) {

        Tester tester1= new Tester();
        tester1.setTesterInfo("Andi",123,"QA",120000);
        System.out.println(tester1);

        Tester tester2= new Tester();
        tester2.setTesterInfo("John",134,"SDET",120000);

        tester1.smokeTesting();
        tester2.creatingTicket();

    }

}
