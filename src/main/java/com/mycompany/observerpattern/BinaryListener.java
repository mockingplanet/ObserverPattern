/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerpattern;

/**
 *
 * @author alu10711158
 */
public class BinaryListener extends Listener {
    
    private Source source;
    
    public BinaryListener(Source source) {
        this.source = source;
        source.addListener(this);
        
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(source.getState()));
        
    }
    
}
