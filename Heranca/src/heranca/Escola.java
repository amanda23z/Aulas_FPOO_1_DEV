/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class Escola {
    public static void main(String[] args) {
        
        Professor p1 = new Professor(true, "Moises Olimpio", "moises@gmail.com", 40, "104.667.342-22");
        System.out.println(p1);
        System.out.println("O email e 'gmail'? " + p1.verificarDominioEmailGmail(p1.getEmail()));
        p1.verfificarDedicacaoExclusiva();
        
        System.out.println("");
        
        Aluno a1 = new Aluno("ASL2303", "Amanda Silvano", "amanda@gmail.com", 16, "462.844.508-77");
        System.out.println(a1);
        System.out.println("O email do aluno e 'gmail'? " + a1.verificarDominioEmailGmail(a1.getEmail()));
        System.out.println("Quantos caracteres tem no RA do aluno? " + a1.getRm().length());
        
        System.out.println("");
        
        Professor p2 = new Professor(false, "Flavia", "flavia@yahoo.com", 39, "456.963.001-43");
        System.out.println(p2);
        System.out.println("O email e 'yahoo' ? " + p2.verificarDominioEmailYahoo(p2.getEmail()));
        p2.verfificarDedicacaoExclusiva();
        
        System.out.println();
        
        Aluno a2 = new Aluno("31GGS", "Gustavo Graciano", "Gustavo@yahoo.com", 17, "403.197.518-05");
        System.out.println(a2);
        System.out.println("O email do aluno e 'yahoo'? " + a2.verificarDominioEmailYahoo(a2.getEmail()));
        System.out.println("Quantos caracteres tem no RA do auno? " + a2.getRm().length());
        
        
    }
    
}
