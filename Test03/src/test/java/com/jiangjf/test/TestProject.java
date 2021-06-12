package com.jiangjf.test;

import com.jiangjf.mapper.ProjectMapper;
import com.jiangjf.pojo.Project;
import org.junit.Test;

public class TestProject extends TestBase {
    @Test
    public void testFindProjectByPid() {
        ProjectMapper projectMapper = session.getMapper(ProjectMapper.class);
        Project project = projectMapper.findProjectJoinEmpsByPid(2);
        System.out.println(project);
    }
}
