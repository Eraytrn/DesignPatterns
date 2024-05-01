package prototype;

import java.util.Calendar;
import java.util.Date;

public class App1 {
    public static void main(String[] args) {
        GenelEntityService genelEntityService = new GenelEntityService();

        long id1 =1L;

        Date ilkTarih = new Date();
        Belge belge1 = genelEntityService.findBelgeById(id1);
        belgeyiVeSaniyeFarkiniYazdir(ilkTarih, belge1);

       // Date ilkTarih2 = new Date();
       // Belge belge2 = genelEntityService.findBelgeById(2L);
       // belgeyiVeSaniyeFarkiniYazdir(ilkTarih2, belge2);

        Date ilkTarih3 = new Date();
        Belge belgeClone = null;
        try {
            belgeClone = belge1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        belgeClone.setAdi("Günlük");
        belgeClone.setVeri("Sevgili Günlük");
        belgeClone.getBelgeTuru().setAdi("Kisisel 2");

        belgeyiVeSaniyeFarkiniYazdir(ilkTarih3,belgeClone);

        System.out.println(belge1);
    }

    private static void belgeyiVeSaniyeFarkiniYazdir(Date ilkTarih, Belge belge1) {
        Date sonTarih = new Date();


        Long saniyeFarki = getSaniyeFarki(ilkTarih,sonTarih);
        System.out.println(belge1);
        System.out.println(saniyeFarki);

        System.out.println("\n");
    }

    private static Long getSaniyeFarki(Date ilkTarih , Date sonTarih){
        long has =1000;
        long saniyeFarki = (sonTarih.getTime()/has) - (ilkTarih.getTime()/has);

        return saniyeFarki;


    }

}
