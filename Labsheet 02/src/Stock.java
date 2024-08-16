
public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public void setPreviousClosingPrice(double closingPrice){
        this.previousClosingPrice = closingPrice;
    }

    public void setCurrentPrice(double nowPrice){
        this.currentPrice = nowPrice;
    }

    public double getChangedPercent(){
        double changedPercent;

        changedPercent =(Math.abs(previousClosingPrice - currentPrice)/previousClosingPrice) * 100;

        return changedPercent;
    }
}
