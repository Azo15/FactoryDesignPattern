// Mercedes üretimi yapan fabrika
public class MercedesFactory extends ArabaFactory {
    @Override
    public Araba ArabaUret() {
        return new Mercedes();
    }
}
