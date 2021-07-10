package shop.growith.api.activity.service;

public interface ActivityService {
    void takeFriendTodo(); // 친구 일정 가져오기

    void inGesture(); // 제스쳐 남기기

    void deleteGesture(); // 제스쳐 남기기

    void inComment(); // 댓글 남기기

    void deleteComment(); // 댓글 삭제
}
