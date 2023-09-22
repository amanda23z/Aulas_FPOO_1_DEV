/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança.escola;

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa {

    private String rm;

    public Aluno(String rm, String nome, String email, int idade, String cpf) {
        super(nome, email, idade, cpf);
        this.rm = rm;
    }

    @Override
    public boolean verificarDominioEmailGmail(String email) {
        return super.verificarDominioEmailGmail(email); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Aluno{" + "rm=" + rm + '}';
    }

    public String getRm() {
        return rm;
    }
    

}
