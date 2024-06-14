/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contai;

import javax.swing.JOptionPane;

/**
 *
 * @author emill
 */


// Implamenta os métodos específicos da ContaCorrente, extendendo da classe Conta, que é abstrata

// Declara a classe ContaCorrente como uma extensão (subclasse) da classe abstrata Conta
public class ContaCorrente extends Conta {
    private double limite;

    // Construtor (tbm o da super classe)
    public ContaCorrente(Cliente dono, int numero, double saldoInicial, double limite) {
        super(dono, numero, saldoInicial);
        this.limite = limite;
    }

    // Substituindo um método da superclasse 
    @Override
    public boolean saca(double valor) {
        if (valor > 0) {
            if (valor <= getSaldo() + limite) {
                double saldoAtual = getSaldo();
                saldoAtual -= valor;
                setSaldo(saldoAtual);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "O valor do saque ultrapassa o limite da conta.", "Aviso", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "O valor do saque deve ser positivo.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    @Override
    public void remunera() {
        double saldoAtual = getSaldo();
        saldoAtual += saldoAtual * 0.01; // Aplicar remuneração de 1%
        setSaldo(saldoAtual); // Atualiza o saldo no objeto Conta
    }

    @Override
    public String toString() {
        return super.toString() + ", ContaCorrente{" +
                "limite=" + limite +
                '}';
    }
}