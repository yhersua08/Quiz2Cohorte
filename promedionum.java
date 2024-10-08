package poo;

import java.util.Scanner;

public class AnalisisNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int sumaPares = 0, sumaImpares = 0;
        int cuentaPares = 0, cuentaImpares = 0;
        int sumaPosicionesPares = 0;

        // Entrada de los numeros
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingresa el número en la posición " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // proceso analisis de los numeros
        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 == 0) { // condicion para verificar si es Número par
                sumaPares += numeros[i];
                cuentaPares++;
            } else { // condicion parsiguiente si es Número impar
                sumaImpares += numeros[i];
                cuentaImpares++;
            }

            if (i % 2 == 0) { // proceso para hallar posiciones pares (0, 2, 4, ..., 18)
                sumaPosicionesPares += numeros[i];
            }
        }

        double promedioPares = (cuentaPares > 0) ? (double) sumaPares / cuentaPares : 0;
        double promedioImpares = (cuentaImpares > 0) ? (double) sumaImpares / cuentaImpares : 0;

        // Resultados
        System.out.println("Promedio de números pares: " + promedioPares);
        System.out.println("Promedio de números impares: " + promedioImpares);
        System.out.println("Suma de elementos en posiciones pares: " + sumaPosicionesPares);
    }
}
