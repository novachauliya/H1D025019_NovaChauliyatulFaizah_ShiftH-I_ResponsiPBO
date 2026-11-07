public class MobilBensin extends Kendaraan {
    private int bensin;

    public MobilBensin(String nomorRangka, String merk, int bensin) {
        super(nomorRangka, merk);
        this.bensin = bensin;
    }
    
    @Override
    public void nyalakanMesin() {
        super.nyalakanMesin();
        System.out.println("Mobil sudah siap.");
    }

    @Override
    public void servis() {
        if (this.bensin < 10) {
            System.out.println("Bensin tinggal (" + this.bensin + "L). Cepet isi bensin!");
            this.bensin += 40;
        } else {
            System.out.println("Bensin cukup.");
        }
    }
}
