package lt.viko.eif.lkaralis.gunshop.model;

import javax.persistence.*;

@Entity
@Table(name = "suppressor")
public class Suppressor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int suppressorId;
    private String suppressorName;
    private double suppressorWeight;
    private double suppressorMuzzleVelocity;

    public Suppressor(int suppressorId, String suppressorName,
                      double suppressorWeight, double suppressorMuzzleVelocity) {
        this.suppressorId = suppressorId;
        this.suppressorName = suppressorName;
        this.suppressorWeight = suppressorWeight;
        this.suppressorMuzzleVelocity = suppressorMuzzleVelocity;
    }

    public Suppressor(String suppressorName, double suppressorWeight, double suppressorMuzzleVelocity) {
        this.suppressorName = suppressorName;
        this.suppressorWeight = suppressorWeight;
        this.suppressorMuzzleVelocity = suppressorMuzzleVelocity;
    }

    public Suppressor() {

    }

    public int getSuppressorId() {
        return suppressorId;
    }

    public void setSuppressorId(int suppressorId) {
        this.suppressorId = suppressorId;
    }

    public String getSuppressorName() {
        return suppressorName;
    }

    public void setSuppressorName(String suppressorName) {
        this.suppressorName = suppressorName;
    }

    public double getSuppressorWeight() {
        return suppressorWeight;
    }

    public void setSuppressorWeight(double suppressorWeight) {
        this.suppressorWeight = suppressorWeight;
    }

    public double getSuppressorMuzzleVelocity() {
        return suppressorMuzzleVelocity;
    }

    public void setSuppressorMuzzleVelocity(double suppressorMuzzleVelocity) {
        this.suppressorMuzzleVelocity = suppressorMuzzleVelocity;
    }

    @Override
    public String toString() {
        return String.format(
                        "\n\t\tID : %d" +
                        "\n\t\tName : %s" +
                        "\n\t\tWeight : %s KG" +
                        "\n\t\tMuzzle velocity : %s",
                this.suppressorId, this.suppressorName, this.suppressorWeight, this.suppressorMuzzleVelocity);
    }
}
