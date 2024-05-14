import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String nome[] = new String[2];
        String senha[] = new String[2];
        System.out.println("Registre seu nome");
        nome[0]=kb.next();
        System.out.println("Registre sua senha");
        senha[0]=kb.next();
       
        
        do{
            System.out.println("Login com seu nome");
            nome[1]=kb.next();
            System.out.println("Agora, digite sua senha");
            senha[1]=kb.next();

            if(nome[0].equals(nome[1])&&senha[0].equals(senha[1])){
                System.out.println("Bem-vindo ao Sistema");
            }else{
                System.out.println("Erro, tente novamente");
            }
        }while(!nome[0].equals(nome[1]) || !senha[0].equals(senha[1]));
        kb.close();
    
    }
}