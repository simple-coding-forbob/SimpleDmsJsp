/**
 * 
 */
package com.simplecoding.simpledmsjsp.faq.vo;

import com.simplecoding.simpledmsjsp.common.Criteria;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FaqVO extends Criteria {
	private int fno;           // 번호(기본키)
	private String title;      // 제목
	private String content;    // 내용
}






