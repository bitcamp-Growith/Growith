package shop.growith.api.Cam.domain;


import lombok.Data;

@Data
public class CamMediaDTO {
    private Long id;

    private int saveMediaNo; //파일등록번호
        private String saveMediaName; //파일명
        private String saveMediaPath; //파일위치(주소)
        private String saveMediaSize; //파일크기

}
