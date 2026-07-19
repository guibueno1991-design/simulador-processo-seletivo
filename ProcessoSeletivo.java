import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // O valor máximo que a empresa aceita pagar para a vaga
        double salarioBase = 2500.00; 

        System.out.println("=== SISTEMA DE SELEÇÃO TECH ===");

        System.out.print("Digite o nome do candidato: ");
        String nome = scanner.nextLine(); // Guarda texto (o nome)

        System.out.print("Digite a vaga desejada (Estágio/Júnior): ");
        String vaga = scanner.nextLine(); // Guarda texto (a vaga)

        System.out.print("Digite a pretensão salarial do candidato: R$ ");
        double salarioPretendido = scanner.nextDouble(); // Guarda o valor em dinheiro

        System.out.println("\n--- ANÁLISE DO SISTEMA ---");
        System.out.println("Candidato: " + nome);
        System.out.println("Vaga: " + vaga);

        // A lógica que toma a decisão baseada no orçamento
        if (salarioBase >= salarioPretendido) {
            System.out.println("STATUS: APROVADO para a próxima fase!");
        } else {
            System.out.println("STATUS: REJEITADO. Pretensão salarial acima do orçamento da empresa.");
        }

        scanner.close();
    }
}