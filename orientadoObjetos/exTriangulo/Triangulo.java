package exTriangulo;

public class Triangulo {
    Double ladoA;
    Double ladoB;
    Double ladoC;

    public Triangulo(Double ladoA, Double ladoB, Double ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double calcularPerimetro(){
        return this.ladoA + this.ladoB + this.ladoC;
    }
}