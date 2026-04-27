package matrices;

import java.util.Scanner;

public class Matriz2x2 {

    private int[][] data = new int[2][2];

    public int getValor(int i, int j) {
        return data[i][j];
    }

    public void setValor(int i, int j, int valor) {
        data[i][j] = valor;
    }

    public void llenar(Scanner sc) {
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                System.out.print("Dato[" + i + "][" + j + "]: ");
                setValor(i, j, sc.nextInt());
            }
    }

    public void mostrar() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(getValor(i, j) + " ");
            System.out.println();
        }
    }

    public Matriz2x2 sumar(Matriz2x2 b) {
        Matriz2x2 r = new Matriz2x2();
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                r.setValor(i, j, getValor(i, j) + b.getValor(i, j));
        return r;
    }

    public Matriz2x2 multiplicar(Matriz2x2 b) {
        Matriz2x2 r = new Matriz2x2();
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                int suma = 0;
                for (int k = 0; k < 2; k++)
                    suma += getValor(i, k) * b.getValor(k, j);
                r.setValor(i, j, suma);
            }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Matriz2x2 A = new Matriz2x2();
        Matriz2x2 B = new Matriz2x2();

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