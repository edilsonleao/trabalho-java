import java.util.Scanner; 

public class TesteArea {
    public static void main(String[] args) {
        Area retangulo = new Area();
        Scanner sc = new Scanner(System.in);
        int comprimento,largura;

        System.out.println("Digite o comprimento do Retangulo: ");
        comprimento = sc.nextInt();

        System.out.println("Digite a largura do triangulo: ");
        largura = sc.nextInt();

        retangulo.setDim(comprimento, largura);

        System.out.print("\nArea do retangulo igual: " +  retangulo.getArea() + "\n");

    }
}
