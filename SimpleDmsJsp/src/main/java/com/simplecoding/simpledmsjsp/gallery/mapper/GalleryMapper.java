package com.simplecoding.simpledmsjsp.gallery.mapper;


import com.simplecoding.simpledmsjsp.common.Criteria;
import com.simplecoding.simpledmsjsp.gallery.vo.GalleryVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GalleryMapper {
	List<?> selectGalleryList(Criteria searchVO);
	int selectGalleryListTotCnt(Criteria searchVO); 
	int insert(GalleryVO galleryVO);
	GalleryVO selectGallery(String  uuid);          
	int delete(String uuid);                       
}





