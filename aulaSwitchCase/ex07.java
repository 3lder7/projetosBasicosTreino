import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = kb.nextInt();
        if(idade <= 18 || idade >= 65){
            System.out.println("Não é obrigado a votar");
        }else{
            System.out.println("É obrigado a votar!");
        }
        kb.close();
    }
}