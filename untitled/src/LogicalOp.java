public class LogicalOp {
    //1
    public void afisare2() {
        int[] arr;
        int i;
        arr = new int[100];
        for (i = 1; i < 100; i++) {
            arr[i]=i+1;
            System.out.println(arr[i]);
        }
    }
    //3
    public void afisare3(int[] arr) {
        int i;
        for (i = 1; i <=100; i++) {
            if(i%2==0)
            { arr[i/2-1]=i;
                System.out.println(arr[i/2-1]);}
        }
    }
    //4
    public float afisare4(int[] arr1){
        int i;
        float sum=0;
        for(i=0; i< arr1.length;i++)
        {
            sum=sum+arr1[i];
        }
        return (float) sum/arr1.length;
    }
    //5
    public boolean afisare5(String[] arr2, String s) {
        int i;
        for (i = 0; i < arr2.length; i++)
        {
            if (arr2[i].equals(s)) return true;

        }
        return false;
    }
    //6
    public void afisare6(){
        int i, j;
        for(i=0; i<9; i++) {
            for(j=0;j<9;j++)
                System.out.print("-");
            System.out.println("");
        }
    }
    //9
    public int returnare9(int array[]){
        int i, aux=0;
        for(i=0;i<array.length;i++)
        { for(int j=i+1;j<array.length;j++)
        {
            if (array[i]>array[j]) {
                aux = array[i];
                array[i] = array[j];
                array[j + 1] = aux;
            }
        }}
        return array[1];
    }
    //10
    public void afisare10(int array[], int updatedArr[]) {
        int i;

        for(i=0; i< array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println("\nThe new array is: ");
        for(i=0; i<updatedArr.length; i++)
        { updatedArr[i]=array[i];
            System.out.print(updatedArr[i] + " ");
        }
    }

}
