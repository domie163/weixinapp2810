package com.entity.model;

import com.entity.ZuozhenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 坐诊信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-01-28 11:04:28
 */
public class ZuozhenxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 医生性别
	 */
	
	private String yishengxingbie;
		
	/**
	 * 医生照片
	 */
	
	private String yishengzhaopian;
		
	/**
	 * 医生职称
	 */
	
	private String yishengzhicheng;
		
	/**
	 * 科室
	 */
	
	private String keshi;
		
	/**
	 * 挂号金额
	 */
	
	private Integer guahaojine;
		
	/**
	 * 挂号数量
	 */
	
	private Integer guahaoshuliang;
		
	/**
	 * 坐诊时间
	 */
	
	private String zuozhenshijian;
		
	/**
	 * 医生履历
	 */
	
	private String yishenglvli;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：医生性别
	 */
	 
	public void setYishengxingbie(String yishengxingbie) {
		this.yishengxingbie = yishengxingbie;
	}
	
	/**
	 * 获取：医生性别
	 */
	public String getYishengxingbie() {
		return yishengxingbie;
	}
				
	
	/**
	 * 设置：医生照片
	 */
	 
	public void setYishengzhaopian(String yishengzhaopian) {
		this.yishengzhaopian = yishengzhaopian;
	}
	
	/**
	 * 获取：医生照片
	 */
	public String getYishengzhaopian() {
		return yishengzhaopian;
	}
				
	
	/**
	 * 设置：医生职称
	 */
	 
	public void setYishengzhicheng(String yishengzhicheng) {
		this.yishengzhicheng = yishengzhicheng;
	}
	
	/**
	 * 获取：医生职称
	 */
	public String getYishengzhicheng() {
		return yishengzhicheng;
	}
				
	
	/**
	 * 设置：科室
	 */
	 
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	
	/**
	 * 获取：科室
	 */
	public String getKeshi() {
		return keshi;
	}
				
	
	/**
	 * 设置：挂号金额
	 */
	 
	public void setGuahaojine(Integer guahaojine) {
		this.guahaojine = guahaojine;
	}
	
	/**
	 * 获取：挂号金额
	 */
	public Integer getGuahaojine() {
		return guahaojine;
	}
				
	
	/**
	 * 设置：挂号数量
	 */
	 
	public void setGuahaoshuliang(Integer guahaoshuliang) {
		this.guahaoshuliang = guahaoshuliang;
	}
	
	/**
	 * 获取：挂号数量
	 */
	public Integer getGuahaoshuliang() {
		return guahaoshuliang;
	}
				
	
	/**
	 * 设置：坐诊时间
	 */
	 
	public void setZuozhenshijian(String zuozhenshijian) {
		this.zuozhenshijian = zuozhenshijian;
	}
	
	/**
	 * 获取：坐诊时间
	 */
	public String getZuozhenshijian() {
		return zuozhenshijian;
	}
				
	
	/**
	 * 设置：医生履历
	 */
	 
	public void setYishenglvli(String yishenglvli) {
		this.yishenglvli = yishenglvli;
	}
	
	/**
	 * 获取：医生履历
	 */
	public String getYishenglvli() {
		return yishenglvli;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
