/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

/**
 *
 * @author USER
 */
public class Test {
    public static void main(String[] args) {
        // TODO code application logic here
        Sorting report = new Report();
        Sorting recommend = new Recommend();
        
        report.setFunction(new Reader());
        recommend.setFunction(new Writer());
        
        report.sort();
        recommend.sort();
    }
}
