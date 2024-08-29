package Model;

import Model.DetaiItem.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListItem {

    List<Item> listItem = new ArrayList<Item>();

    int SponToken = 0;


    public void nhap() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin 5 loại vật phẩm");

        Item x = new GodAcer();
        x.nhap();
        listItem.add(x);

        Item x1 = new ThunderPunch();
        x1.nhap();
        listItem.add(x1);

        Item x2 = new BoomStone();
        x2.nhap();
        listItem.add(x2);

        Item x3 = new MagicAcer();
        x3.nhap();
        listItem.add(x3);

        Item x4 = new GodThunk();
        x4.nhap();
        listItem.add(x4);

        System.out.println("Nhập xu của Spon");
        SponToken  = sc.nextInt();

        System.out.println("----------");
    }

    public double totablMoneyofItem() {
        return this.listItem.stream().mapToDouble(Item::itemTotalPrice).sum();
    }



    public double maxExpensiveItem() {
       return this.listItem.stream().mapToDouble(Item::itemTotalPrice).max().orElse(0.0);
    }

    public void xuat() {

        for (Item i : listItem) {
            i.xuat();
        }

        if (SponToken < totablMoneyofItem()) {
            System.out.println("Spon không cứu được bạn" + " Không đủ tiền để mua 5 vật phẩm " + this.SponToken);
        } else {
            System.out.println("Spon đã giải cứu thành công bạn" + " Số dư sau khi thu nhập 5 vật phẩm " + (double) (this.SponToken - this.totablMoneyofItem()));
        }

        System.out.println("----------");

        Item x = listItem.stream().filter( k -> k.itemTotalPrice() == this.maxExpensiveItem()).findFirst().get();

        System.out.println("Vật phẩm đắt nhất là: " + x.getItemName() + " Giá tiền: " + x.itemTotalPrice());

    }



}
