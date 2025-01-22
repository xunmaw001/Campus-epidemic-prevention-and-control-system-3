package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FanchengshangbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FanchengshangbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FanchengshangbaoView;


/**
 * 返程上报
 *
 * @author 
 * @email 
 * @date 2022-02-24 10:05:32
 */
public interface FanchengshangbaoService extends IService<FanchengshangbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FanchengshangbaoVO> selectListVO(Wrapper<FanchengshangbaoEntity> wrapper);
   	
   	FanchengshangbaoVO selectVO(@Param("ew") Wrapper<FanchengshangbaoEntity> wrapper);
   	
   	List<FanchengshangbaoView> selectListView(Wrapper<FanchengshangbaoEntity> wrapper);
   	
   	FanchengshangbaoView selectView(@Param("ew") Wrapper<FanchengshangbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FanchengshangbaoEntity> wrapper);
   	

}

