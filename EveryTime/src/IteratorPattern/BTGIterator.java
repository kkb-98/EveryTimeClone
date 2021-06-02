package IteratorPattern;
//StudyGroupIterator 역할
public class BTGIterator implements Iterator{
    private BTG btg;
    private int index;
    
    public BTGIterator(BTG btg){
        this.btg=btg;
        this.index=0;
    }
    
    public boolean hasNext(){
        if(index < btg.getLength()){
            return true;
        }else{
            return false;
        }
    }
    
    public Object next(){
        BT bt = btg.getBT(index);
        index++;
        return bt;
    }
}
