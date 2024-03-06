package bai1;

/**
 * DongVat
 */
public class DongVat {
    protected String maDongVat;
    protected String tenDongVat;
    protected int canNang;
    protected String noiSong;

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

    public void inThongTin() {
        System.out.println("ma dong vat:" + maDongVat);
        System.out.println("ten dong vat: " + tenDongVat);
        System.out.println("can nang: " + canNang);
        System.out.println("noi song: " + noiSong);
    }


}