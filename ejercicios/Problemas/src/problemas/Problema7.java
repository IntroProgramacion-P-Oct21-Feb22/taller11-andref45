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
public class Problema7 {

    public static void main(String[] args) {
        obtenerCiudades();
        String[] nombres = {"Carlos", "Juan", "Antonio", "Pablo", "Sara",
            "Matt", "Jessica", "Cristina"};
        imprimir(nombres);
    }

    public static String[] obtenerCiudades() {
        Scanner entrada = new Scanner(System.in);
        int i;
        System.out.println("Ingrese el número de elementos del arreglo");
        i = entrada.nextInt();
        String[] nombres = new String[i];
        for (int a = 0; a < nombres.length; a++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre de una ciudad del Ecuador");
            nombres[a] = entrada.nextLine();
        }
        System.out.println();
        return nombres;
    }

    public static void imprimir(String[] nombres) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].length() == 4 || nombres[i].length() == 5) {
                System.out.println(nombres[i]);
            }
        }
    }
}
