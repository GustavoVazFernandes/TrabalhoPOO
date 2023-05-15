package com.mycompany.tpfinal;


import java.io.IOException;
import java.io.File;
import java.io.FileWriter;


public class TPFinal {

    public static void main(String[] args) throws IOException {
        ListaEncadeada lista = new ListaEncadeada();

        
    /** Adicionando elementos na lista atrave do metodo ADD da classe ListaEncadeada
    *@author Gustavo Vaz  
    */
    lista.add(new Pessoa(3,"João"));
    lista.add(new Pessoa(5,"Maria"));
    lista.add(new Pessoa(1,"Pedro"));
    lista.add(new Pessoa(9,"Ana"));
    lista.add(new Pessoa(10,"Marta"));
    lista.add(new Pessoa(4,"Joaquim"));

    
    /** Obtendo um iterator da lista e percorrendo com while 
    *@author Gustavo Vaz  
    */
    iterator<Pessoa> it = (iterator<Pessoa>) lista.iterator();
    while (it.hasNext()) {
        Pessoa p = it.next();
        System.out.println(p.getNome() + ": o seu codigo é  " + p.getCodigo());
    }
      
        
    /** Procurando uma pessoa na lista utilizando um for-each
    *@author Gustavo Vaz  
    */
//    Pessoa pessoaBuscar = new Pessoa(5, "Maria");
//    boolean encontrado = false;
//    for (Pessoa p : lista) {
//    if (p.equals(pessoaBuscar)) {
//        encontrado = true;
//        break;
//    }
//}
    

    /** Removendo uma pessoa da lista atraves do metodo Remove da classe ListaEncadeada
    *@author Gustavo Vaz  
    */
    Pessoa pRemover = new Pessoa(11,"Ana");
    if (lista.remove(pRemover)) {
        System.out.println("\n" + pRemover.getNome() + " removido(a) da lista.");
    } else {
        System.out.println("\n" + pRemover.getNome() + " não encontrado(a) na lista.");
    }
        
             
    /** Usando o método compareTo para comparar o codigo da pessoaA e pessoaB 
    *@author Gustavo Vaz 
    */
    Pessoa pessoaA = new Pessoa(3,"João");
    Pessoa pessoaB = new Pessoa(5,"Maria");
    int comparacao = pessoaA.compareTo(pessoaB);
    if (comparacao < 0) {
        System.out.println(pessoaA.getCodigo() + "  é menor que " + pessoaB.getCodigo()+ ", logo o codigo da pessoa A é menor que o da pessoa B");
    } else if (comparacao > 0) {
        System.out.println(pessoaA.getCodigo() + " o é maior que  " + pessoaB.getCodigo() + ", logo o codigo da pessoa A é maior que o da pessoa B ");
    } else {
        System.out.println(pessoaA.getCodigo() + "  é igual a " + pessoaB.getCodigo() + ". logo o codigo da pessoa A é igual ao da pessoa B ");
    }

    
    /** Usando o método compare para realizar a comparação do codigo da pessoaC e pessoaD
    *@author Gustavo Vaz 
    */
    Pessoa pessoaC = new Pessoa(10,"Marta");
    Pessoa pessoaD = new Pessoa(4,"Joaquim");
    comparacao = Pessoa.compare(pessoaC, pessoaD);
    if (comparacao < 0) {
        System.out.println(pessoaC.getCodigo() + "  é menor que  " + pessoaD.getCodigo() + ", logo o codigo da pessoa C é menor que o da pessoa D ");
    } else if (comparacao > 0) {
        System.out.println(pessoaC.getCodigo() + "  é maior que  " + pessoaD.getCodigo() + ", logo o codigo da pessoa C é maior que o da pessoa D ");
    } else {
        System.out.println(pessoaC.getCodigo() + "  é igual a " + pessoaD.getCodigo() + ", logo o codigo da pessoa C é igual ao da pessoa D ");
    }

    
    /*Gravando a lista de pessoas em um arquivo .txt atraves do iterator
    *@author Gustavo Vaz 
    */
        it = (iterator<Pessoa>) lista.iterator();
        String fileName = "lista_pessoas.txt";
        File file = new File(fileName);
        try {
            FileWriter writer = new FileWriter(file);
            while (it.hasNext()) {
                Pessoa pFile = it.next();
                writer.write(pFile.getCodigo() + " - " + pFile.getNome()  + "\n");
            }
            writer.close();
            System.out.println("\nLista de pessoas gravada no arquivo " + fileName + ".");
        } catch (IOException e) {
            System.out.println("\nErro ao gravar arquivo: " + e.getMessage());
        }
  }
}
