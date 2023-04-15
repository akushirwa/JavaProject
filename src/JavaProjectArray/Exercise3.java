package JavaProjectArray;

public class Exercise3 {

    /*
    Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.
     */
    public static void main(String[] args) {

        int [][] numbers={{2,4,6,8,10,12},
                          {1,3,5,7,9,11}
        };


        for (int i = 0; i < numbers.length; i++) {
            int [] arry=numbers[i];
            for (int j = 0; j < arry.length; j++) {
                if (arry[j]%2==0){
                    System.out.print(arry[j]+" ");
                }

                }
            System.out.println();
            }

        }









    }
