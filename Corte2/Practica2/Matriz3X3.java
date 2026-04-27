package matrices;

import java.util.Scanner;

public class Matriz3x3 {

    private int[][] data = new int[3][3];

    public int getValor(int i, int j) {
        return data[i][j];
    }

    public void setValor(int i, int j, int valor) {
        data[i][j] = valor;
    }

    public void llenar(Scanner sc) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("Dato[" + i + "][" + j + "]: ");
                setValor(i, j, sc.nextInt());
            }
    }

    public void mostrar() {
        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(getValor(i, j) + " ");
            System.out.println();
        }
    }

    public Matriz3x3 sumar(Matriz3x3 b) {
        Matriz3x3 r = new Matriz3x3();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                r.setValor(i, j, getValor(i, j) + b.getValor(i, j));
        return r;
    }

    public Matriz3x3 multiplicar(Matriz3x3 b) {
        Matriz3x3 r = new Matriz3x3();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                int suma = 0;
                for (int k = 0; k < 3; k++)
                    suma += getValor(i, k) * b.getValor(k, j);
                r.setValor(i, j, suma);
            }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Matriz3x3 A = new Matriz3x3();
        Matriz3x3 B = new Matriz3x3();

        System.out.println("Primera matriz:");
        A.llenar(sc);

        System.out.println("Segunda matriz:");
        B.llenar(sc);

        System.out.println("\nSuma:");
        A.sumar(B).mostrar();

        System.out.println("\nMultiplicación:");
        A.multiplicar(B).mostrar();
    }
}