package JavaProjectArray;

public class Exercise7 {
    public static void main(String[] args) {

        //0+1=1,
        //1+1=2,
        // 2+3=5,
        //5+3=8,
        //8+5=13,
        //13+8=


        int a,b,c;

        a=0;
        b=1;

        for (int i=1;i<=10;i++){
            c=a+b;
            System.out.print(c +"  ");
            a=b;
            b=c;
        }





    }
}
