import java.util.Scanner;

public class scanner8 {
    public static void main(String[] args) {

        System.out.println("Escribe tu nombre pa:");
        Scanner sc = new Scanner(System.in);
        String pal = sc.nextLine();
        System.out.println("Ingresa tuas años de docente");
        var num = sc.nextLine();

        System.out.println("Tu nombre es" + " " + pal + " " + "y tu tiempo de docente es de" + " " + num + "años.");

    }

}
