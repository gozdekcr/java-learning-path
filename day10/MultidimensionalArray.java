package day10;

public class MultidimensionalArray {
    public static void main(String[] args) {
        //int[] array = new int[5];

        int[][] table = new int[][]{
            {1,75,10} , {2,87,13} , {3,95,15} , {4, 109, 27} , {5,102,40}
        };

        int[][] table2 = new int[3][3];
        table2[0][0] = 1;
        table2[0][1] = 9;
        table2[0][2] = 8;

        table2[1][0] = 5;
        table2[1][1] = 102;
        table2[1][2] = 40;

        table2[2][0] = 8;
        table2[2][1] = 12;
        table2[2][2] = 85;


        //table1
        System.out.println("Table1");
        for(int i = 0 ; i < table.length; i++){
            for(int j = 0; j<table[0].length; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------");

        //table2
        System.out.println("Table2");
        for(int g = 0 ; g < table2.length; g++){
            for(int h = 0; h<table2[0].length; h++){
                System.out.print(table2[g][h] + " ");
            }
            System.out.println();
        }


        System.out.println("--------------------------------");

        //for-each
        System.out.println("For-each");
        for (int[] numbers : table2) {
            for (int cell : numbers) {
                System.out.print(cell + " ");
        }
        System.out.println();
}
    }

}
