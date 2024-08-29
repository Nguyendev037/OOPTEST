package Model;

public abstract class Item {

    private String itemName;
    private int itemPower;
    private double powerRate;
    private int itemPrice;

    private int typeItem;

    public int getTypeItem() {
        return typeItem;
    }

    public void setTypeItem(int typeItem) {
        this.typeItem = typeItem;
    }

    public Item() {
        this.itemName = "";
        this.itemPower = 0;
        this.powerRate = 0;
        this.itemPrice = 0;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPower() {
        return itemPower;
    }

    public void setItemPower(int itemPower) {
        this.itemPower = itemPower;
    }

    public double getPowerRate() {
        return powerRate;
    }

    public void setPowerRate(double powerRate) {
        this.powerRate = powerRate;
    }



    public double DamePower () {
        return this.itemPower * this.powerRate;
    }

    public double itemTotalPrice () {
        return this.DamePower() * this.itemPrice;
    }

    public abstract void nhap();
    public abstract  void xuat();

}
