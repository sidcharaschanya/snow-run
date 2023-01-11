import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Dialog.ModalityType;

class SnowRun extends JFrame implements ActionListener, MouseListener {

    JLabel lblBGI, lblSnowRun;
    JButton bPlay, bHowTo, bQuit;
    BackPanel P;
    GridBagLayout GL;
    GridBagConstraints GBC;

    ImageIcon BGI = new ImageIcon(getClass().getResource("/Background.png"));

    Image SRT = (new ImageIcon(getClass().getResource("/SnowRunTitle.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);

    Image PBI = (new ImageIcon(getClass().getResource("/SnowPlayButton.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);
    Image HBI = (new ImageIcon(getClass().getResource("/SnowHowToButton.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);
    Image QBI = (new ImageIcon(getClass().getResource("/SnowQuitButton.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);

    Image PBO = (new ImageIcon(getClass().getResource("/SnowPlayButtonOver.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);
    Image HBO = (new ImageIcon(getClass().getResource("/SnowHowToButtonOver.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);
    Image QBO = (new ImageIcon(getClass().getResource("/SnowQuitButtonOver.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);

    Image PBP = (new ImageIcon(getClass().getResource("/SnowPlayButtonPressed.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);
    Image HBP = (new ImageIcon(getClass().getResource("/SnowHowToButtonPressed.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);
    Image QBP = (new ImageIcon(getClass().getResource("/SnowQuitButtonPressed.png"))).getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);

    ImageIcon PSR = new ImageIcon(getClass().getResource("/PlayerStandingRight.png"));

    SnowRun() {
        super("Snow Run");

        lblBGI = new JLabel();
        lblBGI.setIcon(new ImageIcon(BGI.getImage()));
        lblBGI.setLayout(new BorderLayout());

        lblSnowRun = new JLabel();
        lblSnowRun.setIcon(new ImageIcon(SRT));
        lblSnowRun.setHorizontalAlignment(JLabel.CENTER);

        bPlay = new JButton();
        bPlay.setIcon(new ImageIcon(PBI));
        bPlay.setBorderPainted(false);
        bPlay.setOpaque(false);
        bPlay.setContentAreaFilled(false);

        bHowTo = new JButton();
        bHowTo.setIcon(new ImageIcon(HBI));
        bHowTo.setBorderPainted(false);
        bHowTo.setOpaque(false);
        bHowTo.setContentAreaFilled(false);

        bQuit = new JButton();
        bQuit.setIcon(new ImageIcon(QBI));
        bQuit.setBorderPainted(false);
        bQuit.setOpaque(false);
        bQuit.setContentAreaFilled(false);

        bPlay.addActionListener(this);
        bPlay.addMouseListener(this);

        bHowTo.addActionListener(this);
        bHowTo.addMouseListener(this);

        bQuit.addActionListener(this);
        bQuit.addMouseListener(this);

        P = new BackPanel();
        GL = new GridBagLayout();
        GBC = new GridBagConstraints();
        P.setLayout(GL);
        P.setBackgroundImage(BGI.getImage());

        addComponent(lblSnowRun, P, GL, GBC, 0, 0, 1, 1, 64, 0);
        addComponent(bPlay, P, GL, GBC, 0, 1, 1, 1, 64, 0);
        addComponent(bHowTo, P, GL, GBC, 0, 2, 1, 1, 64, 0);
        addComponent(bQuit, P, GL, GBC, 0, 3, 1, 1, 64, 64);

        getContentPane().add(P);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        if (A.getSource() == bPlay) {
            new GameFrame(this, "", ModalityType.DOCUMENT_MODAL);
        } else if (A.getSource() == bHowTo) {
            new HowToDialog();
        } else {
            System.exit(0);
        }
    }

    public void mouseEntered(MouseEvent M) {
        if (M.getSource() == bPlay) {
            bPlay.setIcon(new ImageIcon(PBO));
        } else {
            if (M.getSource() == bHowTo) {
                bHowTo.setIcon(new ImageIcon(HBO));
            } else {
                bQuit.setIcon(new ImageIcon(QBO));
            }
        }
    }

    public void mouseExited(MouseEvent M) {
        if (M.getSource() == bPlay) {
            bPlay.setIcon(new ImageIcon(PBI));
        } else {
            if (M.getSource() == bHowTo) {
                bHowTo.setIcon(new ImageIcon(HBI));
            } else {
                bQuit.setIcon(new ImageIcon(QBI));
            }
        }
    }

    public void mouseClicked(MouseEvent M) {
    }

    public void mousePressed(MouseEvent M) {
        if (M.getSource() == bPlay) {
            bPlay.setIcon(new ImageIcon(PBP));
        } else {
            if (M.getSource() == bHowTo) {
                bHowTo.setIcon(new ImageIcon(HBP));
            } else {
                bQuit.setIcon(new ImageIcon(QBP));
            }
        }
    }

    public void mouseReleased(MouseEvent M) {
    }

    public static void main(String[] args) {
        new SnowRun();
    }
}
