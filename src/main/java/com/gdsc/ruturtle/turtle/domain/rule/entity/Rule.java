package com.gdsc.ruturtle.turtle.domain.rule.entity;

import com.gdsc.ruturtle.turtle.domain.user.entity.User;
import com.gdsc.ruturtle.turtle.global.BaseEntity;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
public class Rule extends BaseEntity {

    @Id
    @Column(name = "ruleIdx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ruleIdx;

    private String ruleContext;
    private String linkUrl;
    private String memo;

    private LocalDate startedDate;
    private LocalDate finishedDate;

    @ManyToOne
    @JoinColumn(name="userIdx")
    private User user;
}
