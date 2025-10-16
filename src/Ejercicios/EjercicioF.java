package Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EjercicioF {

    // Los mapas deben ser estáticos en la clase
    private static Map<Integer, String> letras = new HashMap<>();
    private static Map<String, Integer> numeros = new HashMap<>();

    // Método para inicializar los mapas
    public static void inicializaMaps() {
        letras.put(1, "a");
        letras.put(2, "b");
        letras.put(3, "c");
        letras.put(4, "d");
        letras.put(5, "e");
        letras.put(6, "f");
        letras.put(7, "g");
        letras.put(8, "h");

        numeros.put("a", 1);
        numeros.put("b", 2);
        numeros.put("c", 3);
        numeros.put("d", 4);
        numeros.put("e", 5);
        numeros.put("f", 6);
        numeros.put("g", 7);
        numeros.put("h", 8);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Inicializamos los mapas
        inicializaMaps();

        System.out.println("Introduzca la posición del alfil: ");
        String posicion = sc.nextLine();

        // Lista de movimientos
        List<String> mov = new ArrayList<>();

        // fila del alfil en numero
        int fila = Integer.parseInt(String.valueOf(posicion.charAt(1)));

        // columna del alfil en numero
        Integer columna = numeros.get(""+posicion.charAt(0));
        if (columna == null) {
            System.out.println("Error parámetro" +  posicion.charAt(0));
        return;
        }

        // guardamos su posicion en un array
        int[][] tablero = new int[8][8];
        tablero[fila - 1][columna - 1] = 1;

        // movimientos del alfil
        int filaArriba = fila + 1;
        int filaAbajo = fila - 1;
        int columnaIzquierda = columna - 1;
        int columnaDerecha = columna + 1;

        while (filaArriba <= 8 || columnaIzquierda >= 1 || filaAbajo >= 8 || columnaDerecha <= 8) {

            // Ariva Izquierda
            if (filaArriba <= 8 && columnaIzquierda >= 1) {

                if (!mov.contains(letras.get(columnaIzquierda) + String.valueOf(filaArriba))) {
                    mov.add(letras.get(columnaIzquierda) + String.valueOf(filaArriba));
                }
            }

            // Arriba Derecha
            if (filaArriba <= 8 && columnaDerecha <= 8) {

                if (!mov.contains(letras.get(columnaDerecha) + String.valueOf(filaArriba))) {
                    mov.add(letras.get(columnaDerecha) + String.valueOf(filaArriba));
                }
            }

            // Abajo Izquierda
            if (filaAbajo >= 1 && columnaIzquierda >= 1) {

                if (!mov.contains(letras.get(columnaIzquierda) + String.valueOf(filaAbajo))) {
                    mov.add(letras.get(columnaIzquierda) + String.valueOf(filaAbajo));
                }
            }

            // Abajo Derecha
            if (filaAbajo >= 1 && columnaDerecha <= 8) {

                if (!mov.contains(letras.get(columnaDerecha) + String.valueOf(filaAbajo))) {
                    mov.add(letras.get(columnaDerecha) + String.valueOf(filaAbajo));
                }
            }

            // movimientos del alfil
            filaArriba = filaArriba + 1;
            filaAbajo = filaAbajo - 1;
            columnaIzquierda = columnaIzquierda - 1;
            columnaDerecha = columnaDerecha + 1;

        }

        System.out.println("El alfil puede moverse a las siguientes posiciones: ");
        System.out.println(Arrays.toString(mov.toArray()));

        sc.close();

    }

}
