public class Car {
    private int idAuto;
    private int numberAuto;

    public Car() {
    }

    public Car(int idAuto, int numberAuto) {
        this.idAuto = idAuto;
        this.numberAuto = numberAuto;
    }

    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }

    public int getNumberAuto() {
        return numberAuto;
    }

    public void setNumberAuto(int numberAuto) {
        this.numberAuto = numberAuto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idAuto=" + idAuto +
                ", numberAuto=" + numberAuto +
                '}';
    }

    public static void entrySet() {
    }
}