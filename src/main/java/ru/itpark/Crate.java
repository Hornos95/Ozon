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
public  void add(Good good, int count){
amount+= good.getPrice()*count;
discountAmount+= good.getDiscountPrice()*count;
totalCount+=count;
}
public void add(Good good){
        amount+= good.getPrice();
        discountAmount+= good.getDiscountPrice();
        totalCount++;
}
public void clean(Good good, int count){
    amount-= good.getPrice()*count;
    discountAmount-= good.getDiscountPrice()*count;
    totalCount-=count;
}
public void clean(Good good){
    amount-= good.getPrice();
    discountAmount-= good.getDiscountPrice();
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
