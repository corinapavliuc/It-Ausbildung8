package lessontwo;

import java.util.Arrays;

public class PolyExampleApp {
    public static void main(String[] args) {
        int a =5;
        int b =10;
        int c=4;
        int sum = sum(a,b);
        System.out.println(sum);

        int sumTwo= sum(a,b,c);
        System.out.println(sumTwo);

        double sumThree= sum(5,4);
        System.out.println(sumThree);

        double sumFour= sum(3,4);
        System.out.println(sumFour);



    }
    private static int sum(int a,int b){
        return a+b;
    }

    private static double sum(double a,int b){
        return a+b;
    }
    private static double sum(double a,double b){
        return a+b;
    }

    private static int sum(int a,int b,int c){
        return  a+b+c;
    }
}
