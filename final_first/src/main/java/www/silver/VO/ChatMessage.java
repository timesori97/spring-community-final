package www.silver.VO;

import java.sql.Timestamp;

public class ChatMessage {
    private Long messageId; // 메시지 고유 ID
    private String roomId; // 채팅방 ID
    private String sender; // 발신자 ID
    private String content; // 메시지 내용
    private Timestamp sentAt; // 전송 시간

    public Long getMessageId() { return messageId; } // 메시지 ID 반환
    public void setMessageId(Long messageId) { this.messageId = messageId; } // 메시지 ID 설정
    public String getRoomId() { return roomId; } // 채팅방 ID 반환
    public void setRoomId(String roomId) { this.roomId = roomId; } // 채팅방 ID 설정
    public String getSender() { return sender; } // 발신자 ID 반환
    public void setSender(String sender) { this.sender = sender; } // 발신자 ID 설정
    public String getContent() { return content; } // 메시지 내용 반환
    public void setContent(String content) { this.content = content; } // 메시지 내용 설정
    public Timestamp getSentAt() { return sentAt; } // 전송 시간 반환
    public void setSentAt(Timestamp sentAt) { this.sentAt = sentAt; } // 전송 시간 설정
}