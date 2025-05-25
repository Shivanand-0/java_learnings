class Code{
 // Printing number in decrinsing order
    public static void decNum(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n);
        decNum(n-1);
    }
// Printing number in increasing order
    public static void incNum(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        incNum(n-1);
        System.out.print(n);
    }
// calculating factorial of a number
    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n * factorial(n-1);
    }

// calculating sum of n number
    public int sumOfNum(int n){
        if(n<=0) return 0;
        if(n==1) return 1;
        return n+sumOfNum(n-1);
    }
// calculating fabonachi series for n terms(here 0:0th term,1:first term and so on)
    public static int fabo1(int n){
        if(n<=0) return 0;
        if(n==1) return 1+fabo1(n-1); 
        return fabo1(n-1)+fabo1(n-2);
    }
// calculating fabonachi series till number less then n;
    public static void  fabo2(int n){
        for(int i=0;i<n;i++){
            int num=fabo1(i);
            if(num<=n){
                System.out.print(num+" ");
            }else{
                return;
            }
        }
    }

    // sorted array status
    public static void sortStatus(int[] array,int size){
        if(size==0)System.out.println("sorted");
        else{
            if(array[size]<array[size-1]){
                System.out.println("unsorted");
            }else{
                sortStatus(array,size-1);
            }
        }

    }

    // first occurance of a  number
    public static int firstOccur(int target, int[] array, int i){
        if(i>=array.length) return -1;
        if(array[i]==target){
            return i;
        }
        return firstOccur(target,array,i+1);      
    }
     public static int lastOccur(int target, int[] array, int size){
        if(size<0) return -1;
        if(array[size]==target){
            return size;
        }
        return lastOccur(target,array,size-1);      
    }

    public static void main(String Args[]){
        // incNum(10);
        // System.out.println();
        // decNum(10);
        // System.out.println(factorial(0));
        // Code  c=new Code();    // if function is non static then access method via object of class.
        // System.out.println(c.sumOfNum(5));
        // System.out.println(fabo1(7));
        // fabo2(8);
        int[] arr={1,2,3,5,6};
        // sortStatus(arr,arr.length-1);
        // System.out.println(firstOccur(3,arr,0));
        System.out.println(lastOccur(3,arr,arr.length-1));

    }
 
}