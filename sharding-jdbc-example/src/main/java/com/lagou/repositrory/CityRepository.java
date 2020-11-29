package com.lagou.repositrory;

import com.lagou.entity.City;
import com.lagou.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author QING
 */
public interface CityRepository extends JpaRepository<City,Long> {
}
