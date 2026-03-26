/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Deiby
 */

public class Calculadora {

    private int num1;
    private int num2;

    // Constructor
    public Calculadora(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    public int sumar() {
        return num1 + num2;
    }

    public int restar() {
        return num1 - num2;
    }

    public int multiplicar() {
        return num1 * num2;
    }

    public int dividir() {
        return num1 / num2;
    }

    public static void main(String[] args) {

        Calculadora calc1 = new Calculadora(10, 2);
        Calculadora calc2 = new Calculadora(20, 4);

        System.out.println("Resultados del objeto calc1:");
        System.out.println("Suma: " + calc1.sumar());
        System.out.println("Resta: " + calc1.restar());
        System.out.println("Multiplicación: " + calc1.multiplicar());
        System.out.println("División: " + calc1.dividir());

        System.out.println("\nResultados del objeto calc2:");
        System.out.println("Suma: " + calc2.sumar());
        System.out.println("Resta: " + calc2.restar());
        System.out.println("Multiplicación: " + calc2.multiplicar());
        System.out.println("División: " + calc2.dividir());
    }
}
