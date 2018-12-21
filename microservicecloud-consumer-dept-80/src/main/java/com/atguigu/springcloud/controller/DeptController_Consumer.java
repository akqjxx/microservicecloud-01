package com.atguigu.springcloud.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
 
import com.atguigu.springcloud.entities.Dept;
 
/**
 * 
 * 
 * 使用restTemplate访问restful接口非常的简单粗暴无脑。
	(url, requestMap, ResponseBean.class)这三个参数分别代表 
	REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
 * 
 * @author admin
 *
 */
@RestController
public class DeptController_Consumer
{
    //private static final String REST_URL_PREFIX = "http://localhost:8001";
	 private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
    
    @Autowired
    private RestTemplate restTemplate;
    
    /**
     * 
     * @param dept
     * @return
     */
    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept)
    {
         return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
    }
    
    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
         return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
    }
    
    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list()
    {
         return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
    }   
}
 
 
 

