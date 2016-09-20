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
public class HashEntry {
     private int key;
      private int value;
 
      HashEntry(Integer key, Integer value) {
            this.key = key;
            this.value = value;
      }     
      
      public int getKey() {
            return this.key;
      }
 
      public int getValue() {
            return this.value;
      }
}

