public class MobilListrik extends Kendaraan implements KendaraanListrik, FiturKeselamatan {
    private int baterai;

    public MobilListrik(String nomorRangka, String merk, int baterai) {
        super(nomorRangka, merk);
        this.baterai = baterai;
    }

    public MobilListrik(String nomorRangka, String merk) {
        super(nomorRangka, merk);
        this.baterai = 50;
    }

    public int getBaterai() { return this.baterai; }

    public void setBaterai(int baterai) {
        this.baterai = Math.max(0, Math.min(100, baterai));
    }

    @Override
    public void nyalakanMesin() {
        super.nyalakanMesin();
        System.out.println("Mobil Listrik siap.");
    }

    @Override
    public void servis() {
        if (this.baterai < 20) {
            System.out.println("Baterai low nih, sisa (" + this.baterai + "%). Cas yukk.");
            this.baterai = 100;
        } else {
            System.out.println("Baterai aman (" + this.baterai + "%).");
        }
    }

    @Override
    public void isiDaya() {
        this.baterai = 100;
        System.out.println(getMerk() + " selesai dicas!");
    }

    @Override
    public void aktifkanAirbag() {
        System.out.println("BUM! Airbag " + getMerk() + " aktif!");
    }
}
