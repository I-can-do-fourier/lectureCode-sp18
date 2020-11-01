public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		
		public IntList s=this;
	        int ss=0;
		
         while(1){
		 
		int ss=ss+1;
		if(this.rest!=null){
		        
		       
		       s=s.rest;    
		
		
		
		}
		
		 else{break;}
		 return ss;
	 }
		
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		return 0;
	}

	/** Returns the ith value in this list.*/
	public int get(int i) {
		return 0;
	}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println(L.iterativeSize());
	}
} 
