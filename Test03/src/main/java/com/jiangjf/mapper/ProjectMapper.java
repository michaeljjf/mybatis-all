package com.jiangjf.mapper;

import com.jiangjf.pojo.Project;

public interface ProjectMapper {
    /**
     * 根据项目编号查询项目下的所有员工信息
     * @param pid 项目编号
     * @return 所在信息封装的Project对象
     */
    Project findProjectJoinEmpsByPid(int pid);
}
