/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asissda;

/**
 *
 * @author ASUS
 */
public class link<E> {
    private E element;
    private link<E> next;
    
    public link(E element, link<E> next){
        this.element = element;
        this.next = next;
    }
    
    public link(link<E> next){
        this.next = next;
    }
    
    public E getelement(){
        return element;
    }
    
    public void setelemenr(E element){
        this.element = element;
    }
    
    public link<E> getnext(){
        return next;
    }
    
    public link<E> setnext(link<E> next){
        return this.next = next;
    }
    
}
