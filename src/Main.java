// Programın çalışma noktası
public class Main {

    // Polimorfik olarak araba üretir
    public static void araba(ArabaFactory f){
        Araba a = f.ArabaUret();
        System.out.println(a.marka() + " marka araba uretildi.\n max hizi = " + a.maxHiz );
    }

    public static void main(String[] args) {

        // Fabrika yönteminin kullanımı
        araba(new SahinFactory());
        araba(new MercedesFactory());
    }
}
