package com.hu.rainbowhat.mapper;

import com.hu.rainbowhat.entity.Store;

public interface StoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated
     */
    int insert(Store row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated
     */
    int insertSelective(Store row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated
     */
    Store selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Store row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Store row);
}