package com.mhcc.common.entity.base;

import java.util.Date;

/**
 * 数据库对象基础类
 */

public abstract class DaoEntity extends Entity {
	/**
	 * 创建时间
	 */
	private Date createTime;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
