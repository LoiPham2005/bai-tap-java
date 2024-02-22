package baitap;

public class TruongPhong extends NhanVien {
    public double trachNhiem;

    public TruongPhong(String hoTen, double luong,double trachNhiem) {
        super(hoTen, luong*3);
        this.trachNhiem = trachNhiem;
    }
    public void xuat(){
        System.out.println(trachNhiem);
    }
   
    
}
