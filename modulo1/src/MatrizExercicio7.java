import java.util.Random;

public class MatrizExercicio7 {
    public static void main(String[] args) {
        int l = new Random().nextInt(1,10);
        int c = new Random().nextInt(1,10);
        int[][] mtz = new int[l][c];
        troca(l, c, mtz);
    }
    public static int troca(int linha, int coluna, int[][] mtz) {
        matriz(linha, coluna, mtz);
        int soma = 0;
        for (linha = 0; linha < mtz.length; linha++) {
            for (coluna = 0; coluna < mtz[0].length; coluna++) {
                if ((mtz[linha][coluna]) % 2 == 0){
                    mtz[linha][coluna] = 1;
                }else{
                    mtz[linha][coluna] = -1;
                }
                System.out.print(" " + mtz[linha][coluna] + " ");
            }
            System.out.println();
        }
        return (0);
    }
    public static int matriz(int linhas, int colunas, int[][] mtz) {
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                mtz[l][c] = new Random().nextInt(100);
            }
        }
        return (1);
    }
}
