package web.models;

public class Cars {
    private int id;
    private String model;
    private String series;

    public Cars(){}

    public Cars(int id, String model, String series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    public int getId() {
        return this.id;
    }

    public String getModel() {
        return this.model;
    }

    public String getSeries() {
        return this.series;
    }
}
