package com.ht.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.ht.dao.DicZhibiaoMapper;
import com.ht.service.DataServiceI;
import com.ht.vo.DicZhibiao;
import com.ht.vo.DicZhibiaoExample;

@Service
public class DataServiceImpl implements DataServiceI {
	
	@Resource
	private DicZhibiaoMapper dicZhibiaoMapper;

		@Override
		public List<DicZhibiao> getDzb() {
			DicZhibiaoExample example = new DicZhibiaoExample();
			com.ht.vo.DicZhibiaoExample.Criteria createCriteria = example.createCriteria();
			createCriteria.andIdIsNotNull();
			List<DicZhibiao> rootData = dicZhibiaoMapper.selectByExample(example);

		    return rootData;
		}
				
}
