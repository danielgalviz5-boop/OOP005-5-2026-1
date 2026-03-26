/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectorheca1;

import java.util.Scanner;

/**
 *
 * @author Deiby
 */
public class Vectorheca1 {

    private int [] vector;
    private int tamaño;

    // Constructor
    public Vectorheca1(int t) {
        tamaño = t;
        vector = new int[tamaño];
    }

    // Método para llenar el vector
    public void llenarVector() {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese número en la posición " + i + ": ");
            vector[i] = entrada.nextInt();
        }
    }

    // Método para mostrar el vector
    public void mostrarVector(String nombre) {
        System.out.print(nombre + " = [ ");

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);

            if (i != vector.length - 1) {
                System.out.print(" - ");
            }
        }

        System.out.println(" ]");
    }

    public static void main(String[] args) {

        Vectorheca1 v = new Vectorheca1(8);

        v.llenarVector();
        v.mostrarVector("Vector ingresado");
    }
}
