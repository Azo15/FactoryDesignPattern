🚗 Araba Fabrikası – Factory Method Tasarım Deseni

Bu proje, Factory Method tasarım desenini basit bir örnek üzerinden göstermektedir.
Amaç, farklı araba türlerini (Şahin – Mercedes) polimorfik bir şekilde üretebilmektir.

📌 Kullanılan Sınıflar
1. Araba (Abstract)

Tüm arabaların ortak özellikleri ve davranışları tanımlanır.

Her araba maxHiz, anlikHiz değerlerine sahiptir.

maxHizAl(), marka(), hizBelirle() metodları alt sınıflar tarafından uygulanır.

2. Somut Arabalar

Sahin → max hız 180

Mercedes → max hız 300

Her biri Araba sınıfından türemektedir.

3. ArabaFactory (Abstract Factory)

Her araba türü için bir fabrika oluşturulmasını sağlar.

4. Somut Fabrikalar

SahinFactory → Şahin üretir

MercedesFactory → Mercedes üretir

5. Main

Fabrikalar kullanılarak polimorfik şekilde araba üretilir.

🎯 Amaç

Bu proje ile:

Soyutlama (abstraction)

Çok biçimlilik (polymorphism)

Factory Method design pattern
konuları basit bir örnekle gösterilmektedir.
