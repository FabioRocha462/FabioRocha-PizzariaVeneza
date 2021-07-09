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
public class Endereco implements Serializable{
    private String rua;
    private String bairro;
    private String num;
    private String referenia;

    /**
     * @return the Rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param Rua the Rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the Bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param Bairro the Bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the Num
     */
    public String getNum() {
        return num;
    }

    /**
     * @param Num the Num to set
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * @return the referenia
     */
    public String getReferenia() {
        return referenia;
    }

    /**
     * @param referenia the referenia to set
     */
    public void setReferenia(String referenia) {
        this.referenia = referenia;
    }

    public void setRua(JTextField ruacliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setBairro(JTextField bairrocliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNum(JTextField numcliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setReferenia(JTextField pfcliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
