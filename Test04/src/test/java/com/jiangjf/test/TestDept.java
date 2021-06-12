package com.jiangjf.test;

import com.jiangjf.mapper.DeptMapper;
import com.jiangjf.pojo.Dept;
import org.junit.Test;

public class TestDept extends TestBase {
    @Test
    public void testFindDeptByDeptno() {
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);
        Dept dept = deptMapper.findDeptByDeptno(20);
        System.out.println(dept);
    }
}
