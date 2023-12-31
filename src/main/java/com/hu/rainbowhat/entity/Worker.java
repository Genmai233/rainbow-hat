package com.hu.rainbowhat.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table worker
 */
@Table(name = "worker")
@Data
public class Worker {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.id
     *
     * @mbg.generated
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Database Column Remarks:
     *   工人姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   门店id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.store_id
     *
     * @mbg.generated
     */
    private Integer storeId;

    /**
     * Database Column Remarks:
     *   手机号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.telephone
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     * Database Column Remarks:
     *   工人状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.state
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker.password
     *
     * @mbg.generated
     */
    private String password;

}