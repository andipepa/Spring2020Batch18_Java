package officeHours.Practice_04_08_2020;

public class forloop_task {
    public static void main(String[] args) {


        String rsult = "";
        String name = "andi";
        int index = name.length() - 1;

        for (int i = index; i >= 0; i--) {
            rsult += name.substring(i, i+ 1);


        }
        System.out.println(rsult);
    }
    }
