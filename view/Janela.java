package view;

import controller.SistemaController;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Janela extends JFrame {
    private JTextField jtfAgencia, jtfConta, jtfNome, jtfEndereco, jtfTelefone, jtfCpf;
    private JRadioButton jrbCorrente, jrbPoupanca;
    private JButton jbConsultar, jbAtualizar, jbFechar;
    
    private SistemaController controller;

    public Janela() {
        setTitle("Java Swing - Sistema Bancário");
        setSize(400, 255);
        setResizable(false);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centralizar();
        
        inicializarComponentes();
        controller = new SistemaController(this);
        configurarEventos();
    }

    private void centralizar() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);
    }

    private void inicializarComponentes() {

    }

    private void configurarEventos() {
        jbConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.consultar();
            }
        });

        jbAtualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.atualizar();
            }
        });

        jbFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.fechar();
            }
        });

        JButton jbGravar = new JButton("Gravar");
        jbGravar.setBounds(10, 190, 100, 23);
        jbGravar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.gravar();
            }
        });
        getContentPane().add(jbGravar);
    }

    public JTextField getJtfAgencia() { return jtfAgencia; }
    public JTextField getJtfConta() { return jtfConta; }
    public JTextField getJtfNome() { return jtfNome; }
    public JTextField getJtfEndereco() { return jtfEndereco; }
    public JTextField getJtfTelefone() { return jtfTelefone; }
    public JTextField getJtfCpf() { return jtfCpf; }
    public JRadioButton getJrbCorrente() { return jrbCorrente; }
    public JRadioButton getJrbPoupanca() { return jrbPoupanca; }
    public JButton getJbConsultar() { return jbConsultar; }
    public JButton getJbAtualizar() { return jbAtualizar; }
    public JButton getJbFechar() { return jbFechar; }

    public static void main(String[] args) {
        Janela janela = new Janela();
        janela.setVisible(true);
    }
}