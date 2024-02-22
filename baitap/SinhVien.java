package baitap;

public class SinhVien {
    private String hoTen;
    private double diemTrungBinh;

    public SinhVien(String hoTen, double diemTrungBinh) {
        this.hoTen = hoTen;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

}
