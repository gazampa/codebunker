package patterns.iterator;
public class BooksCollection implements IContainer{

	private String m_titles[] = {"Design Patterns","1","2","3","4"};

	public IIterator createIterator(){
		return new BookIterator();	
	}

	private class BookIterator implements IIterator{
		private int m_position=0;

		public boolean hasNext(){
			if (m_position < m_titles.length)
				return true;
			return false;
		}

		public Object next(){
			if(this.hasNext())
				return m_titles[m_position++];
			return null;
		}
	}
}
