package thuchanh3;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập giá trị x: ");
        int x = scanner.nextInt();
        System.out.println("Mời bạn nhập giá trị y: ");
        int y = scanner.nextInt();
        CalculationExample ar = new CalculationExample();
        ar.tinhtoan(x,y);

    }

    public void tinhtoan(int x, int y){
        try {
            int cong = x + y;
            int tru = x - y;
            int nhan = x * y;
            int chia = x/y;

            System.out.println("Tổng x + y = "+cong);
            System.out.println("Hiệu x - y = "+tru);
            System.out.println("Tích x * y = "+nhan);
            System.out.println("Thương x/y = "+chia);
        } catch (Exception e) {
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}

