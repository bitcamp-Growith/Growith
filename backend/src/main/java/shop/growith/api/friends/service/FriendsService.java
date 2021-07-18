package shop.growith.api.friends.service;

public interface FriendsService {
    //친구 목록
    void viewFriendsList();  //친구목록 조회

    void addFavoriteFriend(); // 친구 즐겨찾기 추가

    void deleteFavoriteFriend(); // 친구 즐겨찾기 삭제

    void editFriendNickname(); // 친구 닉네임 설정

    //친구 검색 및 관리
    void searchFriendById(); // id로 친구찾기

    void searchFriendByName(); // 이름으로 친구찾기

    void inviteFriend(); // 친구초대

    void invitationAccept(); // 친구신청 수락

    void deleteFriend(); // 친구삭제

    //정렬
    void sortFriendsListById(); // id순 정렬

    void sortFriendsListByActivityTime(); // 최근 활동순 정렬


    //친구 일정 이동
    void moveFriendsTodo(); //친구 일정으로 이동

}
