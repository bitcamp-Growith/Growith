package shop.growith.api.User.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private Long userid;
    @Column private String userName;
    @Column private String userPw;
    @Column private String userEmail;//이메일
    @Column private String img;//자기소개 사진
    @Column private String comment;//자기소개 한마디
    @Column private String name;
    @Column private String gender;
    @Column private String local;
    @Column private LocalDate birth;
}
