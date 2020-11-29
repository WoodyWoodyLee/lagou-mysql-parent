package com.lagou.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author QING
 */
@Entity
@Table(name = "b_order")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BOrder implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "company_id")
    private Long companyId;
    @Column(name = "publish_user_id")
    private Long publishUserId;

    @Column(name = "position_id")
    private Long positionId;

    @Column(name = "position_name")
    private String positionName;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "name")
    private String name;

    @Column(name = "work_year")
    private Long workYear;

    @Column(name = "resume_type")
    private Integer resumeType;

    @Column(name = "resume_id")
    private Long resumeId;

    @Column(name = "status")
    private String status;

    @JSONField(format = "yyyyMMdd hh:mm:ss")
    @Column(name = "create_time")
    private Date createTime;

    @JSONField(format = "yyyyMMdd hh:mm:ss")
    @Column(name = "operate_time")
    private Date operateTime;

    @Column(name = "is_del")
    private Boolean isDel;

}
