/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contai;

/**
 *
 * @author wolsk
 */

import java.util.Comparator;

public class OrdenacaoCliente {
    public static Comparator<Cliente> nomeOrdenacao = new Comparator<Cliente>() {
        @Override
        public int compare(Cliente c1, Cliente c2) {
            return c1.getNome().compareToIgnoreCase(c2.getNome());
        }
    };

    public static Comparator<Cliente> sobrenomeOrdenacao = new Comparator<Cliente>() {
        @Override
        public int compare(Cliente c1, Cliente c2) {
            return c1.getSobreNome().compareToIgnoreCase(c2.getSobreNome());
        }
    };
}
