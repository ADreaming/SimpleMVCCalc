package MVCCalc;

public class Controller {
	public static final int ADDITION = 0;
	public static final int SUBTRACTION = 1;
	public static final int MULTIPLICATION = 2;
	public static final int DIVISION = 3;
	
	
	private View gui;
	private int mode;
	
	private int param1;
	private int param2;
	
	public Controller(){
		gui = new View(this);
		mode = ADDITION;
		
		param1 = param2 = 0;
	}
	
	protected void loadParam(int place, int param){
		switch(place){
		case 1:
			param1 = param;
			break;
		case 2:
			param2 = param;
			break;
		default:
			break;
		}
	}
	
	protected void loadOp(int op){
		mode = op;
	}
	
	protected void calculate(){
		switch(mode){
		case ADDITION:
			gui.update("" + Model.add(param1, param2));
			break;
		case SUBTRACTION:
			gui.update("" + Model.subtract(param1, param2));
			break;
		case MULTIPLICATION:
			gui.update("" + Model.multiply(param1, param2));
			break;
		case DIVISION:
			if (param2 == 0){
				gui.update("ERROR: divide by zero");
				break;
			}
			gui.update("" + Model.divide(param1, param2));
			break;
		default:
			gui.update("ERROR: invalid operation");
			break;
		}
		
		clear();
	}
	
	protected void clear(){
		param1 = 0;
		param2 = 0;
		mode = ADDITION;
	}
	
	public static void main(String[] args){
		new Controller();
	}

}
