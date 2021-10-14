package IteratorPattern;
//Student_Group 역할

public class BTG implements Aggregate {
    private BT[] bt;
    private int num = 0;
    
    public BTG(int num){
        this.bt = new BT[num];
    }
    
    public BT getBT(int index){
        return bt[index];
    }
    
    public void AddBT(BT bt){
        this.bt[num] = bt;
        num++;
    }
    
    public int getLength(){
        return num;
    }
    
    public BTGIterator iterator(){
        return new BTGIterator(this);
    }
}
