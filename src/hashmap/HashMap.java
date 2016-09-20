/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

/**
 *
 * @author afnan
 */
public class HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap_ map= new HashMap_();
        
        map.addToMap(10, 20);
        map.addToMap(15, 45);
        map.addToMap(26, 30);
        map.addToMap(15, 45);
        
        map.addToMap(26, 30);
        
        //map.search(0);
        
        map.displayEverything();
        
        
    }
    
}
