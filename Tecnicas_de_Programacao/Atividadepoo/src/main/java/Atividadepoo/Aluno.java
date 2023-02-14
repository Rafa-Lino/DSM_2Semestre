/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividadepoo;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Aluno {
    
    String nome;
    String email;
    int semestre;
    String curso;
    
    void entregarAtividade() {
        System.out.println("Entregando atividade...");
    }
    
    void login() {
        System.out.println("Realizando Login...");
    }
    
    void pesquisarNotas() {
        System.out.println("Mostrando nota...");
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", semestre=" + semestre + ", curso=" + curso + '}';
    }
    
    
    
}
