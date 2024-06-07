/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contai;

/**
 *
 * @author emill
 */
import javax.swing.JOptionPane;

public class ContaInvestimento extends Conta {
    private double montanteMinimo;
    private double depositoMinimo;

    public ContaInvestimento(Cliente dono, int numero, double saldoInicial, double montanteMinimo, double depositoMinimo) {
        super(dono, numero, saldoInicial);
        this.montanteMinimo = montanteMinimo;
        this.depositoMinimo = depositoMinimo;
    }

    @Override
    public boolean deposita(double valor) {
        if (valor >= depositoMinimo) {
            return super.deposita(valor);
        } else {
            JOptionPane.showMessageDialog(null, "O valor do depósito deve ser maior ou igual ao depósito mínimo.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    @Override
    public boolean saca(double valor) {
        if (valor > 0) {
            if (getSaldo() - valor >= montanteMinimo) {
                return super.saca(valor);
            } else {
                JOptionPane.showMessageDialog(null, "O valor do saque não pode deixar o saldo abaixo do montante mínimo.", "Aviso", JOptionPane.WARNING_MESSAGE);
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
        saldoAtual += saldoAtual * 0.02; // Aplicar remuneração de 2%
    }

    @Override
    public String toString() {
        return super.toString() + ", ContaInvestimento{" +
                "montanteMinimo=" + montanteMinimo +
                ", depositoMinimo=" + depositoMinimo +
                '}';
    }
}
