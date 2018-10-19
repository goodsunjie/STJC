package com.ht.service;

import java.util.List;

import com.ht.vo.DicZhibiao;

public interface DataServiceI {
	
	List<DicZhibiao> getDzb();
	
	String getNameById(String id);
	
	List<DicZhibiao> getRecordById(String id);
	
}
