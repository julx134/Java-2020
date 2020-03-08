/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jules
 */
import java.util.ArrayList;
public class StackOfDistinctStrings {
 // Overview: StacksOfDistinctStrings are mutable, bounded
 // collection of distinct strings that operate in
 // LIFO (Last-In-First-Out) order.
 //
 // The abstraction function is:
 // AF(c) = a stack of strings p such that
 // p = {c.items.get(0), c.items.get(1)...,c.items.get(n)}
 // p.top = c.items.get(c.items.size()-1)
 //  
    
    
    
 // The rep invariant is:
 // c.items != null && 
 // for all integers i, c.items[i] is a String &&
 // for all integers i and j such that: 0 <= i j < c.size() 
 //    !(c.items.get(i).equals(c.items.get(j)))
 //
    
 //the rep
 private ArrayList<String> items;
 
 // constructor
 public StackOfDistinctStrings() {
 // EFFECTS: Creates a new StackOfDistinctStrings object
    items = new ArrayList<String>();
 }
 
 public void push(String element) throws Exception {
 // MODIFIES: this
 // EFFECTS: Appends the element at the top of the stack
 // if the element is not in the stack, otherwise
 // does nothing.
    if(element == null) throw new Exception();
 
    if(false == items.contains(element))
        items.add(element);
 }
 
 public String pop() throws Exception {
 // MODIFIES: this
 // EFFECTS: Removes an element from the top of the stack
    if (items.size() == 0) throw new Exception();
        return items.remove(items.size()-1);
 }
 

 public boolean repOK() {
 // EFFECTS: Returns true if the rep invariant holds for this
 // object; otherwise returns false
 
    if (items == null)
        return false;
    
    for (int i = 0; i < items.size(); i++) {
        for (int j = 0; j < items.size(); i++) {
            if (items.get(i).equals(items.get(j)))
                return false;
        }
    }
    
    return true;
 }

 public String toString() {
 // EFFECTS: Returns a string that contains the strings in the
 // stack and the top element. Implements the
 // abstraction function.
    
    String stack = new String();
    
    for (String s : items) {
        stack += s;
    }
    
    for (int i = 0; i < items.size(); i++) {
        if (i == items.size() - 1) {
            stack += "\n+top = "+ items.get(i);
        }
    }
    return stack;
 }
}