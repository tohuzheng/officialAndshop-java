package com.huzheng.dto;

/**
 * @Author 胡正
 * @Date 2020/3/26 19:57
 * @Description 交易关闭
 */
public class TradeCloseDto {
    // 商户订单号
    private String out_trade_no;
    // 支付宝交易流水号
    private String trade_no;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }
}
