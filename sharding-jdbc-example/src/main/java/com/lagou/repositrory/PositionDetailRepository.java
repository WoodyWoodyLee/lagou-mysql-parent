package com.lagou.repositrory;

import com.lagou.entity.Position;
import com.lagou.entity.PositionDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author QING
 */
public interface PositionDetailRepository extends JpaRepository<PositionDetail,Long> {
}
