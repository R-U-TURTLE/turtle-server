package com.gdsc.ruturtle.turtle.domain.user.entity;

import com.gdsc.ruturtle.turtle.domain.user.enums.LoginStatus;
import com.gdsc.ruturtle.turtle.domain.user.enums.PainColor;
import com.gdsc.ruturtle.turtle.domain.user.enums.RoutineColor;
import com.gdsc.ruturtle.turtle.domain.user.enums.RuleColor;
import com.gdsc.ruturtle.turtle.global.BaseEntity;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "users")
public class User extends BaseEntity {
    @Id
    @Column(name = "userIdx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userIdx;

    private String nickname;
    private String profileImg;
    private int userLevel;
    private String userPerformance;

    @Enumerated(EnumType.STRING)
    private LoginStatus loginStatus;

    @Enumerated(EnumType.STRING)
    private RoutineColor routineColor;

    @Enumerated(EnumType.STRING)
    private RuleColor ruleColor;

    @Enumerated(EnumType.STRING)
    private PainColor painColor;
}
