import java.util.ArrayList;

public class Assignment
{
    static void getSquared(ArrayList<Integer> original)
    {
        System.out.print("(");
        for(int i=0;i<original.size();i++)
        {
            System.out.print(original.get(i)*original.get(i));
            if(i < original.size() - 1)
                System.out.print(",");
        }
        System.out.print(")\n");
    }
    
    
    static void getDivisibleByThree(ArrayList<Integer> original)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0;i < original.size();i++)
            if(original.get(i) % 3 == 0)
                result.add(original.get(i));
              
        System.out.print("(");
        for(int i = 0; i < result.size(); i++)
        {
            System.out.print(result.get(i));
            if(i < result.size() - 1)
                System.out.print(",");
        }
        System.out.print(")\n");
    }
    
    static void getSumAdjacent(ArrayList<Integer> original)
    {
        System.out.print("(");
        for(int i = 0; i < original.size() - 1; i++)
        {
            
            if(i==0)
                System.out.print(original.get(i) + original.get(i+1));
            else
                System.out.print(original.get(i-1) + original.get(i) + original.get(i+1));
            
            /*
            Currently the code is as per the expected output. As per the explaination of the problem and 
            the expected output, we are allowing the addition of the first 2 numbers of the ArrayList even though
            index 0 number has only 1 adjacent number but same is not allowed for the last number of the ArrayList.
            
            We could add a small update here to add only the last two numbers in original ArrayList using the 
            following code instead of the if else condition mentioned above with the loop running till end of the ArrayList.
            
            if(i==0)
                System.out.print(original.get(i) + original.get(i+1));
            else if(i > 0 && i < original.size() - 1)
                System.out.print(original.get(i-1) + original.get(i) + original.get(i+1));
            else
                System.out.print(original.get(i-1) + original.get(i));
            */
            
            if(i < original.size() - 2)
                System.out.print(",");
        }
        System.out.print(")\n");        
    }
    
	public static void main(String[] args) {
		
		ArrayList<Integer> original=new ArrayList<Integer>();
		original.add(3);
		original.add(6);
		original.add(7);
		original.add(8);
		original.add(9);
		original.add(12);
		original.add(15);
		original.add(17);
		original.add(359);
		
		/*
		Implement a solution to square each integer in the collection named ORIGINAL and output to
        the console a comma separated list of the processed values.
        Expected output: (9,36,49,64,81,144,225,289,128881)
		*/
		System.out.println("Square of the numbers:");
		getSquared(original);
		
		/*
		Implement a solution to obtain only the numbers in the collection named ORIGINAL that
        divisible by 3 and output to the console a comma separated list of the values.
        Expected output: (3,6,9,12,15)
		*/
		System.out.println("Numbers divisible by 3:");
		getDivisibleByThree(original);
		
		
		/*
		Implement a solution to sum the adjacent integers in the collection named ORIGINAL and output
        to the console a comma separated list of the values.
        Expected output: (9,16,21,24,29,36,44,391)
		*/
		System.out.println("Sum of adjacent numbers:");
		getSumAdjacent(original);
	}
}
