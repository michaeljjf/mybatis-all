package com.jiangjf.mapper;

import com.jiangjf.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface DeptMapper {
    /**
     * 级联查询
     * @param deptno
     * @return
     */
    Dept findDeptByDeptno(int deptno);

    // 以下方法，使用注解方式实现简单的增删改查

    @Select("select * from dept where deptno = #{deptno}")
    Dept findByDeptno(int deptno);

    @Update("update dept set dname = #{dname}, loc = #{loc} where deptno = #{deptno}")
    int updateDept(Dept dept);

    @Delete("delete from dept where deptno = #{deptno}")
    int removeDept(int deptno);

    @Insert("insert into dept(deptno, dname, loc) values(#{deptno}, #{dname}, #{loc})")
    int addDept(Dept dept);
}
