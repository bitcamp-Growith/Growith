package shop.growith.api.cammedia.controller;

import shop.growith.api.cammedia.domain.CamMedia;
import shop.growith.api.cammedia.service.CamMediaService;

import java.util.List;

public class CamMediaController {
    private final CamMediaService camMediaService;


    public CamMediaController(CamMediaService camMediaService) {
        this.camMediaService = camMediaService;
    }


    public void save(CamMedia camMedia) {

    }

    @Override
    public List<CamMedia> findAll() {
        return null;
    }

    @Override
    public void existsById(long camMediaId) {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Optional<camMedia> findById(long camMediaId) {
        return null;
    }

    @Override
    public CamMedia getById(long camMediaId) {
        return null;
    }
}

