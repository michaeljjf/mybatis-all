package com.jiangjf.mapper;

import com.jiangjf.pojo.Dept;

public interface DeptMapper {
    /**
     * 第一种方式
     * 添加部门，然后把部门编号回填到Dept对象的deptno字段
     * @param dept
     * @return 受影响的行数，1表示增加成功 0失败
     */
    int addDept(Dept dept);

    /**
     * 第二种方式
     * 添加部门，然后把部门编号回填到Dept对象的deptno字段
     * @param dept
     * @return 受影响的行数，1表示增加成功 0失败
     */
    int addDept2(Dept dept);
}
