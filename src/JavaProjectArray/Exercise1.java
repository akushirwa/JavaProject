package JavaProjectArray;

public class Exercise1 {
    public static void main(String[] args) {

        int [] temp={75,65,78,78,80,58,79};
        int highestTemp=temp[0];

        for (int i = 1; i < temp.length;i++) {
            if(highestTemp<temp[i]){
               highestTemp=temp[i];

            }

        }
        System.out.println("The highest temperature in the array is "+highestTemp);

        int lowestTemp=temp[0];

        for (int i=1;i<temp.length;i++){
            if(lowestTemp>temp[i]){
                lowestTemp=temp[i];
            }
        }
        System.out.println("The lowest temperature in the array is "+lowestTemp);





    }
}
