package com.example.springboottest1.mapper;

import com.example.springboottest1.entity.my_test;

public interface my_testMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_test
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_test
     *
     * @mbggenerated
     */
    int insert(my_test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_test
     *
     * @mbggenerated
     */
    int insertSelective(my_test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_test
     *
     * @mbggenerated
     */
    my_test selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_test
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(my_test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_test
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(my_test record);
}