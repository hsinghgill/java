package JavaCore.DataStructureStacks;

public interface StackInterface {

 public int size();
 public boolean isEmpty();
 public Object top() throws StackEmptyException;// will return the top objecct
 public Object pop() throws StackEmptyException;
 public void push(Object obj) throws StackOverFlowException;
 
 
}
