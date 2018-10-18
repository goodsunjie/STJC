package com.ht.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ht.service.DataServiceI;
import com.ht.vo.DicZhibiao;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/test")
@Api(value = "/test", tags = "test接口")
public class DataController {
	
	@Resource
	private DataServiceI dataServiceI;
	
	@RequestMapping("/getDzb")
	@ResponseBody
	@ApiOperation(value = "获取测试信息", notes = "获取测试信息")
	List<DicZhibiao> getDzb(){
		return dataServiceI.getDzb();
	}
}
