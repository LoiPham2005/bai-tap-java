package baithi1;

/**
 * DongVat
 */

public class DongVat {
    private String maDongVat;
    private String tenDongVat;
    private int canNang;
    private String noiSong;  

    public DongVat() {
    }

    public DongVat(String maDongVat, String tenDongVat, int canNang, String noiSong) {
        this.maDongVat = maDongVat;
        this.tenDongVat = tenDongVat;
        this.canNang = canNang;
        this.noiSong = noiSong;
    }

    public String getMaDongVat() {
        return maDongVat;
    }
    public void setMaDongVat(String maDongVat) {
        this.maDongVat = maDongVat;
    }
    public String getTenDongVat() {
        return tenDongVat;
    }
    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }
    public int getCanNang() {
        return canNang;
    }
    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }
    public String getNoiSong() {
        return noiSong;
    }
    public void setNoiSong(String noiSong) {
        this.noiSong = noiSong;
    }

    public void inThongTin(){
        System.out.println("Ma dong vat: " + getMaDongVat());
        System.out.println("Ten dong vat: " + getTenDongVat());
        System.out.println("Can nang: " + getCanNang());
        System.out.println("Noi song: " + getNoiSong());
    }
    
}