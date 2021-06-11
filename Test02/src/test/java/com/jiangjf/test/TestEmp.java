package com.jiangjf.test;

import com.jiangjf.mapper.EmpMapper;
import com.jiangjf.pojo.Emp;
import org.junit.Test;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestEmp extends TestBase {

    @Test
    public void testFindAll() {
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        List<Emp> list = empMapper.findAll();
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    @Test
    public void testFindOne() {
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        Emp emp = empMapper.findByEmpno(7499);
        System.out.println(emp);
    }

    @Test
    public void testFindByDeptnoAndSal() {
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        List<Emp> empList = empMapper.findByDeptnoAndSal(20, 3000.0);
        empList.forEach(System.out::println);
    }

    @Test
    public void testFindByDeptnoAndSal2() {
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("deptno", 10);
        map.put("sal", 3000.0);
        List<Emp> empList = empMapper.findByDeptnoAndSal2(map);
        empList.forEach(System.out::println);
    }

    @Test
    public void testFindByDeptnoAndSal3() {
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        Emp empa = new Emp();
        empa.setDeptno(20);
        Emp empb = new Emp();
        empb.setSal(3000.0);
        List<Emp> empList = empMapper.findByDeptnoAndSal3(empa, empb);
        empList.forEach(System.out::println);
    }

    @Test
    public void testFindByDeptnoAndSal4() {
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        Emp empa = new Emp();
        empa.setDeptno(20);
        Emp empb = new Emp();
        empb.setSal(3000.0);
        List<Emp> empList = empMapper.findByDeptnoAndSal4(empa, empb);
        empList.forEach(System.out::println);
    }

    @Test
    public void testFindByEname() {
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        List<Emp> empList = empMapper.findByEname("a");
        empList.forEach(System.out::println);
    }

    /**
     * 测试动态拼接查询条件
     */
    @Test
    public void testFindByCondition() {
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
//        emp.setEmpno(1111);
        emp.setEname("JAME");
//        emp.setHiredate(Date.valueOf("1981-04-02"));
        List<Emp> empList = empMapper.findByCondition(emp);
        empList.forEach(System.out::println);
    }

    /**
     * 动态创建update set条件更新员工信息
     * set 方式
     */
    @Test
    public void TestUpdateEmpByCondition() {
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEmpno(7935);
        emp.setEname("张三");
        emp.setDeptno(10);
        int rows = empMapper.updateEmpByCondition(emp);
        System.out.println("受影响的行数：" + rows);
    }

    /**
     * 动态创建update set条件更新员工信息
     * trim 方式
     */
    @Test
    public void TestUpdateEmpByCondition2() {
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEmpno(7935);
        emp.setEname("张三2");
        emp.setDeptno(10);
        int rows = empMapper.updateEmpByCondition2(emp);
        System.out.println("受影响的行数：" + rows);
    }
}
