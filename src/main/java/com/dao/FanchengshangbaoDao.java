package com.dao;

import com.entity.FanchengshangbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FanchengshangbaoVO;
import com.entity.view.FanchengshangbaoView;


/**
 * 返程上报
 * 
 * @author 
 * @email 
 * @date 2022-02-24 10:05:32
 */
public interface FanchengshangbaoDao extends BaseMapper<FanchengshangbaoEntity> {
	
	List<FanchengshangbaoVO> selectListVO(@Param("ew") Wrapper<FanchengshangbaoEntity> wrapper);
	
	FanchengshangbaoVO selectVO(@Param("ew") Wrapper<FanchengshangbaoEntity> wrapper);
	
	List<FanchengshangbaoView> selectListView(@Param("ew") Wrapper<FanchengshangbaoEntity> wrapper);

	List<FanchengshangbaoView> selectListView(Pagination page,@Param("ew") Wrapper<FanchengshangbaoEntity> wrapper);
	
	FanchengshangbaoView selectView(@Param("ew") Wrapper<FanchengshangbaoEntity> wrapper);
	

}
