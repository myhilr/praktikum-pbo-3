package BangunDatar;

public class Balok extends PersegiPanjang {
    protected double tinggi;

    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double volume(){
        return panjang*lebar*tinggi;
    }
}
