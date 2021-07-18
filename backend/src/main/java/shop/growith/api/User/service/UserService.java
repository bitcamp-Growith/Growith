package shop.growith.api.User.service;

import shop.growith.api.User.domain.User;

public interface UserService {
    //회원가입
    void signUpUser(User user);
    //로그인
    void login(User user);
    //정보 조회
    void viewUser(User user);
    //수정
    void modifyUser(User user);
    //탈퇴
    void removeUser(User user);
}
