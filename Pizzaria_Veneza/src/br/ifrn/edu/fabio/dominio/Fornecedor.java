/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifrn.edu.fabio.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author fabio
 */
public class Fornecedor extends Pessoa implements Serializable{
    private String cnpj;
    private double totalCompras;
    private String  entrega;
    private String pedido;

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the totalCompras
     */
    public double getTotalCompras() {
        return totalCompras;
    }

    /**
     * @param totalCompras the totalCompras to set
     */
    public void setTotalCompras(double totalCompras) {
        this.totalCompras = totalCompras;
    }

    /**
     * @return the entrega
     */
    public String getEntrega() {
        return entrega;
    }

    /**
     * @param entrega the entrega to set
     */
    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public String imprimir() {
        return String.format("Nome: "+getNome()+" CNPJ: "+getCnpj()+"Tel: "+getTel()+" Rua: "+getEndereco().getRua()+"Bairro: "+getEndereco().getBairro()+" Numero: "+getEndereco().getNum()+" ponto de Referência: "+getEndereco().getReferenia()+"\n");
    }
    /**
     * @return the pedido
     */
    public String getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
}
