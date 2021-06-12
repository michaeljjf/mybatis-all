package com.jiangjf.mapper;

import com.jiangjf.pojo.Dept;

public interface DeptMapper {
    Dept findDeptJoinEmpsByDeptno(int deptno);
}
