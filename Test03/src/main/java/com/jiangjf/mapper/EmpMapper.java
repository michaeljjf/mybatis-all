package com.jiangjf.mapper;

import com.jiangjf.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmpMapper {
    List<Emp> findAll();

    Emp findEmpJoinDeptByEmpno(int empno);
}
