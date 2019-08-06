package com.vverp.entity;

import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

/**
 * UserInformation 用户个人信息完善
 */
@Entity
@Table(name="t_user")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "seq_user")
public class UserInformation extends BaseEntity<Long> {
    private String nickname;
    private Integer age;
    private String sex;
    private Integer telephone;
    private String school;
    private String classes;
    private String major;

}
