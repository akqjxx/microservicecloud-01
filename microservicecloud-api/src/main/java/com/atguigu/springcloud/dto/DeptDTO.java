package com.atguigu.springcloud.dto;
 

import java.util.Date;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;


@Builder
@Data
public class DeptDTO implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2189714473576358800L;
	
	private Long deptno; // 主键
	@NonNull
	private String dname; // 部门名称
	private String db_source;
	private Date createTime;
	private String loginNo;
	
	
	

}
