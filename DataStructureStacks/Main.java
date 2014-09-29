package JavaCore.DataStructureStacks;


	import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

	public class Main implements Runnable {

	    private String fileName;

	    public Main (String fileName) {
	        this.fileName = fileName;
	    }

	    @Override
	    public void run() {
	        try {
	            processFile();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private void processFile() throws IOException {
	        BufferedReader br = new BufferedReader(
	                new FileReader(fileName));
	        String line = "";
	        while ((line = br.readLine()) != null) {
	            processLine(line);
	        }
	        br.close();
	    }

	    private void processLine(String line) {
	        System.out.println(line);
	    }

	    public static void main(String[] args) {
	        new Main(args[0]).run();
	    }
	    public static String evaluateInfix(String exps){
	         
	        /**remove if any spaces from the expression**/
	        exps = exps.replaceAll("\\s+", "");
	        /**we assume that the expression is in valid format**/
	        GenericStacks<String> stack = new GenericStacks<String>(exps.length());
	        /**break the expression into tokens**/
	        StringTokenizer tokens = new StringTokenizer(exps, "{}()*/+-", true);
	        while(tokens.hasMoreTokens()){
	            String tkn = tokens.nextToken();
	            /**read each token and take action**/
	            if(tkn.equals("(") 
	                    || tkn.equals("{")
	                    || tkn.matches("[0-9]+") 
	                    || tkn.equals("*")
	                    || tkn.equals("/")
	                    || tkn.equals("+")
	                    || tkn.equals("-")){
	                /**push token to the stack**/
	                stack.push(tkn);
	            } else if(tkn.equals("}") || tkn.equals(")")){
	                try {
	                    int op2 = Integer.parseInt(stack.pop()); 
	                    String oprnd = stack.pop();
	                    int op1 = Integer.parseInt(stack.pop());
	                    /**Below pop removes either } or ) from stack**/
	                    if(!stack.isEmpty()){
	                        stack.pop();
	                    }
	                    int result = 0;
	                    if(oprnd.equals("*")){
	                        result = op1*op2;
	                    } else if(oprnd.equals("/")){
	                        result = op1/op2;
	                    } else if(oprnd.equals("+")){
	                        result = op1+op2;
	                    } else if(oprnd.equals("-")){
	                        result = op1-op2;
	                    }
	                    /**push the result to the stack**/
	                    stack.push(result+"");
	                } catch (Exception e) {
	                    e.printStackTrace();
	                    break;
	                }
	            }
	        }
	        String finalResult = "";
	        try {
	            finalResult = stack.pop();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return finalResult;
	    }

	}
 