package com.jiangjf.mapper;

import com.jiangjf.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmpMapper {
    /**
     * 查询所有员工信息
     * @return 返回Emp对象的List集合
     */
    List<Emp> findAll();

    /**
     * 查询单个员工信息
     * @param empno 员工编号
     * @return 找到则返回Emp对象，否则返回null
     */
    Emp findByEmpno(int empno);

    // 以下展示不同的参数查询方式
    /**
     * 按部门编号查找某个薪资水平的员工
     * @param deptno 部门编号
     * @param sal 薪资水平 >= sal 的员工
     * @return 返回Emp对象的List集合
     */
    List<Emp> findByDeptnoAndSal(int deptno, double sal);

    List<Emp> findByDeptnoAndSal2(Map<String, Object> map);

    List<Emp> findByDeptnoAndSal3(Emp empa, Emp empb);

    List<Emp> findByDeptnoAndSal4(@Param("empa") Emp empa, @Param("empb") Emp empb);

    /**
     * 模糊查询
     * @param ename
     * @return
     */
    List<Emp> findByEname(String ename);
}
