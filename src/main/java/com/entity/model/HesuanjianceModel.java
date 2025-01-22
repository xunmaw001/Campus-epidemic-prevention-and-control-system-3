package com.entity.model;

import com.entity.HesuanjianceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 核酸检测
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-24 10:05:33
 */
public class HesuanjianceModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 检测类型
	 */
	
	private String jianceleixing;
		
	/**
	 * 检测地点
	 */
	
	private String jiancedidian;
		
	/**
	 * 检测时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianceshijian;
		
	/**
	 * 检测内容
	 */
	
	private String jianceneirong;
		
	/**
	 * 检测图片
	 */
	
	private String jiancetupian;
				
	
	/**
	 * 设置：检测类型
	 */
	 
	public void setJianceleixing(String jianceleixing) {
		this.jianceleixing = jianceleixing;
	}
	
	/**
	 * 获取：检测类型
	 */
	public String getJianceleixing() {
		return jianceleixing;
	}
				
	
	/**
	 * 设置：检测地点
	 */
	 
	public void setJiancedidian(String jiancedidian) {
		this.jiancedidian = jiancedidian;
	}
	
	/**
	 * 获取：检测地点
	 */
	public String getJiancedidian() {
		return jiancedidian;
	}
				
	
	/**
	 * 设置：检测时间
	 */
	 
	public void setJianceshijian(Date jianceshijian) {
		this.jianceshijian = jianceshijian;
	}
	
	/**
	 * 获取：检测时间
	 */
	public Date getJianceshijian() {
		return jianceshijian;
	}
				
	
	/**
	 * 设置：检测内容
	 */
	 
	public void setJianceneirong(String jianceneirong) {
		this.jianceneirong = jianceneirong;
	}
	
	/**
	 * 获取：检测内容
	 */
	public String getJianceneirong() {
		return jianceneirong;
	}
				
	
	/**
	 * 设置：检测图片
	 */
	 
	public void setJiancetupian(String jiancetupian) {
		this.jiancetupian = jiancetupian;
	}
	
	/**
	 * 获取：检测图片
	 */
	public String getJiancetupian() {
		return jiancetupian;
	}
			
}
