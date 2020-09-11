/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author ASUS
 */
public class Node {
    private String name;
    private int x;
    private int y;
    private boolean visited;
    public Node(String c){
        name = c;
        visited = false;        
        
    }
    public void visit(){
        visited = true;
    }
    public boolean visited(){
        return visited;
    
    }
    public String name(){
        return name;
    }
}
