package Ejercicios;
import java.util.Scanner;

public class EjercicioB {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la base imponible: ");
        double bImponible = sc.nextDouble();

        sc.nextLine(); //limpiar buffer
        
        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIva = sc.nextLine();

        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromo = sc.nextLine();

        System.out.println("Base imponible: " + bImponible);
        
        switch (tipoIva) {
            case "general":
                System.out.println("IVA (21%): " + (bImponible * 0.21));
                bImponible *= 1.21;
                break;
            case "reducido":
                System.out.println("IVA (10%): " + (bImponible * 0.10));
                bImponible *= 1.10;
                break;
            case "superreducido":
                System.out.println("IVA (4%): " + (bImponible * 0.04));
                bImponible *= 1.04;
                break;
            default:
                System.out.println("Tipo de IVA no válido.");
                return;
        }

        switch (codigoPromo) {
            case "nopro":
                System.out.println("Cód. promo (nopro): 0");
                break;
            case "mitad":
                System.out.println("Cód. promo (mitad): -" + (bImponible / 2));
                bImponible /= 2;
                break;
            case "meno5":
                System.out.println("Cód. promo (meno5): -5");
                bImponible -= 5;
                break;
            case "5porc":
                System.out.println("Cód. promo (5porc): -" + (bImponible * 0.05));
                bImponible *= 0.95;
                break;
            default:
                System.out.println("Código promocional no válido.");
                return;
        }

        System.out.printf("Total: %.2f\n", bImponible);

        
    }

}