package shop.growith.api.cammedia.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import shop.growith.api.cammedia.domain.CamMedia;
import shop.growith.api.cammedia.service.CamMediaService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/cam_media")
public class CamMediaController {
    private final CamMediaService camMediaService;

    @PostMapping("")
    public void save(@RequestBody CamMedia camMedia){camMediaService.saveCamMedia(camMedia);}
    @GetMapping("")
    public List<CamMedia> findAll(){return camMediaService.findAll();}
    @GetMapping("/exists/{camMediaId}")
    public void existsById(@RequestParam long camMediaId) {
        camMediaService.existsById(camMediaId);
    }
    @GetMapping("/count")
    public int count() { return camMediaService.count();
    }
    @GetMapping("/find/{camMediaId}")
    public Optional<CamMedia> findById(@RequestParam long camMediaId) {
        return camMediaService.findById(camMediaId);
    }
    @GetMapping("/{camMediaId}")
    public CamMedia getById(@RequestParam long camMediaId) {
        return camMediaService.getById(camMediaId);
    }
    @DeleteMapping("/{camMediaId}")
    public void deleteById(@RequestParam long camMediaId) {
        camMediaService.deleteById(camMediaId);
    }

}

