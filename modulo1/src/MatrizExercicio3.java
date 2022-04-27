import java.util.Scanner;

public class MatrizExercicio3 {

        public static void main(String[] args) {
            matriz(3, 2, 1);

        }
        public static int matriz(int linha, int coluna, int colunas) {
            Scanner sc = new Scanner(System.in);
            int[][][] matriz = new int[linha][coluna][colunas];
            System.out.println("O número de linhas da matriz é" + matriz.length);
            System.out.println("O número de colunas da matriz é" + matriz[0].length);
            System.out.println("O número de colunas da matriz é" + matriz[0][0].length);
            for (int l = 0; l < linha; l++) {
                for (int c = 0; c < coluna; c++) {
                    for (int p = 0; p < coluna; p++) {
                        System.out.printf("Digite o npumero na linha %d, coluna %d e profundidade %d: ", l + 1, c + 1, p + 1);
                        matriz[l][c][p] = (int) sc.nextDouble();
                    }
                }
            }
            for (int l = 0; l < linha; l++) {
                for (int c = 0; c < coluna; c++) {
                    for (int p = 0; p < coluna; p++) {
                        System.out.print(" " + (matriz[l][c][p]));
                    }
                }
                System.out.println();
            }
            return (0);
        }
    }

