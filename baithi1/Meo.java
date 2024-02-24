package baithi1;

public class Meo extends DongVat{
    private String tiengKieu;
    
    public Meo(String maDongVat, String tenDongVat, int canNang, String noiSong, String tiengKieu) {
        super(maDongVat, tenDongVat, canNang, noiSong);
        this.tiengKieu = tiengKieu;
    }
    
}
