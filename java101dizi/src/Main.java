import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] matris = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + "  ");
            }
            System.out.println();
        }
        int [][] rotate = rotateMatris(matris);
        System.out.println("Transpoze Matris : ");
        for (int k =0;k<rotate.length;k++){
            for (int m=0;m<rotate[0].length;m++){
                System.out.print(rotate[k][m] + "  ");
            }
            System.out.println();
        }

    }
    public static int[][] rotateMatris(int[][] matris){
        int[][] trMatris = new int[matris[0].length][matris.length];
        for (int i=0;i< trMatris.length;i++){
            for (int j=0;j< trMatris[0].length;j++){
                trMatris[i][j]=matris[j][i];
            }
        }
        return trMatris;
    }

}