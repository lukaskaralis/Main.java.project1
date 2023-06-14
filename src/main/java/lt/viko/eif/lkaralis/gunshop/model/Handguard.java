package lt.viko.eif.lkaralis.gunshop.model;

import javax.persistence.*;

@Entity
@Table(name = "handguard")

public class Handguard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int handguardId;
    private String handguardName;
    private double handguardWeight;

    public Handguard(String handguardName, double handguardWeight) {
        this.handguardName = handguardName;
        this.handguardWeight = handguardWeight;
    }

    public Handguard(int handguardId, String handguardName, double handguardWeight) {
        this.handguardId = handguardId;
        this.handguardName = handguardName;
        this.handguardWeight = handguardWeight;
    }

    public Handguard() {

    }


    public int getHandguardId() {
        return handguardId;
    }

    public void setHandguardId(int handguardId) {
        this.handguardId = handguardId;
    }

    public String getHandguardName() {
        return handguardName;
    }

    public void setHandguardName(String handguardName) {
        this.handguardName = handguardName;
    }

    public double getHandguardWeight() {
        return handguardWeight;
    }

    public void setHandguardWeight(double handguardWeight) {
        this.handguardWeight = handguardWeight;
    }

    @Override
    public String toString() {
        return String.format(
                        "\n\t\tID : %d" +
                        "\n\t\tName : %s" +
                        "\n\t\tWeight : %s KG",
                this.handguardId, this.handguardName, this.handguardWeight);
    }
}
