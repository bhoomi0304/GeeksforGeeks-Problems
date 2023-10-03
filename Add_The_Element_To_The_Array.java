
import java.util.*;
public class Main
{
    public static int[] array(int []arr,int key,int item){
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(int i:arr){
            arr1.add(i);
        }
        arr1.add(key,item);
        int []result=new int[arr1.size()];
        for(int i=0;i<arr1.size();i++){
            result[i]=arr1.get(i);
            
        }
        return result;
        
    }
	public static void main(String[] args) {
		int n=5;
		int []arr=new int[n];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int item=sc.nextInt();
		arr=array(arr,k,item);
		for(int i:arr){
		    System.out.println(arr[i]);
		}
	}
}
