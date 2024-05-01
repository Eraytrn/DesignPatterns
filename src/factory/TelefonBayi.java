package factory;

import javax.swing.*;

public class TelefonBayi {

    public static void main(String[] args) {
        Telefon s8 = TelefonFabrikasi.getTelefon("S8","3000mah", 3 ,4);

        Telefon note8 = TelefonFabrikasi.getTelefon("Note8", "4000mah",4,5);

        System.out.println("S8 için telefon özellikleri: ");
        System.out.println(s8);

        System.out.println("Note8 için telefon özellikleri: ");
        System.out.println(note8);
    }
}
