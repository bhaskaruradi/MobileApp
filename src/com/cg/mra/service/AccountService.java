package com.cg.mra.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.mra.beans.Account;

public interface AccountService {
            Account getAccountDetails(String mobileNo);
            int rechargeAccount(String mobileno,double rechargeAmount);
}


	
