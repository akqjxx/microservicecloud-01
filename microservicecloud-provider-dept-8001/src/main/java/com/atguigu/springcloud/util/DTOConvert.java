package com.atguigu.springcloud.util;



public interface DTOConvert<S, T> {
	
	  T convert(S s);

}
