/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifracesar;

import java.util.Scanner;

/**
 *
 * @author Saulo Jr
 */
public class Decifra {
    
    
    private String recebe;
    
    
    public StringBuilder codifica(String recebe, int codi){
        StringBuilder novo = new StringBuilder();
        int novoChar,teste;
        for (byte i: recebe.getBytes()){
            teste = i+codi;
            if( teste>=122){
                teste = teste - 122;
                novoChar = 65 + teste;
                 novo.append((char)novoChar);
            }else{
            novoChar = i + codi;
            novo.append((char)novoChar);
            }
    }
        return(novo);
        
    }
    
    public StringBuilder decodifica(String recebe, int codi){
          StringBuilder novo = new StringBuilder();
        int novoChar,teste;
        for (byte i: recebe.getBytes()){
            teste = i-codi;
            if( teste>=122){
                teste = teste + 122;
                novoChar = 65 - teste;
                 novo.append((char)novoChar);
            }else if (teste<=65){
                teste = teste - 65;
                novoChar = 122 + teste;
                novo.append((char)novoChar);
            }else{
            novoChar = i - codi;
            novo.append((char)novoChar);
            }
    }
        return(novo);
        
      
    }
}
