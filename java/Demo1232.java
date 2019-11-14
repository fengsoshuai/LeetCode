/**
 * Created by Feng on 2019/11/14 9:35
 * CurrentProject's name is leetcode-demo
 */
public class Demo1232 {

    // 测试
    public static void main(String[] args) {
        int[][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};

        boolean res = new Demo1232().checkStraightLine(coordinates);
        System.out.println(res);
    }


    /**
     * 分析：由两点确定一条直线，再将其他所有点放入到公式进行过滤
     * 注意：分母不能为0
     * (y1 - y2)/(x1 - x2) = k
     */
    public boolean checkStraightLine(int[][] coordinates) {
        // 情形1：斜率为0，即y值相同
        if(coordinates[0][1] == coordinates[1][1]){
            for (int i = 0; i < coordinates.length; i++) {
                if(coordinates[i][1] != coordinates[0][1]){
                    return false;
                }
            }
            return true;
        }

        // 情形2：斜率不为0
        // 计算直线斜率
        double k = (double) (coordinates[0][0] - coordinates[1][0])
                / (coordinates[0][1] - coordinates[1][1]);
        // 遍历数组
        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            // 分母不能为0
            if(y == coordinates[0][1]){
                return false;
            }

            // 判断：斜率不同时返回false
            if(k != (double)(y - coordinates[0][1]) / (x - coordinates[0][0])) {
                return false;
            }
        }
        return true;
    }
}
