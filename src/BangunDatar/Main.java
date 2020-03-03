package BangunDatar;

// Polymafishm
public class Main {
    public static void main(String[] args){

        // PERSEGI
        Persegi persegi=new Persegi();
        persegi.setSisi(30);
        System.out.println("\t\tPERSEGI");
        System.out.println("Sisi : " + persegi.getSisi());
        System.out.println("Luas : " + persegi.Luas());
        //System.out.println("Luas Persegi : " + persegi.Luas(10)); // override
        System.out.println("Keliling : " + persegi.Keliling());

        // LINGKARAN
        Lingkaran lingkaran=new Lingkaran();
        lingkaran.setR(14);
        System.out.println("\t\tLINGKARAN");
        System.out.println("r : " + lingkaran.getR());
        System.out.println("Luas : " + lingkaran.Luas());
        System.out.println("Keliling : " + lingkaran.Keliling());

        // PERSEGI PANJANG
        PersegiPanjang PP=new PersegiPanjang();
        PP.setLebar(15);
        PP.setPanjang(30);
        System.out.println("\t\tPERSEGI PANJANG");
        System.out.println("Lebar : " + PP.getLebar());
        System.out.println("Panjang : " + PP.getPanjang());
        System.out.println("Luas : " + PP.Luas());
        System.out.println("Keliling : " + PP.Keliling());

        // SEGITIGA
        Segitiga segitiga=new Segitiga();
        segitiga.setAlas(30);
        segitiga.setTinggi(20);
        System.out.println("\t\tSEGITIGA");
        System.out.println("Alas : " + segitiga.getAlas());
        System.out.println("Tinggi : "+ segitiga.getTinggi());
        System.out.println("Luas : " + segitiga.Luas());
        System.out.println("Keliling : " + segitiga.Keliling());

        // KUBUS
        Kubus kubus=new Kubus();
        kubus.setSisi(30);
        System.out.println("\t\tKUBUS");
        System.out.println("Sisi: " + kubus.getSisi());
        System.out.println("Volume: " + kubus.volume());


        // SILINDER
        Silinder silinder=new Silinder();
        silinder.setR((float)2.5);
        silinder.setTinggi(250);
        System.out.println("\t\tSILINDER");
        System.out.println("Tinggi: " + silinder.getTinggi());
        System.out.println("r: " + silinder.getR());
        System.out.println("Volume: " + silinder.volume());

        // BALOK
        Balok balok=new Balok();
        balok.setPanjang(50);
        balok.setLebar(20);
        balok.setTinggi(15);
        System.out.println("\t\tBALOK");
        System.out.println("Panjang: " + balok.getPanjang());
        System.out.println("Lebar: " + balok.getLebar());
        System.out.println("Tinggi: " + balok.getTinggi());
        System.out.println("Volume: " + balok.volume());


    }
}
