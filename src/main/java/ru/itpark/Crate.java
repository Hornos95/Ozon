package ru.itpark;

public class Crate {
    private int amount;
    private int discountAmount;
    private int totalCount;

    public int getTotalCount() {
        return totalCount;
    }

    public int getAmount() {
        return amount;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }
public  void add(Goods goods, int count){
amount+=goods.getPrice()*count;
discountAmount+=goods.getDiscountPrice()*count;
totalCount+=count;
}
public void remove(Goods goods,int count){
    amount-=goods.getPrice()*count;
    discountAmount-=goods.getDiscountPrice()*count;
    totalCount-=count;
}


    @Override
    public String toString() {
        return "Crate{" +
                "amount=" + amount +
                ", discountAmount=" + discountAmount +
                ", totalCount=" + totalCount +
                '}';
    }
}
