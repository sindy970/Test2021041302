package day11;

import java.util.Scanner;

public class Ex_ArrayNum02 {

	public static void main(String[] args) {
		//42로 나눈 나머지 값의 서로 다른 숫자 갯수 세는 프로그램
		Scanner sc = new Scanner(System.in);
        int [] mod = new int[10];
        int value = 0, count=0;
        
        for(int i=0; i<mod.length; i++){
        	System.out.print("숫자를 입력하시오 : ");
            value = sc.nextInt();
            mod[i] = value%42;
        }
        for(int i=0; i<mod.length; i++){
        	for(int j=i+1; j<mod.length; j++) {
        		if(mod[i] == mod[j]){
        			mod[j] = 0;
            	}
        	}
        	if(mod[i] != 0 ) {
        		count++;
        	}
        }
        if(count<10) {
        	count++;
        }
        for(int i=0; i<mod.length; i++) {
        	System.out.print(mod[i]);
        }
        System.out.println(count);

	}

}
