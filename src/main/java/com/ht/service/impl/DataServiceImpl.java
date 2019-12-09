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

	@Override
	public String getNameById(String id) {
		DicZhibiaoExample example = new DicZhibiaoExample();
		com.ht.vo.DicZhibiaoExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andIdEqualTo(id);
		List<DicZhibiao> data = dicZhibiaoMapper.selectByExample(example);
		if (data.size() > 0) {
			String name = data.get(0).getName();
			System.out.println(name);
			return name;
		} else {
			return "无";
		}

	}

	@Override
	public List<DicZhibiao> getRecordById(String id) {
		DicZhibiaoExample example = new DicZhibiaoExample();
		com.ht.vo.DicZhibiaoExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andIdEqualTo(id);
		List<DicZhibiao> data = dicZhibiaoMapper.selectByExample(example);
		return data;
	}

}
