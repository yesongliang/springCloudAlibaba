package com.kedacom.tz.sh.vo;

import java.io.Serializable;

public class Order implements Serializable {

	private static final long serialVersionUID = 8712960782610509142L;

	/**
	 * id.
	 */
	public long id;

	/**
	 * user id.
	 */
	public String userId;

	/**
	 * commodity code.
	 */
	public String commodityCode;

	/**
	 * count.
	 */
	public int count;

	/**
	 * money.
	 */
	public int money;

	@Override
	public String toString() {
		return "Order{" + "id=" + id + ", userId='" + userId + '\'' + ", commodityCode='" + commodityCode + '\'' + ", count=" + count + ", money=" + money + '}';
	}

}