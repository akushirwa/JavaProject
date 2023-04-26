package JavaProjectArray;

public class Exercise8 {
    public static void main(String[] args) {
        int [] num ={5,8,12,4,9,11};

        int highnum=num[0];
        int lownum=num[1];

        for (int i = 0; i < num.length; i++) {
            if (highnum<num[i]){
                highnum=num[i];
            }
            else if (lownum>num[i]) {
                lownum=num[i];
            }

        }
        System.out.println("Highest number in the array is "+highnum);
        System.out.println("Lowest number in the array is "+lownum);



    }
}
