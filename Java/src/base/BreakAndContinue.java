package base;

public class BreakAndContinue {
	
	public static void main(String[] args) throws Exception {
		
		/*label1: 
		while (1 == 1) { // 外部循环
			while (1 == 1) { // 内部循环
				// ...
				break; // 1
				// ...
				continue; // 2
				// ...
				continue label1; // 3
				// ...
				break label1; // 4
			}
		}*/
		
		/*
		 *  在条件1 中，break 中断内部循环，并在外部循环结束。在条件2 中，continue 移回内部循环的起始处。但
			在条件3 中，continue label1 却同时中断内部循环以及外部循环，并移至label1 处。随后，它实际是继续
			循环，但却从外部循环开始。在条件4 中，break label1 也会中断所有循环，并回到label1 处，但并不重
			新进入循环。也就是说，它实际是完全中止了两个循环
		 */
	}

}
