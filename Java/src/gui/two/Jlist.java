package gui.two;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/*
 * JList(列表)
 */
public class Jlist {

	public static void main(String[] args) {
		jListTest();
	}

	//JList test
	public static void jListTest(){
		JFrame jf = new JFrame("hah");
		jf.setSize(500, 400);
		jf.setBounds(500, 500, 300, 200);
		
		JPanel jp = new JPanel();
		
		//JList jl = new JList();
		String option[] = {"kitty","tom","sunny","a","b","c","d","e","f","g"};
		JList jl = new JList(option);
		//System.out.println(jl.getSelectedIndex());//返回选中项的索引(未选中为-1)
		//System.out.println(jl.getSelectedIndices());//返回所有选中项的索引数组(按升序排序)
		//System.out.println(jl.getSelectedValue());//获取选中项的值(未选中为null)
		//System.out.println(jl.getSelectedValues());//获取所有选中值的数组(按值的索引顺序升序排序)
		//System.out.println(jl.getItemCount);
		//jl.setVisibleRowCount(3);//设置列表可见行数
		//jl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//设置模型，单选或多选
		//jl.remove(0);//删除指定索引的选项*
		//jl.removeAll();//删除全部选项*
		JScrollPane jsp = new JScrollPane(jl);//加滚动条
		
		jp.add(jsp);
		jf.add(jp);
		jf.setVisible(true);
	}
}
