/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.contai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ClienteTableModel extends AbstractTableModel {
   private String[] colunas = new String[]{"Nome", "SobreNome", "RG", "CPF", "Endereco"};
   private List<Cliente> lista = new ArrayList();

   public ClienteTableModel(List<Cliente> lista) {
      this.lista = lista;
   }

   public ClienteTableModel() {
   }

   public int getRowCount() {
      return this.lista.size();
   }

   public int getColumnCount() {
      return this.colunas.length;
   }

   public String getColumnName(int index) {
      return this.colunas[index];
   }

   public boolean isCellEditable(int row, int column) {
      return false;
   }

   public Object getValueAt(int rowIndex, int columnIndex) {
      Cliente customer = (Cliente)this.lista.get(rowIndex);
      switch (columnIndex) {
         case 0:
            return customer.getNome();
         case 1:
            return customer.getSobreNome();
         case 2:
            return customer.getRg();
         case 3:
            return customer.getCpf();
         case 4:
            return customer.getEndereco();
         default:
            return null;
      }
   }

   public void setValueAt(Object value, int row, int col) {
      Cliente customer = (Cliente)this.lista.get(row);
      switch (col) {
         case 0:
            customer.setNome((String)value);
            break;
         case 1:
            customer.setSobreNome((String)value);
            break;
         case 2:
            customer.setRg((String)value);
            break;
         case 3:
            customer.setCpf((String)value);
            break;
         case 4:
            customer.setEndereco((String)value);
      }

      this.fireTableCellUpdated(row, col);
   }

   public boolean removeCliente(Cliente customer) {
      int linha = this.lista.indexOf(customer);
      boolean result = this.lista.remove(customer);
      this.fireTableRowsDeleted(linha, linha);
      return result;
   }

   public void adicionaCliente(Cliente customer) {
      this.lista.add(customer);
      this.fireTableRowsInserted(this.lista.size() - 1, this.lista.size() - 1);
   }

   public void setListaContatos(List<Cliente> contatos) {
      this.lista = contatos;
      this.fireTableDataChanged();
   }

   public void setListaContatos(HashMap<String, Cliente> contatos) {
      this.lista = new ArrayList();
      Iterator var2 = contatos.values().iterator();

      while(var2.hasNext()) {
         Cliente c = (Cliente)var2.next();
         this.lista.add(c);
      }

      this.fireTableDataChanged();
   }

   public void limpaTabela() {
      int indice = this.lista.size() - 1;
      if (indice < 0) {
         indice = 0;
      }

      this.lista = new ArrayList();
      this.fireTableRowsDeleted(0, indice);
   }

   public Cliente getContato(int linha) {
      return (Cliente)this.lista.get(linha);
   }

   void removeContatos(List<Cliente> listaParaExcluir) {
      listaParaExcluir.forEach((contato) -> {
         this.removeCliente(contato);
      });
   }
}
