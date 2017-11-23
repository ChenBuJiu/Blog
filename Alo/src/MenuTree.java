import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MenuTree {
	public Menu getMendTree(List<Menu> list) {
		Menu root = new Menu();
		Iterator<Menu> it = list.iterator();
		while(it.hasNext()) {
			root = (Menu)it.next();
			if(root.id==0) {
				break;
			}
		}
		return root;
	}
	public static void main(String[] args) {
		List<Menu> list = new LinkedList<Menu>();
	    new MenuTree().getMendTree(list);
		
	}
}
