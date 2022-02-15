
import java.util.Scanner;

public class Resposta2 {

    public static void main(String[] args){
        // variável para receber entradas do teclado
        Scanner ler = new Scanner(System.in);
        
        /*
            Todos os vetores abaixo,´são criado para comparações com a senha.
        */
        String[] digitos = {"0","1","2","3","4","5","6","7","8","9"};
        String[] maiusculos = {"A","B","C","Ç","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","X","W","Z"};
        String[] minusculo = {"a","b","c","ç","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","w","z"};
        String[] caracteresEspeciais = {"!","@","#","$","%","^","&","*","(",")","-","+"};
        
        //Variável criada para receber a confirmação(ou não) se existe um determinado caracter dentro da senha
        int[] confirmacao = new int [4]; 
        
        // Variavel criada apenas para atender a solicitação da questão
        String nome = "";
        
        //Guarda a senha digitada pelo o usuário
        String senha = "";
        
        //Variável para o controle do while
        boolean continuar = true;        
        
        //Solicitação do nome do Usuário
        System.out.println("Digite Seu Nome : ");
        //Atribuição do que foi digitado a variavel nome
        nome = ler.nextLine();
        
        //Inicio do Loop While
        while(continuar){ 
            
            //Solicitação da senha do Usuário
            System.out.println("\nDigite Sua Senha : ");
            //Atribuição do que foi digitado a variavel senha
            senha = ler.nextLine();
            
            //Verifica se a senha contém pelo menos 6 Dígitos
            if(senha.length() < 6){
                //caso não tenha, informará quantos digitos faltam para ter o minimo aceitavel
                int diferenca = 6 - senha.length();
                System.out.println("Falta " + diferenca + " Caracteres para completar a senha mínima!" );                              
                
            }
            //Caso a senha já possua um valor >= a 6, então vrifica se atende a todos os requisitos da senha Segura
            else{
                
                //Verifica se existe os caracteres solicitado na questão
                confirmacao[0] = verificaSenha(senha, digitos);
                confirmacao[1] = verificaSenha(senha, maiusculos);
                confirmacao[2] = verificaSenha(senha, minusculo);
                confirmacao[3] = verificaSenha(senha, caracteresEspeciais);
                
                
                //Comprações apenas para mostrar quais tipos de caracteres precisa para tornar a senha Segura
                if(confirmacao[0] == 0){
                    System.out.println("Acrescente algum número na sua Senha EX: 1, 2, 3 ....");
                }
                if(confirmacao[1] == 0){
                    System.out.println("Acrescente algum caractere Maiusculo na sua Senha EX: A, B, C ....");
                }
                if(confirmacao[2] == 0){
                    System.out.println("Acrescente algum caractere Minusculo na sua Senha EX: a, b, c ....");
                }
                if(confirmacao[3] == 0){
                    System.out.println("Acrescente algum caractere especial da lista : !@#$%^&*()-+");
                }
                //OBS: não estão aninhados pois precisa verificar cada informação de forma individual                
                
                //Se todos os campos possuirem 1 como valor de cada posição do vetor
                //Isso quer dizer que atende a todos os requisitos da senha Segura
                if(confirmacao[0] == 1 && confirmacao[1] == 1 && confirmacao[2] == 1 && confirmacao[3] == 1){
                    System.out.println("Senha Segura!!!!!!");
                    
                    //Seta falso para sair do loop
                    continuar = false;
                }                
            }            
         }        
    }
        
    //Função/método criado para receber uma string e um vetor de string para comparar
    public static int verificaSenha(String senha, String[] sequenciaCaracter){
      
        //valor inicial setado
        int valor = 0;
        
        //Inicio da varredura
        for(int varredura = 0; varredura < sequenciaCaracter.length; varredura++){
            
            //Caso tenha o caracter verificado, atribui o valor 1, e termina as comparações
            //já que achou 1 ocorrencia, não existe a necessidade de continuar comparando
            if(senha.contains(sequenciaCaracter[varredura])){
               valor = 1; 
               varredura = sequenciaCaracter.length + 100;
            }            
        }
        //retorno do valor, 0 = não contém, e 1 se existir 
        return valor;
    } 
    
}
