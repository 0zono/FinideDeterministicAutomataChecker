import java.util.*;

public class Automato {
    private int estadoInicial;
    private Map<String, Integer> transicoes;
    private Set<Character> simbolos;
    private Set<Integer> estadosEnd;
    

    public Automato(int estadoInicial, Map<String, Integer> transicoes, Set<Character> simbolos, Set<Integer> estadosEnd){
        this.estadoInicial = estadoInicial;
        this.transicoes = transicoes;
        this.simbolos = simbolos;
        this.estadosEnd = estadosEnd;
    }

    public boolean verificar(String cadeia){
        //já checa todos os simbolos da cadeia, se não estiver no alfabeto já retorna falso
        
        for (char simbolo : cadeia.toCharArray()) {
            if (simbolos.contains(simbolo) == false) {
                return false;
            }
        }
        int estadoAux = estadoInicial;
        //percorre o AFD usando a cadeia
        for(char cadeiaAux: cadeia.toCharArray()){
            String estadoeSimbolo = estadoAux + " " + cadeiaAux;
            //System.out.println( estadoeSimbolo); eu tava usando isso pra checar se tá no estado correto.
            if(transicoes.containsKey(estadoeSimbolo) == false) {
                return false;
            }
            estadoAux = transicoes.get(estadoeSimbolo);
        }
        //aceita a cadeia se o ultimo estado é um final
        if(estadosEnd.contains(estadoAux)){
            return true;
        }
        else return false;
    
    }   
}
