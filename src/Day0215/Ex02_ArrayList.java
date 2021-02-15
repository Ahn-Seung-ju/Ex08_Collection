package Day0215;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Today Point
 */
public class Ex02_ArrayList {

    public static void main(String[] args) {
        //List 인터페이스 구현: 순서, 중복허용 데이터 집합 다룰 때 클래스
        
        ArrayList arraylist = new ArrayList();
        //Object 타입을 가지는 정적 배열 heap 생성
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add(300);
        arraylist.add(400);
        arraylist.add(500);
        arraylist.add(600);
        arraylist.add(700);
        arraylist.add(800);
        arraylist.add(900);
        
        for(int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
        System.out.println(arraylist.toString());
        
        System.out.println(arraylist.get(0));
        
        //순차적인 데이터를 다루는 것에 대한 장단점
        //비순차적인 데이터 추가, 삭제 >> ArrayList(X) 적합하지 않는다 >> 순서가 있는 데이터
        
        arraylist.add(0, 111);
        System.out.println(arraylist);
        arraylist.add(1000);
        System.out.println(arraylist);
        
        //arraylist.remove(100); //숫자는 인덱스 값으로 안다 java.lang.IndexOutOfBoundsException
        //ArrayList 함수 공부(String 함수 학습)
        System.out.println(arraylist.contains(200)); //true
        System.out.println(arraylist.contains(2000));//false
        
        arraylist.clear();//데이터만 삭제(공간은 유지)
        System.out.println(arraylist.size());
        System.out.println(arraylist.isEmpty());//true
        System.out.println(arraylist);
        
        arraylist.add(101);
        arraylist.add(102);
        arraylist.add(103);
        
        System.out.println(arraylist.isEmpty()); //false
        
        System.out.println(arraylist.size());//3
        Object value = arraylist.remove(0);//0번째 방의 값을 삭제 ... 그 값을 return
        System.out.println("value: " + value);
        System.out.println(arraylist.size());
        System.out.println(arraylist);
        
        arraylist.add(0, 101);
        System.out.println(arraylist);
        
        //Point
        //개발자가 쓰는 코드...일상다반사
        //다형성...(확장성, 유연성 측면에서) 편하게 쓸 수 있다.
        List li = new ArrayList();
        li.add("가");
        li.add("나");
        li.add("다");
        li.add("라");
        
        List li2 = li.subList(0, 2);// subList를 통해서 데이터 집합 생성
        System.out.println(li2);
        
        ArrayList alist = new ArrayList();
        alist.add(50);
        alist.add(1);
        alist.add(34);
        alist.add(20);
        alist.add(6);
        alist.add(33);
        alist.add(12);
        alist.add(43);
        
        System.out.println(alist.toString());
        Collections.sort(alist); // 초급자는 sort 버블정렬 (X)
        System.out.println(alist.toString());
        
        Collections.reverse(alist);
        System.out.println(alist.toString());
    }

}
