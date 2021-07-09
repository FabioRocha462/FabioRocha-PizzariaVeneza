/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifrn.edu.fabio.dominio;

import java.io.Serializable;

/**
 *
 * @author fabio
 */
public class Pizzas extends Cliente implements Serializable{
    private String sabor;
    private double preco;

    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String toString(){
        return String.format("Cliente: "+getNome()+ "Sabor: "+getSabor()+" Preço: "+getPreco()+"\n");
    }
}
