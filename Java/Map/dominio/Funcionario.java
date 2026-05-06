package Java.Map.dominio;
 
import java.util.HashMap;
import java.util.Map;

public class Funcionario {  // Nome da classe com letra maiúscula (boas práticas)
    
    // HashMap com ID (Integer) como chave e Nome (String) como valor
    private Map<Integer, String> funcionarios = new HashMap<>();
    
    // Método para adicionar funcionário (ajuda nos testes)
    public void adicionarFuncionario(int id, String nome) {
        funcionarios.put(id, nome);
        System.out.println("✅ Funcionário " + nome + " (ID: " + id + ") adicionado!");
    }
    
    // ========== MÉTODO 1: BUSCAR FUNCIONÁRIO ==========
    public String buscarFuncionario(int id) {
        String nome = funcionarios.get(id);
        
        if (nome == null) {
            return "Funcionário não encontrado";
        }
        return "Funcionário: " + nome;
    }
    
    // ========== MÉTODO 2: REMOVER FUNCIONÁRIO ==========
    public String removerFuncionario(int id) {
        if (funcionarios.containsKey(id)) {
            String nomeRemovido = funcionarios.remove(id);
            return "✅ Funcionário " + nomeRemovido + " (ID: " + id + ") removido com sucesso!";
        } else {
            return "❌ Funcionário com ID " + id + " não encontrado para remoção.";
        }
    }
    
    // Método extra: exibir todos os funcionários
    public void exibirTodosFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("📋 Nenhum funcionário cadastrado.");
        } else {
            System.out.println("\n📋 Lista de Funcionários:");
            for (Map.Entry<Integer, String> entry : funcionarios.entrySet()) {
                System.out.println("   ID: " + entry.getKey() + " - Nome: " + entry.getValue());
            }
        }
    }
}