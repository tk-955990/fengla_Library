package fengla2;

import java.nio.charset.Charset;

public class Book {
	private String category; // カテゴリー
	private String title; // 書名
	private String author; // 著者
	private int price; // 価格

	public Book(String category, String title, String author, int price) {
	super();
	this.category = category;
	this.author = author;
	this.title = title;
	this.price = price;
	}

	public String getCategory() {
	return category;
	}

	public String getAuthor() {
	return author;
	}

	public String getTitle() {
	return title;
	}

	public int getPrice() {
	return price;
	}

	public String toString() {
		return "カテゴリー: " + format(this.category, 5) + "著者: " + format(this.author, 13) 
	
		+ "タイトル:『 " + format(this.title+" 』", 24) +"価格: " + this.price + "円";
	}
	
	private String format(String target, int length) {
		int byteDiff = (getByteLength(target, Charset.forName("UTF-8")) - target.length()) / 2;
		return String.format("%-" + (length - byteDiff) + "s", target);
	}
	
	private int getByteLength(String string, Charset charset) {
		return string.getBytes(charset).length;
	}
	
	/*
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("カテゴリー：" + format(category,8));
		sb.append("著者：" + format(author,13));
		sb.append("タイトル：" + format("『" + title + "』",40));
		sb.append(String.format("価格：%6d円",price));
		return sb.toString();
		}

		    private static String format(String target, int length){
		        int byteDiff = (getByteLength(target, Charset.forName("UTF-8"))-target.length())/2;
		        return String.format("%-"+(length-byteDiff)+"s", target);
		    }
		    
		    private static int getByteLength(String string, Charset charset) {
		        return string.getBytes(charset).length;
		    }
	 */
	
	
}