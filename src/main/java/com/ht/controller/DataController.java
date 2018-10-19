package com.ht.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ht.service.DataServiceI;
import com.ht.vo.DicZhibiao;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/test")
@Api(value = "/test",tags="测试")
public class DataController {
	
	@Resource
	private DataServiceI dataServiceI;
	
	@RequestMapping("/getDzb")
	@ResponseBody
	@ApiOperation(value = "获取测试信息", notes = "获取测试信息",httpMethod="GET")
	List<DicZhibiao> getDzb(){
		return dataServiceI.getDzb();
	}
	
	@RequestMapping(value = "/getNameById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "获取测试信息", notes = "获取测试信息",httpMethod="GET",tags="id获取")
	@ApiImplicitParam(name = "id",value = "用户id", dataType = "String",required = true, paramType = "path")
	String getNameById(@PathVariable String id){
		String name = dataServiceI.getNameById(id);
		return name;
	}
	
	@RequestMapping(value = "/getRecordById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "根据id获取记录", notes = "根据id获取记录",httpMethod="GET",tags="id获取")
	@ApiImplicitParam(name = "id",value = "用户id", dataType = "String",required = true, paramType = "path")
	List<DicZhibiao> getRecordById(@PathVariable String id){
		List<DicZhibiao> data = dataServiceI.getRecordById(id);
		return data;
	}
}
