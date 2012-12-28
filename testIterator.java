// The source code is from link:
// http://www.cnblogs.com/LIANQQ/archive/2012/12/21/2827473.html
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;



// Interator 接口遍历数组集合
public class testIterator {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //创建一个集合
       //HashSet是无序排列的 而且里面的数据是不重复的，
        Collection<String> colls = new HashSet<String>();
        colls.add("第一个");
        colls.add("第二个");
        colls.add("第三个");
        colls.add("第三个");

        colls.add("4");
        colls.add("5");
        colls.add("6");
        colls.add("7");
        colls.add("8");
        //获得colls的迭代器
        Iterator<String> i =  colls.iterator();
        //迭代
        while(i.hasNext()){
            
            String m = i.next();
            System.out.println(m);

        }
        System.out.println(colls);
        System.out.println("一共有"+colls.size()+"个元素");
    }

}
