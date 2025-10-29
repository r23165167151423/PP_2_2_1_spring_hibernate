package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private final String model;
    private final int series;

    protected Car() {
        this.model = null;
        this.series = 0;
    }
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public String toString() {
        return "Car [id=" + id + ", model=" + model + ", series=" + series + "]";
    }

    public Long getId() { return id; }
    public String getModel() { return model; }
    public int getSeries() { return series; }
}
