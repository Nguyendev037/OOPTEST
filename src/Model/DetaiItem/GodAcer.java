package Model.DetaiItem;

import Model.Item;
import java.util.Scanner;

public class GodAcer extends Item {

    public GodAcer() {
        this.setItemName("Chiếc Búa Thần");
        this.setItemPower(25);
        this.setPowerRate(2);
        this.setItemPrice(10);
        this.setTypeItem(1);
    }

    @Override
    public void xuat() {
        System.out.println("##########");
        System.out.println("Thông tin búa chiến thần ");
        System.out.println("Chỉ số sức mạnh: " + this.getItemPower());
        System.out.println("Hệ số sức mạnh: " + this.getPowerRate());
        System.out.println("Số vàng quy đổi 1 sức mạnh: " + this.getItemPrice());
        System.out.println("Sức công phá " + this.DamePower());
        System.out.println("Số vàng để mua: " + this.itemTotalPrice());
        System.out.println("------------");
    }

    @Override

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("##########");
        System.out.println("Nhập thông tin chiếc búa thần ");
        System.out.println("Nhập chỉ số sức mạnh");
        this.setItemPower(sc.nextInt());
        System.out.println("Nhập hệ số sức mạnh");
        this.setPowerRate(sc.nextDouble());
        System.out.println("Nhập số vàng quy đổi 1 sức mạnh");
        this.setItemPrice(sc.nextInt());
        System.out.println("------------");
    }




}
