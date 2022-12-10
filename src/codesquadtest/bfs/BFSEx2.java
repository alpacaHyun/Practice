package codesquadtest.bfs;

// 최단거리는 BFS 를 사용하자

import java.util.LinkedList;
import java.util.Queue;

public class BFSEx2 {

    static int ck[][];
    static int arr[][];
    static int n;
    static int answer = 0;

    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, 1};

    class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    

    public void bfs(int x, int y) {

        Queue<Point> queue = new LinkedList<>();
        Point point = new Point(x, y);
        queue.add(point);

        while(!queue.isEmpty()){
            int size = queue.size();
            // queque 사이즈 만큼 돌음
            for (int i = 0; i < size; i++) {
                Point pq = queue.poll();
                int xx = pq.x;
                int yy = pq.y;
                for (int j = 0; j < 4; j++) {
                    int nx = xx + dx[j];
                    int ny = yy + dy[j];

//                    if(nx >= 0 && nx <= 6 && ny >= 0 && ny <  6 && arr[nx]][ny] == 0) {
//                        if(ck[nx][ny] == 0) {
//                            ck[nx][ny] = 1;
//                            Point pp = new Point(nx, ny);
//                            queue.add(pp);
//                        }
//                    }

                }
            }
        }

    }

    public static void main(String[] args) {

    }

}
