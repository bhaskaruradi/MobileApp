package com.cg.mra.exception;

public class Custom1 extends Exception {
    public Custom1() {
    	System.out.println("ERROR:Cannot Recharge Account as Given Mobile No Does Not Exist");
    }
}
