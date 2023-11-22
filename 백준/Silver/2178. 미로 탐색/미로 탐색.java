import java.util.*;

public class Main {

        class Point{
                public int x;
                public int y;
                Point(int x, int y){
                        this.x = x;
                        this.y = y;
                }
        }
        static int[][] array;
        static int[][] dis;

        public static void main (String[] args){
                Main T = new Main();
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                int m = scanner.nextInt();
                array = new int[n][m];
                dis = new int[n][m];

                for(int i =0 ; i <n; i++){
                        String[] tmp = scanner.next().split("");
                        for(int j = 0; j<m; j++){
                             array[i][j] = Integer.parseInt(tmp[j]);
                             dis[i][j] = 1;
                        }
                }

                T.BFS(n, m);
                System.out.print(array[n-1][m-1]);

        }
        public void BFS(int n, int m){
                int[] dx = {-1, 0, 1, 0};
                int[] dy = {0, 1, 0, -1};

                Queue<Point> Q = new LinkedList<>();
                Q.offer(new Point(0,0));
                while(!Q.isEmpty()){
                        Point tmp = Q.poll();
                        int x = tmp.x;
                        int y = tmp.y;

                        for(int i =0; i<4; i++){
                                int nx = x + dx[i];
                                int ny = y + dy[i];
                                if(nx >= 0 && nx<n && ny >= 0 && ny<m && array[nx][ny] == 1){
                                        Q.offer(new Point(nx, ny));
                                        array[nx][ny] = array[x][y] +1;
                                        //array[x][y] = 0;
                                      //dis[nx][ny] = dis[x][y] +1;

                                }
                        }
                }
        }
}


