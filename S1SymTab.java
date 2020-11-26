import java.util.ArrayList;

public class S1SymTab {
	
	private ArrayList<String> symbol;


	public S1SymTab() {
		symbol = new ArrayList<String>();
	}
	
	public int enter(String s) {
		int index = symbol.indexOf(s);
		if (index < 0) {
			symbol.add(s);
			index = symbol.indexOf(s);
		}
		
		
		
		return index;
	}
	
	public int getOrder(String s) {
		
		return symbol.indexOf(s);
	}
	
	public String getSymbol(int index) {
		
		return symbol.get(index);
	}
	public int getSize() {
		return symbol.size();
	}

	@Override
	public String toString() {
		return "S1SymTab [symbol=" + symbol + "]";
	}

}