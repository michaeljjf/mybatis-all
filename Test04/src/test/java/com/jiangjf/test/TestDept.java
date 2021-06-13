package com.jiangjf.test;

import com.jiangjf.mapper.DeptMapper;
import com.jiangjf.pojo.Dept;
import com.jiangjf.pojo.Emp;
import org.junit.Test;

import java.util.List;

public class TestDept extends TestBase {
    @Test
    public void testFindDeptByDeptno() {
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);
        Dept dept = deptMapper.findDeptByDeptno(20);
        System.out.println(dept.getDname());
        System.out.println(dept.getLoc());
//        List<Emp> empList = dept.getEmpList();
//        empList.forEach(System.out::println);
    }

    @Test
    public void testAddDept() {
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);
        Dept dept = new Dept(44, "test", "test");
        deptMapper.addDept(dept);
    }

    @Test
    public void testUpdateDept() {
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);
        Dept dept = new Dept(44, "测试部门", "test");
        deptMapper.updateDept(dept);
    }

    @Test
    public void testFindByDeptno() {
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);
        Dept dept = deptMapper.findByDeptno(44);
        System.out.println(dept);

        DeptMapper deptMapper2 = session.getMapper(DeptMapper.class);
        Dept dept2 = deptMapper2.findByDeptno(44);
        System.out.println(dept2);
    }

    @Test
    public void testRemoveDept() {
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);
        deptMapper.removeDept(44);
    }
}
