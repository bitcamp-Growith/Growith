package shop.growith.api.cammedia.service;


import shop.growith.api.cammedia.domain.CamMedia;

import java.util.List;

public interface CamMediaService {
    void saveCamMedia(CamMedia camMedia);
    List<CamMedia> findAll();
    void existsById(long camMediaId);
    int count();
    Optional<CamMedia> findById(long camMediaId);
    CamMedia getById(long camMediaId);
    void deleteById(long camMediaId);


}
