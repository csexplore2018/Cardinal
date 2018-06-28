/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardinal;

/**
 *
 * @author gc_science10
 */
public class Cardinal {

    String name = "Cardinal";
    
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "richlieu";
        a.talk();
        ladyCardinal b = new ladyCardinal();
        b.talk();
    }
    
}

class Animal{
    public String name = "Animal";
    public String food = "Food";
    
    public void talk(){
        System.out.println(name+" says: hey doods");
        
    }
}

class ladyCardinal extends Animal{
    public String name="girlbird";
}