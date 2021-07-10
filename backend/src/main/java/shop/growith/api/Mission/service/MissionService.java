package shop.growith.api.Mission.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.growith.api.Mission.domain.Mission;
import shop.growith.api.Mission.repository.MissionRepository;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class MissionService {

    private final MissionRepository missionRepository;

    public Long save(Mission mission){
        Mission save = missionRepository.save(mission);
        return save.getId();
    }

    public List<Mission> findAll(){
        return missionRepository.findAll();
    }

    public Mission findByMissionId(Long missionId){
        return missionRepository.getById(missionId);
    }

    public List<Mission> findByTitle(String name){
        return missionRepository.findByTitle(name);
    }

    public List<Mission> findByMasterId(String masterId){
        return missionRepository.findByMasterId(masterId);
    }

}
