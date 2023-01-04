import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;


public class frame2 {

	private JFrame frame;
	private JTextField textField;
	double a;
	double b;
	double total;
	
	String action;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 window = new frame2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 553, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.BOLD, 17));
		textField.setBounds(10, 10, 525, 77);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton bSin = new JButton("sin");
		bSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("The calculated result for sin fn is = ");
				textField.setText(textField.getText()+s);
			}
		});
		bSin.setFont(new Font("Calibri", Font.BOLD, 24));
		bSin.setBounds(10, 107, 79, 59);
		frame.getContentPane().add(bSin);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+b7.getText();
				textField.setText(number);
			}
		});
		b7.setFont(new Font("Calibri", Font.BOLD, 24));
		b7.setBounds(10, 176, 79, 59);
		frame.getContentPane().add(b7);
		
		JButton bCos = new JButton("cos");
		bCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double c = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("The calculated result for cos fn is = ");
				textField.setText(textField.getText()+c);
			}
		});
		bCos.setFont(new Font("Calibri", Font.BOLD, 24));
		bCos.setBounds(99, 107, 79, 59);
		frame.getContentPane().add(bCos);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+b8.getText();
				textField.setText(number);
			}
		});
		b8.setFont(new Font("Calibri", Font.BOLD, 24));
		b8.setBounds(99, 176, 79, 59);
		frame.getContentPane().add(b8);
		
		JButton bTan = new JButton("tan");
		bTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double t = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("The calculated result for tan fn is = ");
				textField.setText(textField.getText()+t);
			}
		});
		bTan.setFont(new Font("Calibri", Font.BOLD, 24));
		bTan.setBounds(191, 107, 79, 59);
		frame.getContentPane().add(bTan);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+b9.getText();
				textField.setText(number);
			}
		});
		b9.setFont(new Font("Calibri", Font.BOLD, 24));
		b9.setBounds(191, 176, 79, 59);
		frame.getContentPane().add(b9);
		
		JButton bBck = new JButton("B");
		bBck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bck = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					bck = str.toString();
					textField.setText(bck);
				}
			}
		});
		bBck.setFont(new Font("Calibri", Font.BOLD, 24));
		bBck.setBounds(280, 107, 79, 59);
		frame.getContentPane().add(bBck);
		
		JButton bSqr = new JButton("x^2");
		bSqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(textField.getText());
				x = x*x;
				textField.setText("The calculated result for square fn is = ");
				textField.setText(textField.getText()+x);
			}
		});
		bSqr.setFont(new Font("Calibri", Font.BOLD, 24));
		bSqr.setBounds(280, 176, 79, 59);
		frame.getContentPane().add(bSqr);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+b4.getText();
				textField.setText(number);
			}
		});
		b4.setFont(new Font("Calibri", Font.BOLD, 24));
		b4.setBounds(10, 245, 79, 59);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+b5.getText();
				textField.setText(number);
			}
		});
		b5.setFont(new Font("Calibri", Font.BOLD, 24));
		b5.setBounds(99, 245, 79, 59);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+b6.getText();
				textField.setText(number);
			}
		});
		b6.setFont(new Font("Calibri", Font.BOLD, 24));
		b6.setBounds(191, 245, 79, 59);
		frame.getContentPane().add(b6);
		
		JButton bCube = new JButton("x^3");
		bCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x = Double.parseDouble(textField.getText());
				x = x*x*x;
				textField.setText("The calculated result for cube fn is = ");
				textField.setText(textField.getText()+x);
			}
		});
		bCube.setFont(new Font("Calibri", Font.BOLD, 24));
		bCube.setBounds(280, 245, 79, 59);
		frame.getContentPane().add(bCube);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+b1.getText();
				textField.setText(number);
			}
		});
		b1.setFont(new Font("Calibri", Font.BOLD, 24));
		b1.setBounds(10, 314, 79, 59);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+b2.getText();
				textField.setText(number);
			}
		});
		b2.setFont(new Font("Calibri", Font.BOLD, 24));
		b2.setBounds(99, 314, 79, 59);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+b3.getText();
				textField.setText(number);
			}
		});
		b3.setFont(new Font("Calibri", Font.BOLD, 24));
		b3.setBounds(191, 314, 79, 59);
		frame.getContentPane().add(b3);
		
		JButton bSqrt = new JButton("Sqrt");
		bSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sqrt = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("The calculated result for square root fn is = ");
				textField.setText(textField.getText()+sqrt);
			}
		});
		bSqrt.setFont(new Font("Calibri", Font.BOLD, 24));
		bSqrt.setBounds(280, 314, 79, 59);
		frame.getContentPane().add(bSqrt);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+b0.getText();
				textField.setText(number);
			}
		});
		b0.setFont(new Font("Calibri", Font.BOLD, 24));
		b0.setBounds(10, 383, 168, 59);
		frame.getContentPane().add(b0);
		
		JButton bDot = new JButton(".");
		bDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+bDot.getText();
				textField.setText(number);
			}
		});
		bDot.setFont(new Font("Calibri", Font.BOLD, 24));
		bDot.setBounds(191, 383, 79, 59);
		frame.getContentPane().add(bDot);
		
		JButton bFact = new JButton("x!");
		bFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double f = Double.parseDouble(textField.getText());
				double fac = 1;
				while (f!=0)
				{
					fac = fac*f;
					f--;
				}
				textField.setText("The factorial of opted number is = ");
				textField.setText(textField.getText()+fac);
			}
		});
		bFact.setFont(new Font("Calibri", Font.BOLD, 24));
		bFact.setBounds(367, 176, 79, 59);
		frame.getContentPane().add(bFact);
		
		JButton bLog = new JButton("Log");
		bLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double log = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("The calculated result for log fn for selected value is = ");
				textField.setText(textField.getText()+log);
			}
		});
		bLog.setFont(new Font("Calibri", Font.BOLD, 24));
		bLog.setBounds(369, 245, 79, 59);
		frame.getContentPane().add(bLog);
		
		JButton bPow = new JButton("x^y");
		bPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "x^y";
			}
		});
		bPow.setFont(new Font("Calibri", Font.BOLD, 24));
		bPow.setBounds(369, 314, 79, 59);
		frame.getContentPane().add(bPow);
		
		JButton bEqual = new JButton("=");
		bEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b = Double.parseDouble(textField.getText());
				if(action == "+") 
				{
					total = a + b;
					answer = String.format("%.1f + %.1f = %.2f", a, b, total);
					textField.setText(answer);
				}
				else if(action == "-")
				{
					total = a - b;
					answer = String.format("%.1f - %.1f = %.2f", a, b, total);
					textField.setText(answer);
				}
				else if(action == "*")
				{
					total = a * b;
					answer = String.format("%.1f * %.1f = %.2f", a, b, total);
					textField.setText(answer);
				}
				else if(action == "/")
				{
					total = a / b;
					answer = String.format("%.1f / %.1f = %.2f", a, b, total);
					textField.setText(answer);
				}
				else if(action == "x^y")
				{
					double n = 1;
					int i = 0;
					while(i<b)
					{
						n = a * n;
						i++;
					}
					answer = String.format("%.1f ^ %.1f = %.2f", a, b, n);
					textField.setText(answer);
				}
			}
		});
		bEqual.setFont(new Font("Calibri", Font.BOLD, 24));
		bEqual.setBounds(280, 383, 166, 59);
		frame.getContentPane().add(bEqual);
		
		JButton bAdd = new JButton("+");
		bAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "+";
			}
		});
		bAdd.setFont(new Font("Calibri", Font.BOLD, 24));
		bAdd.setBounds(456, 176, 79, 59);
		frame.getContentPane().add(bAdd);
		
		JButton bSub = new JButton("-");
		bSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "-";
			}
		});
		bSub.setFont(new Font("Calibri", Font.BOLD, 24));
		bSub.setBounds(456, 245, 79, 59);
		frame.getContentPane().add(bSub);
		
		JButton bMul = new JButton("*");
		bMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "*";
			}
		});
		bMul.setFont(new Font("Calibri", Font.BOLD, 24));
		bMul.setBounds(458, 314, 79, 59);
		frame.getContentPane().add(bMul);
		
		JButton bDiv = new JButton("/");
		bDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "/";
			}
		});
		bDiv.setFont(new Font("Calibri", Font.BOLD, 24));
		bDiv.setBounds(456, 383, 79, 59);
		frame.getContentPane().add(bDiv);
		
		JButton bclr = new JButton("C");
		bclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		bclr.setFont(new Font("Calibri", Font.BOLD, 24));
		bclr.setBounds(369, 107, 166, 59);
		frame.getContentPane().add(bclr);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ScnC-On");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bSin.setEnabled(true);
				bCos.setEnabled(true);
				bTan.setEnabled(true);
				bSqr.setEnabled(true);
				bCube.setEnabled(true);
				bSqrt.setEnabled(true);
				bFact.setEnabled(true);
				bLog.setEnabled(true);
				bPow.setEnabled(true);
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Calibri", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(10, 448, 118, 33);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnScncoff = new JRadioButton("ScnC-Off");
		rdbtnScncoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bSin.setEnabled(false);
				bCos.setEnabled(false);
				bTan.setEnabled(false);
				bSqr.setEnabled(false);
				bCube.setEnabled(false);
				bSqrt.setEnabled(false);
				bFact.setEnabled(false);
				bLog.setEnabled(false);
				bPow.setEnabled(false);
			}
		});
		rdbtnScncoff.setFont(new Font("Calibri", Font.BOLD, 20));
		rdbtnScncoff.setBounds(415, 448, 118, 33);
		frame.getContentPane().add(rdbtnScncoff);
	}
}
