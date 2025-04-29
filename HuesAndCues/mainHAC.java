package HuesAndCues;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class mainHAC {
    static int x,y,points,round;
    static JButton clr0= new JButton();
    static JButton clr1 = new JButton();
    static JButton clr2 = new JButton();
    static JButton clr3 = new JButton();
    static JButton clr4 = new JButton();
    static JButton clr5 = new JButton();

    static JButton clr6 = new JButton();
    static JButton clr7 = new JButton();
    static JButton clr8 = new JButton();
    static JButton clr9 = new JButton();
    static JButton clr10 = new JButton();
    static JButton clr11 = new JButton();
    static JButton clr12 = new JButton();
    static JButton clr13 = new JButton();
            
    static JButton clr14 = new JButton();
    static JButton clr15 = new JButton();
    static JButton clr16 = new JButton();
    static JButton clr17 = new JButton();
    static JButton clr18 = new JButton();
    static JButton clr19 = new JButton();
    static JButton clr20 = new JButton();

    static JButton clr21 = new JButton();
    static JButton clr22 = new JButton();
    static JButton clr23 = new JButton();
    static JButton clr24 = new JButton();
    static JButton clr25 = new JButton();
    static JButton clr26 = new JButton();
    static JButton clr27 = new JButton();

    static JButton clr28 = new JButton();
    static JButton clr29 = new JButton();
    static JButton clr30 = new JButton();
    static JButton clr31 = new JButton();
    static JButton clr32 = new JButton();
    static JButton clr33 = new JButton();
    static JButton clr34 = new JButton();

    static JButton clr35 = new JButton();
    static JButton clr36 = new JButton();
    static JButton clr37 = new JButton();
    static JButton clr38 = new JButton();
    static JButton clr39 = new JButton();
    static JButton clr40 = new JButton();
    static JButton clr41 = new JButton();

    static JButton clr42 = new JButton();
    static JButton clr43 = new JButton();
    static JButton clr44 = new JButton();
    static JButton clr45 = new JButton();
    static JButton clr46 = new JButton();
    static JButton clr47 = new JButton();
    static JButton clr48 = new JButton();
    
    static JButton clr49 = new JButton();
    static JButton clr50 = new JButton();
    static JButton clr51 = new JButton();
    static JButton clr52 = new JButton();
    static JButton clr53 = new JButton();
    static JButton clr54 = new JButton();
    static JButton clr55 = new JButton();

    static String[] clrcue0 = {"Wood", "Brick", "Liver"};
    static String[] clrcue1 = {"Firetruck", "Stop Sign", "Phonebooth"};
    static String[] clrcue2 = {"Coca Cola", "Ferrari", "Youtube"};
    static String[] clrcue3 = {"Matador", "Flamenco", "Kraft"};
    static String[] clrcue4 = {"Taco Bell", "Pink Highlighter", "T-Mobile"};
    static String[] clrcue5 = {"Grapes", "Nidoking", "Sableye" };
    static String[] clrcue6 = {"Hallmark", "Milka", "Twitch" };

    static String[] clrcue7 = {"Dirt", "Tree Branches", "Cinnamon"};
    static String[] clrcue8 = {"OnePlus", "Reddit", "Strawberries"};
    static String[] clrcue9 = {"Salmon", "Lips", "Houston Rockets"};
    static String[] clrcue10 = {"Barbie", "Leni Robredo", "Dragonfruit"};
    static String[] clrcue11 = {"Frutos Grape", "Wonka", "Gligar"};
    static String[] clrcue12 = {"Eggplant", "Viber", "Messenger"};
    static String[] clrcue13 = {"Yahoo", "Cadbury", "LA Lakers"};

    static String[] clrcue14 = {"GS Warriors", "Brown Sugar", "Raichu"};
    static String[] clrcue15 = {"Gatorade", "Papaya", "Frutos Orange"};
    static String[] clrcue16 = {"Peach", "Igglybuff", "Mew"};
    static String[] clrcue17 = {"Inter Miami", "Corsola", "Flaafy"};
    static String[] clrcue18 = {"Amethyst", "Ditto", "Goodra"};
    static String[] clrcue19 = {"Gengar","Premier League", "Sacramento Kings"};
    static String[] clrcue20 = {"Mr. Rime", "Skorupi", "Gubat"};

    static String[] clrcue21 = {"Pikachu", "Jolteon", "Helioptile"};
    static String[] clrcue22 = {"Crayon Skin Color", "Cufant", "Moltres"};
    static String[] clrcue23 = {"Pale Skin", "Jigglypuff", "Hattena"};
    static String[] clrcue24 = {"Sunset Pink", "Whismur", "Espeon"};
    static String[] clrcue25 = {"Apple Logo", "Basically Gray", "Venomoth"};
    static String[] clrcue26 = {"Swalot", "Mienshao", "Gliscor"};
    static String[] clrcue27 = {"Corviknight", "Taillow", "Whiscash"};

    static String[] clrcue28 = {"Cooking Oil", "Chingling", "Shuckle"};
    static String[] clrcue29 = {"Dunsparce", "Numel", "Psyduck"};
    static String[] clrcue30 = {"Mimikyu", "Lunatone", "Meowth"};
    static String[] clrcue31 = {"Remoraid", "Avalugg", "Komala"};
    static String[] clrcue32 = {"Carbink", "Glailie", "Machop"};
    static String[] clrcue33 = {"Dratini", "Barboach", "Pupitar"};
    static String[] clrcue34 = {"Facebook", "Articuno", "Blastoise"};

    static String[] clrcue35 = {"Lemon", "Beedrill", "Jirachi"};
    static String[] clrcue36 = {"Leafeon", "Petilil", "Breloom"};
    static String[] clrcue37 = {"Chikorita", "Celebi", "Cacturne"};
    static String[] clrcue38 = {"Woobat", "Bagon", "Amaura"};
    static String[] clrcue39 = {"Arctovish", "Arctovolt", "Elgyem"};
    static String[] clrcue40 = {"Twitter", "Lucario", "Marill"};
    static String[] clrcue41 = {"GCash", "Samurott", "Seismitoad"};

    static String[] clrcue42 = {"Thwackey", "Victreebel", "Weepinbell"};
    static String[] clrcue43 = {"Grass", "Leaves", "Treecko"};
    static String[] clrcue44 = {"Matcha", "Cacnea", "Grovyle"};
    static String[] clrcue45 = {"Mint", "Lombre", "Rayquaza"};
    static String[] clrcue46 = {"Dracapult", "Bulbasaur", "Solosis"};
    static String[] clrcue47 = {"Manchester City FC", "Feraligatr", "Horsea"};
    static String[] clrcue48 = {"Water in Art", "Chelsea FC", "Popplio"};

    static String[] clrcue49 = {"Politoad", "Metapod", "Caterpie"};
    static String[] clrcue50 = {"Whatsapp", "Carnivine", "Sceptile"};
    static String[] clrcue51 = {"Crayon Green", "PayMaya", "Basculin"};
    static String[] clrcue52 = {"GTA Cash", "Landbank", "Electrike"};
    static String[] clrcue53 = {"Fresh Grass", "Virizon", "Scyther"};
    static String[] clrcue54 = {"Minecraft Diamond", "Golurk", "Ivysaur"};
    static String[] clrcue55 = {"Water Jug", "Froakie", "Golduck"};

    static JButton[][] clrs = {{clr0,clr1,clr2,clr3,clr4,clr5,clr6},
                               {clr7,clr8,clr9,clr10,clr11,clr12,clr13},
                               {clr14,clr15,clr16,clr17,clr18,clr19,clr20},
                               {clr21,clr22,clr23,clr24,clr25,clr26,clr27},
                               {clr28,clr29,clr30,clr31,clr32,clr33,clr34},
                               {clr35,clr36,clr37,clr38,clr39,clr40,clr41},
                               {clr42,clr43,clr44,clr45,clr46,clr47,clr48},
                               {clr49,clr50,clr51,clr52,clr53,clr54,clr55}};

    static String[][][] clrscue = {{clrcue0,clrcue1,clrcue2,clrcue3,clrcue4,clrcue5,clrcue6},
                                   {clrcue7,clrcue8,clrcue9,clrcue10,clrcue11,clrcue12,clrcue13},
                                   {clrcue14,clrcue15,clrcue16,clrcue17,clrcue18,clrcue19,clrcue20},
                                   {clrcue21,clrcue22,clrcue23,clrcue24,clrcue25,clrcue26,clrcue27},
                                   {clrcue28,clrcue29,clrcue30,clrcue31,clrcue32,clrcue33,clrcue34},
                                   {clrcue35,clrcue36,clrcue37,clrcue38,clrcue39,clrcue40,clrcue41},
                                   {clrcue42,clrcue43,clrcue44,clrcue45,clrcue46,clrcue47,clrcue48},
                                   {clrcue49,clrcue50,clrcue51,clrcue52,clrcue53,clrcue54,clrcue55}};

    static JFrame frame = new JFrame("CMSC 122 Machine Problem");
    static JPanel bPanel = new JPanel() {
        java.net.URL imgTwoUrl = getClass().getResource("HaC_final.jpg");
        private ImageIcon backgroundImage = new ImageIcon(imgTwoUrl);

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                int width = getWidth();
                int height = getHeight();
                g.drawImage(backgroundImage.getImage(), 0, 0, width, height, this);
            }
        }
    };
    static JPanel aboutPanel = new JPanel() { 
        java.net.URL imgOneUrl = getClass().getResource("HaC_about.png");
        private ImageIcon backgroundImage = new ImageIcon(imgOneUrl);
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                int width = getWidth();
                int height = getHeight();
                g.drawImage(backgroundImage.getImage(), 0, 0, width, height, this);
            }
        }
    };
    static JButton aboutButton = new JButton("ABOUT");
    static JButton solveButton = new JButton("SOLVE");
    static JButton exitButton = new JButton("EXIT");
    static JButton reButton = new JButton("RETURN");
    static JTextField roundField = new JTextField();
    static JTextField scoreField = new JTextField();
    static JTextField clue1Field = new JTextField();
    static JTextField clue2Field = new JTextField();
    static JTextField clue3Field = new JTextField();

    static JTextField[] cFields = {clue1Field,clue2Field,clue3Field};

    static JButton correct;
    
    public static int rowRNG(){ //randomly choose a row for correct item of round
        Random rate = new Random();
        int number=0;
        
        for(int i=1; i<=1; i++){
            number = rate.nextInt(8);
        }
        return number;
    }
    public static int colRNG(){ //randomly choose a column for correct item of round
        Random rate = new Random();
        int number=0;
        
        for(int i=1; i<=1; i++){
            number = rate.nextInt(7);
        }
        return number;
    }
    public static void clrConfig(){ //add characteristics and functions to buttons
        //row 1
        clr0.setBounds(62, 250, 45, 45);
        clr0.setBackground(new Color(0x6a2810));
        
        clr1.setBounds(112, 250, 45, 45);
        clr1.setBackground(new Color(0xc62127));
        
        clr2.setBounds(161, 250, 45, 45);
        clr2.setBackground(new Color(0xec1d23));
        
        clr3.setBackground(new Color(0xe91754));
        clr3.setBounds(210, 250, 45, 45);

        clr4.setBackground(new Color(0xd6138d));
        clr4.setBounds(260, 250, 45, 45);

        clr5.setBounds(310, 250, 45, 45);
        clr5.setBackground(new Color(0xa83594));

        clr6.setBounds(360, 250, 45, 45);
        clr6.setBackground(new Color(0x74429b));
        
        //row 2
        clr7.setBounds(62, 300, 45, 45);
        clr7.setBackground(new Color(0xac5b26));

        clr8.setBounds(112, 300, 45, 45);
        clr8.setBackground(new Color(0xeb3124));
        
        clr9.setBounds(161, 300, 45, 45);
        clr9.setBackground(new Color(0xef3c52));
        
        clr10.setBounds(210, 300, 45, 45);
        clr10.setBackground(new Color(0xed2c87));
        
        clr11.setBounds(260, 300, 45, 45);
        clr11.setBackground(new Color(0xbd4c9c));
        
        clr12.setBounds(310, 300, 45, 45);
        clr12.setBackground(new Color(0x954398));
        
        clr13.setBounds(360, 300, 45, 45);
        clr13.setBackground(new Color(0x5a3191));

        //row 3
        clr14.setBounds(62, 350, 45, 45);
        clr14.setBackground(new Color(0xf39b1f));
        
        clr15.setBounds(112, 350, 45, 45);
        clr15.setBackground(new Color(0xf47147));
        
        clr16.setBounds(161, 350, 45, 45);
        clr16.setBackground(new Color(0xf37781));
        
        clr17.setBounds(210, 350, 45, 45);
        clr17.setBackground(new Color(0xe76fac));
        
        clr18.setBounds(260, 350, 45, 45);
        clr18.setBackground(new Color(0xae67ab));
        
        clr19.setBounds(310, 350, 45, 45);
        clr19.setBackground(new Color(0x8551a3));
        
        clr20.setBounds(360, 350, 45, 45);
        clr20.setBackground(new Color(0x342b86));

        //row4
        clr21.setBounds(62, 400, 45, 45);
        clr21.setBackground(new Color(0xfdc029));
        
        clr22.setBounds(112, 400, 45, 45);
        clr22.setBackground(new Color(0xf9a26d));
        
        clr23.setBounds(161, 400, 45, 45);
        clr23.setBackground(new Color(0xf59d9b));
        
        clr24.setBounds(210, 400, 45, 45);
        clr24.setBackground(new Color(0xe2a3ce));
        
        clr25.setBounds(260, 400, 45, 45);
        clr25.setBackground(new Color(0xa88bc1));
        
        clr26.setBounds(310, 400, 45, 45);
        clr26.setBackground(new Color(0x7464ad));
        
        clr27.setBounds(360, 400, 45, 45);
        clr27.setBackground(new Color(0x2a3088));

        //row 5
        clr28.setBounds(62, 450, 45, 45);
        clr28.setBackground(new Color(0xfeda2a));
        
        clr29.setBounds(112, 450, 45, 45);
        clr29.setBackground(new Color(0xfed56c));
        
        clr30.setBounds(161, 450, 45, 45);
        clr30.setBackground(new Color(0xe9e2b4));
        
        clr31.setBounds(210, 450, 45, 45);
        clr31.setBackground(new Color(0xc7dee4));
        
        clr32.setBounds(260, 450, 45, 45);
        clr32.setBackground(new Color(0x99bbe1));
        
        clr33.setBounds(310, 450, 45, 45);
        clr33.setBackground(new Color(0x6787c4));
        
        clr34.setBounds(360, 450, 45, 45);
        clr34.setBackground(new Color(0x2746a0));

        //row 6
        clr35.setBounds(62, 500, 45, 45);
        clr35.setBackground(new Color(0xf6ef3f));
        
        clr36.setBounds(112, 500, 45, 45);
        clr36.setBackground(new Color(0xe0e885));
        
        clr37.setBounds(161, 500, 45, 45);
        clr37.setBackground(new Color(0xb5dba2));
        
        clr38.setBounds(210, 500, 45, 45);
        clr38.setBackground(new Color(0xaedcda));
        
        clr39.setBounds(260, 500, 45, 45);
        clr39.setBackground(new Color(0x89d7ed));
        
        clr40.setBounds(310, 500, 45, 45);
        clr40.setBackground(new Color(0x59abdd));

        clr41.setBounds(360, 500, 45, 45);
        clr41.setBackground(new Color(0x335cab));

        //row 7
        clr42.setBounds(62, 550, 45, 45);
        clr42.setBackground(new Color(0xdce027));
        
        clr43.setBounds(112, 550, 45, 45);
        clr43.setBackground(new Color(0xa0cc51));
        
        clr44.setBounds(161, 550, 45, 45);
        clr44.setBackground(new Color(0x6fc270));
        
        clr45.setBounds(210, 550, 45, 45);
        clr45.setBackground(new Color(0x70c695));
        
        clr46.setBounds(260, 550, 45, 45);
        clr46.setBackground(new Color(0x6bc6b4));
        
        clr47.setBounds(310, 550, 45, 45);
        clr47.setBackground(new Color(0x2fc4dc));
        
        clr48.setBounds(360, 550, 45, 45);
        clr48.setBackground(new Color(0x2d73b8));

        //row 8
        clr49.setBounds(62, 602, 45, 45);
        clr49.setBackground(new Color(0x9ac53f));
        
        clr50.setBounds(112, 602, 45, 45);
        clr50.setBackground(new Color(0x54a848));
        
        clr51.setBounds(161, 602, 45, 45);
        clr51.setBackground(new Color(0x2fa247));
        
        clr52.setBounds(210, 602, 45, 45);
        clr52.setBackground(new Color(0x37b65d));
        
        clr53.setBounds(260, 602, 45, 45);
        clr53.setBackground(new Color(0x51bc78));
        
        clr54.setBounds(310, 602, 45, 45);
        clr54.setBackground(new Color(0x39bea9));
        
        clr55.setBounds(360, 602, 45, 45);
        clr55.setBackground(new Color(0x19a1dd));

        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                addButtonFunc(clrs[i][j]);
            }
        }
    }
    public static void frameConfig(){ // creates frame and adds characteristics
        SwingUtilities.invokeLater(() -> {
            frame.setSize(480, 720);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            clrConfig();

            bPanel.add(clr0);
            bPanel.add(clr1);
            bPanel.add(clr2);
            bPanel.add(clr3);
            bPanel.add(clr4);
            bPanel.add(clr5);
            bPanel.add(clr6);
            bPanel.add(clr7);
            bPanel.add(clr8);
            bPanel.add(clr9);
            bPanel.add(clr10);
            bPanel.add(clr11);
            bPanel.add(clr12);
            bPanel.add(clr13);
            bPanel.add(clr14);
            bPanel.add(clr15);
            bPanel.add(clr16);
            bPanel.add(clr17);
            bPanel.add(clr18);
            bPanel.add(clr19);
            bPanel.add(clr20);
            bPanel.add(clr21);
            bPanel.add(clr22);
            bPanel.add(clr23);
            bPanel.add(clr24);
            bPanel.add(clr25);
            bPanel.add(clr26);
            bPanel.add(clr27);
            bPanel.add(clr28);
            bPanel.add(clr29);
            bPanel.add(clr30);
            bPanel.add(clr31);
            bPanel.add(clr32);
            bPanel.add(clr33);
            bPanel.add(clr34);
            bPanel.add(clr35);
            bPanel.add(clr36);
            bPanel.add(clr37);
            bPanel.add(clr38);
            bPanel.add(clr39);
            bPanel.add(clr40);
            bPanel.add(clr41);
            bPanel.add(clr42);
            bPanel.add(clr43);
            bPanel.add(clr44);
            bPanel.add(clr45);
            bPanel.add(clr46);
            bPanel.add(clr47);
            bPanel.add(clr48);
            bPanel.add(clr49);
            bPanel.add(clr50);
            bPanel.add(clr51);
            bPanel.add(clr52);
            bPanel.add(clr53);
            bPanel.add(clr54);
            bPanel.add(clr55);

            aboutButton.setBounds(300, 165, 65, 25);
            aboutButton.setFont(new Font("Bahnschrift",0,10));
            aboutButton.setForeground(new Color(0xefefef));
            aboutButton.setBackground(new Color(0x000000));

            solveButton.setBounds(370, 165, 65, 25);
            solveButton.setFont(new Font("Bahnschrift",0,10));
            solveButton.setForeground(new Color(0xefefef));
            solveButton.setBackground(new Color(0x000000));

            exitButton.setBounds(370, 195, 65, 25);
            exitButton.setFont(new Font("Bahnschrift",0,10));
            exitButton.setForeground(new Color(0xefefef));
            exitButton.setBackground(new Color(0x000000));

            bPanel.add(aboutButton);
            bPanel.add(solveButton);
            bPanel.add(exitButton);

            reButton.setBounds(165, 591, 135, 45);
            reButton.setFont(new Font("Bahnschrift",0,24));
            reButton.setForeground(new Color(0xefefef));
            reButton.setBackground(new Color(0x000000));
            aboutPanel.add(reButton);

            roundField.setBounds(88,20,50,25);
            roundField.setBackground(new Color(0x000000));
            roundField.setForeground(new Color(0xffffff));
            roundField.setEditable(false);
            roundField.setFont(new Font("Bahnschrift",0,24));
            roundField.setHorizontalAlignment(JTextField.CENTER);
            roundField.setBorder(null);
            bPanel.add(roundField);

            scoreField.setBounds(221,20,50,25);
            scoreField.setBackground(new Color(0x000000));
            scoreField.setForeground(new Color(0xffffff));
            scoreField.setEditable(false);
            scoreField.setFont(new Font("Bahnschrift",0,24));
            roundField.setHorizontalAlignment(JTextField.CENTER);
            scoreField.setBorder(null);
            bPanel.add(scoreField);

            clue1Field.setBounds(42,71,230,30);
            clue1Field.setBackground(new Color(0x000000));
            clue1Field.setForeground(new Color(0xffffff));
            clue1Field.setEditable(false);
            clue1Field.setFont(new Font("Bahnschrift",0,24));
            clue1Field.setBorder(null);
            bPanel.add(clue1Field);

            clue2Field.setBounds(42,124,230,30);
            clue2Field.setBackground(new Color(0x000000));
            clue2Field.setForeground(new Color(0xffffff));
            clue2Field.setEditable(false);
            clue2Field.setFont(new Font("Bahnschrift",0,24));
            clue2Field.setBorder(null);
            bPanel.add(clue2Field);

            clue3Field.setBounds(42,174,230,30);
            clue3Field.setBackground(new Color(0x000000));
            clue3Field.setForeground(new Color(0xffffff));
            clue3Field.setEditable(false);
            clue3Field.setFont(new Font("Bahnschrift",0,24));
            clue3Field.setBorder(null);
            bPanel.add(clue3Field);

            aboutButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.getContentPane().remove(bPanel);
                    frame.getContentPane().add(aboutPanel);
                    frame.revalidate();
                    frame.repaint();
                }
            });
            solveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    giveAnswer();
                }
            });
            reButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.getContentPane().remove(aboutPanel);
                    frame.getContentPane().add(bPanel);
                    frame.revalidate();
                    frame.repaint();
                }
            });
            exitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            bPanel.setLayout(null);
            aboutPanel.setLayout(null);

            frame.getContentPane().add(bPanel);
            frame.setVisible(true);
        });
    }
    public static void gameStart(){ //to call start of program
        x = rowRNG();
        y = colRNG();
        round = 0;
        correct = clrs[x][y];
        frameConfig();
        roundField.setText(String.valueOf(round+1));
        cFields[round].setText(clrscue[x][y][round]);
    }
    public static void giveAnswer(){ //ask for solution/ solve button function
        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                if(i==x-2 && j==y-2){ clrs[i][j].setText("1"); } //col 1
                else if(i==x-1 && j==y-2){ clrs[i][j].setText("1"); }
                else if(i==x && j==y-2){ clrs[i][j].setText("1"); }
                else if(i==x+1 && j==y-2){ clrs[i][j].setText("1"); }
                else if(i==x+2 && j==y-2){ clrs[i][j].setText("1"); }
                else if(i==x-2 && j==y-1){ clrs[i][j].setText("1"); } //col 2
                else if(i==x-1 && j==y-1){ clrs[i][j].setText("2"); } 
                else if(i==x && j==y-1){ clrs[i][j].setText("2"); }
                else if(i==x+1 && j==y-1){ clrs[i][j].setText("2");}
                else if(i==x+2 && j==y-1){ clrs[i][j].setText("1"); }
                else if(i==x-2 && j==y){ clrs[i][j].setText("1"); } //col 3
                else if(i==x-1 && j==y){ clrs[i][j].setText("2"); }
                else if(i==x && j==y){ clrs[i][j].setText("3"); }
                else if(i==x+1 && j==y){ clrs[i][j].setText("2"); }
                else if(i==x+2 && j==y){ clrs[i][j].setText("1"); }
                else if(i==x-2 && j==y+1){ clrs[i][j].setText("1"); } //col 4
                else if(i==x-1 && j==y+1){ clrs[i][j].setText("2"); }
                else if(i==x && j==y+1){ clrs[i][j].setText("2"); }
                else if(i==x+1 && j==y+1){ clrs[i][j].setText("2"); }
                else if(i==x+2 && j==y+1){ clrs[i][j].setText("1"); }
                else if(i==x-2 && j==y+2){ clrs[i][j].setText("1"); } //col 5
                else if(i==x-1 && j==y+2){ clrs[i][j].setText("1"); }
                else if(i==x && j==y+2){ clrs[i][j].setText("1"); }
                else if(i==x+1 && j==y+2){ clrs[i][j].setText("1"); }
                else if(i==x+2 && j==y+2){ clrs[i][j].setText("1"); }

                clrs[i][j].setFont(new Font("Bahnschrift",0,20));
                clrs[i][j].setEnabled(false);
            }
        }
    }
    public static void endGame(){ //called at the end of 3rd round
        scoreField.setText(String.valueOf(points));
        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                clrs[i][j].setEnabled(false);
            }
        }
        giveAnswer();
    }
    public static void addButtonFunc(JButton b){ //main button functions/ puzzle solving algorithm
        b.addActionListener(new ActionListener() {
            int choiceX,choiceY;
            @Override
            public void actionPerformed(ActionEvent e) {
                round++;
                
                if(round <3){
                    cFields[round].setText(clrscue[x][y][round]);
                    roundField.setText(String.valueOf(round+1));
                }
                for(int i=0;i<8;i++){
                    for(int j=0;j<7;j++){
                        if(clrs[i][j]==b){
                            choiceX = i;
                            choiceY = j;
                        }
                    }
                }
                //col 1
                if(x-choiceX==2 && y-choiceY==2){ points=points+1; }
                else if(x-choiceX==1 && y-choiceY==2){ points=points+1; }
                else if(choiceX==x && y-choiceY==2){ points=points+1; }
                else if(choiceX-x==1 && y-choiceY==2){ points=points+1; }
                else if(choiceX-x==2 && y-choiceY==2){ points=points+1; }
                //col 2
                else if(x-choiceX==2 && y-choiceY==1){ points=points+1; } 
                else if(x-choiceX==1 && y-choiceY==1){ points=points+2; } 
                else if(choiceX==x && y-choiceY==1){ points=points+2; }
                else if(choiceX-x==1 && y-choiceY==1){ points=points+2;}
                else if(choiceX-x==2 && y-choiceY==1){ points=points+1; }
                //col 3
                else if(x-choiceX==2 && choiceY==y){ points=points+1; } 
                else if(x-choiceX==1 && choiceY==y){ points=points+2; }
                else if(choiceX==x && choiceY==y){ points=points+3; }
                else if(choiceX-x==1 && choiceY==y){ points=points+2; }
                else if(choiceX-x==2 && choiceY==y){ points=points+1; }
                //col 4
                else if(x-choiceX==2 && choiceY-y==1){ points=points+1; } 
                else if(x-choiceX==1 && choiceY-y==1){ points=points+2; }
                else if(choiceX==x && choiceY-y==1){ points=points+2; }
                else if(choiceX-x==1 && choiceY-y==1){ points=points+2; }
                else if(choiceX-x==2 && choiceY-y==1){ points=points+1; }
                //col 5
                else if(x-choiceX==2 && choiceY-y==2){ points=points+1; } 
                else if(x-choiceX==1 && choiceY-y==2){ points=points+1; }
                else if(choiceX==x && choiceY-y==2){ points=points+1; }
                else if(choiceX-x==1 && choiceY-y==2){ points=points+1; }
                else if(choiceX-x==2 && choiceY-y==2){ points=points+1; }
                if(round==3){
                    endGame();
                }
                b.setEnabled(false);
            }
        });
    }

    public static void main(String[] args) {
        gameStart();
    }
}