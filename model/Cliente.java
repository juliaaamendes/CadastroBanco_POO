package model;

public class Cliente extends Pessoa {
    public Cliente() {}

    public Cliente(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
    }

    @Override
    public boolean gravar() {
        // Validação do CPF antes de gravar
        if (getCpf() == null || getCpf().trim().isEmpty()) {
            System.out.println("Erro: CPF é obrigatório!");
            return false;
        }
        
        if (getNome() == null || getNome().trim().isEmpty()) {
            System.out.println("Erro: Nome é obrigatório!");
            return false;
        }
        
        System.out.println("Cliente gravado com sucesso: " + this);
        return true;
    }

    @Override
    public boolean editar() {
        System.out.println("Cliente editado: " + this);
        return true;
    }

    @Override
    public boolean excluir() {
        System.out.println("Cliente excluído: " + this);
        return true;
    }

    @Override
    public boolean cancelar() {
        System.out.println("Cadastro do cliente cancelado: " + this);
        return true;
    }
}