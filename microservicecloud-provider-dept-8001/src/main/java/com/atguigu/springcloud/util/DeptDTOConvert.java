package com.atguigu.springcloud.util;

import org.springframework.beans.BeanUtils;

import com.atguigu.springcloud.dto.DeptDTO;
import com.atguigu.springcloud.entities.Dept;

public class DeptDTOConvert  implements DTOConvert<DeptDTO,Dept>{

	@Override
	public Dept convert(DeptDTO s) {
		Dept d = new Dept();
		BeanUtils.copyProperties(s, d);
		return d;
	}
 

}
