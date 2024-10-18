package com.pathy.infra.insProduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsProductService {
	
	@Autowired
	InsProductDao insProductDao;

}
