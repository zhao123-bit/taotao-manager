package com.zhao.service;

import com.zhao.bean.TbItem;

public interface TbItemService {
	
	/**
	 * 根据商品id查询商品指定信息
	 * @param tbItem  商品id
	 * @return  指定商品id的商品信息
	 */
	TbItem findTbItemById(Long tbItemId);
}
