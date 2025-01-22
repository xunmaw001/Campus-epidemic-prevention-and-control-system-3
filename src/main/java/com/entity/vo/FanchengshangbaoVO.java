package com.entity.vo;

import com.entity.FanchengshangbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 返程上报
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-24 10:05:32
 */
public class FanchengshangbaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 返回时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fanhuishijian;
		
	/**
	 * 返程地区
	 */
	
	private String fanchengdiqu;
		
	/**
	 * 返回地点
	 */
	
	private String fanhuididian;
		
	/**
	 * 行动轨迹
	 */
	
	private String xingdongguiji;
		
	/**
	 * 健康码
	 */
	
	private String jiankangma;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：返回时间
	 */
	 
	public void setFanhuishijian(Date fanhuishijian) {
		this.fanhuishijian = fanhuishijian;
	}
	
	/**
	 * 获取：返回时间
	 */
	public Date getFanhuishijian() {
		return fanhuishijian;
	}
				
	
	/**
	 * 设置：返程地区
	 */
	 
	public void setFanchengdiqu(String fanchengdiqu) {
		this.fanchengdiqu = fanchengdiqu;
	}
	
	/**
	 * 获取：返程地区
	 */
	public String getFanchengdiqu() {
		return fanchengdiqu;
	}
				
	
	/**
	 * 设置：返回地点
	 */
	 
	public void setFanhuididian(String fanhuididian) {
		this.fanhuididian = fanhuididian;
	}
	
	/**
	 * 获取：返回地点
	 */
	public String getFanhuididian() {
		return fanhuididian;
	}
				
	
	/**
	 * 设置：行动轨迹
	 */
	 
	public void setXingdongguiji(String xingdongguiji) {
		this.xingdongguiji = xingdongguiji;
	}
	
	/**
	 * 获取：行动轨迹
	 */
	public String getXingdongguiji() {
		return xingdongguiji;
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
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
