package Ejercicios;

import java.util.Scanner;

public class EjercicioC {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int imp = 0;
        int total = 0;
        int parMayor = 0;

        do {

            System.out.println("Dime un numero, si es negativo saldras del bucle:");
            numero = sc.nextInt();

            

            if(numero % 2 != 0 && numero >= 0) {
                imp++;
                total++;
            } else if(numero % 2 == 0 && numero >= 0) {
                if(numero > parMayor) {
                    parMayor = numero;
                }
                total++;
            }

        }while(numero >= 0);

        System.out.println("Has introducido " + total + " numeros.");
        System.out.println("Has introducido " + imp + " numeros impares.");
        System.out.println("El numero par mayor es: " + parMayor);

    }
    
}
