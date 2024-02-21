package Array2d;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        int sum = 0;
        int row = 1;

        int integers[] [] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};

        for (int i = 0; i < integers.length; i++) {
             for (int j = 0; j <= integers.length; j++) {
                 sum = sum + integers[i][j];
             }
            System.out.println("Sum of row " + row + ": " + sum);
             sum = 0;
             row++;
        }

        int column = 0;

        for (int j = 0; j <= integers.length; j++) {
            for (int i = 0; i < integers.length; i ++) {
                sum = sum + integers[i][j];
            }


            System.out.println("Sum of column " + column + ": " + sum);
            sum = 0;
            column++;
        }

    }

    public static void printArray(int [][] integers) {
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++){
                System.out.println(integers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
