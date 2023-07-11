package lesson6java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        
        Iterator<Cat> it = cats.iterator();
        if(it.hasNext())
            cats.remove(it.next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
       
        Set<Cat> cats = new HashSet<Cat>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
       
        for(int i = 0; i < cats.size(); i++){
            System.out.println(cats);
        }
    }

    
    public static class Cat{

    }
}