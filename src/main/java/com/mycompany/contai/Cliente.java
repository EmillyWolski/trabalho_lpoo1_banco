/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contai;

import java.util.Objects;

/**
 *
 * @author emill
 */

// Contém as infos dos clientes e também os getters e setters para lidar com esses dados


public class Cliente {
    // Atributos privados
    private String nome;
    private String sobreNome;
    private String rg;
    private String cpf;
    private String endereco;
    private Conta conta;

    // Construtor
    public Cliente(String nome, String sobreNome, String rg, String cpf, String endereco) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    // Getters que retornam (return) os valores dos atributos e
    // Setters que permitem alteração (com .this definem ou atualizam o valor de um atributo) 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        // this para evitar ambiguidades quando os nomes dos parâmetros são iguais aos nomes dos atributos
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}