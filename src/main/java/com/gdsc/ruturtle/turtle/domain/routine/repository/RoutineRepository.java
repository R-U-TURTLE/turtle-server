package com.gdsc.ruturtle.turtle.domain.routine.repository;

import com.gdsc.ruturtle.turtle.domain.routine.entity.Routine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutineRepository extends JpaRepository<Routine, Long> {
}
