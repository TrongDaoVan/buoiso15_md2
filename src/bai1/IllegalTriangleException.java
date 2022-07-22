package bai1;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        try {
            System.out.println("Xét 3 cạnh của 1 tam giác: ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập cạnh a của tam giác: ");
            int a = scanner.nextInt();
            System.out.println("Nhập cạnh b của tam giác: ");
            int b = scanner.nextInt();
            System.out.println("Nhập cạnh c của tam giác: ");
            int c = scanner.nextInt();

            if(a<0 || b<0 || c<0 || (a+b)<c || (b+c)<a || (c+a)<b) {
                throw new Exception();
            } else {
                System.out.println("Số đo 3 cạnh: a = "+a+" b = " +b+" c = " + c+ " Là độ dài 3 cạnh của 1 tam giác");
            }
        } catch (Exception e){
            System.out.println("Không phải 3 cạnh của 1 tam giác: ");
        }
    }
}
