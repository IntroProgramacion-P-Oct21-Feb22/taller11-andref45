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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int valor;
        System.out.println("Ingrese un número hasta el 3");
        valor = entrada.nextInt();
        if (valor == 1) {
            obtenerAreaCuadrado();
        } else {
            if (valor == 2) {
                obtenerAreaTriangulo();
            } else {
                if (valor == 3) {
                    obtenerAreaRectangulo();
                }
            }
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;
        System.out.println("Ingrese el valor de un lado");
        lado = entrada.nextDouble();
        area = lado * lado;
        System.out.printf("El área del cuadrado es %.2f\n", area);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.printf("El área del triángulo es %.2f\n", area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.printf("El área del rectángulo es %.2f\n", area);
    }

}
