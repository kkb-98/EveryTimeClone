package MementoPattern;
import java.util.ArrayList;
import java.util.List;


public class CareTaker { //Memento를 저장하는 클래스
    private List<Memento> mementoList = new ArrayList<Memento>();

   public void add(Memento state){
      mementoList.add(state);
   }

   public Memento get(int index){
      return mementoList.get(index);
   }
}
