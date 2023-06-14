package lt.viko.eif.lkaralis.gunshop.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Entity
@Table(name = "gun")
@XmlRootElement(name = "gun")
public class Gun {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String gunName;
    private double gunCaliber;
    private double gunWeight;
    private String gunColor;
    @OneToOne(targetEntity = Foregrip.class,cascade = CascadeType.ALL)
    private Foregrip foregrip;
    @OneToOne(targetEntity = Magazine.class,cascade = CascadeType.ALL)
    private Magazine magazine;
    @OneToOne(targetEntity = Suppressor.class,cascade = CascadeType.ALL)
    private Suppressor suppressor;
    @OneToOne(targetEntity = Handguard.class,cascade = CascadeType.ALL)
    private Handguard handguard;
    @OneToMany(targetEntity = Sights.class,cascade = CascadeType.ALL)
    private List<Sights> sights;


    public Gun() {

    }

    public Gun(int id, String gunName, double gunCaliber,
               double gunWeight, String gunColor, Foregrip foregrip,
               Magazine magazine, Suppressor suppressor, Handguard handguard,
               List<Sights> sights) {
        this.id = id;
        this.gunName = gunName;
        this.gunCaliber = gunCaliber;
        this.gunWeight = gunWeight;
        this.gunColor = gunColor;
        this.foregrip = foregrip;
        this.magazine = magazine;
        this.suppressor = suppressor;
        this.handguard = handguard;
        this.sights = sights;
    }

    public Gun(String gunName, double gunCaliber, double gunWeight,
               String gunColor, Foregrip foregrip, Magazine magazine,
               Suppressor suppressor, Handguard handguard, List<Sights> sights) {
        this.gunName = gunName;
        this.gunCaliber = gunCaliber;
        this.gunWeight = gunWeight;
        this.gunColor = gunColor;
        this.foregrip = foregrip;
        this.magazine = magazine;
        this.suppressor = suppressor;
        this.handguard = handguard;
        this.sights = sights;
    }

    public int getGunId() {
        return id;
    }

    public void setGunId(int gunId) {
        this.id = id;
    }

    public String getGunName() {
        return gunName;
    }

    public void setGunName(String gunName) {
        this.gunName = gunName;
    }

    public double getGunCaliber() {
        return gunCaliber;
    }

    public void setGunCaliber(double gunCaliber) {
        this.gunCaliber = gunCaliber;
    }

    public double getGunWeight() {
        return gunWeight;
    }

    public void setGunWeight(double gunWeight) {
        this.gunWeight = gunWeight;
    }

    public String getGunColor() {
        return gunColor;
    }

    public void setGunColor(String gunColor) {
        this.gunColor = gunColor;
    }

    public Foregrip getForegrip() {
        return foregrip;
    }

    public void setForegrip(Foregrip foregrip) {
        this.foregrip = foregrip;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    public Suppressor getSuppressor() {
        return suppressor;
    }

    public void setSuppressor(Suppressor suppressor) {
        this.suppressor = suppressor;
    }

    public Handguard getHandguard() {
        return handguard;
    }

    public void setHandguard(Handguard handguard) {
        this.handguard = handguard;
    }

    public List<Sights> getSights() {
        return sights;
    }

    public void setSights(List<Sights> sights) {
        this.sights = sights;
    }

    @Override
    public String toString() {
        return String.format("Gun: " +
                        "\n\tID : %d" +
                        "\n\tName : %s" +
                        "\n\tCaliber : %s" +
                        "\n\tWeight : %s KG" +
                        "\n\tColor : %s" +
                        "\n\tForegrip : %s" +
                        "\n\tHandguard : %s" +
                        "\n\tSights : %s" +
                        "\n\tMagazine : %s" +
                        "\n\tSuppressor : %s",
                this.id, this.gunName, this.gunCaliber, this.gunWeight, this.gunColor,
                this.foregrip, this.handguard, constructSightsList(), this.magazine, this.suppressor);
    }
    private Object constructSightsList(){
        String result = "";
        for(Sights sights : this.sights){
            result += sights.toString();
        }
        return result;
    }

}
