package ch.bbbaden.yahoo;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * Created by CoFFeeBaker on 24.11.2015.
 */
public class UseData {

    public void  getData(){
        Stock stock = null;
        try {
            stock = YahooFinance.get("INTC");
        } catch (IOException e) {
            e.printStackTrace();
        }

        BigDecimal price = stock.getQuote().getPrice();
        BigDecimal change = stock.getQuote().getChangeInPercent();
        BigDecimal peg = stock.getStats().getPeg();
        BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();

        stock.print();
        System.out.println(price);
    }
}
