package officeHours.officeHourPractice_03_18_2020;

public class multidimensionalarr {
    public static void main(String[] args) {



        String[] DevTeam = {"Zeynep", "Haider", "Jovid", "Muhtar"};

        String[] TestersTeam = {"Rahman", "Aishan", "Osman", "Ali"};

        String[] PO = {"Barzy", "Donald"};

        String[] TestersTeam2  ={"Ilham", "Zarina", "Aizhan", "Asiman"} ;


        String[][] ScrumTeam = { DevTeam, TestersTeam,  PO };
        //              0,        1      ,  2
        ScrumTeam[0][3]  = "Jean";

        ScrumTeam[1] = TestersTeam2;

        System.out.println(ScrumTeam[0][3]);
        String info = ScrumTeam[1][2];

        System.out.println(info);



    }
}