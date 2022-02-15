import java.util.Scanner;

public class Resposta1 {

    public static void main(String[] args) { 
        
        //Variável criada para receber o tamanho da árvore
        int tamanhoDaArvore;
        
        // Variável para receber entrada do teclado.
        Scanner recebe = new Scanner(System.in);
        
        //variável para controle de impressão do caracter *
        String [] simbolo;
        
        // Recebendo informações do teclado
        System.out.println("Digite o tamanho da Escada : ");
        
        // Atribuindo o valor lido a variavel tamanhoDaArvore
        tamanhoDaArvore = recebe.nextInt();
        
        //Definindo o tamanho do vetor igual a entrada do teclado
        simbolo = new String[tamanhoDaArvore];
        
        //Comndo de repetição para auxiliar a impressaõ do caracter
        for(int x = tamanhoDaArvore; x > 0; x --){
           
            //A cada loop, as ultimas posições do vetor é preenchida com o caracter *
            simbolo[x - 1] = "*";
           
            //Outro fluxo de repetição para a impressão do caracter na tela
            for(int y = 0; y < tamanhoDaArvore; y ++){
               
                //Caso se null, ele mostra-rá na tela um espaço " "
                if(simbolo[y] == null){
                    System.out.print(" ");
                }
                //Se não, o caractere * é impresso.
                else{
                    System.out.print(""+simbolo[y]);
                }              
            }
            //A cada fim de linha, uma quebra de linha deve ser realizada
            System.out.print("\n");
        }        
    }    
}
