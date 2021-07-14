package shop.growith.api.camroom.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.growith.api.camroom.domain.CamRoom;
import shop.growith.api.camroom.repository.CamRoomRepository;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CamRoomServiceImpl implements CamRoomService{
    private final CamRoomRepository camRoomRepository;


    @Override
    public void saveCamRoom(CamRoom camRoom) { camRoomRepository.save(camRoom);}

    @Override
    public List<CamRoom> findAll() { return camRoomRepository.findAll(); }

    @Override
    public void existsById(long camRoomId) { camRoomRepository.existsById(camRoomId);}

    @Override
    public int count() { return (int)camRoomRepository.count();}

    @Override
    public Optional<CamRoom> findById(long camRoomId) { return camRoomRepository.findById(camRoomId); }

    @Override
    public CamRoom getById(long camRoomId) { return camRoomRepository.getById(camRoomId); }

    @Override
    public void deleteById(long camRoomId) {camRoomRepository.deleteById(camRoomId); }
}
