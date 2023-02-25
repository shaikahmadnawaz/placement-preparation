class Solution {
  public boolean isBipartite(int[][] graph) {
    int n = graph.length;
    int[] colors = new int[n];

    for (int i = 0; i < n; i++) {
      if (colors[i] == 0) { // if not yet coloured.
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        colors[i] = 1; // color it with blue

        while (!q.isEmpty()) {
          int cur = q.poll(); // start polling the current node

          for (int x : graph[cur]) {
            if (colors[x] == 0) { // if not yet colored
              colors[x] = -colors[cur]; // Use a different color for the adjacent node
              q.offer(x);
            } else if (colors[x] != -colors[cur])// if the adjacent node/neighbour is already coloured and not a
                                                 // different colour, we return false, as no two adjacent vertices must
                                                 // have same colors.
              return false;
          }
        }

      }
    }
    return true;
  }
}