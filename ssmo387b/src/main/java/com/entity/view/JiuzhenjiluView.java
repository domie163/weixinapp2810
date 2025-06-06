package com.entity.view;

import com.entity.JiuzhenjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 就诊记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-01-28 11:04:28
 */
@TableName("jiuzhenjilu")
public class JiuzhenjiluView  extends JiuzhenjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiuzhenjiluView(){
	}
 
 	public JiuzhenjiluView(JiuzhenjiluEntity jiuzhenjiluEntity){
 	try {
			BeanUtils.copyProperties(this, jiuzhenjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
