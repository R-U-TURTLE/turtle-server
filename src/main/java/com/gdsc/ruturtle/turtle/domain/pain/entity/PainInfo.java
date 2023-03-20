package com.gdsc.ruturtle.turtle.domain.pain.entity;

import com.gdsc.ruturtle.turtle.domain.pain.entity.Pain;
import com.gdsc.ruturtle.turtle.global.BaseEntity;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class PainInfo extends BaseEntity {

    @Id
    @Column(name = "painInfoIdx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long painInfoIdx;

    private String painImg;
    private String painName;

    @OneToOne(mappedBy = "painInfo")
    private Pain pain;
}
