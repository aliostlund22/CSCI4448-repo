package Tools;

import java.util.ArrayList;
import java.util.List;

public class ToolFactory {

	// List of Tools
	public List<Tool> ListOfTools;

	// Default Constructor
	public ToolFactory(){
		ListOfTools = new ArrayList<Tool>();
		this.ListOfTools = CreateListOfTools();
	}

	// Getter method for List of Tools
	public List<Tool> getListOfTools(){
		return this.ListOfTools;
	}

	// Factory
	public static Tool getTool(String name, String category){
		if(category.equals("Tools.Painting")) {
			return new Painting(name, "Tools.Painting");
		}
		if(category.equals("Tools.Concrete")) {
			return new Concrete(name, "Tools.Concrete");
		}
		if(category.equals("Tools.Plumbing")) {
			return new Plumbing(name, "Tools.Plumbing");
		}
		if(category.equals("Tools.Woodwork")) {
			return new Woodwork(name,"Tools.Woodwork");
		}
		if(category.equals("Tools.Yardwork")) {
			return new Yardwork( name,"Tools.Yardwork");
		}
		else
			return null;
	}

	// Create list of Tools
	public List<Tool> CreateListOfTools(){

		Tool Painting1 = ToolFactory.getTool("Painting1", "Tools.Painting");
		Tool Painting2 = ToolFactory.getTool("Painting2", "Tools.Painting");
		Tool Painting3 = ToolFactory.getTool("Painting3", "Tools.Painting");
		Tool Painting4 = ToolFactory.getTool( "Painting4", "Tools.Painting");
		Tool Painting5 = ToolFactory.getTool( "Painting5","Tools.Painting");

		Tool Concrete1 = ToolFactory.getTool( "Concrete1", "Tools.Concrete");
		Tool Concrete2 = ToolFactory.getTool( "Concrete2", "Tools.Concrete");
		Tool Concrete3 = ToolFactory.getTool( "Concrete3", "Tools.Concrete");
		Tool Concrete4 = ToolFactory.getTool( "Concrete4", "Tools.Concrete");
		Tool Concrete5 = ToolFactory.getTool( "Concrete5", "Tools.Concrete");

		Tool Plumbing1 = ToolFactory.getTool( "Plumbing1", "Tools.Plumbing");
		Tool Plumbing2 = ToolFactory.getTool( "Plumbing2", "Tools.Plumbing");
		Tool Plumbing3 = ToolFactory.getTool( "Plumbing3", "Tools.Plumbing");
		Tool Plumbing4 = ToolFactory.getTool( "Plumbing4", "Tools.Plumbing");
		Tool Plumbing5 = ToolFactory.getTool( "Plumbing5", "Tools.Plumbing");

		Tool Woodwork1 = ToolFactory.getTool("Woodwork1", "Tools.Woodwork");
		Tool Woodwork2 = ToolFactory.getTool("Woodwork2", "Tools.Woodwork");
		Tool Woodwork3 = ToolFactory.getTool("Woodwork3", "Tools.Woodwork");
		Tool Woodwork4 = ToolFactory.getTool("Woodwork4", "Tools.Woodwork");
		Tool Woodwork5 = ToolFactory.getTool( "Woodwork5", "Tools.Woodwork");

		Tool Yardwork1 = ToolFactory.getTool("Yardwork1", "Tools.Yardwork");
		Tool Yardwork2 = ToolFactory.getTool( "Yardwork2", "Tools.Yardwork");
		Tool Yardwork3 = ToolFactory.getTool("Yardwork3", "Tools.Yardwork");
		Tool Yardwork4 = ToolFactory.getTool( "Yardwork4", "Tools.Yardwork");

		ListOfTools.add(Painting1);
		ListOfTools.add(Painting2);
		ListOfTools.add(Painting3);
		ListOfTools.add(Painting4);
		ListOfTools.add(Painting5);
		ListOfTools.add(Concrete1);
		ListOfTools.add(Concrete2);
		ListOfTools.add(Concrete3);
		ListOfTools.add(Concrete4);
		ListOfTools.add(Concrete5);
		ListOfTools.add(Plumbing1);
		ListOfTools.add(Plumbing2);
		ListOfTools.add(Plumbing3);
		ListOfTools.add(Plumbing4);
		ListOfTools.add(Plumbing5);
		ListOfTools.add(Woodwork1);
		ListOfTools.add(Woodwork2);
		ListOfTools.add(Woodwork3);
		ListOfTools.add(Woodwork4);
		ListOfTools.add(Woodwork5);
		ListOfTools.add(Yardwork1);
		ListOfTools.add(Yardwork2);
		ListOfTools.add(Yardwork3);
		ListOfTools.add(Yardwork4);
		return this.ListOfTools;
	}
}
