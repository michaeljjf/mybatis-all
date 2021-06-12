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
}
