package lt.viko.eif.lkaralis.gunshop.model;

import javax.persistence.*;

@Entity
@Table(name = "magazine")
public class Magazine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int magazineId;
    private String magazineName;
    private double magazineWeight;
    private int magazineCapacity;
    private double magazineCaliber;

    public Magazine(int magazineId, String magazineName, double magazineWeight,
                    int magazineCapacity, double magazineCaliber) {
        this.magazineId = magazineId;
        this.magazineName = magazineName;
        this.magazineWeight = magazineWeight;
        this.magazineCapacity = magazineCapacity;
        this.magazineCaliber = magazineCaliber;
    }

    public Magazine(String magazineName, double magazineWeight, int magazineCapacity, double magazineCaliber) {
        this.magazineName = magazineName;
        this.magazineWeight = magazineWeight;
        this.magazineCapacity = magazineCapacity;
        this.magazineCaliber = magazineCaliber;
    }

    public Magazine() {

    }

    public int getMagazineId() {
        return magazineId;
    }

    public void setMagazineId(int magazineId) {
        this.magazineId = magazineId;
    }

    public String getMagazineName() {
        return magazineName;
    }

    public void setMagazineName(String magazineName) {
        this.magazineName = magazineName;
    }

    public double getMagazineWeight() {
        return magazineWeight;
    }

    public void setMagazineWeight(double magazineWeight) {
        this.magazineWeight = magazineWeight;
    }

    public int getMagazineCapacity() {
        return magazineCapacity;
    }

    public void setMagazineCapacity(int magazineCapacity) {
        this.magazineCapacity = magazineCapacity;
    }

    public double getMagazineCaliber() {
        return magazineCaliber;
    }

    public void setMagazineCaliber(double magazineCaliber) {
        this.magazineCaliber = magazineCaliber;
    }

    @Override
    public String toString() {
        return String.format(
                        "\n\t\tID : %d" +
                        "\n\t\tName : %s" +
                        "\n\t\tWeight : %s KG" +
                        "\n\t\tCapacity : %s rounds" +
                        "\n\t\tCaliber : %s",
                this.magazineId, this.magazineName, this.magazineWeight, this.magazineCapacity, this.magazineCaliber);
    }
}
