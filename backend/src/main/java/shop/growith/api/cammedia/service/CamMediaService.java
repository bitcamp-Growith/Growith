package shop.growith.api.cammedia.service;

public interface CamMediaService {

    void saveMedia();    //기기에 파일 저장
    void modifyMedia(); //파일 편집 또는 수정
    void removeMedia(); //파일 삭제
    void shareMedia(); //파일 공유
}