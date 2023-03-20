package com.gdsc.ruturtle.turtle.domain.pain.repository;

import com.gdsc.ruturtle.turtle.domain.pain.entity.Pain;
import com.gdsc.ruturtle.turtle.domain.pain.entity.PainInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PainInfoRepository extends JpaRepository<PainInfo, Long> {
}
