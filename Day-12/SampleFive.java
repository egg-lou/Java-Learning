public class SampleFive { // main class
    
    //Java Program to illustrate the jagged array  

    public static void main(String[] args){   // main methods
        
        //declaring a 2D array with odd columns  
        
        int arr[][] = new int[3][];  // array
        arr[0] = new int[3];  // 0
        arr[1] = new int[4];  // 1
        arr[2] = new int[2];  // 2
        
        //initializing a jagged array  
        int count = 0;  // int data type count = 0
        
        for (int i=0; i<arr.length; i++)  // for statment int data type i <arr length i++
            
            for(int j=0; j<arr[i].length; j++)   // nested for int data type j = 0 value j< operator arr length j++ inc
                arr[i][j] = count++;  // arr i & j = count ++ inc
   
        //printing the data of a jagged array   
        
        for (int i=0; i<arr.length; i++){  // for statement int data type i = 0 i<arr length i++ inc
            
            for (int j=0; j<arr[i].length; j++){  // nested for int j 0 value j< operator arr length j++ inc
                System.out.print(arr[i][j]+" ");  // code to be exe arr i&j + value
            }  
            System.out.println();//new line  // code to be exe
        }  
    }  
}