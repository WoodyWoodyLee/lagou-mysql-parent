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
@Table(name="city")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="name")
    private String name;
    @Column(name="province")
    private String province;

}
