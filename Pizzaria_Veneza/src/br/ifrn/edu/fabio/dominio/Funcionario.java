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
public class Funcionario extends Pessoa implements Serializable {
    private double salario;

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

  public String imprimir() {
        return String.format("Nome: "+getNome()+" CPF: "+getCpf()+"Tel: "+getTel()+" Salario: "+getSalario()+" Rua: "+getEndereco().getRua()+"Bairro: "+getEndereco().getBairro()+" Numero: "+getEndereco().getNum()+" ponto de Referência: "+getEndereco().getReferenia()+"\n");
    }
    
}
