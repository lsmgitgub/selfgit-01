package com.message.service;

import java.util.List;

import com.message.bean.Contract;

public interface ContractService {
	
	
	public List<Contract> queryContract(Contract airLineCondition);

	public void addContract(Contract airLine);
}
