package com.mhcc.common.entity.base;


import java.io.Serializable;

/**
 * 基础实体对象
 *
 */
public abstract class Entity implements Serializable {
	/**
	 * id
	 */
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Entity{" +
				"id='" + id + '\'' +
				'}';
	}
}
