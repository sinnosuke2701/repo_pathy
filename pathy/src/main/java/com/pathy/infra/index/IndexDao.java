package com.pathy.infra.index;

import org.springframework.stereotype.Repository;

@Repository
public interface IndexDao {
	
	public int selectOneCountCustomer();
	
	public int selectOneCountInsMember();
	
	public int selectOneCountInsProduct();
	
	public int selectOneCountInsContract();
	
	public int selectOneCountCustomerContract();
	
	public int selectOneCountApplicationShin();
	
	public int selectOneCountApplicationCheong();
	
	public int selectOneCountClaim();
	
	public int selectOneCountClaimManage();
	
	public int selectOneCountQna();
	
}
