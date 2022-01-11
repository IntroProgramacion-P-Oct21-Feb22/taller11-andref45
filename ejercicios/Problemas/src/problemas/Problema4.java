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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int cedula;
        int valor;
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su cédula");
        cedula = entrada.nextInt();

        System.out.println("Ingrese 1 para calcular el valor a pagar de la luz,"
                + " ingrese 2 para calcular el valor del predio");
        valor = entrada.nextInt();

        if (valor == 1) {
            calcularValorLuz(nombre, cedula);
        } else {
            if (valor == 2) {
                calcularPredio(nombre, cedula);
            }
        }
    }

    public static void calcularValorLuz(String nombre, int cedula) {
        Scanner entrada = new Scanner(System.in);
        double valorkilow;
        double kmes;
        double valorT;
        System.out.println("Ingrese el valor del kilowatio");
        valorkilow = entrada.nextDouble();

        System.out.println("Ingrese el número de kilowatios del mes");
        kmes = entrada.nextDouble();
        valorT = valorkilow * kmes;

        System.out.printf("Cliente %s con cédula %d debe cancelar el valor de "
                + "$%.0f\n", nombre, cedula, valorT);
    }

    public static void calcularPredio(String nombre, int cedula) {
        Scanner entrada = new Scanner(System.in);
        double inmueble;
        double valorT;
        System.out.println("Ingrese el valor del inmueble");
        inmueble = entrada.nextDouble();
        valorT = (inmueble * 2) / 100;
        System.out.printf("Cliente %s con cédula %d tiene un bien inmueble "
                + "valorado en $%.0f y tiene que pagar de predio $ %.0f\n",
                nombre, cedula, inmueble, valorT);
    }
}
