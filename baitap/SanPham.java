package baitap;

public class SanPham {
    private String ten;
    private double gia;

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }
    public void tinhthue(){
        double tinh=gia*0.1;
        System.out.println("gia cua san pham "+ten+" la:"+tinh);
    }
    public void xuatThongTin(){
        System.out.println("gia cua san pham"+ten+"la:"+gia);
    }
}
