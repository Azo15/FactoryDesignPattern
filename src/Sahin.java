// Somut araba türü: Şahin
public class Sahin extends Araba {

    public Sahin() {
        maxHiz = 180;
        anlikHiz = 0;
    }

    @Override
    public int maxHizAl() {
        return maxHiz;
    }

    @Override
    public String marka() {
        return "Sahin";
    }

    @Override
    public void hizBelirle(int s) {
        anlikHiz = s;
    }
}
