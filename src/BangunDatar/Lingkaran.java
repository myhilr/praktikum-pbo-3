package BangunDatar;

public class Lingkaran extends BangunDatar {
    protected final double PI = (float) 3.14;
    protected double r;

    public double getPI(){
        return PI;
    }
    public double getR(){
        return r;
    }
    public void setR(double r){
        this.r = r;
    }


     @Override
     public double Luas(){
         return (float) (PI * Math.pow(this.r, 2));
     }

    @Override
    public double Keliling() {
        return (float) (PI*2*r);
    }
}
