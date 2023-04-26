package JavaProjectArray;

public class Exercise6 {
    public static void main(String[] args) {

        //Prime numbers
        //1. number should be >1
        //2. number should be divisable by itslef only
        // example: 3(2), 4(2,3) 5(2,3,4) 6(2,3,4,5)


        int num=7;
        boolean isPrime=true;
        if (num>1){
            for (int i=2;i<num;i++){
                if (num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num+" is a prime number");
        }
        else {
            System.out.println(num+" is a odd number");
        }





        








    }
}
