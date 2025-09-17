package Ejercicios;

import java.util.Scanner;


public class EjercicioD {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        int numero = sc.nextInt();

        System.out.println("Dime un dígito y te dire la posicion de este en el numero anterior:");
        int digito = sc.nextInt();

        String numeroStr = Integer.toString(numero);

        for(int i = 0; i < numeroStr.length(); i++) {
            if(numeroStr.charAt(i) == Integer.toString(digito).charAt(0)) {
                
                System.out.println("El dígito " + digito + " se encuentra en la posición " + (i + 1));

            }
        }

    }

}
