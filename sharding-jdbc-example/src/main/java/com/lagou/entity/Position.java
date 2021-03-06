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
@Table(name="position")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Position implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="name")
    private String name;
    @Column(name="salary")
    private String salary;
    @Column(name="city")
    private String city;
}
