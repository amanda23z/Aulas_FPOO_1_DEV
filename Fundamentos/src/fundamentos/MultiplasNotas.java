/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentos;

/**
 *
 * @author Aluno
 */
public class MultiplasNotas {

    public static void main(String[] args) {
        int rs = somar(4, 8, 2, 1);
        System.out.println("O resultado da soma é: " + rs);
    }

    public static int somar(int... valores) {
        int resultado = 0;

        for (int i = 0; i < valores.length; i++) {
            int valor = valores[i];
            resultado += valor;
        }
        return resultado;
    }
}
