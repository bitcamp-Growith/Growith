package shop.growith.api.camroom.service;


import shop.growith.api.camroom.domain.CamRoom;

import java.util.List;
import java.util.Optional;

public interface CamRoomService {
    void saveCamRoom(CamRoom camRoom);
    List<CamRoom> findAll();
    void existsById(long camRoomId);
    int count();
    Optional<CamRoom> findById(long camRoomId);
    CamRoom getById(long camRoomId);
    void deleteById(long camRoomId);

}