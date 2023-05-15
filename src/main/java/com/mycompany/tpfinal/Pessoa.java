
package com.mycompany.tpfinal;

public class Pessoa implements Comparable<Pessoa> {

    
    /** Metodo COMPARE tendo como retorno um inteiro 
    *@author Gustavo Vaz  
    */
    static int compare(Pessoa pessoaC, Pessoa pessoaD) {
        
        if (pessoaC.codigo < pessoaD.codigo) {
           return -1;
       } else if (pessoaC.codigo > pessoaD.codigo) {
           return 1;
       } else {
           return 0;
        }
        
    }
    private int codigo;
    private String nome;

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    /** Metodo CompareTo tendo como retorno um inteiro
    *@author Gustavo Vaz  
    */
    @Override
    public int compareTo(Pessoa outraPessoa) {
       if (this.codigo < outraPessoa.codigo) {
           return -1;
       } else if (this.codigo > outraPessoa.codigo) {
           return 1;
       } else {
           return 0;
        }
    }
     
}