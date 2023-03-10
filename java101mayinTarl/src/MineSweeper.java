import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNum;
    int colNum;
    String[][] mayinMap;
    String[][] oyunMap;
    int mayinSayisi;

    MineSweeper(int rowNum, int colNum) {
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.mayinMap = new String[rowNum][colNum];
        this.oyunMap = new String[rowNum][colNum];
        this.mayinSayisi = (rowNum * colNum) / 4;
    }

    void printMap() {
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                System.out.print(this.oyunMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    void gameMap() {
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                this.oyunMap[i][j] = "-";
            }
        }
    }
    public void mayinKoy(){
        Random rand = new Random();
        for (int i =0;i<mayinSayisi;i++){
            int randomRow = rand.nextInt(rowNum);
            int randomCol = rand.nextInt(colNum);
            if (this.mayinMap[randomRow][randomCol] != "*"){
                this.mayinMap[randomRow][randomCol] = "*";
            }else{
                i--;
            }
        }
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if(this.mayinMap[i][j] == "*"){
                    this.mayinMap[i][j]="-";
                }
                System.out.print(this.mayinMap[i][j] + " ");
            }
            System.out.println();
        }
    }
    void printMineMap(){
        for(int i = 0; i < rowNum; i++){
            for(int j = 0; j < colNum; j++){
                System.out.print(this.mayinMap[i][j] + " ");
            }
            System.out.println();
        }
    }
    void run(){
        int totalMove = (rowNum * colNum) -mayinSayisi;
        Scanner input = new Scanner(System.in);

        gameMap();
        System.out.println("May??nlar??n konumu");
        mayinKoy();
        System.out.println("May??n Tarlas??na Ho??geldin !");
        while(totalMove > 0) {
            int mineCounter = 0;

            System.out.println("===========================");
            System.out.println("Kalan Hamle Hakk??n??z : " + totalMove);
            printMap();

            System.out.print("Sat??r Giriniz : ");
            int row = input.nextInt();

            System.out.print("S??tun Giriniz : ");
            int col = input.nextInt();


            if ((row < 0 || row >= rowNum) || (col < 0 || col >= colNum)) {
                System.out.println("Hatal?? Giri?? Yapt??n??z, L??tfen do??ru index numaras?? giriniz !");
                continue;
            } else {
                if (this.mayinMap[row][col] == "*") {
                    System.out.println("Game Over!!");
                    printMineMap();
                    break;
                }if( ! this.oyunMap[row][col].equals("-") ){
                    System.out.println("Bu hamleyi zaten yapt??n??z !");
                    continue;
                }else{
                    int minusRow = (row - 1), plusRow = (row + 1);
                    int minusCol = (col - 1), plusCol = (col + 1);

                    if ( (minusRow < 0) || (minusCol < 0) ){
                        minusRow = 0;
                        minusCol = 0;
                    }
                    if( (plusRow >= rowNum) || (plusCol >= colNum) ){
                        plusRow = row;
                        plusCol = col;
                    }
                    for(int i = minusRow; i <= plusRow; i++){
                        for (int j = minusCol; j<= plusCol; j++){
                            if(this.mayinMap[i][j] == "*"){
                                mineCounter++;
                            }
                        }
                    }
                    String convertMineCounter = String.valueOf(mineCounter);
                    this.oyunMap[row][col] = convertMineCounter;
                    totalMove--;
                }
            }
        }
        if(totalMove == 0){
            System.out.println("Oyunu Kazand??n??z  !");
            printMap();
        }
    }


}