/**
 * 
 */
package com.simplecoding.simpledmsjsp.dept.service;


import com.simplecoding.simpledmsjsp.common.Criteria;
import com.simplecoding.simpledmsjsp.dept.mapper.DeptMapper;
import com.simplecoding.simpledmsjsp.dept.vo.DeptVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DeptService {

	private final DeptMapper deptMapper;

	
	public List<?> selectDeptList(Criteria criteria) {
		return deptMapper.selectDeptList(criteria);
	}
	
	
	public int selectDeptListTotCnt(Criteria criteria) {
		return deptMapper.selectDeptListTotCnt(criteria);
	}
	
	
	public void insert(DeptVO deptVO) {
		deptMapper.insert(deptVO);
	}
	
	
	public DeptVO selectDept(int dno) {
		DeptVO deptVO = deptMapper.selectDept(dno);
		return deptVO;
	}

	
	public void update(DeptVO deptVO) {
		deptMapper.update(deptVO);
	}

	
	public void delete(DeptVO deptVO) {
		deptMapper.delete(deptVO);
	}
}








