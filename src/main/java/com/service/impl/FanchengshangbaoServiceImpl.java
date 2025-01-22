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


import com.dao.FanchengshangbaoDao;
import com.entity.FanchengshangbaoEntity;
import com.service.FanchengshangbaoService;
import com.entity.vo.FanchengshangbaoVO;
import com.entity.view.FanchengshangbaoView;

@Service("fanchengshangbaoService")
public class FanchengshangbaoServiceImpl extends ServiceImpl<FanchengshangbaoDao, FanchengshangbaoEntity> implements FanchengshangbaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FanchengshangbaoEntity> page = this.selectPage(
                new Query<FanchengshangbaoEntity>(params).getPage(),
                new EntityWrapper<FanchengshangbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FanchengshangbaoEntity> wrapper) {
		  Page<FanchengshangbaoView> page =new Query<FanchengshangbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FanchengshangbaoVO> selectListVO(Wrapper<FanchengshangbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FanchengshangbaoVO selectVO(Wrapper<FanchengshangbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FanchengshangbaoView> selectListView(Wrapper<FanchengshangbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FanchengshangbaoView selectView(Wrapper<FanchengshangbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
