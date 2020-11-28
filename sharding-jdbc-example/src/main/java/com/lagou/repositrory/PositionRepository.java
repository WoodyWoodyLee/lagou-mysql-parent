package com.lagou.repositrory;

import com.lagou.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author QING
 */
public interface PositionRepository extends JpaRepository<Position,Long> {
}
