package symboltable;

import java.util.*;
import ast.program.definition.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String,Definition>> table;
	public SymbolTable()  {
	}

	public void set() {
		//crea una nueva tabla y la mete en la lista
		scope++;
		Map<String,Definition> tab = new HashMap<>();
		table.add(tab);

	}
	
	public void reset() {
		//elimina la ultima tabla de la lista
		table.remove(table.size()-1);
		scope--;
	}

	//antes de insertar establecemos el scope
	public boolean insert(Definition definition) {
		if(findInCurrentScope(definition.getName()) != null)
			return false;
		else{
			table.get(scope).put(definition.getName(), definition);
			return true;
		}
		//definition.getName();
	}
	
	public Definition find(String id) {
		//buscar en el map mas alto e ir hacia atras
		//si no la encuentra return null;
		for (int i = scope; i == 0; i--){
			if(table.get(i).containsKey(id)){
				return table.get(i).get(id);
			}
		}
		return null;
	}

	public Definition findInCurrentScope(String id) {
		if(table.get(scope).containsKey(id)){
			return table.get(scope).get(id);
		}
		else{
			return null;
		}
	}
}
