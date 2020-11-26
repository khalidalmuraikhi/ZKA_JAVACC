import java.io.PrintWriter;

public class S1CodeGen {

	private PrintWriter outFile;
	private S1SymTab st;

	// ----
	public S1CodeGen(PrintWriter outFile, S1SymTab st) {

		this.outFile = outFile;
		this.st = st;
	}

	// ----
	public void emitInstruction(String op) {
		
		System.out.println(op);
		//outFile.printf("			%-4s%n", op);

	}

	// ----
	public void emitInstruction(String op, String opnd) {
		System.out.println(op + " " + opnd);
		//outFile.printf("			%-4s      %s%n", op, opnd);
	}

	// ----
	private void emitdw(String label, String value) {
		System.out.println(label + " " + value);
		//outFile.printf("%-9s dw  %s%n", label + ":", value);
	}

	// ----
	public void endCode() {
		outFile.println();
		emitInstruction("halt");
		int size = st.getSize();
		// emit dw for each symbol in the symbol table
		for (int i = 0; i < size; i++)
			emitdw(st.getSymbol(i), "O");
	}
}
// end of SICodeGen