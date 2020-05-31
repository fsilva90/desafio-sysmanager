package teste2;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class teste{

public static void main(String [] args){
    inicio();
}

public static void inicio(){
    try{
        Scanner in = new Scanner(System.in); 

        System.out.println("\finforme o nomedoarquivo.txt:");
        String arquivo = "abcz";
// o arquivo de entrada deve estar previamente colocado na pasta do projeto

        File arquivoDeEntrada = new File(arquivo);
        Scanner entrada = new Scanner(arquivoDeEntrada); 

        System.out.println("informe o nomedoarquivodesaida.txt:");
        String arquivosaida = "ok";
// para selecionar o nome do arquivo de saida

        PrintWriter saida = new PrintWriter(arquivosaida); 

        int op = 0;
        int chave;
        do{
            System.out.println("Digite 1 para criptografar o arquivo");
            System.out.println("Digite 2 para descriptografar o arquivo");
            op = in.nextInt();
            if(op != 1 && op != 2){
                System.out.println("Opção inválida.");
                inicio();
            } else {
                System.out.println("informe a chave de 1 até 5");
                chave = in.nextInt();
                if(chave != 1 && chave != 2 && chave != 3 && chave != 4 && chave != 5){
                System.out.println("Chave inválida");
                inicio();
                }
                leituraEscritaDosArquivos(entrada, saida, op, chave);
            }
        } while (op != 1 && op != 2);            
    } catch(IOException e){
        System.out.println("Erro com o arquivo. Tente novamente");
        inicio();
    }
} 

public static void leituraEscritaDosArquivos(Scanner entrada,  PrintWriter saida, int op, int chave){

    while(entrada.hasNext()){  
        String palavra = entrada.next().toUpperCase();

        String resultado = "";
        int key = chave;
        if(op == 1){
            resultado = criptografa(palavra, key);
        }
        else{
            resultado = descriptografa(palavra, key);
        }

        saida.println(resultado);

    }
    saida.close();
    entrada.close();
    System.out.println("Saída gerada com sucesso.");
}

public static String criptografa(String palavra, int chave){    
    String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String resultado = "";
    for(int i = 0; i < palavra.length(); i++){
        if(palavra.indexOf(palavra.charAt(i)) == ' '){
            char novaletra = '#';
            resultado = resultado + novaletra;
        }else{
            int posicaodaletra = alfabeto.indexOf(palavra.charAt(i));
            int novaposicao = posicaodaletra + chave;
            if(novaposicao > 25){
                char novaletra = alfabeto.charAt(posicaodaletra+chave-26);
                resultado = resultado + novaletra;
            }else{
                char novaletra = alfabeto.charAt(novaposicao);
                resultado = resultado + novaletra;
            }

        }
    }
    return resultado;
}

public static String descriptografa(String palavra , int chave){    
    String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String resultado = "";
    for(int i = 0; i < palavra.length(); i++){
        if(palavra.indexOf(palavra.charAt(i)) == ' '){
            char novaletra = '#';
            resultado = resultado + novaletra;
        }else{
            int posicaodaletra = alfabeto.indexOf(palavra.charAt(i));
            int novaposicao = posicaodaletra - chave;
            if(novaposicao < 0){
                char novaletra = alfabeto.charAt(posicaodaletra-chave+26);
                resultado = resultado + novaletra;
            }else{
                char novaletra = alfabeto.charAt(novaposicao);
                resultado = resultado + novaletra;
            }

        }
    }
    return resultado;
}
}