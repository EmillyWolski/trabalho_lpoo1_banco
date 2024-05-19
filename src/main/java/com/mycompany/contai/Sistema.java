/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contai;

/**
 *
 * @author emill
 */
import java.util.ArrayList;

public class Sistema {

    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    // Método para adicionar um cliente à lista
    public void adicionarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    // Método para verificar se a lista contém um cliente
    public boolean contemCliente(Cliente cliente) {
        return listaClientes.contains(cliente);
    }
    
    // Método para obter a lista de clientes
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
}
