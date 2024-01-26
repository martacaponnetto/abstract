public class Triangolo {
    private double base;
    private double altezza;

    public Triangolo(double base, double altezza){
        this.altezza = altezza;
        this.base = base;
    }
    public double calcolaArea() {
        double area = (base * altezza) / 2;
        System.out.println("area del triangolo :" + area);
        return area;
    }
}

