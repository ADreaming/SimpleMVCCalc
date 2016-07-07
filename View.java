package MVCCalc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class View implements ActionListener{
	private Controller instance;
	
	private JTextField stack;
	private JTextField text;
	
	boolean calculated;
	
	public View(Controller instance){
		this.instance = instance;
		calculated = false;
		start();
	}
	
	private void start(){
		JFrame main = new JFrame("MVC Calculator Basic");
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new  BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
				
				JPanel viewPanel = new JPanel();
				viewPanel.setLayout(new BoxLayout(viewPanel, BoxLayout.LINE_AXIS));
					stack = new JTextField();
					stack.setEditable(false);
					stack.setEnabled(false);
					viewPanel.add(stack);
					
					text = new JTextField();
					text.setEditable(false);
					text.setHorizontalAlignment(JTextField.RIGHT);
					text.setText("0");
					viewPanel.add(text);
				
				mainPanel.add(viewPanel);
				
				JPanel contPanel = new JPanel();
				contPanel.setLayout(new BoxLayout(contPanel, BoxLayout.PAGE_AXIS));
				
					JPanel cPanel0 = new JPanel();
					cPanel0.setLayout(new BoxLayout(cPanel0, BoxLayout.LINE_AXIS));
						
						JButton add = new JButton("+");
						add.addActionListener(this);
						add.setActionCommand("add");
						cPanel0.add(add);

						JButton sub = new JButton("-");
						sub.addActionListener(this);
						sub.setActionCommand("sub");
						cPanel0.add(sub);

						JButton mul = new JButton("*");
						mul.addActionListener(this);
						mul.setActionCommand("mul");
						cPanel0.add(mul);

						JButton div = new JButton("/");
						div.addActionListener(this);
						div.setActionCommand("div");
						cPanel0.add(div);
						
					contPanel.add(cPanel0);
				
					JPanel cPanel1 = new JPanel();
					cPanel1.setLayout(new BoxLayout(cPanel1, BoxLayout.LINE_AXIS));
					
						JButton num1 = new JButton("1");
						num1.addActionListener(this);
						num1.setActionCommand("num1");
						cPanel1.add(num1);

						JButton num2 = new JButton("2");
						num2.addActionListener(this);
						num2.setActionCommand("num2");
						cPanel1.add(num2);

						JButton num3 = new JButton("3");
						num3.addActionListener(this);
						num3.setActionCommand("num3");
						cPanel1.add(num3);
					
					contPanel.add(cPanel1);
					
					JPanel cPanel2 = new JPanel();
					cPanel2.setLayout(new BoxLayout(cPanel2, BoxLayout.LINE_AXIS));

						JButton num4 = new JButton("4");
						num4.addActionListener(this);
						num4.setActionCommand("num4");
						cPanel2.add(num4);

						JButton num5 = new JButton("5");
						num5.addActionListener(this);
						num5.setActionCommand("num5");
						cPanel2.add(num5);

						JButton num6 = new JButton("6");
						num6.addActionListener(this);
						num6.setActionCommand("num6");
						cPanel2.add(num6);
					
					contPanel.add(cPanel2);
					
					JPanel cPanel3 = new JPanel();
					cPanel3.setLayout(new BoxLayout(cPanel3, BoxLayout.LINE_AXIS));

						JButton num7 = new JButton("7");
						num7.addActionListener(this);
						num7.setActionCommand("num7");
						cPanel3.add(num7);
	
						JButton num8 = new JButton("8");
						num8.addActionListener(this);
						num8.setActionCommand("num8");
						cPanel3.add(num8);
	
						JButton num9 = new JButton("9");
						num9.addActionListener(this);
						num9.setActionCommand("num9");
						cPanel3.add(num9);
				
					contPanel.add(cPanel3);
					
					JPanel cPanel4 = new JPanel();
					cPanel4.setLayout(new BoxLayout(cPanel4, BoxLayout.LINE_AXIS));

						JButton clear = new JButton("C");
						clear.addActionListener(this);
						clear.setActionCommand("clear");
						cPanel4.add(clear);
	
						JButton num0 = new JButton("0");
						num0.addActionListener(this);
						num0.setActionCommand("num0");
						cPanel4.add(num0);
	
						JButton equal = new JButton("=");
						equal.addActionListener(this);
						equal.setActionCommand("equal");
						cPanel4.add(equal);
				
					contPanel.add(cPanel4);
				
				mainPanel.add(contPanel);
				
			main.add(mainPanel);
		
		main.pack();
		main.setLocationRelativeTo(null);
		main.setVisible(true);
	}
	
	private void sendParam(int place, int param){
		instance.loadParam(place, param);
	}
	
	private void setOp(int op){
		instance.loadOp(op);
	}
	
	private void calculate(){
		instance.calculate();
	}
	
	protected void update(String message){
		text.setText(message);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if (text.getText().equals("0")){
			text.setText("");
		}
		stack.setEnabled(false);
		switch(arg0.getActionCommand()){
		case "num0":
			if(calculated){
				text.setText("" + 0);
				stack.setText("");
				calculated = false;
				break;
			}
			text.setText(text.getText().concat("" + 0));
			break;
		case "num1":
			if(calculated){
				text.setText("" + 1);
				stack.setText("");
				calculated = false;
				break;
			}
			text.setText(text.getText().concat("" + 1));
			break;
		case "num2":
			if(calculated){
				text.setText("" + 2);
				stack.setText("");
				calculated = false;
				break;
			}
			text.setText(text.getText().concat("" + 2));
			break;
		case "num3":
			if(calculated){
				text.setText("" + 3);
				stack.setText("");
				calculated = false;
				break;
			}
			text.setText(text.getText().concat("" + 3));
			break;
		case "num4":
			if(calculated){
				text.setText("" + 4);
				stack.setText("");
				calculated = false;
				break;
			}
			text.setText(text.getText().concat("" + 4));
			break;
		case "num5":
			if(calculated){
				text.setText("" + 5);
				stack.setText("");
				calculated = false;
				break;
			}
			text.setText(text.getText().concat("" + 5));
			break;
		case "num6":
			if(calculated){
				text.setText("" + 6);
				stack.setText("");
				calculated = false;
				break;
			}
			text.setText(text.getText().concat("" + 6));
			break;
		case "num7":
			if(calculated){
				text.setText("" + 7);
				stack.setText("");
				calculated = false;
				break;
			}
			text.setText(text.getText().concat("" + 7));
			break;
		case "num8":
			if(calculated){
				text.setText("" + 8);
				stack.setText("");
				calculated = false;
				break;
			}
			text.setText(text.getText().concat("" + 8));
			break;
		case "num9":
			if(calculated){
				text.setText("" + 9);
				stack.setText("");
				calculated = false;
				break;
			}
			text.setText(text.getText().concat("" + 9));
			break;
		case "clear":
			text.setText("" + 0);
			stack.setText("");
			instance.clear();
			break;
		case "equal":
			sendParam(2, text.getText().isEmpty()? 0 :Integer.parseInt(text.getText()));
			calculate();
			calculated = true;
			
			stack.setText(text.getText());
			stack.setEnabled(true);
			text.setText("");
			break;
		case "add":
			if (calculated){
				sendParam(1, stack.getText().isEmpty()? 0 :Integer.parseInt(stack.getText()));
				text.setText("" + 0);
				calculated = false;
				setOp(Controller.ADDITION);
				break;
			}
			sendParam(2, text.getText().isEmpty()? 0 :Integer.parseInt(text.getText()));
			calculate();
			sendParam(1, text.getText().isEmpty()? 0 :Integer.parseInt(text.getText()));
			stack.setText(text.getText().isEmpty()? "" + 0 :text.getText());
			text.setText("0");
			setOp(Controller.ADDITION);
			break;
		case "sub":
			if (calculated){
				sendParam(1, stack.getText().isEmpty()? 0 :Integer.parseInt(stack.getText()));
				text.setText("" + 0);
				calculated = false;
				setOp(Controller.SUBTRACTION);
				break;
			}
			sendParam(2, text.getText().isEmpty()? 0 :Integer.parseInt(text.getText()));
			calculate();
			sendParam(1, text.getText().isEmpty()? 0 :Integer.parseInt(text.getText()));
			stack.setText(text.getText().isEmpty()? "" + 0 :text.getText());
			text.setText("0");
			setOp(Controller.SUBTRACTION);
			break;
		case "mul":
			if (calculated){
				sendParam(1, stack.getText().isEmpty()? 0 :Integer.parseInt(stack.getText()));
				text.setText("" + 0);
				calculated = false;
				setOp(Controller.MULTIPLICATION);
				break;
			}
			sendParam(2, text.getText().isEmpty()? 0 :Integer.parseInt(text.getText()));
			calculate();
			sendParam(1, text.getText().isEmpty()? 0 :Integer.parseInt(text.getText()));
			stack.setText(text.getText().isEmpty()? "" + 0 :text.getText());
			text.setText("0");
			setOp(Controller.MULTIPLICATION);
			break;
		case "div":
			if (calculated){
				sendParam(1, stack.getText().isEmpty()? 0 :Integer.parseInt(stack.getText()));
				text.setText("" + 0);
				calculated = false;
				setOp(Controller.DIVISION);
				break;
			}
			sendParam(2, text.getText().isEmpty()? 0 :Integer.parseInt(text.getText()));
			calculate();
			sendParam(1, text.getText().isEmpty()? 0 :Integer.parseInt(text.getText()));
			stack.setText(text.getText().isEmpty()? "" + 0 :text.getText());
			text.setText("0");
			setOp(Controller.DIVISION);
			break;
		}
	}

}
