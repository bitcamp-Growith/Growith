package shop.growith.api.camroom.service;

public interface CamRoomService {

    void createRoom (); // 방생성
    void viewRoom (); // 방조회
    void modifyRoom (); // 방수정
    void removeRoom (); // 방삭제

    void chatRoom (); // 대화기능

}