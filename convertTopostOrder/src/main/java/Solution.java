import java.util.ArrayList;
import java.util.Arrays;

 public class Solution {

     // kendisine gelen elemanı, yine kendisine gelen j uzunluğunda array içinde bulan fonksiyon
     static int findVariable(ArrayList<Integer> inOrder, int k, int j)
     {
         for (int i = 0; i < j; i++)
             if (inOrder.get(i) == k)
                 return i;
         return -1;
     }

     // PostOrder traversal'i bulmak için yazılmış metodtur.
     // Recursive bir yapıya sahip olması nedeniyle ayrıca ihtiyaç duyulmuştur.
     private static ArrayList<Integer>  findPostOrder(ArrayList<Integer> inOrder, ArrayList<Integer> preOrder, int k, ArrayList<Integer> postOrder)
     {
         int root = findVariable(inOrder, preOrder.get(0), k);

         // eğer left subTree boş değilse, left subTree'yi yazdır
         if (root != 0){
             ArrayList<Integer> newLeft = new ArrayList<Integer>(preOrder.subList(1,k));
             findPostOrder(inOrder, newLeft, root, postOrder);
         }

         // eğer right subTree boş değilse, right subTree'yi yazdır
         if (root != k - 1){
             ArrayList<Integer> newRight = new ArrayList<Integer>(inOrder.subList(root+1,k));
             ArrayList<Integer> newRight1 = new ArrayList<Integer>(preOrder.subList(1+root,k));
             findPostOrder(newRight, newRight1, k - root - 1, postOrder);
         }

         postOrder.add(preOrder.get(0));
         return postOrder;
     }

     private static ArrayList<Integer> getPostOrder(ArrayList<Integer> preOrder, ArrayList<Integer> inOrder) {

         int k = inOrder.size();
         ArrayList<Integer> postOrder = new ArrayList<Integer>();

         postOrder = findPostOrder(inOrder, preOrder, k, postOrder);
         preOrder = postOrder;

         // String postOrderlist = Arrays.toString(postOrder.toArray()).replace("[", "").replace("]", "").replace(",", "");

         return preOrder;
         // return postOrder; bu şekil dönüş yapılması daha mantıklı ama
         // soruda bu şekil verildiği için ellemedim, bi üstte postOrder'ı preOrder'a eşitledim

     }

     public static void main(String args[]) {
         ArrayList<Integer> po = new ArrayList<Integer>();
         ArrayList<Integer> in1 = new ArrayList<Integer>(Arrays.asList(5,7,7,10,14,17,23,23,24,25,34,36,40,48));
         ArrayList<Integer> pre = new ArrayList<Integer>(Arrays.asList(25,14,7,5,10,7,23,17,24,23,40,34,36,48));
         int n = in1.size();
         System.out.println("Postorder traversal " );
         //String postOrder = getPostOrder(pre, in1);
         po = getPostOrder(pre, in1);
         System.out.println("\n"+po);
         //System.out.println("\n"+postOrder);
         // System.out.println("Hello, world!");
     }
 }
