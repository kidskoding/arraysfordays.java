public class Konidala_ArraysForDays
{
	public static void main(String[] args) {
		int[] myNumArr = new int[100];
		for (int i = 0; i < myNumArr.length; i++) {
		    myNumArr[i] = i + 1;
		System.out.print(myNumArr[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < myNumArr.length; i++) {
		    if(myNumArr[i] % 2 == 0) {
		        System.out.print(myNumArr[i]);
		    }
		}
		System.out.println();
		
		for (int x = 0; x < myNumArr.length; x++) {
		    if(myNumArr[x] % 5 == 0) {
		        System.out.print(myNumArr[x]);
		    }
		}
		
		System.out.println();
		
		for (int i = myNumArr.length-1; i >= 0; i--) {
		    System.out.print(myNumArr[i]);
		}
		
		System.out.println();
		
		for(int i = 2; i < myNumArr.length; i++) {
        boolean ifPrime = true;
        for (int j = 2; j < i; j++) {
            if(i % j == 0) {
                ifPrime = false;
                break;
            }
        }
        if(ifPrime)

            System.out.print(i);
            
        }
    }
}   
