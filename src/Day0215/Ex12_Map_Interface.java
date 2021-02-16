package Day0215;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
Map 인터페이스
Map (key, value) 쌍의 구조를 갖는 배열
ex) (02, 서울) (031, 경기)
key: 중복(X)
value: 중복(O)
generic: 지원 (key, value 타입을 강제 가능)

Map 인터페이스 구현
구버전: HashTable 동기화(O)

신버전: HashMap(동기화를 강제(X)): 성능 고려
 */
public class Ex12_Map_Interface {

    public static void main(String[] args) {
        //HashMap<K, V>
        HashMap map = new HashMap();
        map.put("Tiger", "1004");
        map.put("Sccott", "1004");
        map.put("superman", "1004");
        //사용자 ID, PWD 관리 용이
        
        System.out.println(map.containsKey("tiger"));//대소문자 엄격하게 구분 false
        //중복 ID 검사
        System.out.println(map.containsKey("scott"));
        System.out.println(map.containsValue("1004"));
        System.out.println(map.containsValue("1007"));
        
        //POINT
        //key를 제공하면 value 값을 알 수 있다
        System.out.println(map.get("superman")); //value return
        System.out.println(map.get("hong"));//해당 key에 해당하는 value가 없으면 >> null
        
        map.put("Tiger", "1007"); // key 중복(X) key가 중복되면 value 값을 overwrite
        System.out.println(map.get("Tiger"));
        System.out.println(map.size());
        
        Object value = map.remove("superman");//remove안에 parameter는 key 값으로 인정
        System.out.println("value: " + value);
        System.out.println(map.toString());
        //{Sccott=1004, Tiger=1007} 재정의
        
        
        //응용 (이해)
        Set set = map.keySet();//key 집합 >> 규칙 >> 순서(X) >> 중복(X) Set
        Iterator it = set.iterator();// 순차적인
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        Collection clist = map.values();
        System.out.println(clist.toString());
        
        //Map과 List 혼합
        //HashMap<String,ArrayList> room = new HashMap<String,ArrayList>();
        //room.add("1", new ArrayList())
    }

}
