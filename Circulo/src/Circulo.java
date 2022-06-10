public class Circulo {
    
    private String cor;
    private double raio;

    public Circulo(){   
        raio = 1.0;
        cor = "azul";
    }

    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public String getCor() {
        return cor;
    }

    public double getArea(){
        double area;
        area = (Math.PI * (raio * raio));
        return area;
    }

    public void imprimirInformacao(){
        System.out.print("Cor do circulo: " + getCor() + "\n");
        System.out.print("Raio do circulo: " + getRaio() + "\n");
        System.out.print("Area do circulo: " + getArea() + "\n");

    }
    
}
