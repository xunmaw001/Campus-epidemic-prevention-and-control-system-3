package com.entity.model;

import com.entity.ChurudengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 出入登记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-24 10:05:33
 */
public class ChurudengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
