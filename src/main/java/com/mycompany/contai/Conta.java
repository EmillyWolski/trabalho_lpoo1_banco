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


// Além de implementar a interface ContaI, contém as operações da conta:
//(deposita, saca, verSaldo e remunera)e ainda os getters e setters


public abstract class Conta implements ContaI {
    // Atributos
    private Cliente dono;
    private int numero;
    private double saldo;

    // Construtor para inicializar os atributos
    public Conta(Cliente dono, int numero, double saldoInicial) {
        this.dono = dono;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    // Métodos da interface ContaI implementados
    @Override
    public boolean deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "O valor do depósito deve ser positivo.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    @Override
    public boolean saca(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente.", "Aviso", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "O valor do saque deve ser positivo.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    @Override
    public Cliente getDono() {
        return dono;
    }

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
    
    protected void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    // Método abstrato que é implementado pelas sub-classes (ContaCorrente e ContaInvestimento)
    @Override
    public abstract void remunera(); // Método abstrato, porque cada conta tem sua própria implementação de remuneração

    // Representação em string dos atributos da conta
    @Override
    public String toString() {
        return "Conta{" +
                "dono=" + dono +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
