package com.lagou.repositrory;

import com.lagou.entity.BOrder;
import com.lagou.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author QING
 */
public interface BOrderRepository extends JpaRepository<BOrder,Long> {

}
