package Day0215;

import java.util.Vector;

/*
Collection FrameWork

[다수의 데이터를] 다루는 [표준화된 인터페이스]를 구현하고 클래스의 집합

Collection 인터페이스 -> List 인터페이스 상속 -> ArrayList(구현: 수많은 약속) 모르면 바아아아보보오오오오 중요요오오오오오오오오오
                                       -> 줄서는것 번호를 주어 중복된 데이터를 구별
                   -> Set 인터페이스 상속 -> HashSet, TreeSet(구현)
                                      -> 원안에 들어가는 것 데이터의 집합으로 중복을 허용할 수 없다.
Map 인터페이스( key, value) -> HashMap(구현) 중요용오오오오오이욂;ㅇ람ㄴㅇ라ㅣㅓ\

1. List(줄을 서시오: 번호표): 순서를 보장, 중복 허용 >> 내부적으로 데이터(자료, 객체) >> [배열]로 관리
예)[홍길동][홍길동][홍길동]

구현하고 있는 클래스
1.1 Vector(구버전)        ->동기화 보장(멀티 스레드) -> Lock(장치) -> 성능이 조금 떨어짐 -> 안정성을 보장 받는다
1.2 ArrayList(신버전)     ->동기화 보장(멀티 스레드) -> Lock(장치(X)): 필요에 따라서 -> 성능 우선 -> 안정성이 조금 떨어짐

----------------------------------------------------------------------------------------------------------
*기존의 여러개의 같은 타입의 데이터 관리: Array 정적(고정)
-방의 개수가 한번 정해지면 (방의 크기는 변경 불가)
int[] arr = new int[5];
... 10개의 방이 필요해....[줄이거나 늘리는 작업 불가]
in[] arr2 = new int[10];
arr 자원을 arr2 이관해야 된다

Array
1. 배열의 크기 고정 Car[] cars = {new Car(), new Car()};//방 2개 만듬
2. 접근 방법(index)방번호 접근: cars[0]...n방까지: length -1
3. 초기 설정 불가

<-> Collection
List > Vector, ArrayList
1. 배열의 크기를 동적으로 확장: 축소 >> 말도 안된다니 >> ** 사실은 [배열의 재할당] 이용
2. 순서를 유지(내부적으로 index 배열), 중복값 허용 가능
3. 데이터 저장 공간: Array


 */
public class Ex01_Vector {

    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("초기 default: 용량: "+ v.capacity());//방10개 배열
        System.out.println("SIZE: " + v.size());
        
        v.add("AA");
        v.add("AA");
        v.add("AA");
        
        System.out.println("데이터 크기: SIZE :" + v.size());
        System.out.println(v.toString());//[AA, AA, AA] // 재정의 갸꿀
        //Array: length
        //Collection: size
        
        for(int i = 0; i< v.size(); i++) {
            System.out.println(v.get(i));//array[i] // 함수 get()
        }
        for(Object obj : v) {
            System.out.println(obj);
        }
        
        //재너리 >> 타입을 강제 >> 추후 별도 학습
        Vector<String> v2 = new Vector<String>();
        v2.add("hello");
        v2.add("world");
        
        for(String str : v2) {
            System.out.println(str);
        }
        ////////////////////////////////////////////////////////////////////////////
        
        Vector v3 = new Vector();
        System.out.println(v3.capacity());
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        
        System.out.println(v3.capacity());//20
        System.out.println(v3.size());//데이터의 개수 - 11개

    }

}
