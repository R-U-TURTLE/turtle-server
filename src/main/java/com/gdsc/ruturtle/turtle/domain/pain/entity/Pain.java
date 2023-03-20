package com.gdsc.ruturtle.turtle.domain.pain.entity;

import com.gdsc.ruturtle.turtle.domain.pain.enums.PainDegree;
import com.gdsc.ruturtle.turtle.domain.user.entity.User;
import com.gdsc.ruturtle.turtle.global.BaseEntity;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Pain extends BaseEntity {

    @Id
    @Column(name = "painIdx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long painIdx;

    @Enumerated(EnumType.STRING)
    private PainDegree painDegree;

    @ManyToOne
    @JoinColumn(name="userIdx")
    private User user;

    @OneToOne
    @JoinColumn(name = "painInfoIdx")
    private PainInfo painInfo;
}
