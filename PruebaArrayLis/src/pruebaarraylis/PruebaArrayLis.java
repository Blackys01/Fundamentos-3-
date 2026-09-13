
package PruebaArraylis;

import java.util.ArrayList;

/**
 *
 * @author Arcangel Diaz
 * date 2026 08 31
 */
public class PruebaArrayLis {


    public static void main(String[] args) {
        ArrayList<String> personalities= new ArrayList<String>();
        personalities.add("adda lovelace");
        personalities.add("alan turing");
        personalities.add("grace Hoper ");
        String name = personalities.get(1);
        System.out.println(name);
        System.out.println("the size of the ArrayList is :"+ personalities.size());
        personalities.remove(0);
        personalities.set(1,"margaret hamilton");
        System.out.println(personalities);
    }
    
}