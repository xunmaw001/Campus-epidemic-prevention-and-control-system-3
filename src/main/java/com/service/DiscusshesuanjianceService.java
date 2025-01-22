package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshesuanjianceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshesuanjianceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshesuanjianceView;


/**
 * 核酸检测评论表
 *
 * @author 
 * @email 
 * @date 2022-02-24 10:05:33
 */
public interface DiscusshesuanjianceService extends IService<DiscusshesuanjianceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshesuanjianceVO> selectListVO(Wrapper<DiscusshesuanjianceEntity> wrapper);
   	
   	DiscusshesuanjianceVO selectVO(@Param("ew") Wrapper<DiscusshesuanjianceEntity> wrapper);
   	
   	List<DiscusshesuanjianceView> selectListView(Wrapper<DiscusshesuanjianceEntity> wrapper);
   	
   	DiscusshesuanjianceView selectView(@Param("ew") Wrapper<DiscusshesuanjianceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshesuanjianceEntity> wrapper);
   	

}

