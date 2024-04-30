package bai1;
import bai1.DongVat;
public class Meo extends DongVat{
    private String tiengKeu;

    public Meo() {
    }

    public Meo(String maDongVat, String tenDongVat, int canNang, String noiSong, String tiengKeu) {
        super(maDongVat, tenDongVat, canNang, noiSong);
        this.tiengKeu = tiengKeu;
    }

    public String getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    @Override
    public void inThongTin() {
  
        super.inThongTin();
        System.out.println("tieng keu: " + tiengKeu);
    }


   

    

    

}   
