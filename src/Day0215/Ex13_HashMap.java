package Day0215;

import java.util.HashMap;
import java.util.Scanner;

public class Ex13_HashMap {

    public static void main(String[] args) {
        //지역번호, 출석부, 우편번호, 회원가입
        HashMap loginmap = new HashMap();
        loginmap.put("kim", "Kim1004");
        loginmap.put("scott", "tiger");
        loginmap.put("lee", "Kim1004");
        
        //회원가입은 처리 끝남 (회원정보)
        //로그인
        //id(O), pwd(O) >> ok
        //id(O), pwd(X) >> 비밀번호 재입력
        //id(X), pwd(O) >>
        //id(X), pwd(O) 
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("id . pwd 입력하세요");
            System.out.println("ID");
            String id = sc.nextLine().trim().toLowerCase();
            
            System.out.println("PWD");
            String pwd = sc.nextLine().trim();
            
            if(!loginmap.containsKey(id)) {
                //id(X)
                System.out.println("id 일치하지 않습니다");  
            }else {
                //id(O)
                if(loginmap.get(id).equals(pwd)) {
                    System.out.println("환영합니다");
                    break;
                }else {
                    System.out.println("비밀번호를 확인해 주십쇼");
                }
            }
        }
        HashMap login = new HashMap();
        login.put("lion", "juda");
        login.put("star", "craft");
        login.put("league", "legend");
        
    }

}
