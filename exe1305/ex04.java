import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) throws Exception{
        Scanner kb = new Scanner(System.in);
        int media;
        int soma;
        int prod;
        System.out.println("Digite um valor: ");
        int n1 = kb.nextInt();
        System.out.println("Digite outro valor: ");
        int n2 = kb.nextInt();
        soma = n1+n2;
        prod = n1*n2;
        media = soma/2;
        String res;
        if(n1>n2){
            res ="O número "+n1+" é maior";
        }else if(n2>n1){
            res ="O número "+n2+" é maior";
        }else{
            res = "Os números são iguais";
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Produto: " + prod);
        System.out.println(res);
        kb.close();
    }
}
