package Constructor;

public class Cars {
    private String plate;
    private int model;

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public Cars(String plate, int model) {
        this.plate = plate;
        this.model = model;
    }
/*
       public Cars() {
        System.out.println("I'm running");
      }
      */

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
