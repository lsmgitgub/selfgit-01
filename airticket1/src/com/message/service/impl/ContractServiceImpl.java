package com.message.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.message.bean.Contract;
import com.message.repository.ContractDao;
import com.message.service.ContractService;

@Service
public class ContractServiceImpl implements ContractService {

	@Autowired
	private ContractDao contractDao;

	public List<Contract> queryContract(Contract contractCondition) {
		// TODO Auto-generated method stub
		return contractDao.findContract(contractCondition);
	}

	public void addContract(Contract contract) {
		// TODO Auto-generated method stub
		contractDao.addContract(contract);
	}
}
