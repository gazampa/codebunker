import patterns.iterator.*;
public class MainClient{
	
	public static void main(String[] args){
		System.out.println("Im Here");
		IContainer books = new BooksCollection();
		IIterator iter = books.createIterator();
		while(iter.hasNext()){System.out.println(iter.next());};
	}
}
