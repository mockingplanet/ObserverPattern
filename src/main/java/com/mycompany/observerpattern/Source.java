/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observerpattern;

import java.util.*;

/**
 *
 * @author alu10711158
 */
public class Source {
    private List<Listener> listeners = new ArrayList<Listener>();
    
    private int state;
    
    public Source(int state) {
        this.state = state;
    }
    
    public void addListener(Listener listener) {
        listeners.add(listener);
    }
    
    public void removeListener(Listener listener) {
       listeners.remove(listener);
    }
    
    public int getState() {
        return state;
    }
    
    public void setState(int state) {
        this.state = state;
        notifyAllListeners();
    }
    
    private void notifyAllListeners() {
        for (Listener listener : listeners) {
            listener.update();
        }
    }
    
}

