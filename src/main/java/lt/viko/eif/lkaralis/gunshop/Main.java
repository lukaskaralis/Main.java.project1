package lt.viko.eif.lkaralis.gunshop;

import lt.viko.eif.lkaralis.gunshop.model.*;
import lt.viko.eif.lkaralis.gunshop.util.HibernateUtil;
import lt.viko.eif.lkaralis.gunshop.util.JaxbUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String...args) throws JAXBException, IOException {
//==========================SUPPRESSORS=================================================
        Suppressor suppressor1 = new Suppressor(
                "Rotor 43 5.56x45 muzzle brake-compensator ",
                0.57,
                +0.75);
        Suppressor suppressor2 = new Suppressor(
                "Steyr AUG Ase Utra S Series SL7i 5.56x45 sound suppressor",
                0.494,
                +0.5);
        Suppressor suppressor3 = new Suppressor(
                "SureFire SOCOM556-MINI MONSTER 5.56x45 sound suppressor ",
                0.413,
                0);
//==========================MAGAZINES===================================================
        Magazine magazine1 = new Magazine(
                "5.56x45 HK PM Gen.2 STANAG 30-round magazine",
                0.16,
                30,
                5.56 );
        Magazine magazine2 = new Magazine(
                "5.56x45 Magpul PMAG D-60 STANAG 60-round magazine",
                0.58,
                60,
                5.56);
        Magazine magazine3 = new Magazine(
                "M1911A1 .45 ACP Mec-Gar 11-round magazine",
                0.24,
                11,
                .45);
//==========================SIGHTS======================================================
        Sights sights1 = new Sights(
                "EOTech HHS-1 hybrid sight",
                0.635,
                600);
        Sights sights2 = new Sights(
                "Trijicon ACOG TA01NSN 4x32 scope ",
                0.396,
                800);
        Sights sights3 = new Sights(
                "Axion Kobra EKP-8-02 reflex sight (Dovetail) ",
                0.273,
                200);
        Sights sights4 = new Sights(
                "BelOMO PSO-1M2 4x24 scope",
                0.6,
                600);
//==========================HANDGUARDS==================================================
        Handguard handguard1 = new Handguard(
                "HK 416A5 MRS KeyMod 14 inch handguard ",
                0.39 );
        Handguard handguard2 = new Handguard(
                "AK 5.45 Design Aggressor handguard  ",
                0.26 );
        Handguard handguard3 = new Handguard(
                "HK MP5 PTR Tri-Rail handguard  ",
                0.308 );
//==========================FOREGRIPS===================================================
        Foregrip foregrip1 = new Foregrip(
                "HK Sturmgriff foregrip",
                0.068);
        Foregrip foregrip2 = new Foregrip(
                "ASh-12 vertical foregrip ",
                0.08);
        Foregrip foregrip3 = new Foregrip(
                "Strike Industries Cobra Tactical foregrip",
                0.08);
//==========================GUNS========================================================
        Gun gun1 = new Gun(
                "Colt M4A1 5.56x45 assault rifle",
                5.56,
                3.54,
                "Black",
                foregrip1,
                magazine1,
                suppressor1,
                handguard1,
                List.of(sights1, sights2));
        Gun gun2 = new Gun(
                "HK G36 5.56x45 assault rifle",
                5.56,
                3.04,
                "White",
                foregrip2,
                magazine2,
                suppressor2,
                handguard2,
                List.of(sights2,
                sights3));
        Gun gun3 = new Gun(
                "Desert Tech MDR 5.56x45 assault rifle",
                5.56,
                3.998,
                "Yellow",
                foregrip3,
                magazine3,
                suppressor3,
                handguard3,
                List.of(sights3,
                        sights4));
//===========================SYSTEMOUTPRINTLN===========================================
        System.out.println(gun1);
        System.out.println(gun2);
        System.out.println(gun3);

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(gun1);
            transaction.commit();
            } catch (Exception e) {
                if (transaction != null){
                    transaction.rollback();
                }
                e.printStackTrace();
            }

        String xml = JaxbUtil.convertToXML(gun1);
        Gun gun = JaxbUtil.convertToJava("generated.xml");
        System.out.println(gun1);
        }
    }


