import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    static class TreeCell<T> {

        public T datum;
        public TreeCell<T> left, right;

        public TreeCell(T datum) {
            this.datum = datum;
            this.left = null;
            this.right = null;
        }

    }

    private static ArrayList<Integer> getPostOrder(ArrayList<Integer> preOrder, ArrayList<Integer> inOrder) {

        return preOrder;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> preOrder, inOrder, postOrder;

        preOrder = new ArrayList<>();
        for (String s : br.readLine().trim().split(" ")) {
            preOrder.add(Integer.parseInt(s));
        }

        inOrder = new ArrayList<>();
        for (String s : br.readLine().trim().split(" ")) {
            inOrder.add(Integer.parseInt(s));
        }

        postOrder = getPostOrder(preOrder, inOrder);

        System.out.println(postOrder.stream().map(v -> Integer.toString(v)).collect(Collectors.joining(" ")));

        br.close();

    }

}