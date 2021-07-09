/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifrn.edu.fabio.controller;

import br.ifrn.edu.fabio.arquivos.FilePessoa;
import br.ifrn.edu.fabio.dominio.Cliente;
import br.ifrn.edu.fabio.dominio.Pessoa;
import java.util.ArrayList;
import static javafx.scene.input.KeyCode.P;

/**
 *
 * @author fabio
 */
public class CadastroPessoa {
    String caminho1="arquivo1.txt";
    private ArrayList<Pessoa> listapessoa=new ArrayList<Pessoa>();
    public void addPessoa(Pessoa pessoa){
        ArrayList<Pessoa> listapivo  = (ArrayList<Pessoa>)FilePessoa.recuperarPessoa("arquivo1.txt");
        for(Pessoa p: listapivo){
            listapessoa.add(p);
        }
        
        listapivo.clear();
        
        listapessoa.add(pessoa);
        boolean gravou=FilePessoa.gravarPessoa(listapessoa, caminho1);
        
       listapessoa.clear();
       
     
        
        System.out.println(gravou);
    }
    
    public void removerPessoa(String chave){
        ArrayList<Pessoa> lista  = (ArrayList<Pessoa>)FilePessoa.recuperarPessoa("arquivo1.txt");
         int i=-1;
        for(Pessoa p:lista){
            i++;
            if((chave.equalsIgnoreCase(p.getNome()))||(chave.equalsIgnoreCase(p.getCpf()))){
                System.out.println(i); 
                break;
         
            }
           
       
        }
        lista.remove(i); 
         
        
        boolean gravou=FilePessoa.gravarPessoa(lista, caminho1);
        System.out.println(gravou);
        System.out.println(chave);
        
    }                        
    }
    

