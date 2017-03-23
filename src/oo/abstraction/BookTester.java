package oo.abstraction;

public class BookTester {

	public static void main(String[] args) {
		Book b1 = new Book("psychology", "繁體中文",1,"被討厭的勇氣");
		Book b2 = new Book("psychology", "繁體中文",1,"情緒勒索");
		Book b3 = new Book("poetry", "繁體中文",1,"女演員");
		
		Book[] books = new Book[3];
		books[0] = new Book("psychology", "繁體中文",1,"被討厭的勇氣");
		books[1] = new Book("psychology", "繁體中文",1,"情緒勒索");
		books[2] = new Book("poetry", "繁體中文",1,"女演員");
		books[0].author = " 岸見一郎";
		books[1].author =" 周慕姿";
		books[2].author = "連俞涵";
		
		int i;
		for(i=0;i<3;i++){
			System.out.println(books[i].title);
			System.out.println("作者: "+books[i].author);
			
		}
		System.out.println(i);
		
	}

}
