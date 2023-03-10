import java.util.Scanner;

public class tarea1{

    public static void main (String args[]){

        System.out.println("Proporciona el autor:");

        Scanner consola = new Scanner(System.in);

       

        var autor = consola.nextLine();

        System.out.println("autor: " + autor);

        System.out.println("Proporciona el titulo:");

        var titulo = consola.nextLine();

        System.out.println("Fue escrito por: " + " " + autor);

    }}