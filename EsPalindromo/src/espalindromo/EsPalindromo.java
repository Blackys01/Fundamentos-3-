package espalindromo;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author arcagel 2026,sept 2026 
 */
public class EsPalindromo {

    public static void main(String[] args) {
        String cadena =  args.length > 0 ? args[0]:"ama";
        boolean esPalindromo = esPalindromo(cadena);
        System.out.println("cadena:"+ cadena);
        System.out.println("¿es palindromo"+ esPalindromo);
    }
    public static boolean esPalindromo(String cadena){
        Deque<Character>pila = new ArrayDeque<>();
        for(char c: cadena.toCharArray()){
            pila.push(c);
        }
        char[]cadenaInvertida =new char[cadena.length()];
        while(!pila.isEmpty()){
            cadenaInvertida[cadena.length()-pila.size()]= pila.pop();
        }
        String cadenaInvertidaStr = new String (cadenaInvertida);
        System.out.println("cadena invertida" + cadenaInvertida);
        
        return cadena.equals(cadenaInvertidaStr);
     }
     

    }
    

