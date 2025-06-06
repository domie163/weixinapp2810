package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuahaojiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuahaojiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuahaojiluView;


/**
 * 挂号记录
 *
 * @author 
 * @email 
 * @date 2022-01-28 11:04:28
 */
public interface GuahaojiluService extends IService<GuahaojiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuahaojiluVO> selectListVO(Wrapper<GuahaojiluEntity> wrapper);
   	
   	GuahaojiluVO selectVO(@Param("ew") Wrapper<GuahaojiluEntity> wrapper);
   	
   	List<GuahaojiluView> selectListView(Wrapper<GuahaojiluEntity> wrapper);
   	
   	GuahaojiluView selectView(@Param("ew") Wrapper<GuahaojiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuahaojiluEntity> wrapper);
   	

}

