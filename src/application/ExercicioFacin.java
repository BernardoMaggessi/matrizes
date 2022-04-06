package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFacin {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("qual a raiz da matriz?");
        int n = sc.nextInt();

        double[][] mat = new double[n][n];

        System.out.println("valores da matriz:");
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
              mat[i][j] = sc.nextDouble();
            }
        }
        System.out.println("matriz digitada:");
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                System.out.print(" "+mat[i][j]);
            }
            System.out.println();
        }
        System.out.println("Soma da diagonal");
        double soma = 0.0;
        for(int i=0; i<n;i++){
            soma = soma + mat[i][i];
            }
        System.out.printf("Soma da diagonal principal = %.1f%n", soma);
    }

}
