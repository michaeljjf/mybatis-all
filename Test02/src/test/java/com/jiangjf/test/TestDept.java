package com.jiangjf.test;

import com.jiangjf.mapper.DeptMapper;
import com.jiangjf.pojo.Dept;
import org.junit.Test;

public class TestDept extends BaseTest {
    @Test
    public void testAddDept() {
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);
        Dept dept = new Dept();
        dept.setDname("云空间");
        dept.setLoc("深圳南山");
        System.out.println("执行前部门编号：" + dept.getDeptno());
        int rows = deptMapper.addDept(dept);
        System.out.println("受影响的行数：" + rows);
        System.out.println("执行后部门编号：" + dept.getDeptno());
    }

    @Test
    public void testAddDept2() {
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);
        Dept dept = new Dept();
        dept.setDname("云空间");
        dept.setLoc("深圳南山");
        System.out.println("执行前部门编号：" + dept.getDeptno());
        int rows = deptMapper.addDept2(dept);
        System.out.println("受影响的行数：" + rows);
        System.out.println("执行后部门编号：" + dept.getDeptno());
    }
}
