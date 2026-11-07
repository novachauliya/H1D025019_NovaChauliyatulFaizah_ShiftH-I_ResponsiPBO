public abstract class Kendaraan {
    public static final String BENGKEL = "Bengkel Otomotif OLA";
    private final String nomorRangka;

    private String merk;
    private boolean menyala;

    public Kendaraan(String nomorRangka) {
        this(nomorRangka, "Belum Diketahui");
    }

    public Kendaraan(String nomorRangka, String merk) {
        this.nomorRangka = nomorRangka;
        this.merk = merk;
        this.menyala = false;
    }

    public String getNomorRangka() { return this.nomorRangka; }
    public String getMerk() { return this.merk; }
    public void setMerk(String merk) { this.merk = merk; }
    public boolean isMenyala() { return this.menyala; }
    public void setMenyala(boolean menyala) { this.menyala = menyala; }

    public void nyalakanMesin() {
        this.menyala = true;
        System.out.println("Mesin " + this.merk + " menyala.");
    }

    public String getInfo() {
        return "No. Rangka: " + this.nomorRangka + " | Mesin: " + (this.menyala ? "ON" : "OFF");
    }

    public abstract void servis();
}
