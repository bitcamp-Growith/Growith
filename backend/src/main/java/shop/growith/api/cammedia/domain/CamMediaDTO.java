package shop.growith.api.cammedia.domain;


import lombok.Data;
import java.time.LocalDateTime;

@Data
public class CamMediaDTO {

    private Long camMediaId;

    private Long saveMediaNo; //파일등록번호
    private String saveMediaName; //파일명
    private String saveMediaPath; //파일위치(주소)
    private String saveMediaSize; //파일크기(용량)
    private LocalDateTime saveMediaDate; //파일날짜
}
