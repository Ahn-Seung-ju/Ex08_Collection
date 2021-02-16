package Day0215;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_Set_Tree {

    public static void main(String[] args) {
        //Set 인터페이스: 순서(X), 중복(X)
        HashSet<String> hs = new HashSet<String>();
        hs.add("B");
        hs.add("A");
        hs.add("F");
        hs.add("K");
        hs.add("G");
        hs.add("P");
        hs.add("A");
        hs.add("C");
        hs.add("D");
        System.out.println(hs.toString());
        //[P, A, B, C, D, F, G, K]
        
        //TreeSet
        //순서(X) 중복을 허용(X) >> 정렬 (O)
        //검색하거나 정렬 필요하는 자료구조(데이터 집합에 대해서)
        
        //1. 이진트리
        //하나가 가질수 있는 최대수 2개
        //2. 데이터가 저장될때 정렬된다.
        // 그냥 로또
        Set<Integer> lotto = new TreeSet<Integer>();
        for(int i = 0;  lotto.size() < 6; i++) {
            lotto.add((int)(Math.random()*45 + 1));
        }
        System.out.println(lotto.toString());

    }

}
