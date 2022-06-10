import java.util.ArrayList;
import java.util.Scanner;

public class TesteEmpregado {

    public static void main(String[] args) {
        ArrayList<Empregado> empregados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Empregado empregado = new Empregado();
            System.out.print("Digite o nome: ");
            empregado.setNome(sc.nextLine());
            System.out.print("Ano de ingresso: ");
            empregado.setAnoDeIngreso(sc.nextInt());
            System.out.print("Salario: ");
            empregado.setSalario(sc.nextDouble());
            sc.nextLine();
            System.out.print("Endereco: ");
            empregado.setEndereço(sc.nextLine());
            System.out.println();
            empregados.add(empregado);
        }



        System.out.printf("Nome:               \tAno de Ingreso:        \tSalario:  \tEndereco:\n");
        for(int i = 0; i < empregados.size(); i++) {  
            System.out.printf("%s   ",empregados.get(i).getNome());
            System.out.printf("        \t%d",empregados.get(i).getAnoDeIngreso());
            System.out.printf("                \tR$ %.2f", empregados.get(i).getSalario());
            System.out.printf("\t%s\n",empregados.get(i).getEndereço());           
        }

    }
}
