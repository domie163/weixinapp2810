package com.entity.view;

import com.entity.GuahaojiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 挂号记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-01-28 11:04:28
 */
@TableName("guahaojilu")
public class GuahaojiluView  extends GuahaojiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuahaojiluView(){
	}
 
 	public GuahaojiluView(GuahaojiluEntity guahaojiluEntity){
 	try {
			BeanUtils.copyProperties(this, guahaojiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
