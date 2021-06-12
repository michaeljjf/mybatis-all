package com.jiangjf.test;

import com.jiangjf.mapper.EmpMapper;
import com.jiangjf.pojo.Emp;
import org.junit.Test;

import java.util.*;

public class TestEmp extends TestBase {

    @Test
    public void testFindAll() {
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        List<Emp> list = empMapper.findAll();
        list.forEach(System.out::println);
    }

    @Test
    public void testFindEmpJoinDeptByEmpno() {
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        Emp emp = empMapper.findEmpJoinDeptByEmpno(7935);
        System.out.println(emp);
    }
}
