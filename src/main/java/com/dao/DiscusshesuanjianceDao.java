package com.dao;

import com.entity.DiscusshesuanjianceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshesuanjianceVO;
import com.entity.view.DiscusshesuanjianceView;


/**
 * 核酸检测评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-24 10:05:33
 */
public interface DiscusshesuanjianceDao extends BaseMapper<DiscusshesuanjianceEntity> {
	
	List<DiscusshesuanjianceVO> selectListVO(@Param("ew") Wrapper<DiscusshesuanjianceEntity> wrapper);
	
	DiscusshesuanjianceVO selectVO(@Param("ew") Wrapper<DiscusshesuanjianceEntity> wrapper);
	
	List<DiscusshesuanjianceView> selectListView(@Param("ew") Wrapper<DiscusshesuanjianceEntity> wrapper);

	List<DiscusshesuanjianceView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshesuanjianceEntity> wrapper);
	
	DiscusshesuanjianceView selectView(@Param("ew") Wrapper<DiscusshesuanjianceEntity> wrapper);
	

}
