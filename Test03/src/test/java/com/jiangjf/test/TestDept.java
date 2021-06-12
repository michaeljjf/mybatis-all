package com.jiangjf.test;

import com.jiangjf.mapper.DeptMapper;
import com.jiangjf.pojo.Dept;
import org.junit.Test;

public class TestDept extends TestBase {
    @Test
    public void testFindDeptJoinEmpsByDeptno() {
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);
        Dept dept = deptMapper.findDeptJoinEmpsByDeptno(10);
        System.out.println(dept);
    }
}
