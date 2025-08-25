package model;

public class ContaCorrente extends Conta {
    private static final double TAXA_MANUTENCAO = 15.00;

    public ContaCorrente() {}

    public ContaCorrente(String agencia, String numero, double saldo, Cliente cliente) {
        super(agencia, numero, saldo, cliente);
    }

    @Override
    public boolean gravar() {
        if (getAgencia() == null || getAgencia().trim().isEmpty()) {
            System.out.println("Erro: Agência é obrigatória!");
            return false;
        }
        
        if (getNumero() == null || getNumero().trim().isEmpty()) {
            System.out.println("Erro: Número da conta é obrigatório!");
            return false;
        }
        
        System.out.println("Conta Corrente gravada: " + this);
        return true;
    }

    @Override
    public boolean editar() {
        System.out.println("Conta Corrente editada: " + this);
        return true;
    }

    @Override
    public boolean excluir() {
        System.out.println("Conta Corrente excluída: " + this);
        return true;
    }

    @Override
    public boolean cancelar() {
        System.out.println("Conta Corrente cancelada: " + this);
        return true;
    }

    @Override
    public void aplicarTaxa() {
        setSaldo(getSaldo() - TAXA_MANUTENCAO);
        System.out.println("Taxa de manutenção de R$ " + TAXA_MANUTENCAO + " aplicada");
    }
}