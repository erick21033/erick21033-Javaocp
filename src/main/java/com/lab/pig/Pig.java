package com.lab.pig;

public class Pig {
    private String market_name;
    private String addr;

    public String getMarket_name() {
        return market_name;
    }

    public void setMarket_name(String market_name) {
        this.market_name = market_name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Pig{" + "market_name=" + market_name + ", addr=" + addr + '}';
    }
    
    
}
