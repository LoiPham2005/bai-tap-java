package baitap;

public class NhanVien {
    private String hoTen;
    private double luong;

    
    public NhanVien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }
    public String getHoTen() {
        return hoTen;
    }
    public double getLuong() {
        return luong;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    public void output(){
        System.out.println(hoTen+"="+luong);
    }
}
