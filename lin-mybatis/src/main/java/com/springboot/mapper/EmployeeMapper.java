package com.springboot.mapper;

import com.springboot.dto.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("select * from account")
    List<Account> list();

    @Select("select * from account where id=#{id}")
    Account findOne(Integer id);

}