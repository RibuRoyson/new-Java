
public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int y=0;y<=8;y++)
	    {
	        if(y==0||y==8)
	        {
	            System.out.print( "******************\n" );
	            if(y==8)
	            {
	              
	                break;
	            }
	        }

	     
	        for(int x=0;x<=17;x++)
	        {
	            if(x==0||x==17)
	            {
	                System.out.print( "*" );
	                if(x==17)
	                {
	                	System.out.println();
	                }
	            }
	            else
	            {
	                System.out.print( " " );
	            }
	        }

	    }
											}

	

}
