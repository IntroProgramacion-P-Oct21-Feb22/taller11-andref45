/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int suma = obtenerSuma(informacion);
        System.out.printf("El valor de la suma es: %d\n", suma);
    }

    public static int obtenerSuma(int[][] s) {
        int suma = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < 3; j++) {
                suma = suma + s[i][j];
            }
        }
        return suma;
    }
}
