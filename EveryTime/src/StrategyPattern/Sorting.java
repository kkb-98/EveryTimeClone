/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;
import main.databaseSQL;

/**
 *
 * @author USER
 */
public abstract class Sorting extends databaseSQL  {
    private Function function;
    
    public void sort(){
        function.sort();
    }
    public void setFunction(Function function){
        this.function = function;
    }
}
