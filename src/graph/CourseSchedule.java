package graph;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public static boolean dfs(int node, List<List<Integer>> adj, boolean[] vis){
        if(vis[node] == true) return false;
        vis[node] = true;
        for(Integer it : adj.get(node)){
            if(!vis[it]) {
                if(!dfs(it, adj, vis)) return false;
            }
        }
        return true;
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        boolean[] vis = new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] p: prerequisites) {
            int prerequisite = p[1];
            int course = p[0];
            adj.get(course).add(prerequisite);
        }

        for(int i=0;i<numCourses;i++){
            if(!vis[i]) {
                if(!dfs(i, adj, vis)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 2;
       // int[][] p =  {{0,10},{3,18},{5,5},{6,11},{11,14},{13,1},{15,1},{17,4}};
        int[][] p =  {{1,0}};
        System.out.println(canFinish(n,p));
    }
}
