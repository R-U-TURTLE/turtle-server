package com.gdsc.ruturtle.turtle.domain.routine.entity;

import com.gdsc.ruturtle.turtle.domain.user.entity.User;
import com.gdsc.ruturtle.turtle.global.BaseEntity;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
public class Routine extends BaseEntity {

    @Id
    @Column(name = "routineIdx", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long routineIdx;

    private LocalDate startedDate;
    private LocalDate finishedDate;

    private String routineHour;
    private String description;

    private String linkUrl;
    private String memo;

    private LocalTime alarmHour;

    private boolean alarmStatus;

    @ManyToOne
    @JoinColumn(name="userIdx")
    private User user;

}
