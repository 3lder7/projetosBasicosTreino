import java.util.Scanner;
public class exe02 {
    public static void main(String[] args) throws Exception{
        Scanner kb = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int n = kb.nextInt();
        switch(n){
            case 10:
                System.out.println("É igual a 10");
                break;
            default:
            if(n <= 10){
                System.out.println("É menor do que 10");
            }else{
                System.out.println("É maior que 10");
            }
        }
        kb.close();
    }
}
