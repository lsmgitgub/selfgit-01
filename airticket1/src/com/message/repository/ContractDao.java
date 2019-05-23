package com.message.repository;

import java.util.List;

import com.message.bean.Contract;

public interface ContractDao {
	
	
	public List<Contract> findContract(Contract contract);

	public void addContract(Contract contract);

}
