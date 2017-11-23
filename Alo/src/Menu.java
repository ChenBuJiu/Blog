import java.util.LinkedList;
import java.util.List;
//组合模式 获取根节点
public class Menu {
	int id;
	int pid;
	String data;
	List<Menu> children = new LinkedList<Menu>();
}
