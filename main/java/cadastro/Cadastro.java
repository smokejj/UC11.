/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

/**
 *
 * @author JEFERSONCARVALHODASI
 */
public class Cadastro {
     String nome;
    String senha;
    String email;
     
    public Cadastro(String nome,String senha,String email){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
    

    
    public static boolean validarNome(String nome) {
        return nome != null;
    }

    // Valida o e-mail (deve conter "@" e ".")
    public static boolean validarEmail(String email) {
        
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }

    // Valida a senha (deve ter pelo menos 6 caracteres)
    public static boolean validarSenha(String senha) {
        return senha.length() >= 6;
    }
}

