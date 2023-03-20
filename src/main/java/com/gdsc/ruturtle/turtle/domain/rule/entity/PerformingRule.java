package com.gdsc.ruturtle.turtle.domain.rule.entity;

import com.gdsc.ruturtle.turtle.global.BaseEntity;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class PerformingRule extends BaseEntity {

    @Id
    @Column(name = "performingRuleIdx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long performingRuleIdx;

    private LocalDateTime performingRuleDay;
    private boolean performingRuleCheck;

    @ManyToOne
    @JoinColumn(name="ruleIdx")
    private Rule rule;

}
