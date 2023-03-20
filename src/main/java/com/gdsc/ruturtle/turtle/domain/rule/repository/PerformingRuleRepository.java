package com.gdsc.ruturtle.turtle.domain.rule.repository;

import com.gdsc.ruturtle.turtle.domain.routine.entity.PerformingRoutine;
import com.gdsc.ruturtle.turtle.domain.rule.entity.PerformingRule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerformingRuleRepository extends JpaRepository<PerformingRule, Long> {
}
