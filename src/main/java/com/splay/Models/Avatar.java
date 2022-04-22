package com.splay.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table()
public class Avatar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column()
    private UUID id;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String url;

    @Column(columnDefinition = "Decimal(10,2) default '0.0'")
    private double points;

    @OneToOne(mappedBy = "avatar")
    private User user;

    @CreatedDate()
    private Date createAt;

    @LastModifiedDate
    private Date updateAt;
}

