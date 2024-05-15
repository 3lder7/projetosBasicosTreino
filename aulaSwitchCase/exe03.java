import java.util.Scanner;
public class exe03{
public static void main(String[] args) throws Exception{
    Scanner kb = new Scanner(System.in);
    double notas[]=new double[3];
    
    System.out.println("Digite seu nome:");
    String nome = kb.next();
    System.out.println("Digite sua idade:");
    int idade = kb.nextInt();

    double soma = 0;
    for(int i = 0;i<notas.length;i++){
        System.out.println("Digite sua nota "+(i+1)+" :");
        notas[i]=kb.nextDouble();
        soma += notas[i];
    }
    double media = soma / notas.length;
    
    String resultado;
    if(media >= 7){
        resultado = "Aprovado!";
    }else{
        resultado = "Reprovado";
    }

    System.out.println("Nome: "+nome+"\nIdade: "+ idade +"\nResultado: "+ resultado);
    kb.close();
}
}