/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifrn.edu.fabio.controller;

import br.ifrn.edu.fabio.arquivos.FileClienteedido;
import br.ifrn.edu.fabio.arquivos.FileFornecedor;
import br.ifrn.edu.fabio.dominio.Fornecedor;
import br.ifrn.edu.fabio.dominio.Pessoa;
import br.ifrn.edu.fabio.dominio.Pizzas;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author fabio
 */
public class PedidoFornecedor extends Fornecedor implements Serializable{
    ArrayList<PedidoFornecedor> listapedidofor=new ArrayList<PedidoFornecedor>();
    String Caminho3="arquivo3.txt";
    public void fazerpedido(PedidoFornecedor pf){
        ArrayList<PedidoFornecedor> listapivo  = (ArrayList<PedidoFornecedor>)FileFornecedor.recuperarPedido("arquivo3.txt");
        for(PedidoFornecedor p: listapivo){
            listapedidofor.add(p);
        }
        listapivo.clear();
        
        listapedidofor.add(pf);
        boolean gravar=FileFornecedor.Gravarpedido(listapedidofor, Caminho3);
        listapedidofor.clear();
        
    }
public String toString(){
   return String.format("Informações: "+getNome()+"Total de Compras: "+getTotalCompras()+"Pedido: "+getPedido()+"Data Prevista para a Entrega: "+getEntrega()+"\n");
}
}
