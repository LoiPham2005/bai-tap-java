package baithi1;

import java.util.ArrayList;
import java.util.Scanner;

public class DongVatService {
    private static final ArrayList<DongVat> danhSachDongVat = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public void nhapThongTin() {
        System.out.println("moi nhap thong tin doi tuong: ");
        System.out.println("nhap ma dong vat: ");
        String maDongVat = sc.nextLine();
        System.out.println("nhap ten dong vat: ");
        String tenDongVat = sc.nextLine();
        int canNang;
        do {
            System.out.println("nhap can nang: ");
            canNang = sc.nextInt();
        } while (canNang <= 0);
        sc.nextLine();
        System.out.println("nhap noi song: ");
        String noiSong = sc.nextLine();

        danhSachDongVat.add(new DongVat(maDongVat, tenDongVat, canNang, noiSong));
    }

    public void xuatThongTin() {
        for (DongVat danhSach : danhSachDongVat) {
            danhSach.inThongTin();
        }
    }

    public void timKiemKhoangCan(){
        System.out.println("nhap khoang can dau: ");
        int khoangDau = sc.nextInt();
        System.out.println("nhap khoang cuoi: ");
        int khoangCuoi = sc.nextInt();

        for(DongVat danhSach : danhSachDongVat){
            if(khoangDau<= danhSach.getCanNang() && danhSach.getCanNang() <= khoangCuoi){
                danhSach.inThongTin();
            }
        }
    }
}
