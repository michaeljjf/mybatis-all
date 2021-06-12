package com.jiangjf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Project implements Serializable {
    private static final long serialVersionUID = -549846125809906208L;
    private Integer pid;
    private String pname;
    private Integer money;

    // 组合一个ProjectRecord的List集合对象
    private List<ProjectRecord> projectRecords;
}
