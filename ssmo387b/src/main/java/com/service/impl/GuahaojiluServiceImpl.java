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


import com.dao.GuahaojiluDao;
import com.entity.GuahaojiluEntity;
import com.service.GuahaojiluService;
import com.entity.vo.GuahaojiluVO;
import com.entity.view.GuahaojiluView;

@Service("guahaojiluService")
public class GuahaojiluServiceImpl extends ServiceImpl<GuahaojiluDao, GuahaojiluEntity> implements GuahaojiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuahaojiluEntity> page = this.selectPage(
                new Query<GuahaojiluEntity>(params).getPage(),
                new EntityWrapper<GuahaojiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuahaojiluEntity> wrapper) {
		  Page<GuahaojiluView> page =new Query<GuahaojiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuahaojiluVO> selectListVO(Wrapper<GuahaojiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuahaojiluVO selectVO(Wrapper<GuahaojiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuahaojiluView> selectListView(Wrapper<GuahaojiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuahaojiluView selectView(Wrapper<GuahaojiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
