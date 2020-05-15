class MobileShop {
    InnerPurchaseMoney purchaseMoney1;
    InnerPurchaseMoney purchaseMoney2;
    private int mobileAmount;

    MobileShop() {
        purchaseMoney1 = new InnerPurchaseMoney(20000);
        purchaseMoney2 = new InnerPurchaseMoney(10000);
    }

    void setMobileAmount(int m) {
        mobileAmount = m;
    }

    int getMobileAmount() {
        return mobileAmount;
    }

    class InnerPurchaseMoney {
        int moneyValue;

        InnerPurchaseMoney(int m) {
            moneyValue = m;
        }

        void buyMobile() {
            if (moneyValue >= 20000) {
                mobileAmount = mobileAmount - 10;
                System.out.println("用" + moneyValue + "的内部券买了10台手机");
            } else if (moneyValue < 20000 && moneyValue >= 10000) {
                mobileAmount = mobileAmount - 5;
                System.out.println("用" + moneyValue + "的内部券买了5台手机");
            }
        }
    }
}