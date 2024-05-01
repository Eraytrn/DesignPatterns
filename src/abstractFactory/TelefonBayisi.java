package abstractFactory;

import java.sql.SQLOutput;

public class TelefonBayisi {

    public static void main(String[] args) {
        S8Fabrikasi s8Fabrikasi = new S8Fabrikasi();
        Telefon s8 = s8Fabrikasi.getTelefon("s8", "3000mah", 3,4);

        Note8Fabrikasi note8Fabrikasi = new Note8Fabrikasi();
        Telefon note8 = note8Fabrikasi.getTelefon("note8","4000mah",4,5);

        System.out.println(s8);
        System.out.println(note8);
    }
}
