import java.io.*; // for file IO
public class l2
	{
		public static void main(String[] args)
		 {
			
	BufferedReader descriptor = null; 
	String line = null; 
	String [] details = new String[3]; 
	String line;
/*
	try { 
	    descriptor = new BufferedReader(
			    new FileReader("input.txt"));

	    for(int i=0; i < details.length; i++) // assume file has 61 lines 
		details[i] = descriptor.readLine(); 

	    descriptor.close(); 

	} 	
	
*/

	try { 

			br = Files.newBufferedReader(Paths.get("input.txt"));

			while(br.readLine() ! = null)
				{
					line = br.readLine().strip();
					System.out.println(line);
				}





		}





	catch(IOException e) 
		{ 
	    // IOException is more generic (FileNotFound is a type of a 
	    // IOException, so catching only that is sufficient 
	    System.out.println("Bad things happen, what do you do!" + e);
	    return; 
		}

	


	// we will run only if no exceptions were thrown 
	//for(int i=0; i < details.length; i++) 
	   // System.out.println(details[i]); 
/*	String array1[] = new String[3];

	String info[][] = new String[6][3];
	
	

for(int i = 0; i<details.length ;i++)
	{
	array1 = details[i].split(",");	
	for (int j = 0;j < 3; j++)
		{
	      info[i][j] = array1[j];
		}
	}

	for(int i = 0; i<details.length ;i++)
	{
	//array1 = details[i].split(",");	
	for (int j = 0;j < 3; j++)
		{
	      //info[i][j] = array1[j];
			System.out.print(info[i][j] + " ");
		}
		System.out.println();
	}

 double d = Double.parseDouble(info[2][2]);
System.out.print(d + " ");

   /*for(int i =0; i < 6; i++ )
   		{
	 array1[] = details[i].split(",");
   		
	for (String temp: array1)
		{
	      System.out.println(temp);
		}
		}
*/

    }

}
		 

