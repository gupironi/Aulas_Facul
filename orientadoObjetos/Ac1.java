package ac1;
import java.util.*;
public class Ac1 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        char gamer = 'O';
        char matriz[][] = initialize();

        System.out.println();
        System.out.println("Bem vindo ao jogo da velha.\n");

        int st = status(matriz);

        while(st == -1) {
            exibe(matriz);
            System.out.print("Jogador '" + gamer + "', escolha a linha: ");
            int linha = entrada.nextInt();
            System.out.print("Jogador '" + gamer + "', escolha a coluna: ");
            int coluna = entrada.nextInt();

            System.out.println();

            boolean s = step(matriz,linha, coluna, gamer);

            if (s ==true) {
                if(gamer == 'O') {
                    gamer = 'X';
                } else if (gamer == 'X') {
                    gamer = 'O';
                }
            }
            st = status(matriz);
        }

        exibe(matriz);
        entrada.close();
        if (st == 1) {
            System.out.println("O jogador 'O' venceu.");
        } else if (st==2) {
            System.out.println("O jogador 'X' venceu.");

        } else if (st ==0) {
            System.out.println("O jogo empatou.");
        }

        System.out.println();}
        public static char[][] initialize(){

            char matriz[][] = {{'-', '-', '-'},
                    {'-', '-', '-'},
                    {'-', '-', '-'}};
            return matriz;

        }

        public static boolean step (char matriz[][], int linha, int coluna, char gamer) {

            if(matriz[linha][coluna] == '-') {
                matriz[linha][coluna] = gamer;
                return true;
            }else {
                System.out.println("Esta posição está ocupada, tente outra");
                return false;
            }

        }

        public static int status (char matriz[][]) {

            if (matriz[0][0]  == 'X' && matriz[0][1]  == 'X' && matriz[0][2] == 'X' ||
                    matriz[1][0] == 'X' && matriz[1][1] == 'X' && matriz[1][2] == 'X' ||
                    matriz[2][0] == 'X' && matriz[2][1] == 'X' && matriz[2][2] == 'X' ||
                    matriz[0][0] == 'X' && matriz[1][0] == 'X' && matriz[2][0] == 'X' ||
                    matriz[0][1] == 'X' && matriz[1][1] == 'X' && matriz[2][1] == 'X' ||
                    matriz[0][2] == 'X' && matriz[1][2] == 'X' && matriz[2][2] == 'X' ||
                    matriz[0][0] == 'X' && matriz[1][1] == 'X' && matriz[2][2] == 'X' ||
                    matriz[0][2] == 'X' && matriz[1][1] == 'X' && matriz[2][0] == 'X') {
                return 2;
            } else if (matriz[0][0]== 'O'  && matriz[0][1]== 'O' && matriz[0][2] == 'O' ||
                       matriz[1][0]== 'O' && matriz[1][1]== 'O' && matriz[1][2] == 'O' ||
                       matriz[2][0]== 'O' && matriz[2][1]== 'O' && matriz[2][2] == 'O' ||
                       matriz[0][0]== 'O' && matriz[1][0]== 'O' && matriz[2][0] == 'O' ||
                       matriz[0][1]== 'O' && matriz[1][1]== 'O' && matriz[2][1] == 'O' ||
                       matriz[0][2]== 'O' && matriz[1][2]== 'O' && matriz[2][2] == 'O' ||
                       matriz[0][0]== 'O' && matriz[1][1]== 'O' && matriz[2][2] == 'O' ||
                       matriz[0][2]== 'O' && matriz[1][1]== 'O' && matriz[2][0] == 'O') {
                return 1;
            } else if (matriz[0][0]  != '-' && matriz[0][1]  != '-' && matriz[0][2]  != '-' &&
                       matriz[1][0]  != '-' && matriz[1][1]  != '-' && matriz[1][2]  != '-' &&
                       matriz[2][0]  != '-' && matriz[2][1]  != '-' && matriz[2][2]  != '-') {
                return 0;
            } else {
                return -1;
            }
        }

        public static void exibe(char matriz[][]) {

            for (int l = 0; l < matriz.length; l++) {
                for (int c = 0; c < matriz[0].length; c++) {
                    System.out.print(matriz[l][c] + "\t");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("========================");
            System.out.println();
        }
    
    }