/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        String promedioCualitativo;
        System.out.println("Ingrese su nota 1");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese su nota 2");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese su nota 3");
        nota3 = entrada.nextDouble();
        System.out.println("Ingrese su nota 4");
        nota4 = entrada.nextDouble();
        promedioCualitativo = obtenerPromedioCualitativo(nota1, nota2,
                nota3, nota4);
        System.out.printf("El promedio de las notas: %.0f, %.0f, %.0f, %.0f es "
                + "%s\n",
                nota1,
                nota2,
                nota3,
                nota4,
                promedioCualitativo);
    }

    public static String obtenerPromedioCualitativo(double n1, double n2,
            double n3, double n4) {
        double promedio;
        String promedioCualitativo = "";
        promedio = (n1 + n2 + n3 + n4) / 4;
        if (promedio >= 0 && promedio <= 5) {
            promedioCualitativo = "Regular";
        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                promedioCualitativo = "Bueno";
            } else {
                if (promedio >= 8.1 && promedio <= 9) {
                    promedioCualitativo = "Muy Bueno";
                } else {
                    if (promedio >= 9.1 && promedio <= 10) {
                        promedioCualitativo = "Sobresaliente";
                    }
                }
            }
        }
        return promedioCualitativo;
    }
}
