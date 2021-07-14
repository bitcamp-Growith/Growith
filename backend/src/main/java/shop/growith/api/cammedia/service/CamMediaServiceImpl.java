package shop.growith.api.cammedia.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.growith.api.cammedia.domain.CamMedia;
import shop.growith.api.cammedia.repository.CamMediaRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
/* @~~와같은말
public CamMediaServiceImpl(CamMediaRepository camMediaRepository) {
        this.camMediaRepository = camMediaRepository;
        }
*/

public class CamMediaServiceImpl implements CamMediaService {

    private final CamMediaRepository camMediaRepository;


    @Override
    public void saveCamMedia(CamMedia camMedia) { camMediaRepository.save(camMedia);}

    @Override
    public List<CamMedia> findAll() { return camMediaRepository.findAll(); }

    @Override
    public void existsById(long camMediaId) { camMediaRepository.existsById(camMediaId);}

    @Override
    public int count() { return (int)camMediaRepository.count();}

    @Override
    public Optional<CamMedia> findById(long camMediaId) { return camMediaRepository.findById(camMediaId); }

    @Override
    public CamMedia getById(long camMediaId) { return camMediaRepository.getById(camMediaId); }

    @Override
    public void deleteById(long camMediaId) {camMediaRepository.deleteById(camMediaId); }
}
