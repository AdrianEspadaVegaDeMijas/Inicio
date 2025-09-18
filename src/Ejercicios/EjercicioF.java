package Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EjercicioF {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> letras = new HashMap<>();
        letras.put(1, "a");
        letras.put(2, "b");
        letras.put(3, "c");
        letras.put(4, "d");
        letras.put(5, "e");
        letras.put(6, "f");
        letras.put(7, "g");
        letras.put(8, "h");


        HashMap<String, Integer> numeros = new HashMap<>();
        numeros.put("a", 1);
        numeros.put("b", 2);
        numeros.put("c", 3);
        numeros.put("d",4);
        numeros.put("e", 5);
        numeros.put("f", 6);
        numeros.put("g", 7);
        numeros.put("h",8);

        System.out.println("Intr4du3ca la posición del alfil: ");
        String posicion = sc.nextLine();

        //Lista de movimientos
        String[] mov = new String[0];
        List<String> mov1 = new ArrayList<>();

        for(int i = 1; i <= 8; i++){
           
            //fila del alfil en numero
            int fila = Integer.parseInt(String.valueOf(posicion.charAt(1)));

            //columna del alfil en numero
            int columna = 0;
            for(int j = 1; j <= 8; j++){
                if(letras.get(j).equals(String.valueOf(posicion.charAt(0)))) {
                    columna = numeros.get(String.valueOf(posicion.charAt(0)));;
                }
            }

            //guardamos su posicion en un array
            int[][] tablero = new int[8][8];
            tablero[fila-1][columna-1] = 1;



                //movimientos del alfil
                int filaArriba = fila - 1;
                int filaAbajo = fila + 1;
                int columnaIzquierda = columna - 1;
                int columnaDerecha = columna + 1;  

            while(filaArriba <= 8 && columnaIzquierda >= 1 && filaAbajo <= 8 && columnaDerecha <= 8) {




                //Ariva Izquierda
                if(filaArriba <= 8 && columnaIzquierda >= 1) {

                    /*mov = Arrays.copyOf(mov, mov.length + 1);
                    mov[mov.length - 1] = letras.get(columnaIzquierda) + String.valueOf(filaArriba);*/

                    if(mov1.contains(mov1)==false) {
                        mov1.add(letras.get(columnaIzquierda) + String.valueOf(filaArriba));
                    }


                }

                //Arriba Derecha
                if(filaArriba <= 8 && columnaDerecha <= 8) {

                   /*mov = Arrays.copyOf(mov, mov.length + 1);
                    mov[mov.length - 1] = letras.get(columnaDerecha) + String.valueOf(filaArriba);
*/
                    if(mov1.contains(mov1)==false) {
                        mov1.add(letras.get(columnaDerecha) + String.valueOf(filaArriba));
                    }

                }

                //Abajo Izquierda
                if(filaAbajo <= 8 && columnaIzquierda >= 1) {

                   /*  mov = Arrays.copyOf(mov, mov.length + 1);
                    mov[mov.length - 1] = letras.get(columnaIzquierda) + String.valueOf(filaAbajo);
*/
                    if(mov1.contains(mov1)==false) {
                        mov1.add(letras.get(columnaIzquierda) + String.valueOf(filaAbajo));
                    }

                }

                //Abajo Derecha
                if(filaAbajo <= 8 && columnaDerecha <= 8) {

                    /*mov = Arrays.copyOf(mov, mov.length + 1);
                    mov[mov.length - 1] = letras.get(columnaDerecha) + String.valueOf(filaAbajo);
*/
                    if(mov1.contains(mov1)==false) {
                        mov1.add(letras.get(columnaDerecha) + String.valueOf(filaAbajo));
                    }

                }

                //movimientos del alfil
                filaArriba = filaArriba - 1;
                filaAbajo = filaAbajo + 1;
                columnaIzquierda = columnaIzquierda - 1;
                columnaDerecha = columnaDerecha + 1;  
            
            }

        }

        System.out.println("El alfil puede moverse a las siguientes posiciones: ");
        System.out.println(Arrays.toString(mov1.toArray()));
/* 
        System.out.println(Arrays.toString(mov));

         */

            

    }

        
      
        
}
    

