/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.dao;

import java.util.List;

import org.hoteia.qalingo.core.domain.ProductSku;

public interface ProductSkuDao {

//	ProductSku getProductSkuById(Long productSkuId);

//	ProductSku getProductSkuByCode(String productSkuCode);
	
//	ProductSku getProductSkuByCode(Long marketAreaId, String productSkuCode);
	
	ProductSku getProductSkuByCode(Long marketAreaId, Long retailerId, String productSkuCode);
	
	List<ProductSku> findProductSkus(Long marketAreaId, Long retailerId, Long productMarkettingId);
	
	List<ProductSku> findProductSkus(Long marketAreaId, Long retailerId, String text);
	
	void saveOrUpdateProductSku(ProductSku productSku);

	void deleteProductSku(ProductSku productSku);

}
