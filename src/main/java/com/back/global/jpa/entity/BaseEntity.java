package com.back.global.jpa.entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@MappedSuperclass // 엔티티의 부모 클래스에는 이걸 달아야 함.
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;
    @CreatedDate
    private LocalDateTime createDate; // INSERT 시 자동으로 현재 시간으로 설정됨
    @LastModifiedDate
    private LocalDateTime modifyDate; // INSERT/UPDATE 시 자동으로 현재 시간으로 설정됨
}
