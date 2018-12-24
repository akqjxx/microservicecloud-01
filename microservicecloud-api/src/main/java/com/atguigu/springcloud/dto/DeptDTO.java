package com.atguigu.springcloud.dto;
 

import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
 
public class DeptDTO implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2189714473576358800L;
	
	@NotNull
	private Long deptno; // 主键
	private String dname; // 部门名称
	private String db_source;
	private Timestamp createTime;
	private String loginNo;
	
	

}
