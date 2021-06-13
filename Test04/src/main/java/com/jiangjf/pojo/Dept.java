package com.jiangjf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable {
    private static final long serialVersionUID = 8260568403165560303L;
    private Integer deptno;
    private String dname;
    private String loc;

    public Dept(Integer deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    // 组合一个Emp的List集合作为属性
    private List<Emp> empList;
}
