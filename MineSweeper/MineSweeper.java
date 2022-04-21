import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int columnNumber;
    boolean isWin=true;
    MineSweeper(int rowNumber,int columnNumber){
        this.rowNumber=rowNumber;
        this.columnNumber=columnNumber;
    }
    void putMine(String[][] arr){
        int boxesNum=(arr.length*arr[0].length);
        int mineNum=boxesNum/4;
        Random rand=new Random();
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=" - ";
            }
        }
        for (int i=1;i<=mineNum;i++){
            int randomRow=rand.nextInt(arr.length);
            int randomColumn=rand.nextInt(arr[0].length);
            arr[randomRow][randomColumn]=" * ";
        }
    }
    public void selectBox(String[][] board,String[][] mineBoard,int row,int col){

        if(mineBoard[row][col].equals(" * ")){
            System.out.println("Oyunu KAYBETTİNİZ!");
            print(mineBoard);
            isWin=false;
        }else if(mineBoard[row][col].equals(" - ")){
            int count=0;
            if (row==0){
                if (col==0){
                    for(int i=row;i<=row+1;i++){
                        for (int j=col;j<=col+1;j++){
                            if(mineBoard[i][j].equals(" * ")){
                                count++;
                            }
                        }
                    }
                }else if (col==mineBoard[0].length-1){
                    for(int i=row;i<=row+1;i++){
                        for (int j=col-1;j<=col;j++){
                            if(mineBoard[i][j].equals(" * ")){
                                count++;
                            }
                        }
                    }
                }else {
                    for (int i = row; i <= row + 1; i++) {
                        for (int j = col - 1; j <= col + 1; j++) {
                            if (mineBoard[i][j].equals(" * ")) {
                                count++;
                            }
                        }
                    }
                }
            }else if(row==mineBoard.length-1){
                if (col==0){
                    for(int i=row-1;i<=row;i++){
                        for (int j=col;j<=col+1;j++){
                            if(mineBoard[i][j].equals(" * ")){
                                count++;
                            }
                        }
                    }
                }else if (col==mineBoard[0].length-1){
                    for(int i=row-1;i<=row;i++){
                        for (int j=col-1;j<=col;j++){
                            if(mineBoard[i][j].equals(" * ")){
                                count++;
                            }
                        }
                    }
                }else {
                    for (int i = row-1; i <= row; i++) {
                        for (int j = col - 1; j <= col + 1; j++) {
                            if (mineBoard[i][j].equals(" * ")) {
                                count++;
                            }
                        }
                    }
                }
            }else if (col==0){
                for(int i=row-1;i<=row;i++){
                    for (int j=col;j<=col+1;j++){
                        if(mineBoard[i][j].equals(" * ")){
                            count++;
                        }
                    }
                }
            }else if (col==mineBoard[0].length-1){
                for(int i=row-1;i<=row;i++){
                    for (int j=col-1;j<=col;j++){
                        if(mineBoard[i][j].equals(" * ")){
                            count++;
                        }
                    }
                }
            }else {
                for (int i = row - 1; i <= row + 1; i++) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        if (mineBoard[i][j].equals(" * ")) {
                            count++;
                        }
                    }
                }
            }
            board[row][col]=" "+count+" ";
            print(board);
        }
    }
    public void print(String[][] board){
        for (String[] row : board){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public void run(){
        String[][] board=new String[rowNumber][columnNumber];
        String[][] mineBoard=new String[rowNumber][columnNumber];
        putMine(mineBoard);

        System.out.println("========Mayın Tarlası========");
        for(int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                board[i][j]=" - ";
            }
        }
        print(board);
        System.out.println("===============================");
        Scanner inp=new Scanner(System.in);
        int boxesNum=(rowNumber*columnNumber);
        int mineNum=boxesNum/4;
        int counter=boxesNum-mineNum;
        do {
             System.out.println("Satır giriniz:");
             int row = inp.nextInt();
             System.out.println("Sütun giriniz:");
             int col = inp.nextInt();
             if (row<rowNumber && col<columnNumber){
             selectBox(board, mineBoard, row, col);
            }
            if (row>=rowNumber || col>=columnNumber){
                System.out.println("Geçersiz koordinat girdiniz.");
                counter+=1;
            }
            if (!isWin){
                break;
            }
             System.out.println("===============================");
         counter--;
         if(counter==0){
             System.out.println("Oyunu KAZANDINIZ.");
             print(mineBoard);
         }
        }while (counter!=0);
    }
}
