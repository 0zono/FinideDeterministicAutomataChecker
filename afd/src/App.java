import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("caminhodoarquivo"));
        @SuppressWarnings("unused")
        int qtdEstados = scanner.nextInt(); //n vai ser usado porque a quantidade de estados fica implicita em transicoes, provavelmente       
        int estadoIni = scanner.nextInt();
        int qtdEstadosEnd = scanner.nextInt(); //escrevi estadosEnd pq eu q n vou arriscar usar a palavra final
        Set<Integer> estadosEnd = new HashSet<>();
        for (int i = 0; i < qtdEstadosEnd; i++) {
            estadosEnd.add(scanner.nextInt());
        }
        
        int qtdSimbolos = scanner.nextInt();

        Set<Character> simbolos = new HashSet<>(); //hashset pq a ordem não importa
        for(int i = 0; i < qtdSimbolos; i++){
            //System.out.println(scanner.next().charAt(0)); só pra checar se o scanner tá lendo certo os simbolos
            simbolos.add(scanner.next().charAt(0));
        }
        
        int qtdTransicoes = scanner.nextInt();

        Map<String, Integer> transicoes = new HashMap<>();
        for (int i = 0; i < qtdTransicoes; i++) {
            int estadoAtual = scanner.nextInt();
            char simbolo = scanner.next().charAt(0);
            int estadoDestino = scanner.nextInt();
            transicoes.put(estadoAtual + " " + simbolo, estadoDestino);
        }
        

        String cadeia = scanner.next();
        

        Automato afd = new Automato(estadoIni, transicoes, simbolos, estadosEnd);

        boolean cadeiaAfd = afd.verificar(cadeia);

        if(cadeiaAfd){
            System.out.println("A cadeia foi aceita pelo AFD");
        }
        else{
            System.out.println("A cadeia não foi aceita pelo afd");
        }
    }
}
