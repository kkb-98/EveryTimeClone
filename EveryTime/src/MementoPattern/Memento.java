package MementoPattern;

/*메멘토 패턴 - 객체의 상태 정보를 저장하고 사용자의 필요에
의하여 원하는 시점의 데이터를 복원할 수  있는 패턴*/
//학점계산기에 사용됨

public class Memento {  //State를 가지고 있는 인스턴스 클래스
    private String state;

   public Memento(String state){
      this.state = state;
   }

   public String GetState(){
      return state;
   }	
}