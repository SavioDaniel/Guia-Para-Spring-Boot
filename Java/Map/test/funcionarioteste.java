package Java.Map.test;

import java.util.Scanner;
import Java.Map.dominio.Funcionario;

public class funcionarioteste {
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Scanner scanner = new Scanner(System.in);
        
        // ===== 1. CADASTRAR FUNCIONÁRIOS =====
        System.out.print("Quantidade de funcionários: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 0; i < quantidade; i++) {
            System.out.println("\n--- Funcionário " + (i + 1) + " ---");
            
            System.out.print("Digite o ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            
            funcionario.adicionarFuncionario(id, nome);
        }
        
        System.out.println("\n" + "=".repeat(50));
        System.out.print("Digite o ID para buscar: ");
        int idBusca = scanner.nextInt();
        System.out.println(funcionario.buscarFuncionario(idBusca));
        
        System.out.println("\n" + "=".repeat(50));
        System.out.print("Digite o ID para remover: ");
        int idRemocao = scanner.nextInt();
        System.out.println(funcionario.removerFuncionario(idRemocao));
        
        System.out.println("\n" + "=".repeat(50));
        funcionario.exibirTodosFuncionarios();
        
        scanner.close();
    }
}