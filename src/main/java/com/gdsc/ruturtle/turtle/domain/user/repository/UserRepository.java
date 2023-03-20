package com.gdsc.ruturtle.turtle.domain.user.repository;

import com.gdsc.ruturtle.turtle.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
