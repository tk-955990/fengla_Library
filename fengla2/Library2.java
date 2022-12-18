package fengla2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Library2 {
	public static void main(String args[]) {
		Book[] books = {
				new Book("410", "数学入門", "山田悟", 1980), 
				new Book("420", "初歩からの物理学", "佐藤貴明", 2480), 
				new Book("430", "化学総論", "斉藤ひかる",3480),
				new Book("410", "確率論", "横澤隆",3980), 
				new Book("420", "相対性理論入門", "高瀬美和",980), 
				new Book("440", "ブラックホールの秘密","百瀬仁",1280) 
		};

		ArrayList<Book> bookList = new ArrayList<Book>();
		for(int i=0;i<books.length;i++) {
			bookList.add(books[i]);        
		}
		for(Book str: bookList) {
			System.out.println("arraylist");  
			System.out.println(str);
		}	
		
//		Map<String,ArrayList<String>> libraryMap = sortByCategory(bookList);
	
		
	}
	
	private static  Map<String,ArrayList<String,String,Integer>> sortByCategory(ArrayList<Book> bookList) {
		Map<String, ArrayList<String,String,Integer>> map = new HashMap<>();
		for(Book book : bookList) {
			if(map.containsKey(book.getCategory())) {
				ArrayList<String,String,Integer>names = 
						map.get(book.getCategory());

				names.add(book.getPersonName());

			}else {
				ArrayList<String>addName = 
						new ArrayList<String>();		
				addName.add(book.getPersonName());

				map.put(book.getBookTitle(),addName);

			}
		}
		
		
		
		
		
		
		
		return map;
		
	}
}
