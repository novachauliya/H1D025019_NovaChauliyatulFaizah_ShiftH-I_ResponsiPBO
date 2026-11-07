public abstract class Kendaraan {
    public static final String BENGKEL = "Bengkel Otomotif OLA";
    private final String nomorRangka;

    private String merk;
    private boolean isMenyala;

    public Kendaraan(String nomorRangka) {
        this(nomorRangka, "Belum Diketahui"); 
    }

    public Kendaraan(String nomorRangka, String merk) {
        this.nomorRangka = nomorRangka;
        this.merk = merk;
        this.isMenyala = false;
    }

    public String getMerk() { return this.merk; }
    
    public void nyalakanMesin() {
        this.isMenyala = true;
        System.out.println("Mesin " + this.merk + " menyala.");
    }
    
    public String getInfo() {
        return "Merk: " + this.merk + " | Mesin: " + (this.isMenyala ? "ON" : "OFF");
    }
    
    public abstract void servis();
}