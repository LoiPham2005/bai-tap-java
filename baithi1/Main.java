package baithi1;
// import baithi1.DongVat;
import java.util.Scanner;
public class Main {
    private static final Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        DongVatService dongVat = new DongVatService();
        int choose;
        do {
            System.out.println("""
                    ----------------------
                    Nhập:
                    1. Nhập thông tin đối tượng.
                    2. Hiển thị danh sách đối tượng.
                    3. Tìm kiếm trong khoảng cân nặng.
                    4. Thoát.
                    ----------------------
                        """);
                System.out.println("moi chon chuc nang: ");
                choose = sc.nextInt();
                switch (choose) {
                    case 1 -> {
                        dongVat.nhapThongTin();
                    }
                    case 2 ->{
                        dongVat.xuatThongTin();
                    }
                    case 3 ->{
                        dongVat.timKiemKhoangCan();
                    }
                    default ->
                        System.err.println("ko ton tai. moi nhap lai ");
                    
                        
                }
        } while (choose != 4);
    }
}
