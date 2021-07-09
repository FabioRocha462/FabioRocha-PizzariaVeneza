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
public class FileClienteedido {
    public static boolean Gravarpedido(Object objpedido,String Caminho2){
        File arquivo2=new File(Caminho2);
        
        if(! arquivo2.exists()){
            try{
            arquivo2.createNewFile();
            }catch(Exception e){
                e.printStackTrace();
                return false;
            }
        }
        
        try{
           FileOutputStream fileOutput=new FileOutputStream(arquivo2);
           ObjectOutputStream objOutput=new ObjectOutputStream(fileOutput);
           
           objOutput.writeObject(objpedido);
           
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
     public static Object recuperarPedido(String Caminho2){
        File arquivo2=new File(Caminho2);
        try{
            FileInputStream fileInput=new FileInputStream(arquivo2);
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
