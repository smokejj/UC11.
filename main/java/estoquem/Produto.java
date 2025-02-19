/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoquem;

/**
 *
 * @author JEFERSONCARVALHODASI
 */
public class Produto {
    public String nome;
    public int quantidade;
    
    public Produto(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
        
    }
    public String getNome(){
        return nome;
    }
    public  int getQuantidade(){
        return quantidade;
    }

    public void adicionarQuantidade(int adicao) {
        this.quantidade += adicao;
    }

    public void removerQuantidade(int sub) {
        this.quantidade -= sub;
    }
}
