package com.towerHonai;

public class TowerHonai {

	public static void main(String[] args) {
		char s='S';
		char d='D';
		char t='T';
		int n=4;
		
		hanoi(n,s,t,d);

	}

	private static void hanoi(int n, char src, char temp, char dest) {
	
		if (n == 1) 
        { 
            System.out.println("Move disk 1 from rod " +  src + " to rod " + dest); 
            return; 
        } 
        hanoi(n-1, src, temp, dest); 
        System.out.println("Move disk " + n + " from rod " +  src + " to rod " + dest); 
        hanoi(n-1, temp, dest, src);
		
	}

}
