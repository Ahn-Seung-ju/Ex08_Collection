package kr.or.bit;

import java.util.Arrays;

//Stack 자료구조 설계
//저장 공간: Array : Object[] sarray
//MyStack my = new MyStack(); 기본적으로 배열 생성 //크기를 설정 가능
//위치정보: 저장되는 값이 있는 위치 정보(position, index)
//기능: push(Object) , Object pop , isEmpty , isFull

public class MyStack {
    private Object[] sarray;
    private int index;

    public MyStack() {
        sarray = new Object[10];
    }

    @Override
    public String toString() {
        return "MyStack [sarray=" + Arrays.toString(sarray) + ", index=" + index + "]";
    }

    public void push(Object obj) {
        for (int i = index; i < sarray.length; i++) {
            if (sarray[i] == null) {
                sarray[i] = obj;
                index++;
                break;
            } else if (sarray[i] != null) {
                return;
            }
        }
    }

    public void pop() {
        for (int i = index - 1; i < sarray.length; i--) {
            if (index < 0) {
                return;
            } else if (sarray[i] != null) {
                sarray[i] = null;
                index--;
                break;
            }
        }
    }

}
