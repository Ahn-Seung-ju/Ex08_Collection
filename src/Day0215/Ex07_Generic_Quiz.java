package Day0215;

import java.util.ArrayList;

class Product {
    int price;
    int bonuspoint;

    // Product() { }
    Product(int price) {
        this.price = price;
        this.bonuspoint = (int) (this.price / 10.0);
    }
}

class KtTv extends Product {
    KtTv() {
        super(500);
    }
    // KtTv(int price){ super(price);}

    @Override
    public String toString() {
        return "KtTv";
    }
}

class Audio extends Product {
    Audio() {
        super(100);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}

class NoteBook extends Product {
    NoteBook() {
        super(150);
    }

    @Override
    public String toString() {
        return "NoteBook";
    }
}



public class Ex07_Generic_Quiz {

    public static void main(String[] args) {
        //다형성
        //1. Array  배열을 사용해서  cart 만들고 제품을 담으세요 (tv , audio , notebook)
        Product[] cart = new Product[3];
        cart[0] = new KtTv();
        cart[1] = new Audio();
        cart[2] = new NoteBook();
        
        //Generic
        // 2. ArrayList 를 사용해서 cart 만들고 제품을 담으세요
        
        ArrayList<Product> pcart = new ArrayList<Product>();
        pcart.add(new KtTv());
        pcart.add(new KtTv());
        pcart.add(new KtTv());
        pcart.add(new KtTv());
        pcart.add(new KtTv());
        pcart.add(new Audio());
        pcart.add(new Audio());
        pcart.add(new Audio());
        pcart.add(new NoteBook());
        pcart.add(new NoteBook());
        pcart.add(new NoteBook());
        pcart.add(new NoteBook());
        
        for(Product product : pcart) {
            System.out.println(product);
        }
        System.out.println(pcart.size());
        for(Product product : pcart) {
            System.out.println(product.toString() +product.price);
        }

    }

}
