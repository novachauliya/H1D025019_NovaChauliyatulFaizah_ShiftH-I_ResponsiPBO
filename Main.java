public class Main {
    public static void main(String[] args) {
        System.out.println("=== " + Kendaraan.BENGKEL + " ===\n");

        System.out.println("--- 1. Pengujian Mobil Listrik ---");
        MobilListrik wuling = new MobilListrik("EV-01", "Wuling New Air ev", 10);
        wuling.nyalakanMesin(); 
        System.out.println(wuling.getInfo()); 
        wuling.aktifkanAirbag(); 
        wuling.servis(); 
        
        System.out.println("\n--- 2. Pengujian Mobil Bensin ---");
        MobilBensin porsche = new MobilBensin("PC-02", "Porsche 718 Spyder", 2);
        System.out.println(porsche.getInfo()); 
        porsche.nyalakanMesin();
        System.out.println(porsche.getInfo());
        porsche.servis();

        System.out.println("\n--- 3. Syarat 9: Polimorfisme Interface ---");
        KendaraanListrik ioniq = new MobilListrik("IO-03", "Ioniq 5", 50);
        ioniq.isiDaya();
    }
}
