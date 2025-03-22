class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        int[] vist=new int[n];
        List<Component> list=new ArrayList<>();

        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
           
        }
        for(int i=0;i<n;i++){
            if(vist[i]==0){
                int[] c = dfs(i,adj,vist);
                list.add(new Component(c[0],c[1]));
                
            }
        }

        int cnt=0;
        for(Component c: list){
            if(c.edges/2==c.nodes*(c.nodes-1)/2) cnt++; 
        }

        return cnt;
    }

    public int[] dfs(int curr, List<List<Integer>> adj, int[] vist){
        vist[curr]=1;
        int nodes=1; int edges=0;
        for(int neigh:adj.get(curr)){
            edges++;
            if(vist[neigh]==0){
                int[] res=dfs(neigh,adj,vist);
                nodes+=res[0];
                edges+=res[1];
            }
        } 
        return new int[]{nodes,edges};
    } 
}

class Component{
    int nodes, edges;
    Component(int nodes, int edges){
        this.nodes=nodes; this.edges=edges;
    }
}