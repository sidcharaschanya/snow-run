import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class HowToDialog extends JDialog implements ActionListener, MouseListener {

    JButton bBack;
    JLabel lblHowTo, lblAbout, lblRight, lblLeft, lblUp, lblEsc, txtRight, txtLeft, txtUp, txtEsc;
    JTextArea txtAbout;
    JPanel P;
    GridBagLayout GL;
    GridBagConstraints GBC;

    Font F = new Font("Monaco", Font.BOLD, 60);
    Font A = new Font("Monaco", Font.PLAIN, 18);

    Image HTT = (new ImageIcon(getClass().getResource("/HowToTitle.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);

    Image BBI = (new ImageIcon(getClass().getResource("/BackButton.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);
    Image BBO = (new ImageIcon(getClass().getResource("/BackButtonOver.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);
    Image BBP = (new ImageIcon(getClass().getResource("/BackButtonPressed.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);

    Image LK = (new ImageIcon(getClass().getResource("/LeftKey.png"))).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
    Image RK = (new ImageIcon(getClass().getResource("/RightKey.png"))).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
    Image UK = (new ImageIcon(getClass().getResource("/UpKey.png"))).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
    Image EK = (new ImageIcon(getClass().getResource("/EscapeKey.png"))).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

    HowToDialog() {
        setTitle("How To?");

        bBack = new JButton();
        bBack.setIcon(new ImageIcon(BBI));
        bBack.setBorderPainted(false);
        bBack.setOpaque(false);
        bBack.setContentAreaFilled(false);
        bBack.addActionListener(this);
        bBack.addMouseListener(this);

        lblHowTo = new JLabel();
        lblHowTo.setHorizontalAlignment(JLabel.CENTER);
        lblHowTo.setIcon(new ImageIcon(HTT));

        lblAbout = new JLabel("ABOUT");
        lblAbout.setFont(F);
        lblAbout.setForeground(Color.white);
        lblAbout.setSize(400, 100);
        lblAbout.setHorizontalAlignment(JLabel.CENTER);

        lblRight = new JLabel();
        lblRight.setHorizontalAlignment(JLabel.CENTER);
        lblRight.setIcon(new ImageIcon(RK));

        lblLeft = new JLabel();
        lblLeft.setHorizontalAlignment(JLabel.CENTER);
        lblLeft.setIcon(new ImageIcon(LK));

        lblUp = new JLabel();
        lblUp.setHorizontalAlignment(JLabel.CENTER);
        lblUp.setIcon(new ImageIcon(UK));

        lblEsc = new JLabel();
        lblEsc.setHorizontalAlignment(JLabel.CENTER);
        lblEsc.setIcon(new ImageIcon(EK));

        txtAbout = new JTextArea("A classic, arcade-style platform\ngame, accentuated by an underlying\nsnow theme.\n\nAim:\nMr. Snowman has lost all of his\ntreasure in the wild. He needs\nyour help to find his missing\ntreasure. Are you up for a snow\nrun?");
        txtAbout.setOpaque(false);
        txtAbout.setEditable(false);
        txtAbout.setFont(A);
        txtAbout.setForeground(Color.white);
        txtAbout.setSize(400, 233);

        txtRight = new JLabel("Move Right");
        txtRight.setFont(F);
        txtRight.setForeground(Color.white);
        txtRight.setSize(400, 100);

        txtLeft = new JLabel("Move Left");
        txtLeft.setFont(F);
        txtLeft.setForeground(Color.white);
        txtLeft.setSize(400, 100);

        txtUp = new JLabel("Jump");
        txtUp.setFont(F);
        txtUp.setForeground(Color.white);
        txtUp.setSize(400, 100);

        txtEsc = new JLabel("Exit Game");
        txtEsc.setFont(F);
        txtEsc.setForeground(Color.white);
        txtEsc.setSize(400, 100);

        P = new JPanel();
        GL = new GridBagLayout();
        GBC = new GridBagConstraints();
        P.setLayout(GL);
        P.setBackground(Color.darkGray);
        getContentPane().add(P);

        addComponent(lblHowTo, P, GL, GBC, 1, 0, 1, 1, 36, 0, 20, 20);

        addComponent(lblAbout, P, GL, GBC, 0, 1, 1, 1, 36, 0, 20, 0);
        addComponent(txtAbout, P, GL, GBC, 0, 2, 1, 2, 36, 0, 50, 0);

        addComponent(lblRight, P, GL, GBC, 1, 1, 1, 1, 36, 0, 150, 150);
        addComponent(txtRight, P, GL, GBC, 2, 1, 1, 1, 36, 0, 20, 50);

        addComponent(lblLeft, P, GL, GBC, 1, 2, 1, 1, 36, 0, 150, 150);
        addComponent(txtLeft, P, GL, GBC, 2, 2, 1, 1, 36, 0, 20, 50);

        addComponent(lblUp, P, GL, GBC, 1, 3, 1, 1, 36, 0, 150, 150);
        addComponent(txtUp, P, GL, GBC, 2, 3, 1, 1, 36, 0, 20, 50);

        addComponent(lblEsc, P, GL, GBC, 1, 4, 1, 1, 36, 36, 150, 150);
        addComponent(txtEsc, P, GL, GBC, 2, 4, 1, 1, 36, 36, 20, 50);

        addComponent(bBack, P, GL, GBC, 0, 4, 1, 1, 36, 36, 20, 0);

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setSize(1280, 740);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void addComponent(Component Co, Container C, GridBagLayout G, GridBagConstraints gbc, int x, int y, int w, int h, int t, int b, int l, int r) {
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;
        gbc.insets = new Insets(t, l, b, r);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.BOTH;
        G.setConstraints(Co, gbc);
        C.add(Co);
    }

    public void actionPerformed(ActionEvent A) {
        dispose();
    }

    public void mouseEntered(MouseEvent M) {
        bBack.setIcon(new ImageIcon(BBO));
    }

    public void mouseExited(MouseEvent M) {
        bBack.setIcon(new ImageIcon(BBI));
    }

    public void mouseClicked(MouseEvent M) {
    }

    public void mousePressed(MouseEvent M) {
        bBack.setIcon(new ImageIcon(BBP));
    }

    public void mouseReleased(MouseEvent M) {
    }
}
