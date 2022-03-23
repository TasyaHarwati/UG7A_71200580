package com.ug7.ewallet;

public class ShopeePay extends eWallet {
    private int feeTopup;
    private int feeTransfer;
    private int feeWithdraw;

    public ShopeePay(com.ug7.ewallet.User user){
        this User = user;
    }
    public void topup(int jumlah){
        feeTopup = jumlah;
    }
    public void transfer(eWallet eWallet, int jumlah){
        feeTransfer = jumlah;
    }
    public void withdraw(int jumlah){
        withdraw();
    }

}
