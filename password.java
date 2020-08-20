import java.util.Scanner;

public class password {
    public static void main(String[] Args){
        String password=" baba b";
        System.out.println("guees password");

        Scanner levo=new Scanner(System.in);
        String guess=levo.nextLine();

        System.out.println(password.equals(guess));


    }
}
