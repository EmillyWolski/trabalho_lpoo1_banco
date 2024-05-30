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

    public boolean deposita(double valor){
        return false;
    }

    public boolean saca(double valor){
        return false;
    }

    public Cliente getDono(){
        return null;
    }

    public int getNumero(){
        return 0;
    }

    public double getSaldo(){
        return 0;
    }

}
