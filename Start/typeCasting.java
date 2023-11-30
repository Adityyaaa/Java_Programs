import java.util.Scanner;

public class typeCasting {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // float num= input.nextFloat();
        // System.out.println(num);


        // Type Casting
        // int num= (int)(67.15f);
        // System.out.println(num);


        // Automatic type promotion in expressions
        // int a= 257;
        // byte b= (byte)a;      // 257 % 256= 1
        // System.out.println(b);


        // byte a= 40;
        // byte b= 50;
        // byte c= 100;
        // int d= (a*b)/c; 
        // System.out.println(d);


        // int a= 'A';
        // System.out.println(a);


        // System.out.println(2*4.5566);


        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.6f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        // float - int * double = double
        System.out.println(result);
        input.close();
    }
}