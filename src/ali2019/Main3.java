package ali2019;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * 快递员小王每天早晨7点从快递网点收拾包裹出发前往各个小区派件，11点前需要回到网点做上午的盘点。
 * 已知每个小区之间快递员需要骑行的时间，以及每个小区需要派送的包裹量。
 *
 * 我们约定
 * 1.小王每天上午只派件一次，
 * 2.快递车容量无限制，
 * 3.因为小区之间有河相隔，所以并不是所有小区互通。
 *
 * 规划出能使小王一次派件量最大的派件路线 。
 *
 * 编译器版本: Java 1.8.0_66
 * 请使用标准输入输出(System.in, System.out)；已禁用图形、文件、网络、系统相关的操作，如java.lang.Process , javax.swing.JFrame , Runtime.getRuntime；不要自定义包名称，否则会报错，即不要添加package answer之类的语句；您可以写很多个类，但是必须有一个类名为Main，并且为public属性，并且Main为唯一的public class，Main类的里面必须包含一个名字为'main'的静态方法（函数），这个方法是程序的入口
 * 时间限制: 3S (C/C++以外的语言为: 5 S)   内存限制: 128M (C/C++以外的语言为: 640 M)
 * 输入:
 * 输入数据包含多行
 * 第一行: 一个整数N，表示有N各小区；
 * 接下来N行，每行一个整数m，表示每个小区的包裹数；
 * 接下来是一个P*Q的二维数组，表示小区之间的通路；其中：
 * 第N+2行：表示小区与小区之间的线路条数P，即二维数组的行数；
 * 第N+3行：表示二维数组的列数Q；
 * 接下来P行: 每一行是一条线路 包含3个整数，以空格分隔。意义是：
 *  整数x 整数y 整数z（第x个小区到第y个小区有通路，快递员骑行时间为z）
 * 输出:
 * 能够派送的最多的包裹量
 * 输入范例:
 * 6
 * 35
 * 20
 * 15
 * 20
 * 28
 * 18
 * 7
 * 3
 * 0 1 20
 * 0 2 25
 * 1 3 30
 * 2 3 35
 * 2 4 50
 * 3 5 100
 * 4 5 50
 * 输出范例:
 * 80
 * 编程说明 ▲
 *
 */
public class Main3 {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static int main(int[] value, int[][] distance) {
        return 0;

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _value_size = 0;
        _value_size = Integer.parseInt(in.nextLine().trim());
        int[] _value = new int[_value_size];
        int _value_item;
        for(int _value_i = 0; _value_i < _value_size; _value_i++) {
            _value_item = Integer.parseInt(in.nextLine().trim());
            _value[_value_i] = _value_item;
        }

        int _distance_rows = 0;
        int _distance_cols = 0;
        _distance_rows = Integer.parseInt(in.nextLine().trim());
        _distance_cols = Integer.parseInt(in.nextLine().trim());

        int[][] _distance = new int[_distance_rows][_distance_cols];
        for(int _distance_i=0; _distance_i<_distance_rows; _distance_i++) {
            for(int _distance_j=0; _distance_j<_distance_cols; _distance_j++) {
                _distance[_distance_i][_distance_j] = in.nextInt();

            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        res = main(_value, _distance);
        System.out.println(String.valueOf(res));

    }
}
