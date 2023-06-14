package lt.viko.eif.lkaralis.gunshop.model;

import javax.persistence.*;

@Entity
@Table(name = "foregrip")
public class Foregrip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String foregripName;
    private double foregripWeight;

    public Foregrip() {

    }


    public Foregrip(int id, String foregripName, double foregripWeight) {
        this.id = id;
        this.foregripName = foregripName;
        this.foregripWeight = foregripWeight;
    }

    public Foregrip(String foregripName, double foregripWeight) {
        this.foregripName = foregripName;
        this.foregripWeight = foregripWeight;
    }

    public int getId() {
        return id;
    }

    public void setId(int foregripId) {
        this.id = id;
    }

    public String getForegripName() {
        return foregripName;
    }

    public void setForegripName(String foregripName) {
        this.foregripName = foregripName;
    }

    public double getForegripWeight() {
        return foregripWeight;
    }

    public void setForegripWeight(int foregripWeight) {
        this.foregripWeight = foregripWeight;
    }

    @Override
    public String toString() {
        return String.format(
                        "\n\t\tID : %d" +
                        "\n\t\tName : %s" +
                        "\n\t\tWeight : %s KG",
                this.id, this.foregripName, this.foregripWeight);
    }
}
