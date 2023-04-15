package JavaProjectArray;

public class Exercise4 {
    public static void main(String[] args) {

        int[][] numbers = {{2, 4, 6, 8, 10, 12},
                {1, 3, 5, 7, 9, 11},
                {7, 6, 5, 4, 9, 51}
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length; j++) {

                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }


    }
}


