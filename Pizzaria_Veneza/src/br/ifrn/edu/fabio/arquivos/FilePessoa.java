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
public class FilePessoa {
    public static boolean gravarPessoa(Object objpessoa,String Caminho1){
       //criando o arquivo
       File arquivo1=new File(Caminho1);
       //Verifica se o arquivo existe ou não, senão existir ele criará
       if(! arquivo1.exists()){
           try{
               arquivo1.createNewFile();
           }catch(Exception e){
               e.printStackTrace();
               return false;
           }
       }
       try{
           FileOutputStream fileOutput=new FileOutputStream(arquivo1);
           ObjectOutputStream objOutput=new ObjectOutputStream(fileOutput);
           
           objOutput.writeObject(objpessoa);
           
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
    public static Object recuperarPessoa(String Caminho1){
        File arquivo1=new File(Caminho1);
        try{
            FileInputStream fileInput=new FileInputStream(arquivo1);
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
