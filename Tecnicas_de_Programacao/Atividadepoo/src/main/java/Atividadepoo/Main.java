/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividadepoo;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Aluno aluno = new Aluno();
       
       aluno.nome = "Radfsa";
       aluno.curso = "DSM";
       aluno.email = "Radfsa21@fatec.sp.gov.br";
       aluno.semestre = 1;
       
       System.out.println(aluno.toString());
       
       aluno.login();
       aluno.entregarAtividade();
       aluno.pesquisarNotas();
      
      
       
        
    }
    
}
