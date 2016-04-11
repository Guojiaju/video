package com.future.commons.domain;

import java.io.Serializable;

public abstract class AbstractCriteria implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String orderByClause;

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}
	
}
