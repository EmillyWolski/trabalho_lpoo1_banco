/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.contai;

/**
 *
 * @author emill
 */
public interface ContaI {

    public boolean deposita(double valor);

    public boolean saca(double valor);

    public Cliente getDono();

    public int getNumero();

    public double getSaldo();

    public void remunera();

}
