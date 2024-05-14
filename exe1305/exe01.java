import java.util.Scanner;
public class exe01 {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int n = kb.nextInt();
        if(n >= 10){
            System.out.println("É maior que 10");
        }else{
            System.out.println("Não é maior que 10");
        }
        kb.close();
    }
}
