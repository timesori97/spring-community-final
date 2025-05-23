package www.silver.VO;

public class ChatRoom {
    private String id; // 채팅방 고유 ID
    private String user1; // 첫 번째 사용자 ID
    private String user2; // 두 번째 사용자 ID

    public ChatRoom(String id, String user1, String user2) {
        // 생성자: 채팅방 ID와 두 사용자 ID 초기화
        this.id = id;
        this.user1 = user1;
        this.user2 = user2;
    }

    public String getId() { return id; } // 채팅방 ID 반환
    public void setId(String id) { this.id = id; } // 채팅방 ID 설정
    public String getUser1() { return user1; } // 첫 번째 사용자 ID 반환
    public void setUser1(String user1) { this.user1 = user1; } // 첫 번째 사용자 ID 설정
    public String getUser2() { return user2; } // 두 번째 사용자 ID 반환
    public void setUser2(String user2) { this.user2 = user2; } // 두 번째 사용자 ID 설정
}