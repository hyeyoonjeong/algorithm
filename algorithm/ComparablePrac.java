package algorithm;

import java.util.Arrays;

public class ComparablePrac {
	public static void main(String args[]){
		int[] testArr = new int[]{3, 24, 253, 535464, 64};
		Student[] stdArr = new Student[5];
		for(int i =0; i<5;i++){
			Student s = new Student("user"+i,17+i,60-i);
			stdArr[i] = s;
		}
		
		Arrays.sort(testArr);
		for(int a:testArr)
			System.out.println(a);
		
		Arrays.sort(stdArr); 
		for(Student s:stdArr)
			System.out.println(s.toString());
	}
}
class Student implements Comparable<Student>{
	String name;
	int age;
	int score;
	@Override
	public int compareTo(Student o){
		if(score>o.score) return 1; //점수순으로 정렬
		return -1;
	}
	public Student(String name, int age, int score){
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String toString(){
		return "이름: " + name + " 나이: " + age + " 점수: " + score;
	}
}

//백준 알고리즘 2751 문제
//import java.io.*;
//import java.util.Arrays;
//public class Main{
//     public static void main(String args[]) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++)
//            arr[i]=Integer.parseInt(br.readLine());
//        Arrays.sort(arr);
//        for(int a:arr)
//            bw.write(a+"\n");
//        bw.close();
//    }
//}