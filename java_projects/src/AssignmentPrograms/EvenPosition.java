package AssignmentPrograms;

public class EvenPosition {

	public static void main(String[] args) {
   //Write a java program to print Even Position Elements &Even Positions in an array
            int array [] = {2, 3, 6, 7, 8};
            for(int i=0;i<array.length;i++) {
            	if(i%2==0) {
            	System.out.println(array[i]);
            	}
            }
	}

}
