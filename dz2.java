
package lesson3;

import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {

    Scanner qe = new Scanner(System.in);
        System.out.println("Введите a:");
    int a = qe.nextInt();
        System.out.println("Введите b:");
    int b = qe.nextInt();
        System.out.println("Введите c:");
    int c = qe.nextInt();
        System.out.println("уравнение "+a+"x2+"+b+"x+"+c+"=0");
    long disc = discriminant (a,b,c);
        if (!isPositive(disc)) {
        System.out.println("дискриминант < 0, уравнение не имеет корней");
    } else {
        double koren1 = (b*(-1)+Math.sqrt(disc))/(2*a);
        double koren2 = (b*(-1)-Math.sqrt(disc))/(2*a);
        System.out.println("дискриминант >0, уравнение имеет 2 корня:");
        System.out.println("х1=:"+koren1);
        System.out.println("х2=:"+koren2);
    }
        if (isZero(disc)) {
        double koren1 = (b*(-1)+ Math.sqrt(disc))/(2*a);
        System.out.println("дискриминант =0, уравнение имеет 1 корень:");
        System.out.println("х1=:"+koren1);
    }

}
    static boolean isPositive(long p) {
        return (p>0);
    }

    static boolean isZero(long q) {
        return (q==0);
    }

    static long discriminant (int a, int b, int c) {
        return (b*b-4*a*c);
    }
}

