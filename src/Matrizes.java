import java.security.SecureRandom;

public class Matrizes {
    public static void main(String[] args) {

        final int linha = 3;
        final int coluna = 3;
        int[][] numeros = new int[linha][coluna];

        geraDados(numeros, linha, coluna);
        impDados(numeros, linha, coluna);
    }

    public static void geraDados(int[][] mtz, int linhas, int colunas) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                mtz[i][j] = new SecureRandom().nextInt(100);
            }
            System.out.printf("%n");
        }
    }
        public static void impDados ( int[][] mtz, int linhas, int colunas){
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.printf("%d ", mtz[i][j]);
                }
                System.out.printf("%n");
            }
        }
    }


