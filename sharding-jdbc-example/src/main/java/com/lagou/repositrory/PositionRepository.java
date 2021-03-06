package com.lagou.repositrory;

import com.lagou.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author QING
 */
public interface PositionRepository extends JpaRepository<Position,Long> {
    List<Position> findAllByOrderByIdAsc();
}
