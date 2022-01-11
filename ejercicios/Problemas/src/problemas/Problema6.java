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
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media = obtenerPromedioDatos(informacion);
        double desviacion = obtenerDesviacion(informacion);
        System.out.printf("El valor de la media aritmética es: %.2f\n",
                media);
        System.out.printf("El valor de la desviación estándar es: %.2f\n",
                desviacion);
    }

    public static double obtenerPromedioDatos(int[] datos) {
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
        double promedio;
        promedio = suma / datos.length;
        return promedio;
    }

    public static double obtenerDesviacion(int numArray[]) {

        double sum = 0.0, desviacion = 0.0;

        int length = numArray.length;

        for (double num : numArray) {
            sum += num;
        }

        double mean = sum / length;
        for (double num : numArray) {

            desviacion += Math.pow(num - mean, 2);
        }
        return Math.sqrt(desviacion / length);

    }

}
