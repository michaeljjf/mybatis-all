package com.jiangjf.test;

import com.jiangjf.pojo.Dept;
import com.jiangjf.pojo.Emp;
import org.junit.Test;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1 extends BaseTest {

    @Test
    public void testFindAll() {
        List<Dept> list = session.selectList("DeptMapper.findAll");
        for (Dept dept : list) {
            System.out.println(dept);
        }
    }

    @Test
    public void testFindOne() {
        Emp emp = session.selectOne("EmpMapper.findOne");
        System.out.println(emp);
    }

    @Test
    public void testSelectMap() {
        Map<Integer, Emp> empMap = session.selectMap("EmpMapper.findEmpMap", "EMPNO");
        Set<Integer> empNos = empMap.keySet();
        for (Integer empNo : empNos) {
            System.out.println(empNo + ":" + empMap.get(empNo));
        }
    }

    @Test
    public void testSingleArg() {
        Emp emp = session.selectOne("EmpMapper.findByEmpno", 7521);
        System.out.println(emp);
    }

    @Test
    public void testMapArg() {
        Map<String, Object> args = new HashMap<>();
        args.put("deptno", 20);
        args.put("sal", 1500.0);
        List<Emp> emps = session.selectList("EmpMapper.findEmpByDeptnoAndSal", args);
        emps.forEach(System.out::println);
    }

    @Test
    public void testEmpArg() {
        Emp emp = new Emp();
        emp.setDeptno(20);
        emp.setSal(1500.0);
        List<Emp> emps = session.selectList("EmpMapper.findEmpByDeptnoAndSal2", emp);
        emps.forEach(System.out::println);
    }

    @Test
    public void testAddEmp() {
        Emp emp = new Emp();
        emp.setEmpno(null);
        emp.setEname("Jiangjf");
        emp.setJob("PHP开发工程师");
        emp.setMgr(7782);
        emp.setHiredate(Date.valueOf("2014-06-16"));
        emp.setSal(1500.0);
        emp.setComm(300.0);
        emp.setDeptno(20);
        int rows = session.insert("EmpMapper.addEmp", emp);
        // 手动提交事务
        session.commit();
        System.out.println("受影响的行数：" + rows);

        /*
         * insert update delete 需要事务提交，有两种方式处理
         * 1、session.commit();手动提交事务
         * 2、session = factory.openSession(true);获取SqlSession对象时，设置事务自动提交
         */
    }

    @Test
    public void testUpdateEmp() {
        Emp emp = new Emp();
        emp.setEmpno(7935);
        emp.setEname("Jiangjf");
        emp.setJob("PHP开发工程师");
        emp.setMgr(7782);
        emp.setHiredate(Date.valueOf("2014-06-16"));
        emp.setSal(2500.0);
        emp.setComm(600.0);
        emp.setDeptno(20);
        int rows = session.update("EmpMapper.updateEmp", emp);
        // 手动提交事务
        session.commit();
        System.out.println("受影响的行数：" + rows);

        /*
         * insert update delete 需要事务提交，有两种方式处理
         * 1、session.commit();手动提交事务
         * 2、session = factory.openSession(true);获取SqlSession对象时，设置事务自动提交
         */
    }

    @Test
    public void testDeleteEmp() {
        int rows = session.delete("EmpMapper.deleteEmp", 7936);
        // 手动提交事务
        session.commit();
        System.out.println("受影响的行数：" + rows);

        /*
         * insert update delete 需要事务提交，有两种方式处理
         * 1、session.commit();手动提交事务
         * 2、session = factory.openSession(true);获取SqlSession对象时，设置事务自动提交
         */
    }

}
