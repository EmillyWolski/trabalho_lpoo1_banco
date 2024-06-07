/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contai;

/**
 *
 * @author emill
 */
public abstract class Conta implements ContaI {
    private Cliente dono;
    private int numero;
    private double saldo;

    public Conta(Cliente dono, int numero, double saldoInicial) {
        this.dono = dono;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    @Override
    public boolean deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
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
                System.out.println("Saldo insuficiente.");
                return false;
            }
        } else {
            System.out.println("O valor do saque deve ser positivo.");
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

    @Override
    public abstract void remunera();

    @Override
    public String toString() {
        return "Conta{" +
                "dono=" + dono +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
