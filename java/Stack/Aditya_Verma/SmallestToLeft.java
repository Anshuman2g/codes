package Aditya_Verma;
import java.util.*;
public class SmallestToLeft {
    // public static void main(String[] args) {
    //     int[]arr={4,5,2,10,8};
    //     int[]res=new int[arr.length];
    //     res[0]=-1;
    //     for(int i=1;i<arr.length;i++){
    //     for(int j=i-1;j>=0;j--){
    //         if(arr[j]<arr[i]){
    //             res[i]=arr[j];                     //BRUTE FORCE
    //             break;
    //         }
    //         else{
    //             res[i]=-1;
    //         }
    //     }
    //     }
    //     for(int i=0;i<res.length;i++){
    //         System.out.println(res[i]);
    //     }
    // }
    public static void main(String[] args) {
        int[]arr={4,5,2,10,8};
        ArrayList<Integer>ls = new ArrayList<>();
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.size() == 0){
                ls.add(-1);
            }
           else if(st.peek()<arr[i]){
                ls.add(st.peek());
            }
            else if( st.peek()>=arr[i]){
                while(st.size() >0 && st.peek()>=arr[i]){
                    st.pop();
                }
                if(st.size() == 0){
                    ls.add(-1);
                }
                else {
                    ls.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
        System.out.println(ls);
    }
}
