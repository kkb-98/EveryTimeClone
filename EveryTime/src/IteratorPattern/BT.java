//복합 클래스가 가지는 게시판제목 정보를 가지고 있는 데이터 객체
//Student 클래스 역할
package IteratorPattern;

//BoardTitle.class
public class BT {
    private String title="";
    
    public BT(String title){
        this.title=title;
    }
    
    public String getTitle(){
        return title;
    }
   
}
