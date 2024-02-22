package baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiSinhVien {
    private static final ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int chon;

        do {
            System.out.println("1. Nhap ds sv\n"
                    + "2. Xuat ds sv\n"
                    + "3. Xuat ds sv theo khoang diem\n"
                    + "4. Tim sinh vien theo ho ten\n"
                    + "5. tim va sua sinh vien theo ho ten\n"
                    + "6. tim va xoa ho ten\n"
                    + "7. Thoat\n");
            System.out.println("Nhap lua chon: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhapThongTinSinhVien();
                    break;
                case 2:
                    xuatThongTinSinhVien(danhSachSinhVien);
                    break;
                case 3:
                    xuatDanhSachTheoKhoangDiem();
                    break;
                case 4:
                    timSinhVienTheoTen();
                    break;
                case 5:
                    timvaSinhVienCanSua();
                    break;
                case 6:
                    timSinhVienCanXoa();
                    break;
                case 7:
                    System.out.println("thoat ");
                    break;
                default:
                System.out.println("khong ton tai. moi nhap lai");
                    break;
            }
        } while (chon != 7);
    }

    public static void nhapThongTinSinhVien() {
        System.out.println("moi nhap so luong sinh vien: ");
        int soLuong = sc.nextInt();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("thong tin sinh vien " + (i + 1) + "la: ");

            System.out.println("Nhap ho ten: ");
            String hoTen = sc.next();

            System.out.println("Nhap diem trung binh: ");
            double diemTrungBinh = sc.nextDouble();
            // sc.nextLine();
            SinhVien sv = new SinhVien(hoTen, diemTrungBinh);
            danhSachSinhVien.add(sv);
        }
    }

    public static void xuatThongTinSinhVien(ArrayList<SinhVien> danhSachSinhVien) {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sach sinh vien khong co");
        } else {
            for (SinhVien sinhVien : danhSachSinhVien) {
                System.out.println("ten sinh vien la: " + sinhVien.getHoTen());
                System.out.println("diem trung binh la: " + sinhVien.getDiemTrungBinh());
            }
        }
    }

    public static void xuatDanhSachTheoKhoangDiem() {
        System.out.println("nhap diem bat dau: ");
        double diemBatDau = sc.nextDouble();
        System.out.println("nhap diem ket thuc: ");
        double diemKetThuc = sc.nextDouble();
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.getDiemTrungBinh() >= diemBatDau && sv.getDiemTrungBinh() <= diemKetThuc) {
                System.out.println("danh sach nhan vien theo khoang diem la:");
                System.out.println(sv.getHoTen());
            }
        }
    }

    public static void timSinhVienTheoTen() {
        // sc.nextLine();

        // System.out.println("moi nhap ten muon tim:");
        // String ten = sc.nextLine();

        // boolean found = false;
        // for (SinhVien sv : danhSachSinhVien) {
        // if (sv.getHoTen().equalsIgnoreCase(ten)) {
        // System.out.println("thong tin sinh vien: ");
        // System.out.println(sv.getHoTen());
        // found = true;
        // break;
        // }
        // }
        // if (!found) {
        // System.out.println("Không tìm thấy sinh viên có họ tên: " + ten);
        // }
        // }
        sc.nextLine();
        System.out.println("Ten can tim: ");
        String hoVaTenCanTim = sc.nextLine();

        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getHoTen().equalsIgnoreCase(hoVaTenCanTim)) {
                System.out.println("Diem cua sinh vien " + hoVaTenCanTim +
                        " la " + sinhVien.getDiemTrungBinh());
            } else {
                System.out.println("Khong ton tai");
            }
        }
    }

    public static void timvaSinhVienCanSua() {
        sc.nextLine();
        System.out.println("Sinh Vien co ten can sua: ");
        String hoTenSVCanSua = sc.nextLine();
        
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getHoTen().equalsIgnoreCase(hoTenSVCanSua)) {
                System.out.println("Nhap diem moi cho sinh vien " + hoTenSVCanSua + ": ");
                double diemMoi = sc.nextDouble();
                sinhVien.setDiemTrungBinh(diemMoi);
                System.out.println("Da sua diem cho sinh vien " + hoTenSVCanSua);
            } else {
                System.out.println("Khong ton tai");
            }
        }
    }

    public static void timSinhVienCanXoa() {
        sc.nextLine();
        System.out.println("Sinh Vien co ten can xoa: ");
        String hoTenSVCanXoa = sc.nextLine();
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getHoTen().equalsIgnoreCase(hoTenSVCanXoa)) {
                danhSachSinhVien.remove(sinhVien);
            } else {
                System.out.println("Khong ton tai");
            }
        }
    }
}
