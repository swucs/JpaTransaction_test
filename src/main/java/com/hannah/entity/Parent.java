package com.hannah.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="parent")
public class Parent {

    @Id
    @Column(name="id")
    private Long id;

    @Column(name="vin")
    private String vin;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name="user_profile_id")
    private String userProfileId;

    @Column(name="process_yn")
    private String processYn;

    public void changeProcessYn(String processYn) {
        this.processYn = processYn;
    }

}
