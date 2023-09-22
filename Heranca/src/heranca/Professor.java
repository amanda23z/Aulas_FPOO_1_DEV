/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa {

    private boolean dedicacaoExclusiva;

    public Professor(boolean dedicacaoExclusiva, String nome, String email, int idade, String cpf) {
        super(nome, email, idade, cpf);
        this.dedicacaoExclusiva = dedicacaoExclusiva;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Professor{" + "dedicacaoExclusiva=" + dedicacaoExclusiva + '}';
    }

    public void verfificarDedicacaoExclusiva() {
        if (dedicacaoExclusiva == true) {
            System.out.println("O professor tem dedicacao exclusiva a escola");
        } else {
            System.out.println("O professor nao tem dedicacao exclusiva a escola");
        }
    }

}
