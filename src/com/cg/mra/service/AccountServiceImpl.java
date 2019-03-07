package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService {
 AccountDao acc = new AccountDaoImpl();
	@Override
	public Account getAccountDetails(String mobileNo) {
		// TODO Auto-generated method stub
		Account a =acc.getAccountDetails(mobileNo); 
		return a;
	}

	@Override
	public int rechargeAccount(String mobileno, double rechargeAmount) {
		// TODO Auto-generated method stub
		int balance = acc.rechargeAccount(mobileno, rechargeAmount);
		return balance;
	}

}
