package Day0215;

import java.util.ArrayList;

import kr.or.bit.Emp;

/*

 */
public class Ex03_ArrayList_Object {
    
    public static void main(String[] args) {
        //사원 1명을 만드세요
        
        Emp emp = new Emp(100,"김유신", "군인");
        System.out.println(emp.toString());
        
        //사원 2명을 만드세요
        //Array
        Emp[] emplist = {new Emp(100, "김씨" , "일반"), new Emp(200,"박씨", "학생")};
        for(Emp e : emplist) {
            System.out.println(e.toString());
        }
        //1명 입사을 더 추가
        //Emp[] emplis = new Emp[3];
        //기존 데인터 이동
        
        //Collection...
        //ArrayList
        ArrayList elist = new ArrayList();
        elist.add(new Emp(1, "강", "IT"));
        elist.add(new Emp(2, "김", "IT"));
        //1명 입사
        elist.add(new Emp(3, "이", "IT"));
        System.out.println(elist.size());
        for(int i = 0; i < elist.size(); i++) {
            //System.out.println(elist.get(i));
            //Emp e = elist.get(i); ArrayList 가지고 있는 배열 타입 Object[]
            Object obj = elist.get(i);
            System.out.println(obj);//재정의 한 toString()
            Emp e = (Emp) obj;
            System.out.println(e.getEmpno()+ " / " + e.getEname() + " / " + e.getJob());
        }
        for(Object e : elist) {
            //목적에 따라서 downcasting
            Emp e2 = (Emp)e;
        }
        //개발자가 제일 casting 예외
        //Object 안쓰고 싶다
        //요청 JAVA 개발자에게
        //generic 타입
        //현업에서는 90% 제너릭을 사용한다
        ArrayList<Emp> list2 = new ArrayList<Emp>();
        list2.add(new Emp(1, "a", "IT"));
        list2.add(new Emp(2,"b", "IT"));
        for(Emp e : list2) {
            System.out.println(e.getEmpno()+ e.getEname() + e.getJob());
        }
    }

}
