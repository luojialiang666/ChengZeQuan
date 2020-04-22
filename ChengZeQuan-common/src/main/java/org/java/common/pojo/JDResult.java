package org.java.common.pojo;

import java.io.Serializable;

/**
 * 所有的方法如果你不知道返回什么类型，都用这个类型
 * @author yan
 *
 */
public class JDResult implements Serializable{
	private Integer status;	//返回状态
	private String msg;		//原因
	private Object data;	//返回值
	
	
	
	public JDResult() {
	}
	

	public JDResult(Integer status, String msg, Object data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}


	public static JDResult bind(Integer status,String msg){
		return new JDResult(status, msg, null);
	}
	public static JDResult ok(){
		return new JDResult(200, "ok", null);
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
