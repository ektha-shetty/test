package com.example.demo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TesterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and mor";
		String [] sampleArray=sample.split(" ");
		Map<String,Word> wordMap=new LinkedHashMap<>();
		for(String word:sampleArray) {
			if(!wordMap.containsKey(word)){
				int count=countOccurrences(sample,word);
				int points=calculateWordPoint(word);
				wordMap.put(word,new Word(count,points));
			}
		}
		List<String> wordList =new ArrayList<>();
		for (String name : wordMap.keySet())
        {
             int points = wordMap.get(name).getPoints();
             int count = wordMap.get(name).getOccurances();
             int finalPoints=points*count;
             if(finalPoints>10) {
            	 wordList.add(name);
             }
        }
		for(String word:wordList) {
			System.out.println(word);
		}
	}

	private static int calculateWordPoint(String word) {
		int points=0;
		for (int i=0 ; i<word.length();i++) {
			if(Character.isLowerCase(word.charAt(i))) {
				points=points+1;
			}
			else if(Character.isDigit(word.charAt(i))){
				points=points + 3;
			}
			else if (Character.isUpperCase(word.charAt(i))) {
				points=points+2;
			}
			else 
				points=points+4;
		}
		return points;
		// TODO Auto-generated method stub
		
	}
	private static int countOccurrences(String str, String word) 
	{
	    String words[] = str.split(" ");
	    int count = 0;
	    for (int i = 0; i < words.length; i++) 
		    {
		    if (word.equals(words[i]))
		        count++;
		    }
	    return count;
	}
}
