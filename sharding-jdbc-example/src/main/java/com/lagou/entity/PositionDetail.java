package com.lagou.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author QING
 */
@Entity
@Table(name = "position_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PositionDetail implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "pid")
    private Long pid;
    @Column(name = "description")
    private String description;
}
    
