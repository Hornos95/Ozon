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
public void add(Goods goods){
        amount+=goods.getPrice();
        discountAmount+=goods.getDiscountPrice();
        totalCount++;
}
public void clean(Goods goods, int count){
    amount-=goods.getPrice()*count;
    discountAmount-=goods.getDiscountPrice()*count;
    totalCount-=count;
}
public void clean(Goods goods){
    amount-=goods.getPrice();
    discountAmount-=goods.getDiscountPrice();
    totalCount--;
}


    @Override
    public String toString() {
        return "Корзина:" +
                " Сумма " + amount +
                ", Сумма со скидкой " + discountAmount +
                ", Количество товара " + totalCount  ;
    }
}
