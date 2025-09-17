package Ejercicios;

import java.util.Scanner;

public class EjercicioE {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la altura de la piramide (NUMERO ENTERO MAYOR QUE 3): ");
        int n = sc.nextInt();

        int cont = n-1;

        for(int i = 0; i < n*2; i = i + 2) {

            for(int j = 0; j < cont; j++) {
                System.out.print(" ");
                
            }
            cont--;

            for(int j = 0; j < 6 + i; j++) {

                System.out.print("*");

            }


            System.out.println();

        }

    }
    
}
