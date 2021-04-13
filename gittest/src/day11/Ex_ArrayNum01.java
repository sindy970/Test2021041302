package day11;

import java.util.Scanner;

public class Ex_ArrayNum01 {

	public static void main(String[] args) {
		//3개의 숫자를 곱한 값의 각각의 숫자들의 갯수 구하는 프로그램
		Scanner sc = new Scanner(System.in);
        int a, b, c, sum=0 , val=0, mod=0;
        int[] number = new int[10];
        boolean run = true;
        
        System.out.print("a 숫자 입력 : ");
        a = sc.nextInt();
        System.out.print("b 숫자 입력 : ");
        b = sc.nextInt();
        System.out.print("c 숫자 입력 : ");
        c = sc.nextInt();
        
        sum = a * b * c;
        System.out.println(sum);
        val = sum;
        mod = sum;
        
        while(run){
            mod = val%10;
            for(int j=0; j<number.length; j++){
                if(j == mod){
                    number[j]++;
                }
            }
            val = val/10;
            if(val == 0) {
            	run = false;
            }
        }
        
        System.out.println(number[0]);
        
        for(int i=1; i<number.length; i++){
            System.out.println(number[i]);
        }

	}

}
