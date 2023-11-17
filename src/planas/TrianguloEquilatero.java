package planas;

public class TrianguloEquilatero {
    double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return lado * Math.sqrt(3/4);
    }
    public double calcularPerimetro(){
        return lado * 3;
    }
}
