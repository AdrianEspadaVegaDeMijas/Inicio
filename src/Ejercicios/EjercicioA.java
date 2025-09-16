package Ejercicios;
import java.util.Scanner;

public class EjercicioA {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la nota de tu primer trimestre:");
        double nota1 = sc.nextDouble();

        System.out.println("Dime la nota del segundo trimestre:");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2 )/ 2;

        System.out.println("Tu nota media es: " + media + " es aprobado" );
        

        if(media >= 5) {
            
            System.out.println("Tu nota de programacin: " + media);

        }else {

            sc.nextLine();//limpiar buffer

            System.out.println("¿Cual ha sido el resultado de la recuperaccion?(apto/no apto)");
            String recuperacion = sc.nextLine();
            
            if(recuperacion.equalsIgnoreCase("apto")) {
                System.out.println("Tu nota de programacin es: 5");
            } else {
                System.out.println("Tu nota de programacin es: " + media + " es Suspenso");
            }

        }


    }

}
