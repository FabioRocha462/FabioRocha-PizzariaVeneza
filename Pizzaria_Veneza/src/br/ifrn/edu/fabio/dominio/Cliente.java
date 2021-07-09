/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifrn.edu.fabio.dominio;

import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author fabio
 */
public class Cliente  extends Pessoa implements Serializable{
    private String apelido;
    private Pizzas pizza;
    /**
     * @return the apelido
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * @param apelido the apelido to set
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
   
    public String imprimir() {
        return String.format("Nome: "+getNome()+" CPF: "+getCpf()+"Tel: "+getTel()+" Apelido: "+getApelido()+" Rua: "+getEndereco().getRua()+"Bairro: "+getEndereco().getBairro()+" Numero: "+getEndereco().getNum()+" ponto de Referência: "+getEndereco().getReferenia()+"\n");
    }
    /**
     * @return the pizza
     */
    public Pizzas getPizza() {
        return pizza;
    }

    /**
     * @param pizza the pizza to set
     */
    public void setPizza(Pizzas pizza) {
        this.pizza = pizza;
    }

}
