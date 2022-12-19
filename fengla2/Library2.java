package fengla2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



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

		Map<String,ArrayList<Object>> libraryMap = booksClassification(bookList);

	}

	private static Map<String, ArrayList<Object>> booksClassification(ArrayList<Book> bookList) {

		Map<String, ArrayList<Object>> map = new HashMap<>();
		for(Book book : bookList) {
			if(map.containsKey(book.getCategory())) {
				ArrayList<Object>books = 
						map.get(book.getCategory());

				books.add(book);

			}else {
				ArrayList<Object>addBooks = 
						new ArrayList<Object>();		
				addBooks.add(book);

				map.put(book.getCategory(),addBooks);

			}
		}
		System.out.println("");
		System.out.println("追加後");

		System.out.println("");

		for(Entry<String, ArrayList<Object>> entry : map.entrySet()){
			System.out.println(entry.getKey());
			for(Object author:entry.getValue())
				System.out.println("  "+ author);
		}
		return map;
	}	

	//　出力パターン　1
	/*		System.out.println("case 1");
		System.out.println("");

		map.forEach((key, val) -> {
		System.out.println(key );
		System.out.println(  val );
		System.out.println("");

		});  
		System.out.println("");

		//　出力パターン　2
		System.out.println("case 2");
		System.out.println("");

		for(Entry<String, ArrayList<String>> entry : map.entrySet()){
			System.out.println(entry.getKey());
			for(String author:entry.getValue())
			System.out.println("  "+ author);
		}
		System.out.println("");

		//　出力パターン　3
		System.out.println("case ");
		System.out.println("");

		for (String key : map.keySet()) {
			System.out.println(key);
			for (ArrayList<String> val : map.values()) {
				System.out.println(val);
			}
		}


		return map;
	}	
	 */
}