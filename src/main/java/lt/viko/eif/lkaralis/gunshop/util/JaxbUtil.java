package lt.viko.eif.lkaralis.gunshop.util;

import lt.viko.eif.lkaralis.gunshop.model.Gun;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class JaxbUtil {
    public static String convertToXML(Gun gun) throws FileNotFoundException, JAXBException {

        try {
            JAXBContext context = JAXBContext.newInstance(Gun.class);
            Marshaller marshaller = null;
            marshaller = context.createMarshaller();
            marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
            OutputStream os = new FileOutputStream("generated.xml");
            marshaller.marshal(gun, System.out);
            marshaller.marshal(gun, os);
            StringWriter writer = new StringWriter();
            marshaller.marshal(gun, writer);
            return writer.toString();
        } catch (/*FileNotFoundException | */JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    public static Gun convertToJava(String fileName) throws javax.xml.bind.JAXBException, IOException {
        javax.xml.bind.JAXBContext context = javax.xml.bind.JAXBContext.newInstance(Gun.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Path path = Path.of(fileName);
        String xmlContent = Files.readString(path);
        System.out.println(xmlContent);
        StringReader reader = new StringReader(xmlContent);
        Gun gun = (Gun) unmarshaller.unmarshal(reader);
        return gun;
    }
}
