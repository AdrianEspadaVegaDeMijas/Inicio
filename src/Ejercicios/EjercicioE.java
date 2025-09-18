package Ejercicios;

import java.util.Scanner;

public class EjercicioE {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        //preguntar altura de la piramide
        System.out.println("Dime la altura de la piramide (NUMERO ENTERO MAYOR QUE 3): ");
        int n = sc.nextInt();

        int cont = n-1;

        for(int i = 0; i < n; i++) {

            //Espacio a la izquierda
            for(int j = 0; j < cont; j++) {
            
                System.out.print(" ");
            
            }

            //Contador de espacios a la izquierda
            cont--;

           for(int j = 0; j < 6 + i + i; j++) {

                if(i % 2 != 0 && j > i && j <= i + 4) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }

            }
            
            System.out.println();

        }

    }
    
}
