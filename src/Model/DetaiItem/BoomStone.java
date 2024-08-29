package Model.DetaiItem;

import Model.Item;

import java.util.Scanner;

public class BoomStone extends Item {

    public BoomStone() {
        this.setItemName("Hòn đá kích nổ");
        this.setItemPower(40);
        this.setPowerRate(2);
        this.setItemPrice(12);
        this.setTypeItem(3);

    }

    @Override
    public void xuat() {
        System.out.println("##########");
        System.out.println("Nhập thông tin Hòn đá kích nổ ");
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
        System.out.println("Nhập thông tin Hòn đá kích nổ ");
        System.out.println("Nhập chỉ số sức mạnh");
        this.setItemPower(sc.nextInt());
        System.out.println("Nhập hệ số sức mạnh");
        this.setPowerRate(sc.nextDouble());
        System.out.println("Nhập số vàng quy đổi 1 sức mạnh");
        this.setItemPrice(sc.nextInt());
        System.out.println("------------");
    }




}
