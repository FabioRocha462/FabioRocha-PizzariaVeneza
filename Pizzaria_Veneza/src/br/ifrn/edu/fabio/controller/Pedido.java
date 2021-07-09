/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifrn.edu.fabio.controller;

import br.ifrn.edu.fabio.arquivos.FileClienteedido;
import br.ifrn.edu.fabio.arquivos.FilePessoa;
import br.ifrn.edu.fabio.dominio.Cliente;
import br.ifrn.edu.fabio.dominio.Pessoa;
import br.ifrn.edu.fabio.dominio.Pizzas;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author fabio
 */
public class Pedido implements Serializable{
    String caminho2="arquivo2.txt";
    ArrayList<Pizzas> listapizza=new ArrayList<Pizzas>();
    public void fazerpedido(Pizzas pizza){
        
        ArrayList<Pizzas> listapivo  = (ArrayList<Pizzas>)FileClienteedido.recuperarPedido("arquivo2.txt");
        for(Pizzas p:listapivo){
            listapizza.add(p);
        }
        listapivo.clear();
        listapizza.add(pizza);
       boolean gravar= FileClienteedido.Gravarpedido(listapizza, caminho2);
       listapizza.clear();
        System.out.println(gravar);
    }
}
