package bai1;

import java.util.Scanner;

// import bai1.DongVatService;
public class Menu {
    public static void main(String[] args) {
        DongVatService service = new DongVatService();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("""
                    ----------------------
                    Nhập:
                    1. Nhập thông tin đối tượng.
                    2. Hiển thị danh sách đối tượng.
                    3. Tìm kiếm trong khoảng cân nặng.
                    4. Thoát.
                    5. Dong vat meo.
                    ----------------------
                        """);
            System.out.println("moi nhap chuc nang: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    service.nhapThongTin();
                    break;
                case 2:
                    service.hienThi();
                    break;
                case 3:
                    service.timKhoangCan();
                    break;
                case 4:
                    System.out.println("thoat");
                    break;
                case 5:
                    service.dongVatMeo();
                    break;
                default:
                    System.out.println("khong hop le moi nhap lai.");
                    break;
            }
        } while (choose != 4);
        sc.close();
    }
}
