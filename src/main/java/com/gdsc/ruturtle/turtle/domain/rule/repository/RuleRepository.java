package com.gdsc.ruturtle.turtle.domain.rule.repository;

import com.gdsc.ruturtle.turtle.domain.rule.entity.Rule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RuleRepository extends JpaRepository<Rule, Long> {
}
