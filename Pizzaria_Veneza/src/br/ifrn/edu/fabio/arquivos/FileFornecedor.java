/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifrn.edu.fabio.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author fabio
 */
public class FileFornecedor {
    public static boolean Gravarpedido(Object objfornecedor,String Caminho3){
        File arquivo3=new File(Caminho3);
        
        if(! arquivo3.exists()){
            try{
            arquivo3.createNewFile();
            }catch(Exception e){
                e.printStackTrace();
                return false;
            }
        }
        
        try{
           FileOutputStream fileOutput=new FileOutputStream(arquivo3);
           ObjectOutputStream objOutput=new ObjectOutputStream(fileOutput);
           
           objOutput.writeObject(objfornecedor);
           
           objOutput.flush();
           fileOutput.flush();
           
           objOutput.close();
           fileOutput.close();
           return true;
       }catch(Exception e){
           e.printStackTrace();
           return false;
       }
    }
    public static Object recuperarPedido(String Caminho3){
        File arquivo3=new File(Caminho3);
        try{
            FileInputStream fileInput=new FileInputStream(arquivo3);
            ObjectInputStream objetoInput=new ObjectInputStream(fileInput);
            
            Object retorno = objetoInput.readObject();
            
            objetoInput.close();
            fileInput.close();
            
            return retorno;
        }catch( Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
