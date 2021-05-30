
package SingletonPattern;
//싱글톤 패턴
//전체 프로그램에서 본 객체를 1개만 생성 가능
//UserInfo userinfo = UserInfo.getInstance(); << 왼쪽과 같이 생성 후
//userinfo.UserNum; << 과 같이 사용하면 static처럼 사용 가능합니다.

public class UserInfo {
    public String UserNum;
    public String addBoard;
    public String PostNum;
    public int Recommand;
    
    private UserInfo(){
        UserNum = "00000";
        addBoard = "초기게시판추가";
        PostNum = "00000";
        Recommand = 0;
    }
    
    private static class InnerUserInfo {
        private static final UserInfo instance = new UserInfo();
    }
    
    public static UserInfo getInstance(){
        return InnerUserInfo.instance;
    }
}