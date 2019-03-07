package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exception.Custom;
import com.cg.mra.exception.Custom1;

import com.cg.mra.exception.ImproperInput;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MainUI {
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	AccountService as = new AccountServiceImpl();
    	while(true) {
    	System.out.println("Enter your choice");
		System.out.println("1. Account Balance Enquiry");
		System.out.println("2. Recharge Account");
		System.out.println("3.Exit");
		int ch = sc.nextInt();
		
            switch(ch)
            {
            case 1 :
            	System.out.println("Enter MobileNo");
            	String MobileNo = sc.next();
            	if(MobileNo.length()==10) {
            	Account a = as.getAccountDetails(MobileNo);
            	if(a!=null)
            		System.out.println("your current balance is Rs. "+a.getAccountBalance());
            	
            	else {
            		try {
            			throw new Custom();
            		}
            		catch(Custom e) {}
            	}
            	}
            	else {
            		try {
            			throw 	new ImproperInput();
            		}
            		catch(ImproperInput e) {}
            	}
            	break;
            case 2:
            	System.out.println("Enter MobileNo:");
            	String mob = sc.next();
            	Account a1 = as.getAccountDetails(mob);
            	if(a1!=null) {
            	System.out.println("Enter Recharge amount:");
            	int rech = sc.nextInt();
            	int balance = as.rechargeAccount(mob, rech);
            	System.out.println("Your Account Recharged Succesfully");
            	System.out.println("Hello "+a1.getCustomerName()+"," +"Available balance is "+balance);
            	}
            	else {
            		try {
            			throw new Custom1();
            		}
            		catch(Custom1 e) {}
            	}
            	break;
            case 3 :
            	System.out.println("Thank you");
            		System.exit(0);
            		default:
            			System.out.println("give valid operation/number");
            			System.exit(0);
            }
    }
}
}
