package controller;

import model.*;
import view.Janela;

public class SistemaController {
    private Janela janela;
    private Cliente cliente;
    private Conta conta;

    public SistemaController(Janela janela) {
        this.janela = janela;
    }

    public void consultar() {
        System.out.println("Consultando dados...");
        // Aqui viria a lógica de consulta no banco de dados
    }

    public void atualizar() {
        if (cliente != null && conta != null) {
            boolean clienteAtualizado = cliente.editar();
            boolean contaAtualizada = conta.editar();
            
            if (clienteAtualizado && contaAtualizada) {
                System.out.println("Dados atualizados com sucesso!");
            }
        } else {
            System.out.println("Nenhum cliente/conta para atualizar!");
        }
    }

    public void gravar() {
        // Criar cliente a partir dos dados da janela
        cliente = new Cliente(
            janela.getJtfNome().getText(),
            janela.getJtfEndereco().getText(),
            janela.getJtfTelefone().getText(),
            janela.getJtfCpf().getText()
        );

        // Criar conta baseada na seleção
        if (janela.getJrbCorrente().isSelected()) {
            conta = new ContaCorrente(
                janela.getJtfAgencia().getText(),
                janela.getJtfConta().getText(),
                0.0,
                cliente
            );
        } else {
            conta = new ContaPoupanca(
                janela.getJtfAgencia().getText(),
                janela.getJtfConta().getText(),
                0.0,
                cliente
            );
        }

        // Gravar dados
        boolean clienteGravado = cliente.gravar();
        boolean contaGravada = conta.gravar();

        if (clienteGravado && contaGravada) {
            janela.getJbAtualizar().setEnabled(true);
            System.out.println("Cadastro realizado com sucesso!");
        }
    }

    public void fechar() {
        System.out.println("Sistema fechado!");
        System.exit(0);
    }

    public void aplicarTaxa() {
        if (conta != null) {
            conta.aplicarTaxa();
            System.out.println("Novo saldo: R$ " + conta.getSaldo());
        }
    }

    // Getters
    public Cliente getCliente() { return cliente; }
    public Conta getConta() { return conta; }
}