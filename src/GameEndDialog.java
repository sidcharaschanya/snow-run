import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class GameEndDialog extends JDialog implements ActionListener, MouseListener {

    JButton bMenu;
    JLabel lblTitle, lblScore, lblLives, lblLevel;
    JPanel P;
    GridBagLayout GL;
    GridBagConstraints GBC;

    Font F = new Font("Monaco", Font.BOLD, 60);

    Image MBI = (new ImageIcon(getClass().getResource("/MenuButton.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);
    Image MBO = (new ImageIcon(getClass().getResource("/MenuButtonOver.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);
    Image MBP = (new ImageIcon(getClass().getResource("/MenuButtonPressed.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);

    GameEndDialog(char a, int s, int l, int lvl) {
        if (a == 'e') {
            setTitle("You Exit");
            lblTitle = new JLabel("You Exit");
        }
        if (a == 'l') {
            setTitle("You Lost!");
            lblTitle = new JLabel("You Lost!");
        }
        if (a == 'w') {
            setTitle("You Won!");
            lblTitle = new JLabel("You Won!");
        }

        lblTitle.setFont(F);
        lblTitle.setForeground(Color.white);
        lblTitle.setSize(400, 100);
        lblTitle.setHorizontalAlignment(JLabel.CENTER);

        bMenu = new JButton();
        bMenu.setIcon(new ImageIcon(MBI));
        bMenu.setBorderPainted(false);
        bMenu.setOpaque(false);
        bMenu.setContentAreaFilled(false);
        bMenu.addActionListener(this);
        bMenu.addMouseListener(this);

        lblScore = new JLabel("Score: " + s);
        lblScore.setFont(F);
        lblScore.setForeground(Color.white);
        lblScore.setSize(400, 100);
        lblScore.setHorizontalAlignment(JLabel.CENTER);

        lblLives = new JLabel("Lives: " + l);
        lblLives.setFont(F);
        lblLives.setForeground(Color.white);
        lblLives.setSize(400, 100);
        lblLives.setHorizontalAlignment(JLabel.CENTER);

        lblLevel = new JLabel("Level: " + lvl);
        lblLevel.setFont(F);
        lblLevel.setForeground(Color.white);
        lblLevel.setSize(400, 100);
        lblLevel.setHorizontalAlignment(JLabel.CENTER);

        P = new JPanel();
        GL = new GridBagLayout();
        GBC = new GridBagConstraints();
        P.setLayout(GL);
        P.setBackground(Color.darkGray);
        getContentPane().add(P);

        addComponent(lblTitle, P, GL, GBC, 0, 0, 1, 1, 36, 0);
        addComponent(lblScore, P, GL, GBC, 0, 1, 1, 1, 36, 0);
        addComponent(lblLives, P, GL, GBC, 0, 2, 1, 1, 36, 0);
        addComponent(lblLevel, P, GL, GBC, 0, 3, 1, 1, 36, 0);
        addComponent(bMenu, P, GL, GBC, 0, 4, 1, 1, 36, 36);

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setSize(1280, 740);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void addComponent(Component Co, Container C, GridBagLayout G, GridBagConstraints gbc, int x, int y, int w, int h, int t, int b) {
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;
        gbc.insets = new Insets(t, 0, b, 0);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.BOTH;
        G.setConstraints(Co, gbc);
        C.add(Co);
    }

    public void actionPerformed(ActionEvent A) {
        dispose();
    }

    public void mouseEntered(MouseEvent M) {
        bMenu.setIcon(new ImageIcon(MBO));
    }

    public void mouseExited(MouseEvent M) {
        bMenu.setIcon(new ImageIcon(MBI));
    }

    public void mouseClicked(MouseEvent M) {
    }

    public void mousePressed(MouseEvent M) {
        bMenu.setIcon(new ImageIcon(MBP));
    }

    public void mouseReleased(MouseEvent M) {
    }
}
