package bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * DongVatService
 */
public class DongVatService {
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<DongVat> danhSach = new ArrayList<DongVat>();

    protected void nhapThongTin() {
        do {
            System.out.println("nhap ma dong vat: ");
            String maDongVat = sc.nextLine();
            System.out.println("nhap ten dong vat: ");
            String tenDongVat = sc.nextLine();
            System.out.println("nhap can nang: ");
            int canNang = sc.nextInt();
            sc.nextLine();
            System.out.println("nhap noi song: ");
            String noiSong = sc.nextLine();

            DongVat dv = new DongVat(maDongVat, tenDongVat, canNang, noiSong);
            danhSach.add(dv);

            System.out.println("""
                    Nhập lại chúng tôi như thế nào để tiếp tục nhập thông tin?
                    m: Nhập lại
                    n: ket thuc
                    """);
        } while (!sc.nextLine().equals("n"));
    }

    protected void hienThi() {
        System.out.println("danh sanh dong vat :");
        for (DongVat dongVat : danhSach) {
            dongVat.inThongTin();
            System.out.println(" ");
        }
    }

    protected void timKhoangCan() {
        System.out.println("nhap can nang dau: ");
        int canNangDau = sc.nextInt();
        System.out.println("nhap can nang cuoi: ");
        int canNangCuoi = sc.nextInt();

        for (DongVat dongVat : danhSach) {
            if (canNangDau <= dongVat.getCanNang() && dongVat.getCanNang() <= canNangCuoi) {
                dongVat.inThongTin();
                System.out.println(" ");
            }
        }
    }

    protected void dongVatMeo(){
        Meo meo =new Meo("x", "cun", 10, "hanoi", "meomeo");
        meo.inThongTin();
   
    }

}