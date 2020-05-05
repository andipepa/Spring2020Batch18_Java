package day34_CustomClass2;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testersTeam = new ArrayList<>();

    public void hireTester(Tester tester){

        testersTeam.add(tester);
    }

    public void fireTester(long employeeID){
        testersTeam.removeIf(p -> p.employeeID==employeeID);
    }

}
