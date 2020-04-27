import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container; 
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GamesCollectionFrame extends JFrame implements ActionListener{

	public GamesCollectionFrame(){
		
		setBounds(200, 200, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(2, 2));

		JButton tikTakToe = new JButton("Tik-Tak-Toe");
		contentPane.add(tikTakToe);
		tikTakToe.addActionListener(this);

		JButton connectFour = new JButton("Connect Four");
		contentPane.add(connectFour);
		connectFour.addActionListener(this);

		JButton cardMatching = new JButton("Card Matching");
		contentPane.add(cardMatching);
		cardMatching.addActionListener(this);

		JButton random = new JButton("Random Choice");
		contentPane.add(random);
		random.addActionListener(this);


	}

	public void actionPerformed(ActionEvent e){

		Container contentPane = getContentPane();
		contentPane.removeAll();
		repaint();

	}
	
}