package day37_Constractor;

public class InstanceBlock {

    static {

        System.out.println("Static Block");
    }


    {
        System.out.println("Instance Block");
    }

    public static void main(String[] args) {
        InstanceBlock obj=new InstanceBlock();
        InstanceBlock obj2=new InstanceBlock();
    }

}
