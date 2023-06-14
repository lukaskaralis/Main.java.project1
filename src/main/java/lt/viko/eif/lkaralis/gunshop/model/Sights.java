package lt.viko.eif.lkaralis.gunshop.model;

import javax.persistence.*;

@Entity
@Table(name = "sights")
public class Sights {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int sightsId;
    private String sightsName;
    private double sightsWeight;
    private double sightingRange;

    public Sights(int sightsId, String sightsName,
                  double sightsWeight, double sightingRange) {
        this.sightsId = sightsId;
        this.sightsName = sightsName;
        this.sightsWeight = sightsWeight;
        this.sightingRange = sightingRange;
    }

    public Sights(String sightsName, double sightsWeight, double sightingRange) {
        this.sightsName = sightsName;
        this.sightsWeight = sightsWeight;
        this.sightingRange = sightingRange;
    }

    public Sights() {

    }

    public int getSightsId() {
        return sightsId;
    }

    public void setSightsId(int sightsId) {
        this.sightsId = sightsId;
    }

    public String getSightsName() {
        return sightsName;
    }

    public void setSightsName(String sightsName) {
        this.sightsName = sightsName;
    }

    public double getSightsWeight() {
        return sightsWeight;
    }

    public void setSightsWeight(double sightsWeight) {
        this.sightsWeight = sightsWeight;
    }

    public double getSightingRange() {
        return sightingRange;
    }

    public void setSightingRange(double sightingRange) {
        this.sightingRange = sightingRange;
    }

    @Override
    public String toString() {
        return String.format("\n\tSight: " +
                        "\n\t\tID : %d" +
                        "\n\t\tName : %s" +
                        "\n\t\tWeight : %s KG" +
                        "\n\t\tSighting Range : %s" + " m",
                this.sightsId, this.sightsName, this.sightsWeight, this.sightingRange);
    }
}
