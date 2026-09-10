import java.util.Scanner;

public class basics {
    public static int add(int a,int b){
        int c = 0;
        if(a>b){
             c = a-b;
        }                          // "static int add"  this is a method which is also a template for adding or subtracting two variables
        else{
             c = a+b;
        }
        return c;
    }

    static void change(int x){
        x = 01;
    }

    static int add(int ... arr){
        int sum = 0;
        for(int res : arr){               // by using this method, we dont need to create a sep int for every number all numbers can be added at once
            sum += res;                   // this also comes under method over riding because two methods with different parameters are used
        }
        return sum;
    }

    static int facto(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else{
            return n*facto(n-1);
        }
    }

    static int fibo(int n){
        if (n <= 1) {
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }

    static int fibo2(int n){
        if(n == 1){
            return 0;
        } else if (n == 2) {
            return 1;
        }else {
            return fibo2(n-1)+fibo2(n-2);
        }
    }

    static int avg(int ... arr){
        int sum = 0;
        int avg = 0;
        for(int res : arr){               // by using this method, we dont need to create a sep int for every number all numbers can be added at once
            sum += res;                   // this also comes under method over riding because two methods with different parameters are used
        }
        return sum / arr.length;
    }

    static int sumnatural(int n){
        if(n == 1){
            return 1;
        }
        return n+sumnatural(n-1);
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int f = 5;
        int facto = 1;
        for (int i = 1; i <= f; i++) {
            facto = facto * i;
        }
        System.out.println(facto);

        int n = 1;
        for (int i = 4; i >= n; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int t = 8;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
           // System.out.println(t * i);
            sum += t * i;
        }
        System.out.println(sum);

        int x = 5;
        int y = 2;
        int z = add(x, y);          // this is the point where the method is used..
        System.out.println(z);

        int [] marks = {2,6,9,4};
        System.out.println(marks [0]);
        marks [0] = 8;
        change(marks[0]);
        System.out.println(marks [0]);
        for (int ty : marks){
            System.out.print(ty+" ");      // code to print an array
        }

        System.out.println("\nThe sum of 2,3,5,7 is "+ add(2,3,5,7));

        int fa = 7;
        System.out.println("The factorial of 7 is :" + facto(6));

        int fibonacci = 10;
        System.out.println("The first 10 fibonacci series are :");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibo(i)+" ");
        }
        System.out.println();

        int p = 0;
        for (int i = 5; i >= p; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("^");
            }
            System.out.println();
        }

        // Recursion code to find a specific n*th number in the fibonacci series..........
        System.out.println(fibo2(10));

        System.out.println("The average of the numbers 4,4,4,4 is : " + avg(4,4,4,4));

        System.out.println(sumnatural(5));

        // TO PRINT THE SUM OF FIRST n NATURAL NUMBERS.
        /* int sumit = 0;
        for (int i = sc.nextInt(); i > 0; i--) {
            sumit += i;
        }
        System.out.println(sumit);
         */

        // PRINTING A 2-D ARRAY......
        int [][] array = {{1,2,3},{4,5,6}};
        for(int [] abc : array){
            for (int iop : abc){
                System.out.print(iop + " ");
            }
            System.out.println();
        }

        // USING FOR LOOP...
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array [i][j] + " ");
            }
            System.out.println();
        }

        // to check whether a number is present in the array..
        int [] num = {55,33,6,9,1,48};
        boolean isPresent = false;
        int nim = 55 ; // this is the element which we have to check.
        for (int ele : num){
            if (nim == ele){
                isPresent = true;
            }
        }
        if (isPresent == true) {
            System.out.println("PRESENT ");
        }
        else {
            System.out.println("NOT PRESENT");
        }

        int [][] mat1 = {{1,1,1},{1,1,1}};
        int [][] mat2 = {{1,1,1},{1,1,1}};
        int [][] result = {{0,0,0},{0,0,0}};
        System.out.println("The result of one and two matrices is :");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                //System.out.print(mat1[i][j]+" ");
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
      /*
      System.out.println("\n matrix two is :");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }
       */
        int [] iop = {1,5,9,7,5,3};
        for (int i = iop.length-1; i >= 0; i--) {
            System.out.print(iop[i] + " ");
        }
        System.out.println();
        int [] iop2 = {1,5,9,7,5,3};
        int l = iop2.length;
        int div = Math.floorDiv(l,2);
        int temp;
        for (int i = 0; i < div; i++) {
            temp = iop2[i];
            iop2[i] = iop2[l-1-i];
            iop2[l-1-i] = temp;
        }
        for (int rev : iop2){
            System.out.print(rev+" ");
        }

        System.out.println();

        int [] ty = {4,8,6,2,96,17,3,5};
        int max = 0;
        int min = ty[0];
        for (int e : ty){
            if (e>max){
                max = e;
            }
        }
        System.out.println("The maximum element is : "+max);

        for (int i = 0; i < ty.length; i++) {
            if (ty[i]<min){
                min = ty[i];
            }
        }
        System.out.println("The minimum element is : "+min);

        // TO CHECK WHETHER ARRAY IS SORTED

        boolean isSorted = true;
        int [] arr = {1,4,6,2,7};
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted == true){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }

        // JAVA CODE TO SORT AN ARRAY.....

        int [] qwe = {1,5,9,4,26};
        int too;
        System.out.println("The given array is : 1 5 9 4 26");
        for (int i = 0; i < qwe.length-1; i++) {
            for (int j = i+1; j < qwe.length; j++) {
                if (qwe[i]>qwe[j]){
                    too = qwe[i];
                    qwe[i] = qwe[j];
                    qwe[j] = too;
                }
            }
        }
        System.out.println("The sorted array is : ");
        for (int j = 0; j < qwe.length; j++) {
            System.out.print(qwe[j] + " ");
        }

        constructors human = new constructors("Omer",19);
        System.out.println(human.name+" "+ human.age);
    }
}