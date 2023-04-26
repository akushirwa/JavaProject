package JavaProjectArray;

public class Exercise4 {
    public static void main(String[] args) {

        int[][] numbers = {{2, 4, 6, 8, 10, 12},
                {1, 3, 5, 7, 9, 11},
                {7, 6, 5, 4, 9, 51},
                {4,8,7,23,45,12,58}
        };

        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length; j++) {
                int evenNumber=numbers[i][j];
                if(evenNumber%2==0)
                    sum+=evenNumber;
            }

        }
        System.out.println("The sum of all the even numbers in the array is "+sum);

        sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int oddNumber= numbers[i][j];
                if(oddNumber%2!=0){
                    sum+=oddNumber;
                }
            }

        }
        System.out.println("The sum of all the odd numbers in the array is "+sum);



    }
}


