import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Resposta3 {
    
    public static void main(String[] args) {
        //Variável para receber entrada do teclado
        Scanner recebe = new Scanner(System.in);
        
        //variável que armazena a informação da entrada
        System.out.println("Digite o texto : ");
        String texto = recebe.nextLine();
        
        //Chamando Função para a verificação
        stringSeparada(texto);
    }

    static void stringSeparada( String texto ){
        
        //Variaável para armazernar cahve/valor das informações dos caracteres
        HashMap<String, Integer> mapa = new HashMap<>();

        //Loop inicial do tamanho do texto
        for(int i  = 0; i <= texto.length(); i++){
            
            //Loop scundário para verificar cada caractere
            for( int j = i; j < texto.length(); j++ ){
                
                //Variável para armazer os caracteres
                char[] caracter = texto.substring(i, j+1).toCharArray();
                Arrays.sort(caracter);
                String subCaract = new String(caracter);
                
                //Verifica cada sub cadeia de caractere
                if(mapa.containsKey(subCaract)){
                    mapa.put(subCaract, mapa.get(subCaract) + 1);
                }                    
                else{
                    mapa.put(subCaract,1);
                }                    
            }
        }
        
        int contaPares = 0;
        
        //Ultimo loop para contar os pares.
        for(String key: mapa.keySet()) {
            
            int n = mapa.get(key);
            contaPares += (n*(n-1))/2;
        }
        System.out.println(contaPares);
    }
    
}