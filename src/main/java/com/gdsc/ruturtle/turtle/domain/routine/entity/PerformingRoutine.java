package com.gdsc.ruturtle.turtle.domain.routine.entity;

import com.gdsc.ruturtle.turtle.global.BaseEntity;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class PerformingRoutine extends BaseEntity {

    @Id
    @Column(name = "performingRoutineIdx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long performingRoutineIdx;

    private LocalDateTime performingRoutineDay;
    private boolean performingRoutineCheck;

    @ManyToOne
    @JoinColumn(name="routineIdx")
    private Routine routine;

}
