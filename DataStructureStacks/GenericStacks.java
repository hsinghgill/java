package JavaCore.DataStructureStacks;

public class GenericStacks<T extends Object> implements StackInterface {

	
	public static final int ARRAY_DEFAULT_CAPACITY=1024;// default capacity of the array
	private int capacity;  // variable to set the capacity 
	private int top ;// default top of the stack
	private T[] s;// stack to hold the objects
	public GenericStacks()
	{
		this(ARRAY_DEFAULT_CAPACITY);
		this.top=-1;
	}
	public GenericStacks(int capacity)
	{
		this.capacity=capacity;
		this.s=(T[]) new Object[capacity];
		this.top=-1;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return top+1;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top<0);
	}
	@Override
	public Object top() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new StackEmptyException ("satckunderflow");
		return s[top];
	}
	@Override
	public T pop() throws StackEmptyException {
		// TODO Auto-generated method stub
		T temp;
		if(isEmpty())
			throw new StackEmptyException ("satckunderflow");
		
		temp=s[top];
		top=top--;
		return temp;
		
	}
	@Override
	public void push(Object obj) throws StackOverFlowException {
		// TODO Auto-generated method stub
		if(top==(s.length)-1)
		{
			increaseSize();
		}
			{//throw new StackOverFlowException("satckoverflow");
		s[++top]=(T) obj;}
		}
	public String toString()
	{
		String str;
		str="[";
		if(size()>0)
		{
			str=str+s[0];
		}
		if(size()>1)
		{
			for(int i=1;i<size()-1;i++)
			{
				str=str+ "," +s[i];
			}
		}
		return s+ "]";
	}
private  void increaseSize()
	{
		Object[] newStack= new Object[s.length*2];
		for(int i=0;i<s.length;i++)
		{
			newStack[i]=s[i];
		}
		s=(T[]) newStack;
}
}
