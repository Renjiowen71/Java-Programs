package TSP;

public class Main {

 

    /**

     * @param args

     */

    public static void main(String[] args)

    {

         

        //Lets create nodes as given as an example in the article

        Node nA=new Node("1");

        Node nB=new Node("2");

        Node nC=new Node("3");

        Node nD=new Node("4");

        Node nE=new Node("5");

        Node nF=new Node("6");

        Node nG=new Node("7");

        Node nH=new Node("8");

        Node nI=new Node("9");

        Node nJ=new Node("10");

        Node nK=new Node("11");

 
        //Create the graph, add nodes, create edges between nodes

        Graph g=new Graph();

        g.addNode(nA);

        g.addNode(nB);
        g.addNode(nC);
        g.addNode(nD);
        g.addNode(nE);
        g.addNode(nF);
        g.addNode(nG);
        g.addNode(nH);
        g.addNode(nI);
        g.addNode(nJ);
        g.addNode(nK);
        g.setRootNode(nA);
        g.connectNode(nA,nB);
        g.connectNode(nA,nC);
        g.connectNode(nA,nD);
         
        g.connectNode(nB,nC);
        g.connectNode(nC,nD);
        g.connectNode(nC,nE);
        g.connectNode(nD,nE);
        g.connectNode(nD,nF);
        g.connectNode(nD,nG);
        g.connectNode(nE,nG);
        g.connectNode(nE,nH);
        g.connectNode(nF,nH);
        g.connectNode(nG,nI);
        g.connectNode(nG,nJ);
        g.connectNode(nH,nI);
        g.connectNode(nH,nJ);
        g.connectNode(nH,nK);
        g.connectNode(nI,nK);
        g.connectNode(nJ,nK);
        //Perform the traversal of the graph
        System.out.println("DFS Traversal of a tree is --->");
        g.dfs();
         
        System.out.println("\nBFS Traversal of a tree is --->");
        g.bfs();
         
    }
 
}