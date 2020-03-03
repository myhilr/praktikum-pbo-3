package BangunDatar;

public class Segitiga extends BangunDatar {
    private double alas, tinggi;

    public double getAlas(){
        return alas;
    }
    public double getTinggi(){
        return tinggi;
    }

    public void setAlas(double alas){
        this.alas = alas;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    @Override
    public double Luas(){
        return (alas*tinggi)/2;
    }
    @Override
    public double Keliling(){
        return 3*alas;
    }
}
