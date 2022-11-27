package web.model;

public class Car {
    private String model;
    private int series;
    private int releaseDate;

    public Car(String model, int series, int releaseDate) {
        this.model = model;
        this.series = series;
        this.releaseDate = releaseDate;
    }

    public String getModel() {
        return model;
    }


    public int getSeries() {
        return series;
    }


    public int getReleaseDate() {
        return releaseDate;
    }


    @Override
    public String toString() {

        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
