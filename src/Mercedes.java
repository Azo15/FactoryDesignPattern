// Somut araba türü: Mercedes
public class Mercedes extends Araba {

    public Mercedes() {
        maxHiz = 300;
        anlikHiz = 0;
    }

    @Override
    public int maxHizAl() {
        return maxHiz;
    }

    @Override
    public String marka() {
        return "Mercedes";
    }

    @Override
    public void hizBelirle(int s) {
        anlikHiz = s;
    }
}
