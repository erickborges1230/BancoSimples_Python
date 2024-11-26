package matriz;

import java.util.Scanner;
public class matriz {
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas: ");
        int linha = sc.nextInt();
        System.out.println("Digite a quantidade de colunas: ");
        int coluna = sc.nextInt();

        int [][] matriz = new int[linha][coluna];
        System.out.println("Digite os elementos que pertence: ");
        //leitura dos dados da matriz
        for(int i=0; i<linha; i++)
            for (int j = 0; j < coluna; j++) matriz[i][j] = sc.nextInt();
        for (int i=0; i<linha; i++){// impressão dos dados fornecidos
            for(int j=0; j<coluna; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}