package baitap;

public class BangCuuChuong {
    public static void main(String[] args) {
        System.out.println("bang cuu chuong tu 2-9 la: ");
        int i = 2;
        while (i <= 9) {
            System.out.println("\n");
            for (int j = 1; j <= 10; j++) {
                int tinh = i * j;
                System.out.println(i + "*" + j + "=" + tinh);
            }
            i++;
        }
    }
}