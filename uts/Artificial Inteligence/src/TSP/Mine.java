package TSP;

import java.util.ArrayList;

public class Mine{ 

        static ArrayList<Node> nodes=new ArrayList<>();
        static ArrayList<String> result_route=new ArrayList<>();
        static ArrayList<Integer> result_dist=new ArrayList<>();
        static int[][] maps;
        static int start;
        boolean awal=true;
//        boolean awal2=true;
        
        static class Node{
                String data;
                boolean visited;

                Node(String data){
                        this.data=data;
                }
        }
        public static int nodeIndex(Node x){
                int index=-1;
                for (int i = 0; i < nodes.size(); i++) {
                        if(nodes.get(i).equals(x)){
                                index=i;
                        }
                }
                return index;
        }
        public static void printmatrix(int a[][]){
                for (int i = 0;i<a.length;i++){
                        for (int j = 0; j<a[0].length;j++)
                                System.out.print(a[i][j]+" ");
                        System.out.println("");
                }
                System.out.println("");
        }
        public static boolean circuit(Node node){
//                System.out.println(nodeIndex(node)+"+"+start);
//                printmatrix(maps);
                if(maps[start][nodeIndex(node)]>0){
                        return true;
                }
                return false;
        }
        // find neighbors of node using adjacency matrix
        // if adjacency_matrix[i][j]==1, then nodes at index i and index j are connected
        public ArrayList<Node> findNeighbours(int adjacency_matrix[][],Node x){
                int nodeIndex=-1;

                ArrayList<Node> neighbours=new ArrayList<>();
                for (int i = 0; i < nodes.size(); i++) {
                        if(nodes.get(i).equals(x)){
                                nodeIndex=i;
                                break;
                        }
                }

                if(nodeIndex!=-1){
                        for (int j = 0; j < adjacency_matrix[nodeIndex].length; j++) {
                                if(adjacency_matrix[nodeIndex][j]>0){
                                        neighbours.add(nodes.get(j));
                                }
                        }
                }
                return neighbours;
        }


        // Recursive DFS
        public  void dfs(int adjacency_matrix[][], Node node, String dump, int h, String dust){
                String dump2;
                String dust2;
                int adjacency_matrix2[][]=adjacency_matrix;
                if(awal){
                        dump2=""+node.data;
                        awal=false;
                }else{
//                        int y = nodeIndex(node);
//                        for (int j = 0; j < adjacency_matrix2[y].length; j++) {
//                                                adjacency_matrix2[j][y]=0;
//                        }
                        dump2 = dump+" -> "+node.data;
                }
//                System.out.println("NOW"+h);
//                int x = nodeIndex(node);
//                if(h==5){
//                        System.out.println(dump);
//                }
//                if(node.data==40){
//                        System.out.println(dump);
//                }
//                System.out.print(node.data + " ");
                
                ArrayList<Node> neighbours=findNeighbours(adjacency_matrix,node);
//                node.visited=true;
                int[] temp = new int[adjacency_matrix2[0].length];
                int y = nodeIndex(node);
                if(neighbours.size()>0){
                        for (int i = 0; i < neighbours.size(); i++) {
                                Node n=neighbours.get(i);
                                int x = nodeIndex(n);
                                int adjacency_matrix3[][]=adjacency_matrix2;

                                for (int j = 0; j < adjacency_matrix3[y].length; j++) {
                                                        temp[j]=adjacency_matrix3[j][y];
                                }
                                int h2=h+adjacency_matrix3[x][y];
                                dust2=dust+adjacency_matrix3[x][y]+"+";
//                                if(!awal){
                                        for (int j = 0; j < adjacency_matrix3[y].length; j++) {
                                                                adjacency_matrix3[j][y]=0;
                                        }
//                                }else{
//                                        awal=false;
//                                }
//                                printmatrix(adjacency_matrix2);
                                
                                if(n!=null){
                                        
                                        dfs(adjacency_matrix3,n,dump2,h2,dust2);
                                }
                                for (int j = 0; j < adjacency_matrix3[y].length; j++) {
                                        adjacency_matrix3[j][y]=temp[j];
                                }
                        }
                }else{
                        if(circuit(node)){
                                dust=dust+maps[start][y];
                                h=h+maps[start][y];
                                dump2=dump2+" -> "+nodes.get(start).data;
                                System.out.println(dump2+"\t"+dust+"\t"+h);
                                result_route.add(dump2);
                                result_dist.add(h);
//                        printmatrix(adjacency_matrix2);
                        }
                }
        }

        public static void main(String arg[])
        {

                Node nodeA =new Node("A");
                Node nodeB =new Node("B");
                Node nodeC =new Node("C");
                Node nodeD =new Node("D");
//                Node node60 =new Node(60);
//                Node node50 =new Node(50);
//                Node node70 =new Node(70);

                nodes.add(nodeA);
                nodes.add(nodeB);
                nodes.add(nodeC);
                nodes.add(nodeD);
//                nodes.add(node60);
//                nodes.add(node50);
//                nodes.add(node70);
//                int adjacency_matrix[][] = {
//                                {0,1,1,0,0,0,0},  // Node 1: 40
//                                {0,0,0,1,0,0,0},  // Node 2 :10
//                                {0,1,0,1,1,1,0},  // Node 3: 20
//                                {0,0,0,0,1,0,0},  // Node 4: 30
//                                {0,0,0,0,0,0,1},  // Node 5: 60
//                                {0,0,0,0,0,0,1},  // Node 6: 50
//                                {0,0,0,0,0,0,0},  // Node 7: 70
//                };
                int adjacency_matrix[][] = {
                                {0,3,2,4},  // Node 1: A
                                {3,0,6,1},  // Node 2 :B
                                {2,6,0,8},  // Node 3: C
                                {4,1,8,0},  // Node 4: D
                };
                maps=adjacency_matrix;

                Mine dfsExample = new Mine();

                System.out.println("Possible route :");
                String temp="";
                Node root = nodeA;
                start = nodeIndex(root);
                dfsExample.dfs(adjacency_matrix, root, temp, 0, "");
                
                int one=result_dist.get(0);
                int result_index=0;
                for (int i = 1; i < result_dist.size(); i++) {
                        if(one>result_dist.get(i)){
                                one=result_dist.get(i);
                                result_index=i;
                        }
                }
                System.out.println("Thus, "+result_route.get(result_index)+" with distance "+result_dist.get(result_index)+" unit is the best route.");
        }

//        public static void clearVisitedFlags()
//        {
//                for (int i = 0; i < nodes.size(); i++) {
//                        nodes.get(i).visited=false;
//                }
//        }
}