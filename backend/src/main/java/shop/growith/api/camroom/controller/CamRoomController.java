package shop.growith.api.camroom.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import shop.growith.api.camroom.domain.CamRoom;
import shop.growith.api.camroom.service.CamRoomService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/cam_room")
public class CamRoomController {
    private final CamRoomService camRoomService;

    @PostMapping("")
    public void save(@RequestBody CamRoom camRoom){camRoomService.saveCamRoom(camRoom);}
    @GetMapping("")
    public List<CamRoom> findAll(){return camRoomService.findAll();}
    @GetMapping("/exists/{camRoomId}")
    public void existsById(@RequestParam long camRoomId) {
        camRoomService.existsById(camRoomId);
    }
    @GetMapping("/count")
    public int count() { return camRoomService.count();
    }
    @GetMapping("/find/{camRoomId}")
    public Optional<CamRoom> findById(@RequestParam long camRoomId) {
        return camRoomService.findById(camRoomId);
    }
    @GetMapping("/{camRoomId}")
    public CamRoom getById(@RequestParam long camRoomId) {
        return camRoomService.getById(camRoomId);
    }
    @DeleteMapping("/{camRoomId}")
    public void deleteById(@RequestParam long camRoomId) {
        camRoomService.deleteById(camRoomId);
    }

}