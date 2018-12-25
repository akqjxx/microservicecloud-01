package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.dto.DeptDTO;
import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;

@RestController
public class DeptController {
	@Autowired
	private DeptService service;

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		System.out.println("--------------");
		return service.add(dept);
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return service.get(id);
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
	/*	
	 * 
	 * DeptDTO dto =  DeptDTO.of("dd").setDb_source("dd");
		DTOConvert<DeptDTO, Dept> v = (x) -> {
			Dept d = new Dept();
			BeanUtils.copyProperties(x, d);
			///throw new AssertionError("不支持逆向转化方法!");
			return d;
		};
		
		Dept s = v.convert(dto);
*/
		
		DeptDTO.builder().db_source("33").build();
		DeptDTO.builder().db_source("3");
		return service.list();
	}

}
