package exTriangulo;


public class Principal{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ladoA = sc.ladoA;
        ladoB = sc.ladoB;
        ladoC = sc.ladoC;

        Triangulo t = new Triangulo(this.ladoA, this.ladoB, this.ladoC);

        System.out.println("Perimetro: " +t.calcularPerimetro);
    }

}