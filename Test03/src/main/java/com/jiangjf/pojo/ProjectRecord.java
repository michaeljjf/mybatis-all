package com.jiangjf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectRecord implements Serializable {
    private static final long serialVersionUID = 3784820352845477623L;
    private Integer empno;
    private Integer pid;

    // 组合一个Emp对象
    private Emp emp;
}
