/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoquem;
import java.util.ArrayList;
/**
 *
 * @author JEFERSONCARVALHODASI
 */
public class Estoque {
    
   ArrayList<Produto> estoque;
   
   public Estoque(){
       this.estoque = new ArrayList<>();
       
   }
   
     public Produto adicionarProduto(String nome, int qntd){
        for(Produto prod : estoque){
            if(nome.equals(prod.nome)){
                prod.quantidade += qntd;
            }
        }
        estoque.add(new Produto(nome,qntd));
        return null;
    }
   
   public Produto removerProduto(String nome, int quantidade){
       for(Produto prod : estoque){
            if(nome == null ? prod.nome == null : nome.equals(prod.nome)){
                prod.quantidade -= quantidade;
                if(prod.quantidade == 0){
                    estoque.remove(prod);
                }
            }
        }
        return null;
   }

  public String produtoMaisEstocado(String nome, int quantidade){
       int maior = 0;
        String nomeDoMaior = "";
        for(Produto prod : estoque){
            if (prod.quantidade > maior){
                maior = prod.quantidade;
                nomeDoMaior = prod.nome;
            }
        }
       return nomeDoMaior;
      
  }
  public String limparEstoque(){
      estoque.clear();
       return ("Estoque apagado com sucesso!");
  
  }
  public int Consultar(String nome){
      int ii = 0;
      for(int i = 0; i < estoque.size();i++){
         
          if(nome == estoque.get(i).nome){
              return estoque.get(i).getQuantidade();
            }  
        }
      return 0;
    }
}   

