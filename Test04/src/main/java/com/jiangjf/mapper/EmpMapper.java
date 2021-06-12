package com.jiangjf.mapper;

import com.jiangjf.pojo.Emp;

import java.util.List;

public interface EmpMapper {
    List<Emp> findEmpsByDeptno(int deptno);
}
