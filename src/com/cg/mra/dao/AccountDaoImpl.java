package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.mra.beans.Account;

public class AccountDaoImpl implements AccountDao {
Map<String,Account> accountEntry;
	
	public  AccountDaoImpl() {
		accountEntry = new HashMap<>();
		accountEntry.put("9010210131",new Account("Prepaid","Vaishali",200));
		accountEntry.put("9823920123",new Account("Prepaid","Megha",453));
		accountEntry.put("9948761996",new Account("Prepaid","Vikas",631));
		accountEntry.put("9010210131",new Account("Prepaid","Anju",521));
		accountEntry.put("9010210131",new Account("Prepaid","Tushar",632));
	}

	@Override
	public Account getAccountDetails(String mobileNo) {
		// TODO Auto-generated method stub
		Account user= null;
	
		for(Map.Entry<String, Account> m : accountEntry.entrySet())
		{
			if(m.getKey().equals(mobileNo))
			{
				user = m.getValue();
			
			}
			
		}
		return user;
		}
		
		
	

	@Override
	public int rechargeAccount(String mobileno, double rechargeAmount) {
		// TODO Auto-generated method stub
		Account user = null;
		
		for(Map.Entry<String, Account> m : accountEntry.entrySet())
		{
			if(m.getKey().equals(mobileno))
			{
				user = m.getValue();
			
			}
		}
		if(user != null)
		{
			rechargeAmount = rechargeAmount+user.getAccountBalance();
			user.setAccountBalance(rechargeAmount);
			accountEntry.put(mobileno, user);
		}
		
		return (int)rechargeAmount;
	
		
	}

	
}
