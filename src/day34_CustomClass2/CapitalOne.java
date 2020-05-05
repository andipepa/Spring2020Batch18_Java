package day34_CustomClass2;

public class CapitalOne {
    public static void main(String[] args) {

        Tester tester1=new Tester();
        tester1.setTesterInfo("Andi",12345678,"Manual Tester",120000);

        ScrumTeam scrum= new ScrumTeam();

        scrum.hireTester(tester1);

        System.out.println(scrum.testersTeam.size());

        scrum.fireTester(12345678);
        System.out.println(scrum.testersTeam.size());



    }
}
