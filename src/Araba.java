// Soyut sınıf: Temel araba özelliklerini tanımlar
public abstract class Araba {

    public int maxHiz;
    public int anlikHiz;

    // Alt sınıflar tarafından zorunlu olarak uygulanır
    public abstract int maxHizAl();
    public abstract String marka();
    public abstract void hizBelirle(int s);
}
