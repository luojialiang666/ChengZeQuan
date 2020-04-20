package org.java.common.pojo;

import java.io.Serializable;
import java.util.List;

public class EasyUIDataGrideResult implements Serializable{
	private Long total;		//数据总的信息I条数
	private List<?> rows;	//一页信息列表
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
}
