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
 * 出入登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-24 10:05:33
 */
@TableName("churudengji")
public class ChurudengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChurudengjiEntity() {
		
	}
	
	public ChurudengjiEntity(T t) {
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
	 * 登记姓名
	 */
					
	private String dengjixingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 角色类型
	 */
					
	private String jiaoseleixing;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 健康码
	 */
					
	private String jiankangma;
	
	/**
	 * 入校时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date ruxiaoshijian;
	
	/**
	 * 出校时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chuxiaoshijian;
	
	/**
	 * 入校事由
	 */
					
	private String ruxiaoshiyou;
	
	
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
	 * 设置：登记姓名
	 */
	public void setDengjixingming(String dengjixingming) {
		this.dengjixingming = dengjixingming;
	}
	/**
	 * 获取：登记姓名
	 */
	public String getDengjixingming() {
		return dengjixingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：角色类型
	 */
	public void setJiaoseleixing(String jiaoseleixing) {
		this.jiaoseleixing = jiaoseleixing;
	}
	/**
	 * 获取：角色类型
	 */
	public String getJiaoseleixing() {
		return jiaoseleixing;
	}
	/**
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
	/**
	 * 设置：健康码
	 */
	public void setJiankangma(String jiankangma) {
		this.jiankangma = jiankangma;
	}
	/**
	 * 获取：健康码
	 */
	public String getJiankangma() {
		return jiankangma;
	}
	/**
	 * 设置：入校时间
	 */
	public void setRuxiaoshijian(Date ruxiaoshijian) {
		this.ruxiaoshijian = ruxiaoshijian;
	}
	/**
	 * 获取：入校时间
	 */
	public Date getRuxiaoshijian() {
		return ruxiaoshijian;
	}
	/**
	 * 设置：出校时间
	 */
	public void setChuxiaoshijian(Date chuxiaoshijian) {
		this.chuxiaoshijian = chuxiaoshijian;
	}
	/**
	 * 获取：出校时间
	 */
	public Date getChuxiaoshijian() {
		return chuxiaoshijian;
	}
	/**
	 * 设置：入校事由
	 */
	public void setRuxiaoshiyou(String ruxiaoshiyou) {
		this.ruxiaoshiyou = ruxiaoshiyou;
	}
	/**
	 * 获取：入校事由
	 */
	public String getRuxiaoshiyou() {
		return ruxiaoshiyou;
	}

}
