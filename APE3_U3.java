import java.util.Scanner;

public class APE3_U3 {

    static final int FILAS = 2;
    static final int COLUMNAS = 3;

    public static void main(String[] args) {
        int[][] matrizA = new int[FILAS][COLUMNAS];
        int[][] matrizB = new int[FILAS][COLUMNAS];

        completarMatrices(matrizA, matrizB);

        // Mostrar matrices ingresadas
        System.out.println("\nMatriz A:");
        mostrarMatriz(matrizA);

        System.out.println("Matriz B:");
        mostrarMatriz(matrizB);

        int[][] suma = sumaMatriz(matrizA, matrizB);
        int[][] resta = restaMatriz(matrizA, matrizB);
        int[][] multiplicacion = multiplicacionMatriz(matrizA, matrizB);

        System.out.println("\n--- RESULTADOS ---");

        System.out.println("Suma:");
        mostrarMatriz(suma);

        System.out.println("Resta:");
        mostrarMatriz(resta);

        System.out.println("Multiplicación:");
        mostrarMatriz(multiplicacion);
    }

    // Llenar matrices
    public static void completarMatrices(int[][] A, int[][] B) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los numeros de la Matriz A:");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nIngrese los numerosde la Matriz B:");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }
    }

    // Mostrar matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Suma
    public static int[][] sumaMatriz(int[][] A, int[][] B) {
        int[][] resultado = new int[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                resultado[i][j] = A[i][j] + B[i][j];
            }
        }
        return resultado;
    }

    // Resta
    public static int[][] restaMatriz(int[][] A, int[][] B) {
        int[][] resultado = new int[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                resultado[i][j] = A[i][j] - B[i][j];
            }
        }
        return resultado;
    }

    // Multiplicación 
    public static int[][] multiplicacionMatriz(int[][] A, int[][] B) {
        int[][] resultado = new int[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                resultado[i][j] = A[i][j] * B[i][j];
            }
        }
        return resultado;
    }
}
