package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusshesuanjianceDao;
import com.entity.DiscusshesuanjianceEntity;
import com.service.DiscusshesuanjianceService;
import com.entity.vo.DiscusshesuanjianceVO;
import com.entity.view.DiscusshesuanjianceView;

@Service("discusshesuanjianceService")
public class DiscusshesuanjianceServiceImpl extends ServiceImpl<DiscusshesuanjianceDao, DiscusshesuanjianceEntity> implements DiscusshesuanjianceService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshesuanjianceEntity> page = this.selectPage(
                new Query<DiscusshesuanjianceEntity>(params).getPage(),
                new EntityWrapper<DiscusshesuanjianceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshesuanjianceEntity> wrapper) {
		  Page<DiscusshesuanjianceView> page =new Query<DiscusshesuanjianceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshesuanjianceVO> selectListVO(Wrapper<DiscusshesuanjianceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshesuanjianceVO selectVO(Wrapper<DiscusshesuanjianceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshesuanjianceView> selectListView(Wrapper<DiscusshesuanjianceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshesuanjianceView selectView(Wrapper<DiscusshesuanjianceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
