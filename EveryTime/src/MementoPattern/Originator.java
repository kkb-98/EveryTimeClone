package MementoPattern;

public class Originator { //현재 State를 가지고, Memento 객체 상태를 얻게 한다.
    private String state;

   public void SetState(String state){
      this.state = state;
   }

   public String GetState(){
      return state;
   }

   public Memento saveStateToMemento(){
      return new Memento(state);
   }

   public void getStateFromMemento(Memento memento){
      state = memento.GetState();
   }
}
