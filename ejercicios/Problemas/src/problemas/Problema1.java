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
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        imprimirDatos(informacion);
    }

    public static void imprimirDatos(int[][] datos) {
        String cadena = "";
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (datos[i][j] % 2 == 0) {
                    cadena = String.format("%s%d\n", cadena, datos[i][j]);
                }
            }
        }
        System.out.printf("Los valores pares del arreglo son:\n%s", cadena);
    }

}
