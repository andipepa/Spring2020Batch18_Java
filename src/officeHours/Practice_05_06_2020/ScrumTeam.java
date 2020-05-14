package officeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testersTeam= new ArrayList<>();
    ArrayList<Developer> devTeam =new ArrayList<>();


    public void fireDeveloper(long id){
        devTeam.removeIf(p -> p.emplyeeId==id );
    }

    public void hireDeveloper(Developer developer){

        devTeam.add(developer);
    }

    public void hireTester(Tester tester){

        testersTeam.add(tester);

    }

    public void fireTester(long id){
        testersTeam.removeIf(p -> p.employeeID==id);

    }

}
