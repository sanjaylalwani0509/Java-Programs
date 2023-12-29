class Book
{
	int pages;
	String title;
	
	Book(int pages, String title)
	{
		this.pages=pages;
		this.title=title;
	}
}

class thisdemo
{
	public static void main(String[] args)
	{
		Book b1=new Book(500,"AnsiC");
		System.out.println("Pages: "+b1.pages);
		System.out.println("Title: "+b1.title);
	}
}