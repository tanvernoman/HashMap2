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
public class HashMap_ {

    private final static int SIZE = 10;

    HashEntry[] table;
    

    HashMap_() {
        table = new HashEntry[SIZE];
        
        for (int i = 0; i < SIZE; i++) {
            table[i] = null;
          
        }
    }

    public void addToMap(Integer key, Integer value) {
        int hash = (key % SIZE);
        if(table[hash] != null && table[hash].getKey() != key) {
             System.out.println("This key exist in the table ");
           
        }else{
             
             table[hash] = new HashEntry(key, value);
        }
       
    }

    public int search(Integer key) {
        int hash = (key % SIZE);
       
        if (table[hash] == null) {
            System.out.println("There are nothing");
        } else {
            System.out.println(table[hash].getKey() + " : " + table[hash].getValue());
        }
        return 0;
    }

    public void displayEverything() {

        for (int i = 0; i < SIZE; i++) {

            if (table[i] == null) {
                System.out.println("There are nothing");
            } else {
                System.out.println(table[i].getKey() + " : " + table[i].getValue());
            }
        }
      
    }
    
}
 