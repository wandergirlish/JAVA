package com.class2.demo;

import java.util.*;

public class Dome1 {
	/*	
	 *1.买牌
	 *2.洗牌
	 * 3.发牌
	 * 4.看牌
	 * */
	public static void main(String [] args)
	{
		// 1.1 定义双列集合
		Map<Integer ,String> poker =new HashMap<>();
		//1.2 定义单列集合 存储所有牌的编号
		List<Integer> list =new ArrayList<>();
		//1.3 普通牌
		String [] colors ={"♠","♥","♣","♦"};
		String [] numbers ={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		int num = 1;
		for (String number: numbers)
		{
			for (String color:colors)
			{
				String pokers=color+number;
				poker.put(num,pokers);
				list.add(num);
				num++;
			}
			System.out.println();
		}
		poker.put(num,"小王");
		list.add(num++);
		poker.put(num,"大王");
		list.add(num);
		System.out.println("所有牌"+poker);
		System.out.println("牌的编号"+list);
		//2.洗牌
		Collections.shuffle(list);
		System.out.println("===============");
		System.out.println(list);
		//3.发牌
		List <Integer> saber =new ArrayList<>();
		List <Integer> Yukka =new ArrayList<>();
		List <Integer> hinna =new ArrayList<>();
		List <Integer> save=new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			Integer pokerNum =list.get(i);
			if(i>=list.size() -3)
			{
				save.add(pokerNum);
			}
			else if (i %3 ==0) {
				saber.add(pokerNum);
			}
			else if (i%3==1) {
				Yukka.add(i);
			}
			else if (i%3==2) {
				hinna.add(pokerNum);
			}
		}
		System.out.println("saber:"+printpoker(saber,poker));
		System.out.println("Yuuka:"+printpoker(Yukka,poker));
		System.out.println("hina:"+printpoker(hinna,poker));
		System.out.println("save:"+printpoker(save,poker));
		//查看具体的牌
		System.out.println("========================");
	}
	public static String printpoker(List<Integer> numbers,Map<Integer,String> pokers){

		Collections.sort(numbers);
		StringBuilder s1 =new StringBuilder();
		for (Integer num:numbers)
		{
			String poker =pokers.get(num);
			s1.append(poker+" ");
		}
		String str = s1.toString();
		return str.trim();
	}
}
