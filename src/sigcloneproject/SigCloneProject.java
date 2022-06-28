package sigcloneproject;

import java.util.Scanner;

/** * @author wildes*/
public class SigCloneProject {
    /** @param args the command line arguments*/
    public static void main(String[] args) {
       
        AutenticacaoDoSistema testeLogin, testeLogin2;
        
        testeLogin = new AutenticacaoDoSistema ("wildesDev","@3170d35");
        testeLogin2 = new AutenticacaoDoSistema ("devjoao","@61a90d5");
        
        Discente discente;
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        discente = new Discente();
       
        System.out.println(testeLogin.toString());
        System.out.println(testeLogin2.toString());
        System.out.println(testeLogin2.setRecuperarSenha("11870274644"));
        testeLogin.setCancelLogin();
               
        System.out.println(testeLogin2.toString());
        System.out.println(testeLogin.toString());
    }
    
}
