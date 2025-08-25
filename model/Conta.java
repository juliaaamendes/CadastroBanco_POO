package model;

public abstract class Conta {
    private String agencia;
    private String numero;
    private double saldo;
    private Cliente cliente;

    public Conta() {}

    public Conta(String agencia, String numero, double saldo, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    // Getters e Setters
    public String getAgencia() { return agencia; }
    public void setAgencia(String agencia) { this.agencia = agencia; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    // Métodos abstratos
    public abstract boolean gravar();
    public abstract boolean editar();
    public abstract boolean excluir();
    public abstract boolean cancelar();

    public abstract void aplicarTaxa();

    @Override
    public String toString() {
        return "Agência: " + agencia + ", Número: " + numero + ", Saldo: " + saldo;
    }
}