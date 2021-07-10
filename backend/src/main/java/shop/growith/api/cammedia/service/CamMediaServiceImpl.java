package shop.growith.api.cammedia.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
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

public class CamMediaServiceImpl {
    CamMedia camMediaRepository;

    public Optional<CamMedia> add(){
        return null;}
}
