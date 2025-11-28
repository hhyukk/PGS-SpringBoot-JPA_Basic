package com.back.domain.post.post.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity // 아래 구조대로 DB 테이블을 만들어야 한다.
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = IDENTITY) // AUTO_INCREMENT
    private int id; // INT
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    private String title; // VARCHAR(255)
    @Column(columnDefinition = "TEXT")
    private String content;

    public Post(String title, String content) {
        this.createDate = LocalDateTime.now();
        this.modifyDate = this.createDate;
        this.title = "";
        this.content = "";
    }
}
