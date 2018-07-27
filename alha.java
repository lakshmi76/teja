class Ideone
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter character");
		char c = s.next().charAt(0);
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		System.out.println("c=is an alhabet");
		else
		System.out.println("c is not an alphabet");
		
		}
