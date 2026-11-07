public class Main {
    public static void main(String[] args) {
        System.out.println("=== " + Kendaraan.BENGKEL + " ===\n");

        System.out.println("--- Wuling: Skenario 1 ---");
        MobilListrik wuling1 = new MobilListrik("EV-01", "Wuling New Air ev", 10);
        wuling1.nyalakanMesin();              
        System.out.println(wuling1.getInfo());
        wuling1.servis();                     
        System.out.println("Baterai sekarang: " + wuling1.getBaterai() + "%");
        wuling1.aktifkanAirbag();

        System.out.println("\n--- Wuling: Skenario 2 ---");
        MobilListrik wuling2 = new MobilListrik("EV-01", "Wuling New Air ev", 100);
        wuling2.nyalakanMesin();
        System.out.println(wuling2.getInfo());
        wuling2.servis();                     
        wuling2.aktifkanAirbag();

        System.out.println("\n--- Porsche: Skenario 1 ---");
        MobilBensin porsche1 = new MobilBensin("PC-02", "Porsche 718 Spyder");
        porsche1.setBensin(2);               
        porsche1.nyalakanMesin();
        System.out.println(porsche1.getInfo());
        porsche1.servis();                    
        System.out.println("Bensin sekarang: " + porsche1.getBensin() + "L");

        System.out.println("\n--- Porsche: Skenario 2 ---");
        MobilBensin porsche2 = new MobilBensin("PC-02", "Porsche 718 Spyder", 42);
        porsche2.nyalakanMesin();
        System.out.println(porsche2.getInfo());
        porsche2.servis();

        System.out.println("\n--- POLIMORFISME INTERFACE ---");
        KendaraanListrik ioniq = new MobilListrik("IO-03", "Ioniq 5", 50);
        ioniq.isiDaya();
    }
}
