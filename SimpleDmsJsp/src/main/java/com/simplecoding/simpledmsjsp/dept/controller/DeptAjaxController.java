/**
 * 
 */
package com.simplecoding.simpledmsjsp.dept.controller;


import com.simplecoding.simpledmsjsp.common.Criteria;
import com.simplecoding.simpledmsjsp.dept.service.DeptService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author simple-coding
 * AutoComplete
 */
@RequiredArgsConstructor
@Log4j2
@RestController
public class DeptAjaxController {

	private final DeptService deptService;

	@GetMapping("/api/dept")
	public List<?> selectDeptList(@ModelAttribute("searchVO") Criteria criteria) throws Exception {
		List<?> list = deptService.selectDeptList(criteria);
		
		return list;
	}	
}
