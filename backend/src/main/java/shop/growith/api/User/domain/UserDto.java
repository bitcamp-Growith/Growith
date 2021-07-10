package shop.growith.api.User.domain;

import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDate;

@Data
public class UserDto {
    private Long userId;
    private String userName;
    private String userPw;
    private String userEmail;
    private String img;
    private String comment;
    private String name;
    private String gender;
    private String local;
    private LocalDate birth;
}
