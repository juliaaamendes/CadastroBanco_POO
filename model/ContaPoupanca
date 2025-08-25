package model;

public class ContaPoupanca extends Conta {
    private static final double RENDIMENTO = 0.005; // 0.5% ao mês

    public ContaPoupanca() {}

    public ContaPoupanca(String agencia, String numero, double saldo, Cliente cliente) {
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
        
        System.out.println("Conta Poupança gravada: " + this);
        return true;
    }

    @Override
    public boolean editar() {
        System.out.println("Conta Poupança editada: " + this);
        return true;
    }

    @Override
    public boolean excluir() {
        System.out.println("Conta Poupança excluída: " + this);
        return true;
    }

    @Override
    public boolean cancelar() {
        System.out.println("Conta Poupança cancelada: " + this);
        return true;
    }

    @Override
    public void aplicarTaxa() {
        double rendimento = getSaldo() * RENDIMENTO;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento de R$ " + rendimento + " aplicado");
    }
}