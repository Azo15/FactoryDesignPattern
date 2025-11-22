// Şahin üretimi yapan fabrika
public class SahinFactory extends ArabaFactory {
    @Override
    public Araba ArabaUret() {
        return new Sahin();
    }
}
