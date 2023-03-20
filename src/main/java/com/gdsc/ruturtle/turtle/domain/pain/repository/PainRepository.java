package com.gdsc.ruturtle.turtle.domain.pain.repository;

import com.gdsc.ruturtle.turtle.domain.pain.entity.Pain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PainRepository extends JpaRepository<Pain, Long> {
}
