package BangunDatar;

public class PersegiPanjang extends BangunDatar {
    protected double panjang,lebar;

    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    @Override
    public double Luas(){
        return panjang*lebar;
    }

    public double Keliling(){
        return 2*(panjang+lebar);
    }

}
