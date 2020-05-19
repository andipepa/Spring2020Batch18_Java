package day40_Encapsulation;

public class CredentialsObjects {
    public static void main(String[] args) {
        Credentials facebook= new Credentials();

        facebook.setUsernaem("AndiPepa");
        facebook.setPasword(123456);

        System.out.println("User Name: "+facebook.getUsernaem());
        System.out.println("Pasword: "+facebook.getPasword());

    }

}
