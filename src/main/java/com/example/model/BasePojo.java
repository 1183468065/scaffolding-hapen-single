package com.example.model;

import com.example.utils.JsonUtil;

import java.io.Serializable;

public abstract class BasePojo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return JsonUtil.toJson(this);
	}
}
