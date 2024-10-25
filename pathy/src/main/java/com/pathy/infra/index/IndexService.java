package com.pathy.infra.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {
	
	@Autowired
	IndexDao indexDao;
	
	public int selectOneCountCustomer() {
		return indexDao.selectOneCountCustomer();
	}
	
	public int selectOneCountInsMember() {
		return indexDao.selectOneCountInsMember();
	}
	
	public int selectOneCountInsProduct() {
		return indexDao.selectOneCountInsProduct();
	}
	
	public int selectOneCountInsContract() {
		return indexDao.selectOneCountInsContract();
	}
	
	public int selectOneCountCustomerContract() {
		return indexDao.selectOneCountCustomerContract();
	}
	
	public int selectOneCountApplicationShin() {
		return indexDao.selectOneCountApplicationShin();
	}
	
	public int selectOneCountApplicationCheong() {
		return indexDao.selectOneCountApplicationCheong();
	}
	
	public int selectOneCountClaim() {
		return indexDao.selectOneCountClaim();
	}
	
	public int selectOneCountClaimManage() {
		return indexDao.selectOneCountClaimManage();
	}
	
	public int selectOneCountQna() {
		return indexDao.selectOneCountQna();
	}
	
}
