package JavaProjectArray;

public class Exercise9 {
    public static void main(String[] args) {

        int [] numbers={10,15,4,20,24,5,13,13};

        int highestnum=numbers[0];
        int secondhighnum=numbers[0];


        for (int i = 0; i < numbers.length; i++) {
            if (highestnum<numbers[i]){
                highestnum=numbers[i];
            }

        }
        System.out.println("The highest number in array is "+highestnum);

        for (int i = 0; i < numbers.length; i++) {
            if (secondhighnum<numbers[i] && numbers[i]!=highestnum){
                secondhighnum=numbers[i];
            }

        }
        System.out.println("But the second highest number in the array is "+secondhighnum);





    }
}
