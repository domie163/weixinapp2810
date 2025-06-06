package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 坐诊信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-01-28 11:04:28
 */
@TableName("zuozhenxinxi")
public class ZuozhenxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuozhenxinxiEntity() {
		
	}
	
	public ZuozhenxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 医生工号
	 */
					
	private String yishenggonghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：医生工号
	 */
	public void setYishenggonghao(String yishenggonghao) {
		this.yishenggonghao = yishenggonghao;
	}
	/**
	 * 获取：医生工号
	 */
	public String getYishenggonghao() {
		return yishenggonghao;
	}
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
