package com.entity.vo;

import com.entity.TiwenshangbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 体温上报
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-24 10:05:33
 */
public class TiwenshangbaoVO  implements Serializable {
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
	 * 体温
	 */
	
	private String tiwen;
		
	/**
	 * 有无发热
	 */
	
	private String youwufare;
		
	/**
	 * 有无咳嗽
	 */
	
	private String youwukesou;
		
	/**
	 * 身体状况
	 */
	
	private String shentizhuangkuang;
		
	/**
	 * 状况描述
	 */
	
	private String zhuangkuangmiaoshu;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
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
	 * 设置：体温
	 */
	 
	public void setTiwen(String tiwen) {
		this.tiwen = tiwen;
	}
	
	/**
	 * 获取：体温
	 */
	public String getTiwen() {
		return tiwen;
	}
				
	
	/**
	 * 设置：有无发热
	 */
	 
	public void setYouwufare(String youwufare) {
		this.youwufare = youwufare;
	}
	
	/**
	 * 获取：有无发热
	 */
	public String getYouwufare() {
		return youwufare;
	}
				
	
	/**
	 * 设置：有无咳嗽
	 */
	 
	public void setYouwukesou(String youwukesou) {
		this.youwukesou = youwukesou;
	}
	
	/**
	 * 获取：有无咳嗽
	 */
	public String getYouwukesou() {
		return youwukesou;
	}
				
	
	/**
	 * 设置：身体状况
	 */
	 
	public void setShentizhuangkuang(String shentizhuangkuang) {
		this.shentizhuangkuang = shentizhuangkuang;
	}
	
	/**
	 * 获取：身体状况
	 */
	public String getShentizhuangkuang() {
		return shentizhuangkuang;
	}
				
	
	/**
	 * 设置：状况描述
	 */
	 
	public void setZhuangkuangmiaoshu(String zhuangkuangmiaoshu) {
		this.zhuangkuangmiaoshu = zhuangkuangmiaoshu;
	}
	
	/**
	 * 获取：状况描述
	 */
	public String getZhuangkuangmiaoshu() {
		return zhuangkuangmiaoshu;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
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
