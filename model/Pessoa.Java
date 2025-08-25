package model;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    public Pessoa() {}

    public Pessoa(String nome, String endereco, String telefone, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public abstract boolean gravar();
    public abstract boolean editar();
    public abstract boolean excluir();
    public abstract boolean cancelar();

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}