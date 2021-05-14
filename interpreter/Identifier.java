/*
 * CS: 4308: Concepts of Programming Languages
 * Section W01; Spring 2021
 * Project Deliverable 3
 * Developers:
 * Brandon Tedeschi
 * Mike Lin
 * Nick Tibbetts
 *
 */

package interpreter;

public class Identifier {

	private String variableType, variableName, variableValue;

	public Identifier() {}

	public Identifier(String vType, String vName, String vValue) {
		this.variableType = vType;
		this.variableName = vName;
		this.variableValue = vValue;
	}


	public String getName(){
		return this.variableName;
	}
	public String getType() {
		return this.variableType;
	}
	public String getValue() {
		return this.variableValue;
	}
	public void setValue(String value) {
		this.variableValue = value;
	}
	public String toString() {
		return "Variable type: "+ this.getType() + "\nVariable name: "+ this.getName() + "\nVariable value: "+ this.getValue();
	}

}