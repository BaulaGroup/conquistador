package conquistador;

import conquistador.buildings.administration;
import conquistador.buildings.arsenal;
import conquistador.buildings.barrack;
import conquistador.buildings.castle;
import conquistador.buildings.farmHouse;
import conquistador.buildings.granary;
import conquistador.buildings.mineExtractor;
import conquistador.buildings.quarry;
import conquistador.buildings.stockpile;
import conquistador.buildings.weaponIndustry;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.IOException;

public class frame extends javax.swing.JFrame {
    public boolean runFlag=true;

    public boolean castleBuildFlag=false;
    public boolean quarryBuildFlag=false;
    public boolean mineExtractorBuildFlag=false;
    public boolean farmHouseBuildFlag=false;
    public boolean weaponIndustryBuildFlag=false;
    public boolean warCampBuildFlag=false;
    public boolean tradePostBuildFlag=false;
    public boolean monumentBuildFlag=false;
    //for admintration building
    public boolean popFlag = false;
    public boolean taxFlag = false;
    
    
    public boolean weaponAddFlag=false;
    public boolean weaponRemoveFlag=false;
    //farm house
    public boolean farmHouseAddFlag = false;
    public boolean farmHouseRemoveFlag = false;
    //mine extractor
    public boolean mineExtractorAddFlag = false;
    public boolean mineExtractorRemoveFlag = false;
    //barrack
    public boolean barrackFlag = false;
    public boolean castleAddFlag = false;
    public boolean castleRemoveFlag = false;
    //weapon industry
    public boolean weaponFlag = false;
    private Object jPanel1;

    /** Creates new form mainwindow */
    // JPanel  pan=new JPanel();
    // JButton as=new JButton();
    public frame() {

        initComponents();
        removepane();
        basepanel.add(menupanel1);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ground = new javax.swing.JPanel();
        barrackGround = new javax.swing.JButton();
        warCampGround = new javax.swing.JButton();
        granaryGround = new javax.swing.JButton();
        castle1Ground = new javax.swing.JButton();
        farmGround = new javax.swing.JButton();
        adminGround = new javax.swing.JButton();
        quarryGround = new javax.swing.JButton();
        statusBar = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        basepanel = new javax.swing.JPanel();
        warstatus = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        Attack = new javax.swing.JButton();
        Attack1 = new javax.swing.JButton();
        Attack2 = new javax.swing.JButton();
        Attack3 = new javax.swing.JButton();
        Attack4 = new javax.swing.JButton();
        Attack5 = new javax.swing.JButton();
        Attack6 = new javax.swing.JButton();
        Attack7 = new javax.swing.JButton();
        barrackMenu = new javax.swing.JPanel();
        addPikeman = new javax.swing.JButton();
        addSwordsman = new javax.swing.JButton();
        addMuskeeter = new javax.swing.JButton();
        addArcher = new javax.swing.JButton();
        addCrossbowman = new javax.swing.JButton();
        addKnight = new javax.swing.JButton();
        totalPikeman = new javax.swing.JLabel();
        totalSwordsman = new javax.swing.JLabel();
        totalMuskeeter = new javax.swing.JLabel();
        totalArcher = new javax.swing.JLabel();
        totalCrossbowman = new javax.swing.JLabel();
        totalKnight = new javax.swing.JLabel();
        displayPikeman = new javax.swing.JLabel();
        displaySwordsman = new javax.swing.JLabel();
        displayMuskeeter = new javax.swing.JLabel();
        displayArcher = new javax.swing.JLabel();
        displayCrossbowman = new javax.swing.JLabel();
        displayKnight = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        menupanel1 = new javax.swing.JPanel();
        Quarry = new javax.swing.JButton();
        farmHouse = new javax.swing.JButton();
        Castle = new javax.swing.JButton();
        warCamp = new javax.swing.JButton();
        Trade = new javax.swing.JButton();
        weaponindustry = new javax.swing.JButton();
        Monument = new javax.swing.JButton();
        castleMenu = new javax.swing.JPanel();
        PikemanCastle = new javax.swing.JButton();
        SwordsmanCastle = new javax.swing.JButton();
        ArcherCastle = new javax.swing.JButton();
        MuskeeterCastle = new javax.swing.JButton();
        KnightCastle = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        totalSwordsmanCastle = new javax.swing.JLabel();
        swordsmanCastle = new javax.swing.JLabel();
        totalPikemanCastle = new javax.swing.JLabel();
        pikemanCastle = new javax.swing.JLabel();
        totalArcherCastle = new javax.swing.JLabel();
        archerCastle = new javax.swing.JLabel();
        totalMuskeeterCastle = new javax.swing.JLabel();
        muskeeterCastle = new javax.swing.JLabel();
        totalKnightCastle = new javax.swing.JLabel();
        knightCastle = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        CrossbowmanCastle = new javax.swing.JButton();
        totalCrossbowmanCastle = new javax.swing.JLabel();
        crossbowmanCastle = new javax.swing.JLabel();
        farmHouseMenu = new javax.swing.JPanel();
        addFarm = new javax.swing.JButton();
        removeFarm = new javax.swing.JButton();
        totalWoodcutter = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        woodcutter = new javax.swing.JLabel();
        farmer = new javax.swing.JLabel();
        monthlyFoodExtraction = new javax.swing.JLabel();
        monthlySpendingFarm = new javax.swing.JLabel();
        monthlyWoodExtraction = new javax.swing.JLabel();
        arFarmer = new javax.swing.JButton();
        arWoodcutter = new javax.swing.JButton();
        totalFarmer = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Granary = new javax.swing.JPanel();
        food = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        consumptionrate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Armory = new javax.swing.JPanel();
        gun = new javax.swing.JLabel();
        pike = new javax.swing.JLabel();
        swordnarmour = new javax.swing.JLabel();
        bow = new javax.swing.JLabel();
        crossbow = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        mineExtractor1 = new javax.swing.JButton();
        mineExtractor2 = new javax.swing.JButton();
        mineExtractor3 = new javax.swing.JButton();
        mineExtractor4 = new javax.swing.JButton();
        mineExtractor5 = new javax.swing.JButton();
        farmHouseMenu1 = new javax.swing.JPanel();
        WarcampMenu = new javax.swing.JPanel();
        addPikeman1 = new javax.swing.JButton();
        displayKnight1 = new javax.swing.JLabel();
        addSwordsman1 = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        addMuskeeter1 = new javax.swing.JButton();
        addArcher1 = new javax.swing.JButton();
        totalSwordsman1 = new javax.swing.JLabel();
        addCrossbowman1 = new javax.swing.JButton();
        addKnight1 = new javax.swing.JButton();
        totalPikeman1 = new javax.swing.JLabel();
        displayCrossbowman1 = new javax.swing.JLabel();
        totalArcher1 = new javax.swing.JLabel();
        totalMuskeeter1 = new javax.swing.JLabel();
        totalKnight1 = new javax.swing.JLabel();
        totalCrossbowman1 = new javax.swing.JLabel();
        displaySwordsman1 = new javax.swing.JLabel();
        displayPikeman1 = new javax.swing.JLabel();
        displayArcher1 = new javax.swing.JLabel();
        displayMuskeeter1 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        WeaponIndustry = new javax.swing.JPanel();
        addSword = new javax.swing.JButton();
        addBow = new javax.swing.JButton();
        addCrossbow = new javax.swing.JButton();
        addPike = new javax.swing.JButton();
        totalBow = new javax.swing.JLabel();
        totalCrossbow = new javax.swing.JLabel();
        totalPikeWeaponIndustry = new javax.swing.JLabel();
        totalsword = new javax.swing.JLabel();
        bowWeapon = new javax.swing.JLabel();
        swordWeapon = new javax.swing.JLabel();
        pikeWeapon = new javax.swing.JLabel();
        crossbowWeapon = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        stockpile = new javax.swing.JPanel();
        stone = new javax.swing.JButton();
        iron = new javax.swing.JButton();
        wood = new javax.swing.JButton();
        Archer12 = new javax.swing.JButton();
        copper = new javax.swing.JLabel();
        wood1 = new javax.swing.JLabel();
        iron1 = new javax.swing.JLabel();
        stone1 = new javax.swing.JLabel();
        stone2 = new javax.swing.JLabel();
        iron2 = new javax.swing.JLabel();
        wood2 = new javax.swing.JLabel();
        copper1 = new javax.swing.JLabel();
        administrationMenu = new javax.swing.JPanel();
        displayTax = new javax.swing.JLabel();
        jobless = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        population = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        popularity = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        taxRate = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        popRate = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        mineExtractorMenu = new javax.swing.JPanel();
        arIron = new javax.swing.JButton();
        arCopper = new javax.swing.JButton();
        arStone = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        displayCopper = new javax.swing.JLabel();
        displayStone = new javax.swing.JLabel();
        displayIron = new javax.swing.JLabel();
        subStone = new javax.swing.JButton();
        addStone = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        totalIron = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        monthlyIronExtraction = new javax.swing.JLabel();
        monthlyCopperExtraction = new javax.swing.JLabel();
        monthlySpending = new javax.swing.JLabel();
        totalCopper = new javax.swing.JLabel();
        totalStone = new javax.swing.JLabel();
        information = new javax.swing.JPanel();
        Requirement = new javax.swing.JLabel();
        woods = new javax.swing.JLabel();
        gold = new javax.swing.JLabel();
        irons = new javax.swing.JLabel();
        stones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1000, 768));
        setModalExclusionType(null);
        setResizable(false);

        ground.setBackground(new java.awt.Color(204, 204, 204));
        ground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ground.setAlignmentX(0.0F);
        ground.setAlignmentY(0.0F);
        ground.setMaximumSize(new java.awt.Dimension(1024, 618));
        ground.setMinimumSize(new java.awt.Dimension(1024, 618));
        ground.setPreferredSize(new java.awt.Dimension(1024, 618));
        ground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                groundMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                groundMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                groundMousePressed(evt);
            }
        });

        barrackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/barrack.jpg"))); // NOI18N
        barrackGround.setToolTipText("barrack");
        barrackGround.setMaximumSize(new java.awt.Dimension(60, 60));
        barrackGround.setMinimumSize(new java.awt.Dimension(60, 60));
        barrackGround.setPreferredSize(new java.awt.Dimension(60, 60));
        barrackGround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barrackGroundActionPerformed(evt);
            }
        });

        warCampGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/warcamp.jpg"))); // NOI18N
        warCampGround.setToolTipText("armory");
        warCampGround.setMaximumSize(new java.awt.Dimension(60, 60));
        warCampGround.setMinimumSize(new java.awt.Dimension(60, 60));
        warCampGround.setPreferredSize(new java.awt.Dimension(60, 60));
        warCampGround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warCampGroundActionPerformed(evt);
            }
        });

        granaryGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/granary copy.jpg"))); // NOI18N
        granaryGround.setToolTipText("barrack");
        granaryGround.setMaximumSize(new java.awt.Dimension(60, 60));
        granaryGround.setMinimumSize(new java.awt.Dimension(60, 60));
        granaryGround.setPreferredSize(new java.awt.Dimension(60, 60));
        granaryGround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                granaryGroundActionPerformed(evt);
            }
        });

        castle1Ground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/castledownright copy (2).jpg"))); // NOI18N
        castle1Ground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                castle1GroundActionPerformed(evt);
            }
        });

        farmGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/farmhouse.jpg"))); // NOI18N
        farmGround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmGroundActionPerformed(evt);
            }
        });

        adminGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/admin.jpg"))); // NOI18N
        adminGround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminGroundActionPerformed(evt);
            }
        });

        quarryGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/quarry.jpg"))); // NOI18N
        quarryGround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quarryGroundActionPerformed(evt);
            }
        });

        statusBar.setText("jLabel3");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/weaponindustry.jpg"))); // NOI18N

        javax.swing.GroupLayout groundLayout = new javax.swing.GroupLayout(ground);
        ground.setLayout(groundLayout);
        groundLayout.setHorizontalGroup(
            groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
            .addGroup(groundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quarryGround, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(farmGround, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(734, Short.MAX_VALUE))
            .addGroup(groundLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(warCampGround, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(groundLayout.createSequentialGroup()
                        .addComponent(castle1Ground, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(adminGround, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addComponent(granaryGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(barrackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
            .addGroup(groundLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(854, Short.MAX_VALUE))
        );
        groundLayout.setVerticalGroup(
            groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groundLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quarryGround, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(farmGround, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(groundLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(adminGround, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(groundLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(castle1Ground, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(groundLayout.createSequentialGroup()
                        .addComponent(warCampGround, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(groundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(groundLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(granaryGround, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(groundLayout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(barrackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(statusBar))
        );

        basepanel.setBackground(new java.awt.Color(204, 204, 204));
        basepanel.setAlignmentX(0.0F);
        basepanel.setAlignmentY(0.0F);
        basepanel.setMaximumSize(new java.awt.Dimension(874, 150));
        basepanel.setMinimumSize(new java.awt.Dimension(874, 150));
        basepanel.setPreferredSize(new java.awt.Dimension(874, 150));
        basepanel.setVerifyInputWhenFocusTarget(false);
        basepanel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                basepanelPropertyChange(evt);
            }
        });

        warstatus.setMaximumSize(new java.awt.Dimension(874, 150));
        warstatus.setMinimumSize(new java.awt.Dimension(874, 150));
        warstatus.setPreferredSize(new java.awt.Dimension(874, 150));

        jLabel8.setText("Archers");

        jLabel14.setText("Crossbowman");

        jLabel15.setText("Swordsman");

        jLabel26.setText("Knight");

        jLabel28.setText("Pikeman");

        jLabel33.setText("Muskeeters");

        jLabel34.setText("jLabel34");

        jLabel35.setText("jLabel34");

        jLabel36.setText("jLabel34");

        jLabel37.setText("jLabel34");

        jLabel38.setText("jLabel34");

        jLabel39.setText("jLabel34");

        Attack.setText("Attack");
        Attack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttackActionPerformed(evt);
            }
        });

        Attack1.setText("Attack");
        Attack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Attack1ActionPerformed(evt);
            }
        });

        Attack2.setText("Attack");
        Attack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Attack2ActionPerformed(evt);
            }
        });

        Attack3.setText("Attack");
        Attack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Attack3ActionPerformed(evt);
            }
        });

        Attack4.setText("Attack");
        Attack4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Attack4ActionPerformed(evt);
            }
        });

        Attack5.setText("Attack");
        Attack5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Attack5ActionPerformed(evt);
            }
        });

        Attack6.setText("Withdraw War");
        Attack6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Attack6ActionPerformed(evt);
            }
        });

        Attack7.setText("Reinforcement");
        Attack7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Attack7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout warstatusLayout = new javax.swing.GroupLayout(warstatus);
        warstatus.setLayout(warstatusLayout);
        warstatusLayout.setHorizontalGroup(
            warstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warstatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(warstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel34)
                    .addComponent(Attack))
                .addGap(42, 42, 42)
                .addGroup(warstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(warstatusLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(warstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel36)))
                    .addComponent(Attack1))
                .addGap(38, 38, 38)
                .addGroup(warstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(warstatusLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(warstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel37)))
                    .addComponent(Attack2))
                .addGap(53, 53, 53)
                .addGroup(warstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel35)
                    .addComponent(Attack3))
                .addGap(59, 59, 59)
                .addGroup(warstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel38)
                    .addComponent(Attack4))
                .addGap(69, 69, 69)
                .addGroup(warstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Attack5)
                    .addComponent(jLabel39)
                    .addComponent(jLabel33))
                .addContainerGap(217, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, warstatusLayout.createSequentialGroup()
                .addContainerGap(642, Short.MAX_VALUE)
                .addComponent(Attack7)
                .addGap(18, 18, 18)
                .addComponent(Attack6)
                .addContainerGap())
        );
        warstatusLayout.setVerticalGroup(
            warstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warstatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(warstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(warstatusLayout.createSequentialGroup()
                        .addGroup(warstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(warstatusLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Attack2))
                            .addGroup(warstatusLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Attack))
                            .addGroup(warstatusLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Attack1))
                            .addGroup(warstatusLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Attack5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(warstatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Attack6)
                            .addComponent(Attack7)))
                    .addGroup(warstatusLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Attack3))
                    .addGroup(warstatusLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Attack4)))
                .addContainerGap())
        );

        barrackMenu.setBackground(new java.awt.Color(204, 204, 204));
        barrackMenu.setAlignmentX(0.0F);
        barrackMenu.setAlignmentY(0.0F);
        barrackMenu.setMaximumSize(new java.awt.Dimension(874, 150));
        barrackMenu.setMinimumSize(new java.awt.Dimension(874, 150));
        barrackMenu.setPreferredSize(new java.awt.Dimension(874, 150));
        barrackMenu.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                barrackMenuPropertyChange(evt);
            }
        });

        addPikeman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/pikeman copy.jpg"))); // NOI18N
        addPikeman.setToolTipText("Pikeman");
        addPikeman.setMaximumSize(new java.awt.Dimension(60, 60));
        addPikeman.setMinimumSize(new java.awt.Dimension(60, 60));
        addPikeman.setPreferredSize(new java.awt.Dimension(60, 60));
        addPikeman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPikemanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addPikemanMouseExited(evt);
            }
        });
        addPikeman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPikemanActionPerformed(evt);
            }
        });

        addSwordsman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/swordsman copy.jpg"))); // NOI18N
        addSwordsman.setToolTipText("Swordman");
        addSwordsman.setMaximumSize(new java.awt.Dimension(60, 60));
        addSwordsman.setMinimumSize(new java.awt.Dimension(60, 60));
        addSwordsman.setPreferredSize(new java.awt.Dimension(60, 60));
        addSwordsman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSwordsmanActionPerformed(evt);
            }
        });

        addMuskeeter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/Messman.gif"))); // NOI18N
        addMuskeeter.setToolTipText("Meceman");
        addMuskeeter.setMaximumSize(new java.awt.Dimension(60, 60));
        addMuskeeter.setMinimumSize(new java.awt.Dimension(60, 60));
        addMuskeeter.setPreferredSize(new java.awt.Dimension(60, 60));
        addMuskeeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMuskeeterActionPerformed(evt);
            }
        });

        addArcher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/archers copy.jpg"))); // NOI18N
        addArcher.setToolTipText("Archer");
        addArcher.setMaximumSize(new java.awt.Dimension(60, 60));
        addArcher.setMinimumSize(new java.awt.Dimension(60, 60));
        addArcher.setPreferredSize(new java.awt.Dimension(60, 60));
        addArcher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArcherActionPerformed(evt);
            }
        });

        addCrossbowman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/crossbowman copy.jpg"))); // NOI18N
        addCrossbowman.setToolTipText("crossbowman");
        addCrossbowman.setMaximumSize(new java.awt.Dimension(60, 60));
        addCrossbowman.setMinimumSize(new java.awt.Dimension(60, 60));
        addCrossbowman.setPreferredSize(new java.awt.Dimension(60, 60));
        addCrossbowman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addCrossbowmanMouseEntered(evt);
            }
        });
        addCrossbowman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCrossbowmanActionPerformed(evt);
            }
        });

        addKnight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/knight copy.jpg"))); // NOI18N
        addKnight.setToolTipText("knight");
        addKnight.setMaximumSize(new java.awt.Dimension(60, 60));
        addKnight.setMinimumSize(new java.awt.Dimension(60, 60));
        addKnight.setPreferredSize(new java.awt.Dimension(60, 60));
        addKnight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addKnightMouseEntered(evt);
            }
        });
        addKnight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addKnightActionPerformed(evt);
            }
        });

        totalPikeman.setText("0");

        totalSwordsman.setText("0");

        totalMuskeeter.setText("0");

        totalArcher.setText("0");

        totalCrossbowman.setText("0");

        totalKnight.setText("0");

        displayPikeman.setText("0");

        displaySwordsman.setText("0");

        displayMuskeeter.setText("0");

        displayArcher.setText("0");

        displayCrossbowman.setText("0");

        displayKnight.setText("0");

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setText("add");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barrackMenuLayout = new javax.swing.GroupLayout(barrackMenu);
        barrackMenu.setLayout(barrackMenuLayout);
        barrackMenuLayout.setHorizontalGroup(
            barrackMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barrackMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barrackMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalPikeman, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(addPikeman, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(displayPikeman, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(barrackMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalSwordsman, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addSwordsman, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displaySwordsman))
                .addGap(41, 41, 41)
                .addGroup(barrackMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalMuskeeter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMuskeeter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayMuskeeter))
                .addGap(39, 39, 39)
                .addGroup(barrackMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayArcher, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(totalArcher, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(addArcher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(barrackMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barrackMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addCrossbowman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayCrossbowman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(totalCrossbowman, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(barrackMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalKnight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addKnight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayKnight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(jButton7)
                .addGap(225, 225, 225))
        );
        barrackMenuLayout.setVerticalGroup(
            barrackMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barrackMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(barrackMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(barrackMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(barrackMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(barrackMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(totalSwordsman)
                                .addComponent(totalPikeman))
                            .addComponent(totalMuskeeter)
                            .addComponent(totalKnight))
                        .addGroup(barrackMenuLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(totalArcher)))
                    .addComponent(totalCrossbowman))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(barrackMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barrackMenuLayout.createSequentialGroup()
                        .addGroup(barrackMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addSwordsman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addMuskeeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addArcher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCrossbowman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addKnight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPikeman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(barrackMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(displayPikeman)
                            .addComponent(displaySwordsman)
                            .addComponent(displayMuskeeter)
                            .addComponent(displayCrossbowman)
                            .addComponent(displayKnight)
                            .addComponent(displayArcher)))
                    .addGroup(barrackMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(33, 33, 33)))
                .addGap(31, 31, 31))
        );

        menupanel1.setBackground(new java.awt.Color(204, 204, 204));
        menupanel1.setToolTipText("castle");
        menupanel1.setAlignmentX(0.0F);
        menupanel1.setAlignmentY(0.0F);
        menupanel1.setMaximumSize(new java.awt.Dimension(874, 150));
        menupanel1.setMinimumSize(new java.awt.Dimension(874, 150));
        menupanel1.setPreferredSize(new java.awt.Dimension(874, 150));
        menupanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                menupanel1PropertyChange(evt);
            }
        });

        Quarry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/quarry1.jpg"))); // NOI18N
        Quarry.setMnemonic('q');
        Quarry.setToolTipText("Stockpile");
        Quarry.setMaximumSize(new java.awt.Dimension(60, 60));
        Quarry.setMinimumSize(new java.awt.Dimension(60, 60));
        Quarry.setPreferredSize(new java.awt.Dimension(60, 60));
        Quarry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuarryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                QuarryMouseExited(evt);
            }
        });
        Quarry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuarryActionPerformed(evt);
            }
        });

        farmHouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/farmhouse1.jpg"))); // NOI18N
        farmHouse.setToolTipText("FarmHouse");
        farmHouse.setMaximumSize(new java.awt.Dimension(60, 60));
        farmHouse.setMinimumSize(new java.awt.Dimension(60, 60));
        farmHouse.setPreferredSize(new java.awt.Dimension(60, 60));
        farmHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmHouseActionPerformed(evt);
            }
        });

        Castle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/castle3 copy.jpg"))); // NOI18N
        Castle.setToolTipText("Castle");
        Castle.setMaximumSize(new java.awt.Dimension(60, 60));
        Castle.setMinimumSize(new java.awt.Dimension(60, 60));
        Castle.setPreferredSize(new java.awt.Dimension(60, 60));
        Castle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CastleActionPerformed(evt);
            }
        });

        warCamp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/warcamp.jpg"))); // NOI18N
        warCamp.setToolTipText("WarCamp");
        warCamp.setMaximumSize(new java.awt.Dimension(60, 60));
        warCamp.setMinimumSize(new java.awt.Dimension(60, 60));
        warCamp.setPreferredSize(new java.awt.Dimension(60, 60));
        warCamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warCampActionPerformed(evt);
            }
        });

        Trade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/tradepost1.jpg"))); // NOI18N
        Trade.setToolTipText("TradePost");
        Trade.setMaximumSize(new java.awt.Dimension(60, 60));
        Trade.setMinimumSize(new java.awt.Dimension(60, 60));
        Trade.setPreferredSize(new java.awt.Dimension(60, 60));
        Trade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TradeActionPerformed(evt);
            }
        });

        weaponindustry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/weaponindustry1.jpg"))); // NOI18N
        weaponindustry.setToolTipText("weaponIndustry");
        weaponindustry.setMaximumSize(new java.awt.Dimension(60, 60));
        weaponindustry.setMinimumSize(new java.awt.Dimension(60, 60));
        weaponindustry.setPreferredSize(new java.awt.Dimension(60, 60));
        weaponindustry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weaponindustryActionPerformed(evt);
            }
        });

        Monument.setToolTipText("TradePost");
        Monument.setMaximumSize(new java.awt.Dimension(60, 60));
        Monument.setMinimumSize(new java.awt.Dimension(60, 60));
        Monument.setPreferredSize(new java.awt.Dimension(60, 60));
        Monument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonumentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menupanel1Layout = new javax.swing.GroupLayout(menupanel1);
        menupanel1.setLayout(menupanel1Layout);
        menupanel1Layout.setHorizontalGroup(
            menupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Castle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Quarry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(farmHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(weaponindustry, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(warCamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Trade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Monument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        menupanel1Layout.setVerticalGroup(
            menupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(menupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Trade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Monument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warCamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(farmHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weaponindustry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quarry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Castle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        castleMenu.setBackground(new java.awt.Color(204, 204, 204));
        castleMenu.setAlignmentX(0.0F);
        castleMenu.setAlignmentY(0.0F);
        castleMenu.setMaximumSize(new java.awt.Dimension(874, 150));
        castleMenu.setMinimumSize(new java.awt.Dimension(874, 150));
        castleMenu.setPreferredSize(new java.awt.Dimension(874, 150));
        castleMenu.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                castleMenuPropertyChange(evt);
            }
        });

        PikemanCastle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/pikeman copy.jpg"))); // NOI18N
        PikemanCastle.setToolTipText("Pikeman");
        PikemanCastle.setMaximumSize(new java.awt.Dimension(60, 60));
        PikemanCastle.setMinimumSize(new java.awt.Dimension(60, 60));
        PikemanCastle.setPreferredSize(new java.awt.Dimension(60, 60));
        PikemanCastle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PikemanCastleActionPerformed(evt);
            }
        });

        SwordsmanCastle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/swordsman copy.jpg"))); // NOI18N
        SwordsmanCastle.setToolTipText("swordsman");
        SwordsmanCastle.setMaximumSize(new java.awt.Dimension(60, 60));
        SwordsmanCastle.setMinimumSize(new java.awt.Dimension(60, 60));
        SwordsmanCastle.setPreferredSize(new java.awt.Dimension(60, 60));
        SwordsmanCastle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SwordsmanCastleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SwordsmanCastleMouseExited(evt);
            }
        });
        SwordsmanCastle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwordsmanCastleActionPerformed(evt);
            }
        });

        ArcherCastle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/archers copy.jpg"))); // NOI18N
        ArcherCastle.setToolTipText("Archer");
        ArcherCastle.setMaximumSize(new java.awt.Dimension(60, 60));
        ArcherCastle.setMinimumSize(new java.awt.Dimension(60, 60));
        ArcherCastle.setPreferredSize(new java.awt.Dimension(60, 60));
        ArcherCastle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArcherCastleActionPerformed(evt);
            }
        });

        MuskeeterCastle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/Messman.gif"))); // NOI18N
        MuskeeterCastle.setToolTipText("Swordman");
        MuskeeterCastle.setMaximumSize(new java.awt.Dimension(60, 60));
        MuskeeterCastle.setMinimumSize(new java.awt.Dimension(60, 60));
        MuskeeterCastle.setPreferredSize(new java.awt.Dimension(60, 60));
        MuskeeterCastle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuskeeterCastleActionPerformed(evt);
            }
        });

        KnightCastle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/knight copy.jpg"))); // NOI18N
        KnightCastle.setToolTipText("Swordman");
        KnightCastle.setMaximumSize(new java.awt.Dimension(60, 60));
        KnightCastle.setMinimumSize(new java.awt.Dimension(60, 60));
        KnightCastle.setPreferredSize(new java.awt.Dimension(60, 60));
        KnightCastle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnightCastleActionPerformed(evt);
            }
        });

        remove.setText("remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        totalSwordsmanCastle.setText("0");

        swordsmanCastle.setText("0");

        totalPikemanCastle.setText("0");

        pikemanCastle.setText("0");

        totalArcherCastle.setText("0");

        archerCastle.setLabelFor(ArcherCastle);
        archerCastle.setText("0");

        totalMuskeeterCastle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalMuskeeterCastle.setLabelFor(MuskeeterCastle);
        totalMuskeeterCastle.setText("0");

        muskeeterCastle.setText("0");

        totalKnightCastle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalKnightCastle.setText("0");
        totalKnightCastle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        totalKnightCastle.setAlignmentY(0.0F);

        knightCastle.setText("0");

        add.setText("add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        CrossbowmanCastle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/crossbowman copy.jpg"))); // NOI18N
        CrossbowmanCastle.setToolTipText("Swordman");
        CrossbowmanCastle.setMaximumSize(new java.awt.Dimension(60, 60));
        CrossbowmanCastle.setMinimumSize(new java.awt.Dimension(60, 60));
        CrossbowmanCastle.setPreferredSize(new java.awt.Dimension(60, 60));
        CrossbowmanCastle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrossbowmanCastleActionPerformed(evt);
            }
        });

        totalCrossbowmanCastle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalCrossbowmanCastle.setText("0");
        totalCrossbowmanCastle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        crossbowmanCastle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        crossbowmanCastle.setText("0");
        crossbowmanCastle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout castleMenuLayout = new javax.swing.GroupLayout(castleMenu);
        castleMenu.setLayout(castleMenuLayout);
        castleMenuLayout.setHorizontalGroup(
            castleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(castleMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(castleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(totalSwordsmanCastle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SwordsmanCastle, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(swordsmanCastle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(castleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PikemanCastle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalPikemanCastle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pikemanCastle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(castleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(castleMenuLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(totalArcherCastle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(castleMenuLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(castleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(archerCastle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ArcherCastle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(31, 31, 31)
                .addGroup(castleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(castleMenuLayout.createSequentialGroup()
                        .addComponent(totalMuskeeterCastle, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(MuskeeterCastle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(muskeeterCastle, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGroup(castleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(castleMenuLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(totalKnightCastle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(castleMenuLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(castleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(knightCastle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(KnightCastle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(32, 32, 32)
                .addGroup(castleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(castleMenuLayout.createSequentialGroup()
                        .addGroup(castleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(crossbowmanCastle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CrossbowmanCastle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(castleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add)
                            .addComponent(remove)))
                    .addComponent(totalCrossbowmanCastle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(228, 228, 228))
        );
        castleMenuLayout.setVerticalGroup(
            castleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, castleMenuLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(castleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(castleMenuLayout.createSequentialGroup()
                        .addComponent(add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remove))
                    .addGroup(castleMenuLayout.createSequentialGroup()
                        .addGroup(castleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalSwordsmanCastle)
                            .addComponent(totalArcherCastle)
                            .addComponent(totalKnightCastle)
                            .addComponent(totalPikemanCastle)
                            .addComponent(totalCrossbowmanCastle)
                            .addComponent(totalMuskeeterCastle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(castleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SwordsmanCastle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PikemanCastle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ArcherCastle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MuskeeterCastle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KnightCastle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CrossbowmanCastle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(castleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(crossbowmanCastle)
                            .addComponent(knightCastle)
                            .addComponent(muskeeterCastle)
                            .addComponent(archerCastle)
                            .addComponent(pikemanCastle)
                            .addComponent(swordsmanCastle))))
                .addGap(25, 25, 25))
        );

        farmHouseMenu.setBackground(new java.awt.Color(204, 204, 204));
        farmHouseMenu.setAlignmentX(0.0F);
        farmHouseMenu.setAlignmentY(0.0F);
        farmHouseMenu.setMaximumSize(new java.awt.Dimension(874, 150));
        farmHouseMenu.setMinimumSize(new java.awt.Dimension(874, 150));
        farmHouseMenu.setPreferredSize(new java.awt.Dimension(874, 150));
        farmHouseMenu.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                farmHouseMenuPropertyChange(evt);
            }
        });

        addFarm.setText("Add");
        addFarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFarmActionPerformed(evt);
            }
        });

        removeFarm.setText("Remove");
        removeFarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFarmActionPerformed(evt);
            }
        });

        totalWoodcutter.setText("0");

        jLabel29.setText("monthlySpending");

        jLabel30.setText("monthlyFoodExtraction");

        jLabel31.setText("monthlyWoodExtraction");

        woodcutter.setText("0");

        farmer.setText("0");

        monthlyFoodExtraction.setText("0");

        monthlySpendingFarm.setText("0");

        monthlyWoodExtraction.setText("0");

        arFarmer.setText("Farmer");
        arFarmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arFarmerActionPerformed(evt);
            }
        });

        arWoodcutter.setText("Woodcutter");
        arWoodcutter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arWoodcutterActionPerformed(evt);
            }
        });

        totalFarmer.setText("0");

        jLabel13.setText("Farmers");

        jLabel32.setText("Woodcutters");

        javax.swing.GroupLayout farmHouseMenuLayout = new javax.swing.GroupLayout(farmHouseMenu);
        farmHouseMenu.setLayout(farmHouseMenuLayout);
        farmHouseMenuLayout.setHorizontalGroup(
            farmHouseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmHouseMenuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(farmHouseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arFarmer)
                    .addComponent(farmer, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalFarmer, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(30, 30, 30)
                .addGroup(farmHouseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(farmHouseMenuLayout.createSequentialGroup()
                        .addGroup(farmHouseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arWoodcutter)
                            .addComponent(woodcutter, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalWoodcutter, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(removeFarm)
                        .addGap(18, 18, 18)
                        .addComponent(addFarm)
                        .addGap(131, 131, 131)
                        .addGroup(farmHouseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addGroup(farmHouseMenuLayout.createSequentialGroup()
                                .addGroup(farmHouseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel29))
                                .addGap(36, 36, 36)
                                .addGroup(farmHouseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(monthlyFoodExtraction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(monthlyWoodExtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monthlySpendingFarm, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel32))
                .addGap(150, 150, 150))
        );
        farmHouseMenuLayout.setVerticalGroup(
            farmHouseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(farmHouseMenuLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(farmHouseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(farmHouseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(farmHouseMenuLayout.createSequentialGroup()
                        .addGroup(farmHouseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalWoodcutter)
                            .addComponent(totalFarmer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(farmHouseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(arFarmer)
                            .addComponent(arWoodcutter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(farmHouseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(farmer)
                            .addComponent(woodcutter)))
                    .addGroup(farmHouseMenuLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(farmHouseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addFarm)
                            .addComponent(removeFarm))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, farmHouseMenuLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(farmHouseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(farmHouseMenuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(monthlyFoodExtraction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthlyWoodExtraction))
                    .addGroup(farmHouseMenuLayout.createSequentialGroup()
                        .addGroup(farmHouseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(monthlySpendingFarm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)))
                .addGap(37, 37, 37))
        );

        Granary.setBackground(new java.awt.Color(204, 204, 204));
        Granary.setAlignmentX(0.0F);
        Granary.setAlignmentY(0.0F);
        Granary.setMaximumSize(new java.awt.Dimension(874, 150));
        Granary.setMinimumSize(new java.awt.Dimension(874, 150));
        Granary.setPreferredSize(new java.awt.Dimension(874, 150));

        food.setText("0");

        jLabel27.setText("Granary");

        consumptionrate.setText("0");

        jLabel1.setText("Food");

        jLabel2.setText("Consumption Rate");

        javax.swing.GroupLayout GranaryLayout = new javax.swing.GroupLayout(Granary);
        Granary.setLayout(GranaryLayout);
        GranaryLayout.setHorizontalGroup(
            GranaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GranaryLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(GranaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GranaryLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(GranaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31)
                        .addGroup(GranaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consumptionrate)
                            .addComponent(food)))
                    .addComponent(jLabel27))
                .addContainerGap(707, Short.MAX_VALUE))
        );
        GranaryLayout.setVerticalGroup(
            GranaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GranaryLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(GranaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GranaryLayout.createSequentialGroup()
                        .addComponent(food)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consumptionrate))
                    .addGroup(GranaryLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        Armory.setBackground(new java.awt.Color(204, 204, 204));
        Armory.setAlignmentX(0.0F);
        Armory.setAlignmentY(0.0F);
        Armory.setMaximumSize(new java.awt.Dimension(874, 150));
        Armory.setMinimumSize(new java.awt.Dimension(874, 150));
        Armory.setPreferredSize(new java.awt.Dimension(874, 150));

        gun.setText("0");

        pike.setText("0");

        swordnarmour.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        swordnarmour.setText("0");

        bow.setText("0");

        crossbow.setText("0");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Gun");

        jLabel22.setText("Pike");

        jLabel23.setText("Sword");

        jLabel20.setText("Bow");

        jLabel21.setText("CrossBows");

        jLabel19.setText("Armory");

        mineExtractor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/crossbow.jpg"))); // NOI18N
        mineExtractor1.setToolTipText("crossbow");
        mineExtractor1.setMaximumSize(new java.awt.Dimension(60, 60));
        mineExtractor1.setMinimumSize(new java.awt.Dimension(60, 60));
        mineExtractor1.setPreferredSize(new java.awt.Dimension(60, 60));
        mineExtractor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mineExtractor1ActionPerformed(evt);
            }
        });

        mineExtractor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/bow.jpg"))); // NOI18N
        mineExtractor2.setToolTipText("bow");
        mineExtractor2.setMaximumSize(new java.awt.Dimension(60, 60));
        mineExtractor2.setMinimumSize(new java.awt.Dimension(60, 60));
        mineExtractor2.setPreferredSize(new java.awt.Dimension(60, 60));
        mineExtractor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mineExtractor2ActionPerformed(evt);
            }
        });

        mineExtractor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/pike copy.jpg"))); // NOI18N
        mineExtractor3.setToolTipText("pike");
        mineExtractor3.setMaximumSize(new java.awt.Dimension(60, 60));
        mineExtractor3.setMinimumSize(new java.awt.Dimension(60, 60));
        mineExtractor3.setPreferredSize(new java.awt.Dimension(60, 60));
        mineExtractor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mineExtractor3ActionPerformed(evt);
            }
        });

        mineExtractor4.setToolTipText("gun");
        mineExtractor4.setMaximumSize(new java.awt.Dimension(60, 60));
        mineExtractor4.setMinimumSize(new java.awt.Dimension(60, 60));
        mineExtractor4.setPreferredSize(new java.awt.Dimension(60, 60));
        mineExtractor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mineExtractor4ActionPerformed(evt);
            }
        });

        mineExtractor5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/sword.jpg"))); // NOI18N
        mineExtractor5.setToolTipText("sword");
        mineExtractor5.setMaximumSize(new java.awt.Dimension(60, 60));
        mineExtractor5.setMinimumSize(new java.awt.Dimension(60, 60));
        mineExtractor5.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout ArmoryLayout = new javax.swing.GroupLayout(Armory);
        Armory.setLayout(ArmoryLayout);
        ArmoryLayout.setHorizontalGroup(
            ArmoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArmoryLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(ArmoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ArmoryLayout.createSequentialGroup()
                        .addGroup(ArmoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ArmoryLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel24)
                                .addGap(74, 74, 74)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addComponent(jLabel19))
                        .addGap(410, 410, 410))
                    .addGroup(ArmoryLayout.createSequentialGroup()
                        .addGroup(ArmoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mineExtractor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bow, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(ArmoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ArmoryLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(crossbow))
                            .addGroup(ArmoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mineExtractor1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(31, 31, 31)
                        .addGroup(ArmoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mineExtractor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(ArmoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mineExtractor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gun, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(ArmoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mineExtractor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swordnarmour, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(399, 399, 399))))
        );
        ArmoryLayout.setVerticalGroup(
            ArmoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArmoryLayout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ArmoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ArmoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mineExtractor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mineExtractor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mineExtractor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mineExtractor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mineExtractor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ArmoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crossbow)
                    .addComponent(pike)
                    .addComponent(gun)
                    .addComponent(swordnarmour)
                    .addComponent(bow))
                .addGap(25, 25, 25))
        );

        farmHouseMenu1.setBackground(new java.awt.Color(204, 204, 204));
        farmHouseMenu1.setAlignmentX(0.0F);
        farmHouseMenu1.setAlignmentY(0.0F);
        farmHouseMenu1.setMaximumSize(new java.awt.Dimension(874, 150));
        farmHouseMenu1.setMinimumSize(new java.awt.Dimension(874, 150));
        farmHouseMenu1.setPreferredSize(new java.awt.Dimension(874, 150));
        farmHouseMenu1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                farmHouseMenu1PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout farmHouseMenu1Layout = new javax.swing.GroupLayout(farmHouseMenu1);
        farmHouseMenu1.setLayout(farmHouseMenu1Layout);
        farmHouseMenu1Layout.setHorizontalGroup(
            farmHouseMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
        );
        farmHouseMenu1Layout.setVerticalGroup(
            farmHouseMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        WarcampMenu.setBackground(new java.awt.Color(204, 204, 204));
        WarcampMenu.setAlignmentX(0.0F);
        WarcampMenu.setAlignmentY(0.0F);
        WarcampMenu.setMaximumSize(new java.awt.Dimension(874, 150));
        WarcampMenu.setMinimumSize(new java.awt.Dimension(874, 150));
        WarcampMenu.setPreferredSize(new java.awt.Dimension(874, 150));
        WarcampMenu.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                WarcampMenuPropertyChange(evt);
            }
        });

        addPikeman1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/pikeman copy.jpg"))); // NOI18N
        addPikeman1.setToolTipText("Pikeman");
        addPikeman1.setMaximumSize(new java.awt.Dimension(60, 60));
        addPikeman1.setMinimumSize(new java.awt.Dimension(60, 60));
        addPikeman1.setPreferredSize(new java.awt.Dimension(60, 60));
        addPikeman1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPikeman1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addPikeman1MouseExited(evt);
            }
        });
        addPikeman1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPikeman1ActionPerformed(evt);
            }
        });

        displayKnight1.setText("0");

        addSwordsman1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/swordsman copy.jpg"))); // NOI18N
        addSwordsman1.setToolTipText("Swordman");
        addSwordsman1.setMaximumSize(new java.awt.Dimension(60, 60));
        addSwordsman1.setMinimumSize(new java.awt.Dimension(60, 60));
        addSwordsman1.setPreferredSize(new java.awt.Dimension(60, 60));
        addSwordsman1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSwordsman1ActionPerformed(evt);
            }
        });

        Add.setBackground(new java.awt.Color(204, 204, 255));
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        addMuskeeter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/Messman.gif"))); // NOI18N
        addMuskeeter1.setToolTipText("muskeeter");
        addMuskeeter1.setMaximumSize(new java.awt.Dimension(60, 60));
        addMuskeeter1.setMinimumSize(new java.awt.Dimension(60, 60));
        addMuskeeter1.setPreferredSize(new java.awt.Dimension(60, 60));
        addMuskeeter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMuskeeter1ActionPerformed(evt);
            }
        });

        addArcher1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/archers copy.jpg"))); // NOI18N
        addArcher1.setToolTipText("Archer");
        addArcher1.setMaximumSize(new java.awt.Dimension(60, 60));
        addArcher1.setMinimumSize(new java.awt.Dimension(60, 60));
        addArcher1.setPreferredSize(new java.awt.Dimension(60, 60));
        addArcher1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArcher1ActionPerformed(evt);
            }
        });

        totalSwordsman1.setText("0");

        addCrossbowman1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/crossbowman copy.jpg"))); // NOI18N
        addCrossbowman1.setToolTipText("crossbowman");
        addCrossbowman1.setMaximumSize(new java.awt.Dimension(60, 60));
        addCrossbowman1.setMinimumSize(new java.awt.Dimension(60, 60));
        addCrossbowman1.setPreferredSize(new java.awt.Dimension(60, 60));
        addCrossbowman1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addCrossbowman1MouseEntered(evt);
            }
        });
        addCrossbowman1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCrossbowman1ActionPerformed(evt);
            }
        });

        addKnight1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/knight copy.jpg"))); // NOI18N
        addKnight1.setToolTipText("knight");
        addKnight1.setMaximumSize(new java.awt.Dimension(60, 60));
        addKnight1.setMinimumSize(new java.awt.Dimension(60, 60));
        addKnight1.setPreferredSize(new java.awt.Dimension(60, 60));
        addKnight1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addKnight1MouseEntered(evt);
            }
        });
        addKnight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addKnight1ActionPerformed(evt);
            }
        });

        totalPikeman1.setText("0");

        displayCrossbowman1.setText("0");

        totalArcher1.setText("0");

        totalMuskeeter1.setText("0");

        totalKnight1.setText("0");

        totalCrossbowman1.setText("0");

        displaySwordsman1.setText("0");

        displayPikeman1.setText("0");

        displayArcher1.setText("0");

        displayMuskeeter1.setText("0");

        jButton11.setBackground(new java.awt.Color(204, 204, 255));
        jButton11.setText("Remove");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(204, 204, 255));
        jButton12.setText("Attack");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WarcampMenuLayout = new javax.swing.GroupLayout(WarcampMenu);
        WarcampMenu.setLayout(WarcampMenuLayout);
        WarcampMenuLayout.setHorizontalGroup(
            WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WarcampMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalPikeman1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(addPikeman1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(displayPikeman1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalSwordsman1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addSwordsman1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displaySwordsman1))
                .addGap(41, 41, 41)
                .addGroup(WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalMuskeeter1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMuskeeter1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayMuskeeter1))
                .addGap(39, 39, 39)
                .addGroup(WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayArcher1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(totalArcher1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(addArcher1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addCrossbowman1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayCrossbowman1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(totalCrossbowman1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalKnight1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addKnight1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayKnight1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(95, 95, 95)
                .addComponent(Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addContainerGap())
        );
        WarcampMenuLayout.setVerticalGroup(
            WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WarcampMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(totalSwordsman1)
                                .addComponent(totalPikeman1))
                            .addComponent(totalMuskeeter1)
                            .addComponent(totalKnight1))
                        .addGroup(WarcampMenuLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(totalArcher1)))
                    .addComponent(totalCrossbowman1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WarcampMenuLayout.createSequentialGroup()
                        .addGroup(WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12)
                            .addComponent(jButton11)
                            .addComponent(Add))
                        .addContainerGap())
                    .addGroup(WarcampMenuLayout.createSequentialGroup()
                        .addGroup(WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addSwordsman1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addMuskeeter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addArcher1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCrossbowman1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addKnight1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPikeman1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(WarcampMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(displayPikeman1)
                            .addComponent(displaySwordsman1)
                            .addComponent(displayMuskeeter1)
                            .addComponent(displayCrossbowman1)
                            .addComponent(displayKnight1)
                            .addComponent(displayArcher1))
                        .addGap(31, 31, 31))))
        );

        WeaponIndustry.setBackground(new java.awt.Color(204, 204, 204));
        WeaponIndustry.setAlignmentX(0.0F);
        WeaponIndustry.setAlignmentY(0.0F);
        WeaponIndustry.setMaximumSize(new java.awt.Dimension(874, 150));
        WeaponIndustry.setMinimumSize(new java.awt.Dimension(874, 150));
        WeaponIndustry.setPreferredSize(new java.awt.Dimension(874, 150));
        WeaponIndustry.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                WeaponIndustryPropertyChange(evt);
            }
        });

        addSword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/sword.jpg"))); // NOI18N
        addSword.setToolTipText("sword");
        addSword.setMaximumSize(new java.awt.Dimension(60, 60));
        addSword.setMinimumSize(new java.awt.Dimension(60, 60));
        addSword.setPreferredSize(new java.awt.Dimension(60, 60));
        addSword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSwordActionPerformed(evt);
            }
        });

        addBow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/bow.jpg"))); // NOI18N
        addBow.setToolTipText("bow");
        addBow.setMaximumSize(new java.awt.Dimension(60, 60));
        addBow.setMinimumSize(new java.awt.Dimension(60, 60));
        addBow.setPreferredSize(new java.awt.Dimension(60, 60));
        addBow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBowMouseExited(evt);
            }
        });
        addBow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBowActionPerformed(evt);
            }
        });

        addCrossbow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/crossbow.jpg"))); // NOI18N
        addCrossbow.setToolTipText("crossbows");
        addCrossbow.setMaximumSize(new java.awt.Dimension(60, 60));
        addCrossbow.setMinimumSize(new java.awt.Dimension(60, 60));
        addCrossbow.setPreferredSize(new java.awt.Dimension(60, 60));
        addCrossbow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addCrossbowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addCrossbowMouseExited(evt);
            }
        });
        addCrossbow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCrossbowActionPerformed(evt);
            }
        });

        addPike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/pike copy.jpg"))); // NOI18N
        addPike.setToolTipText("pike");
        addPike.setMaximumSize(new java.awt.Dimension(60, 60));
        addPike.setMinimumSize(new java.awt.Dimension(60, 60));
        addPike.setPreferredSize(new java.awt.Dimension(60, 60));
        addPike.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPikeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addPikeMouseExited(evt);
            }
        });
        addPike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPikeActionPerformed(evt);
            }
        });

        totalBow.setText("0");

        totalCrossbow.setText("0");

        totalPikeWeaponIndustry.setText("0");

        totalsword.setText("0");

        bowWeapon.setText("0");

        swordWeapon.setText("0");

        pikeWeapon.setText("0");

        crossbowWeapon.setText("0");

        jButton8.setText("Add");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Remove");

        javax.swing.GroupLayout WeaponIndustryLayout = new javax.swing.GroupLayout(WeaponIndustry);
        WeaponIndustry.setLayout(WeaponIndustryLayout);
        WeaponIndustryLayout.setHorizontalGroup(
            WeaponIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WeaponIndustryLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(WeaponIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WeaponIndustryLayout.createSequentialGroup()
                        .addComponent(bowWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(crossbowWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WeaponIndustryLayout.createSequentialGroup()
                        .addGroup(WeaponIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalBow, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(addBow, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(WeaponIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalCrossbow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addCrossbow, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(WeaponIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pikeWeapon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPike, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(totalPikeWeaponIndustry))
                .addGap(40, 40, 40)
                .addGroup(WeaponIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(swordWeapon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalsword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addSword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addGap(343, 343, 343))
        );
        WeaponIndustryLayout.setVerticalGroup(
            WeaponIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WeaponIndustryLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(WeaponIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WeaponIndustryLayout.createSequentialGroup()
                        .addGroup(WeaponIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WeaponIndustryLayout.createSequentialGroup()
                                .addComponent(totalPikeWeaponIndustry)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addPike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pikeWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(WeaponIndustryLayout.createSequentialGroup()
                                .addGroup(WeaponIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(WeaponIndustryLayout.createSequentialGroup()
                                        .addGroup(WeaponIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(totalBow, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(totalCrossbow))
                                        .addGap(6, 6, 6)
                                        .addGroup(WeaponIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(addBow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(WeaponIndustryLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addCrossbow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(WeaponIndustryLayout.createSequentialGroup()
                                        .addComponent(totalsword)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addSword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(WeaponIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(WeaponIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(crossbowWeapon)
                                        .addComponent(bowWeapon))
                                    .addComponent(swordWeapon))))
                        .addContainerGap(23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WeaponIndustryLayout.createSequentialGroup()
                        .addGroup(WeaponIndustryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jButton9))
                        .addContainerGap())))
        );

        stockpile.setBackground(new java.awt.Color(204, 204, 204));
        stockpile.setAlignmentX(0.0F);
        stockpile.setAlignmentY(0.0F);
        stockpile.setMaximumSize(new java.awt.Dimension(874, 150));
        stockpile.setMinimumSize(new java.awt.Dimension(874, 150));
        stockpile.setPreferredSize(new java.awt.Dimension(874, 150));
        stockpile.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                stockpilePropertyChange(evt);
            }
        });

        stone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/stone.jpg"))); // NOI18N
        stone.setToolTipText("stone");
        stone.setMaximumSize(new java.awt.Dimension(60, 60));
        stone.setMinimumSize(new java.awt.Dimension(60, 60));
        stone.setPreferredSize(new java.awt.Dimension(60, 60));
        stone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stoneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stoneMouseExited(evt);
            }
        });
        stone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoneActionPerformed(evt);
            }
        });

        iron.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/iron copy.jpg"))); // NOI18N
        iron.setToolTipText("iron");
        iron.setMaximumSize(new java.awt.Dimension(60, 60));
        iron.setMinimumSize(new java.awt.Dimension(60, 60));
        iron.setPreferredSize(new java.awt.Dimension(60, 60));
        iron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ironActionPerformed(evt);
            }
        });

        wood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/wood copy.jpg"))); // NOI18N
        wood.setToolTipText("wood");
        wood.setMaximumSize(new java.awt.Dimension(60, 60));
        wood.setMinimumSize(new java.awt.Dimension(60, 60));
        wood.setPreferredSize(new java.awt.Dimension(60, 60));
        wood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                woodActionPerformed(evt);
            }
        });

        Archer12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/co.jpg"))); // NOI18N
        Archer12.setToolTipText("copper");
        Archer12.setMaximumSize(new java.awt.Dimension(60, 60));
        Archer12.setMinimumSize(new java.awt.Dimension(60, 60));
        Archer12.setPreferredSize(new java.awt.Dimension(60, 60));
        Archer12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Archer12ActionPerformed(evt);
            }
        });

        copper.setText("Copper");

        wood1.setText("Wood");

        iron1.setText("Iron");

        stone1.setText("Stone");

        stone2.setText("Stone");

        iron2.setText("Iron");

        wood2.setText("Wood");

        copper1.setText("Copper");

        javax.swing.GroupLayout stockpileLayout = new javax.swing.GroupLayout(stockpile);
        stockpile.setLayout(stockpileLayout);
        stockpileLayout.setHorizontalGroup(
            stockpileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockpileLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(stockpileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stone1)
                    .addComponent(stone2))
                .addGap(30, 30, 30)
                .addGroup(stockpileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iron1)
                    .addComponent(iron2))
                .addGap(36, 36, 36)
                .addGroup(stockpileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wood1)
                    .addComponent(wood2))
                .addGap(36, 36, 36)
                .addGroup(stockpileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copper1)
                    .addComponent(Archer12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copper))
                .addContainerGap(509, Short.MAX_VALUE))
        );
        stockpileLayout.setVerticalGroup(
            stockpileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockpileLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(stockpileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stone2)
                    .addComponent(iron2)
                    .addGroup(stockpileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(wood2)
                        .addComponent(copper1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(stockpileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stockpileLayout.createSequentialGroup()
                        .addComponent(Archer12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(copper))
                    .addGroup(stockpileLayout.createSequentialGroup()
                        .addComponent(wood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wood1))
                    .addGroup(stockpileLayout.createSequentialGroup()
                        .addComponent(iron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iron1))
                    .addGroup(stockpileLayout.createSequentialGroup()
                        .addComponent(stone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stone1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        administrationMenu.setBackground(new java.awt.Color(204, 204, 204));
        administrationMenu.setAlignmentX(0.0F);
        administrationMenu.setAlignmentY(0.0F);
        administrationMenu.setMaximumSize(new java.awt.Dimension(874, 150));
        administrationMenu.setMinimumSize(new java.awt.Dimension(874, 150));
        administrationMenu.setPreferredSize(new java.awt.Dimension(874, 150));
        administrationMenu.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                administrationMenuPropertyChange(evt);
            }
        });

        displayTax.setText("0");

        jobless.setText("0");

        jLabel16.setText("Jobless");

        jLabel4.setText("Rate");

        jLabel5.setText("Tax");

        population.setText("0");

        jLabel6.setText("Population");

        popularity.setText("0");

        jLabel7.setText("Popularity");

        taxRate.setText("0");

        jButton1.setText("-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("+");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        popRate.setText("0");

        jButton6.setText("-");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel12.setText("Rate");

        javax.swing.GroupLayout administrationMenuLayout = new javax.swing.GroupLayout(administrationMenu);
        administrationMenu.setLayout(administrationMenuLayout);
        administrationMenuLayout.setHorizontalGroup(
            administrationMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(administrationMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(administrationMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(administrationMenuLayout.createSequentialGroup()
                        .addGroup(administrationMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(administrationMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(administrationMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(population, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(administrationMenuLayout.createSequentialGroup()
                                .addGroup(administrationMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(displayTax, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(taxRate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, administrationMenuLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addGap(12, 12, 12)
                        .addComponent(jButton5)
                        .addGap(8, 8, 8)
                        .addComponent(popRate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(administrationMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(administrationMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(popularity, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobless, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(461, Short.MAX_VALUE))
        );
        administrationMenuLayout.setVerticalGroup(
            administrationMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(administrationMenuLayout.createSequentialGroup()
                .addGroup(administrationMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(administrationMenuLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(administrationMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(displayTax)
                            .addComponent(jLabel5))
                        .addGap(11, 11, 11)
                        .addGroup(administrationMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel4)
                            .addComponent(jButton2)
                            .addComponent(taxRate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(administrationMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(population, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(administrationMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(popRate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6)
                            .addComponent(jLabel12)))
                    .addGroup(administrationMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(administrationMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(popularity, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(administrationMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jobless))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        mineExtractorMenu.setBackground(new java.awt.Color(204, 204, 204));
        mineExtractorMenu.setAlignmentX(0.0F);
        mineExtractorMenu.setAlignmentY(0.0F);
        mineExtractorMenu.setMaximumSize(new java.awt.Dimension(874, 150));
        mineExtractorMenu.setMinimumSize(new java.awt.Dimension(874, 150));
        mineExtractorMenu.setPreferredSize(new java.awt.Dimension(874, 150));
        mineExtractorMenu.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                mineExtractorMenuPropertyChange(evt);
            }
        });

        arIron.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/iron copy.jpg"))); // NOI18N
        arIron.setToolTipText("ironExtractor");
        arIron.setMaximumSize(new java.awt.Dimension(60, 60));
        arIron.setMinimumSize(new java.awt.Dimension(60, 60));
        arIron.setPreferredSize(new java.awt.Dimension(60, 60));
        arIron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                arIronMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arIronMouseExited(evt);
            }
        });
        arIron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arIronActionPerformed(evt);
            }
        });

        arCopper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/co.jpg"))); // NOI18N
        arCopper.setToolTipText("copperExtractor");
        arCopper.setMaximumSize(new java.awt.Dimension(60, 60));
        arCopper.setMinimumSize(new java.awt.Dimension(60, 60));
        arCopper.setPreferredSize(new java.awt.Dimension(60, 60));
        arCopper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arCopperActionPerformed(evt);
            }
        });

        arStone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conquistador/stone.jpg"))); // NOI18N
        arStone.setToolTipText("stones");
        arStone.setMaximumSize(new java.awt.Dimension(60, 60));
        arStone.setMinimumSize(new java.awt.Dimension(60, 60));
        arStone.setPreferredSize(new java.awt.Dimension(60, 60));
        arStone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arStoneActionPerformed(evt);
            }
        });

        jLabel9.setText("Iron Extractor");

        displayCopper.setText("0");

        displayStone.setText("0");

        displayIron.setText("0");

        subStone.setText("Remove");
        subStone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subStoneActionPerformed(evt);
            }
        });

        addStone.setText("Add");
        addStone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStoneActionPerformed(evt);
            }
        });

        jLabel10.setText("Stone Extractor");

        jLabel11.setText("Copper Extractor");

        totalIron.setText("0");

        jLabel17.setText("monthlySpending");

        jLabel18.setText("monthlyIronExtraction");

        jLabel25.setText("monthlyCopperExtraction");

        monthlyIronExtraction.setText("0");

        monthlyCopperExtraction.setText("0");

        monthlySpending.setText("0");

        totalCopper.setText("0");

        totalStone.setText("0");

        javax.swing.GroupLayout mineExtractorMenuLayout = new javax.swing.GroupLayout(mineExtractorMenu);
        mineExtractorMenu.setLayout(mineExtractorMenuLayout);
        mineExtractorMenuLayout.setHorizontalGroup(
            mineExtractorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mineExtractorMenuLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(mineExtractorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(displayIron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalIron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arIron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(mineExtractorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displayCopper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addComponent(totalCopper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arCopper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(mineExtractorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mineExtractorMenuLayout.createSequentialGroup()
                        .addGroup(mineExtractorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mineExtractorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(displayStone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(arStone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(totalStone, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(mineExtractorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subStone)
                            .addComponent(addStone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(jLabel10))
                .addGap(69, 69, 69)
                .addGroup(mineExtractorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(mineExtractorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(monthlySpending, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(monthlyIronExtraction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(monthlyCopperExtraction))
                .addGap(234, 234, 234))
        );
        mineExtractorMenuLayout.setVerticalGroup(
            mineExtractorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mineExtractorMenuLayout.createSequentialGroup()
                .addGroup(mineExtractorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mineExtractorMenuLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(mineExtractorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mineExtractorMenuLayout.createSequentialGroup()
                                .addGroup(mineExtractorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(totalCopper)
                                    .addComponent(totalStone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arCopper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayCopper))
                            .addGroup(mineExtractorMenuLayout.createSequentialGroup()
                                .addComponent(totalIron)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arIron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayIron))
                            .addGroup(mineExtractorMenuLayout.createSequentialGroup()
                                .addGroup(mineExtractorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(mineExtractorMenuLayout.createSequentialGroup()
                                        .addComponent(addStone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(subStone))
                                    .addComponent(arStone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayStone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(mineExtractorMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mineExtractorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)))
                    .addGroup(mineExtractorMenuLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(mineExtractorMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mineExtractorMenuLayout.createSequentialGroup()
                                .addComponent(monthlySpending)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthlyIronExtraction)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(monthlyCopperExtraction))
                            .addGroup(mineExtractorMenuLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel25)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout basepanelLayout = new javax.swing.GroupLayout(basepanel);
        basepanel.setLayout(basepanelLayout);
        basepanelLayout.setHorizontalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basepanelLayout.createSequentialGroup()
                .addComponent(WeaponIndustry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addComponent(castleMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addComponent(barrackMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addComponent(mineExtractorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addComponent(farmHouseMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addComponent(administrationMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addComponent(stockpile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addComponent(WarcampMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basepanelLayout.createSequentialGroup()
                    .addComponent(menupanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basepanelLayout.createSequentialGroup()
                    .addComponent(farmHouseMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(Armory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(Granary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(warstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        basepanelLayout.setVerticalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basepanelLayout.createSequentialGroup()
                .addComponent(WeaponIndustry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(castleMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(barrackMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(mineExtractorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(farmHouseMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(administrationMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(stockpile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(WarcampMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(menupanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(farmHouseMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(Armory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(Granary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basepanelLayout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(warstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        information.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        information.setAlignmentX(0.0F);
        information.setAlignmentY(0.0F);
        information.setMaximumSize(new java.awt.Dimension(150, 150));
        information.setMinimumSize(new java.awt.Dimension(150, 150));
        information.setPreferredSize(new java.awt.Dimension(150, 150));
        information.setVerifyInputWhenFocusTarget(false);

        Requirement.setText("Requirement");

        woods.setText("1");

        gold.setText("10");

        irons.setText("1");

        stones.setText("10");

        javax.swing.GroupLayout informationLayout = new javax.swing.GroupLayout(information);
        information.setLayout(informationLayout);
        informationLayout.setHorizontalGroup(
            informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informationLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(stones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, informationLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(woods, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gold, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(irons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(informationLayout.createSequentialGroup()
                        .addComponent(Requirement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(390, 390, 390))))
        );
        informationLayout.setVerticalGroup(
            informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Requirement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gold, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(woods, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(irons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stones)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(information, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(ground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(basepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(information, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void displayAdministration(administration a) {
        population.setText("" + a.customIncome);
        population.setText("" + a.Peasants.population);
        popularity.setText("" + a.popularity);
        jobless.setText("" + a.Peasants.jobless);
        //goldStock.setText(""+a.Gold.stock);
        taxRate.setText("" + a.taxRate);

    }

    public void displayArsenal(arsenal a) {
        bow.setText("" + a.Bow.stock);
        crossbow.setText("" + a.CrossBow.stock);
        pike.setText("" + a.Pike.stock);
        swordnarmour.setText("" + a.SwordNArmour.stock);
        gun.setText("" + a.Gun.stock);
    }

    public void displayCastle(castle c) {
        //castleefficency.setText(""+c.)
    }

    /*public void displayWarCamp(warCamp w)
    {
    archers.setText(""+w.Archer);
    crossbowmans.setText(""+w.CrossBowman);
    knights.setText(""+w.Knight);
    pikemans.setText(""+w.Pikeman);
    muskeeters.setText(""+w.Muskeeter);
    swordsmans.setText(""+w.Swordsman);
    warcampefficency.setText(""+w.warCampEfficiency);
    }*/
    public void displayBarrack(barrack b) {
        totalArcher.setText("" + b.archerPopulation);
        totalCrossbowman.setText("" + b.crossBowmanPopulation);
        totalKnight.setText("" + b.knightPopulation);
        totalMuskeeter.setText("" + b.muskeeterPopulation);
        totalPikeman.setText("" + b.pikemanPopulation);
        totalSwordsman.setText("" + b.swordsmanPopulation);
        
    }

    public void displayStockpile(stockpile s) {
        wood.setText("" + s.Wood.stock);
        stone.setText("" + s.Stone.stock);
        iron.setText("" + s.Iron.stock);
        copper.setText(""+s.Copper.stock);
        //gold.setText(""+s.Gold.stock);
    }

    public void displayMineExtractor(mineExtractor i) {

        monthlySpending.setText("" + i.monthlySpendings);
        monthlyIronExtraction.setText("" + i.monthlyIronExtraction);
        monthlyCopperExtraction.setText("" + i.monthlyCopperExtraction);

    }

    public void displayFarmHouse(farmHouse f) {
        totalFarmer.setText("" + f.farmers);
        totalWoodcutter.setText("" + f.woodcutters);

    }

    public void displayGranary(granary g) {
        food.setText("" + g.Food.stock);
        consumptionrate.setText("" + g.consumptionRate);
    }

    public void displayQuarry(quarry q) {
    }

    public void displayWeaponIndustry(weaponIndustry w) {
        totalBow.setText("" + w.bowConstructors);
        totalCrossbow.setText("" + w.crossBowConstructors);
        totalPikeWeaponIndustry.setText("" + w.pikeConstructors);
        totalsword.setText("" + w.swordNArmourConstructors);

    }
    private void basepanelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_basepanelPropertyChange
// TODO add your handling code here:
    }//GEN-LAST:event_basepanelPropertyChange

    private void barrackGroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barrackGroundActionPerformed
// TODO add your handling code here:
        removepane();
        showBarrackmenu();

    }//GEN-LAST:event_barrackGroundActionPerformed

private void groundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_groundMousePressed
// TODO add your handling code here:
    // basepanel.remove(barrackMenu);
    removepane();
    basepanel.add(menupanel1);
    basepanel.validate();
    basepanel.repaint();

    //addpane();
    //addpane();

}//GEN-LAST:event_groundMousePressed

private void groundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_groundMouseClicked
    // removepane();
    // visibility(0);
}//GEN-LAST:event_groundMouseClicked

private void groundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_groundMouseEntered
// TODO add your handling code here:
//visibility(0);//GEN-LAST:event_groundMouseEntered
    }

private void addPikemanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPikemanMouseEntered
// TODO add your handling code here:
    information(10, 0, 0,0);

}//GEN-LAST:event_addPikemanMouseEntered

private void addPikemanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPikemanMouseExited
// TODO add your handling code here:
    information(0, 0, 0,0);
}//GEN-LAST:event_addPikemanMouseExited

private void addPikemanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPikemanActionPerformed
// TODO add your handling code here:

    displayPikeman.setText("" + (Integer.parseInt(displayPikeman.getText()) + 1));
}//GEN-LAST:event_addPikemanActionPerformed

private void addSwordsmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSwordsmanActionPerformed
// TODO add your handling code here:
    displaySwordsman.setText("" + (Integer.parseInt(displaySwordsman.getText()) + 1));
}//GEN-LAST:event_addSwordsmanActionPerformed

private void addMuskeeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMuskeeterActionPerformed
// TODO add your handling code here:
    displayMuskeeter.setText("" + (Integer.parseInt(displayMuskeeter.getText()) + 1));


}//GEN-LAST:event_addMuskeeterActionPerformed

private void addArcherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArcherActionPerformed
// TODO add your handling code here:
    displayArcher.setText("" + (Integer.parseInt(displayArcher.getText()) + 1));
}//GEN-LAST:event_addArcherActionPerformed

private void barrackMenuPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_barrackMenuPropertyChange
// TODO add your handling code here:
}//GEN-LAST:event_barrackMenuPropertyChange

private void PikemanCastleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PikemanCastleActionPerformed
// TODO add your handling code here:
    pikemanCastle.setText("" + (Integer.parseInt(pikemanCastle.getText()) + 1));

}//GEN-LAST:event_PikemanCastleActionPerformed

private void SwordsmanCastleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwordsmanCastleMouseEntered
// TODO add your handling code here:
    //direction.setVisible(true);
}//GEN-LAST:event_SwordsmanCastleMouseEntered

private void SwordsmanCastleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwordsmanCastleMouseExited
// TODO add your handling code here:
    // direction.setVisible(false);
}//GEN-LAST:event_SwordsmanCastleMouseExited

private void SwordsmanCastleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SwordsmanCastleActionPerformed
// TODO add your handling code here: i++;
    swordsmanCastle.setText("" + (Integer.parseInt(swordsmanCastle.getText()) + 1));

}//GEN-LAST:event_SwordsmanCastleActionPerformed

private void castleMenuPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_castleMenuPropertyChange
// TODO add your handling code here:
}//GEN-LAST:event_castleMenuPropertyChange

private void arIronMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arIronMouseEntered
// TODO add your handling code here:
}//GEN-LAST:event_arIronMouseEntered

private void arIronMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arIronMouseExited
// TODO add your handling code here:
}//GEN-LAST:event_arIronMouseExited

private void arIronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arIronActionPerformed
// TODO add your handling code here:
    displayIron.setText("" + (Integer.parseInt(displayIron.getText()) + 1));
}//GEN-LAST:event_arIronActionPerformed

private void arCopperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arCopperActionPerformed
// TODO add your handling code here:
    displayCopper.setText("" + (Integer.parseInt(displayCopper.getText()) + 1));

}//GEN-LAST:event_arCopperActionPerformed

private void arStoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arStoneActionPerformed
// TODO add your handling code here:
    displayStone.setText("" + (Integer.parseInt(displayStone.getText()) + 1));

}//GEN-LAST:event_arStoneActionPerformed

private void mineExtractorMenuPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_mineExtractorMenuPropertyChange
// TODO add your handling code here:
}//GEN-LAST:event_mineExtractorMenuPropertyChange

private void farmHouseMenuPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_farmHouseMenuPropertyChange
// TODO add your handling code here:
}//GEN-LAST:event_farmHouseMenuPropertyChange

private void administrationMenuPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_administrationMenuPropertyChange
// TODO add your handling code here:
}//GEN-LAST:event_administrationMenuPropertyChange

private void stoneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stoneMouseEntered
// TODO add your handling code here:
}//GEN-LAST:event_stoneMouseEntered

private void stoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stoneMouseExited
// TODO add your handling code here:
}//GEN-LAST:event_stoneMouseExited

private void stoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoneActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_stoneActionPerformed

private void ironActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ironActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_ironActionPerformed

private void woodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_woodActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_woodActionPerformed

private void Archer12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Archer12ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_Archer12ActionPerformed

private void stockpilePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_stockpilePropertyChange
// TODO add your handling code here:
}//GEN-LAST:event_stockpilePropertyChange

private void WarcampMenuPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_WarcampMenuPropertyChange
// TODO add your handling code here:
}//GEN-LAST:event_WarcampMenuPropertyChange

private void addSwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSwordActionPerformed
// TODO add your handling code here:
    addSword.setText("" + (Integer.parseInt(addSword.getText()) + 1));

}//GEN-LAST:event_addSwordActionPerformed

private void addBowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBowMouseEntered
// TODO add your handling code here:
}//GEN-LAST:event_addBowMouseEntered

private void addBowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBowMouseExited
// TODO add your handling code here:
}//GEN-LAST:event_addBowMouseExited

private void addBowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBowActionPerformed
// TODO add your handling code here:
    addBow.setText("" + (Integer.parseInt(addBow.getText()) + 1));


}//GEN-LAST:event_addBowActionPerformed

private void WeaponIndustryPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_WeaponIndustryPropertyChange
// TODO add your handling code here:
}//GEN-LAST:event_WeaponIndustryPropertyChange

private void addCrossbowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCrossbowMouseEntered
// TODO add your handling code here:
}//GEN-LAST:event_addCrossbowMouseEntered

private void addCrossbowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCrossbowMouseExited
// TODO add your handling code here:
}//GEN-LAST:event_addCrossbowMouseExited

private void addCrossbowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCrossbowActionPerformed
// TODO add your handling code here:
    addCrossbow.setText("" + (Integer.parseInt(addCrossbow.getText()) + 1));

}//GEN-LAST:event_addCrossbowActionPerformed

private void addPikeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPikeMouseEntered
// TODO add your handling code here:
}//GEN-LAST:event_addPikeMouseEntered

private void addPikeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPikeMouseExited
// TODO add your handling code here:
}//GEN-LAST:event_addPikeMouseExited

private void addPikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPikeActionPerformed
// TODO add your handling code here:
    addPike.setText("" + (Integer.parseInt(addPike.getText()) + 1));

}//GEN-LAST:event_addPikeActionPerformed

private void addKnightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addKnightMouseEntered
// TODO add your handling code here:
}//GEN-LAST:event_addKnightMouseEntered

private void addKnightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addKnightActionPerformed
// TODO add your handling code here:
    displayKnight.setText("" + (Integer.parseInt(displayKnight.getText()) + 1));
}//GEN-LAST:event_addKnightActionPerformed

private void addCrossbowmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCrossbowmanActionPerformed
// TODO add your handling code here:
    displayCrossbowman.setText("" + (Integer.parseInt(displayCrossbowman.getText()) + 1));
}//GEN-LAST:event_addCrossbowmanActionPerformed

private void addCrossbowmanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCrossbowmanMouseEntered
// TODO add your handling code here
    // basepanel.remove(jScrollPane1);
    // basepanel.remove(barrackMenu); 
    // basepanel.validate();s
    //    basepanel.repaint();
}//GEN-LAST:event_addCrossbowmanMouseEntered

private void ArcherCastleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArcherCastleActionPerformed
// TODO add your handling code here:
    archerCastle.setText("" + (Integer.parseInt(archerCastle.getText()) + 1));


}//GEN-LAST:event_ArcherCastleActionPerformed

private void MuskeeterCastleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuskeeterCastleActionPerformed
// TODO add your handling code here:
    muskeeterCastle.setText("" + (Integer.parseInt(muskeeterCastle.getText()) + 1));

}//GEN-LAST:event_MuskeeterCastleActionPerformed

private void KnightCastleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnightCastleActionPerformed
// TODO add your handling code here:
    knightCastle.setText("" + (Integer.parseInt(knightCastle.getText()) + 1));

}//GEN-LAST:event_KnightCastleActionPerformed

private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
// TODO add your handling code here:
    castleRemoveFlag = true;
}//GEN-LAST:event_removeActionPerformed

private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
// TODO add your handling code here:
    castleAddFlag = true;
}//GEN-LAST:event_addActionPerformed

private void CrossbowmanCastleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrossbowmanCastleActionPerformed
// TODO add your handling code here:
    crossbowmanCastle.setText("" + (Integer.parseInt(crossbowmanCastle.getText()) + 1));

}//GEN-LAST:event_CrossbowmanCastleActionPerformed

private void menupanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_menupanel1PropertyChange
// TODO add your handling code here:
}//GEN-LAST:event_menupanel1PropertyChange

private void weaponindustryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weaponindustryActionPerformed
// TODO add your handling code here:
    weaponIndustryBuildFlag=true;
    //removepane();
    //basepanel.add(WeaponIndustry);
}//GEN-LAST:event_weaponindustryActionPerformed

private void TradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TradeActionPerformed
// TODO add your handling code here:
    tradePostBuildFlag=true;
    //removepane();
    //basepanel.add(stockpile);
}//GEN-LAST:event_TradeActionPerformed

private void warCampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warCampActionPerformed
// TODO add your handling code here:
    warCampBuildFlag=true;
    //removepane();
    //basepanel.add(WarcampMenu);
}//GEN-LAST:event_warCampActionPerformed

private void CastleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CastleActionPerformed
// TODO add your handling code here:
    /*removepane();
    basepanel.add(castleMenu);
    basepanel.validate();
    basepanel.repaint();*/
    castleBuildFlag=true;
}//GEN-LAST:event_CastleActionPerformed

private void farmHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farmHouseActionPerformed
// TODO add your handling code here:
    farmHouseBuildFlag=true;
    //removepane();
    //basepanel.add(farmHouseMenu);
}//GEN-LAST:event_farmHouseActionPerformed

private void QuarryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuarryActionPerformed
// TODO add your handling code here:
    quarryBuildFlag=true;
    //removepane();
    //basepanel.add(stockpile);

}//GEN-LAST:event_QuarryActionPerformed

private void QuarryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuarryMouseExited
// TODO add your handling code here:
}//GEN-LAST:event_QuarryMouseExited

private void QuarryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuarryMouseEntered
// TODO add your handling code here:
    //information(getIronsInfo(),getStonesInfo());
    //
}//GEN-LAST:event_QuarryMouseEntered

private void MonumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonumentActionPerformed
// TODO add your handling code here:
    monumentBuildFlag=true;
}//GEN-LAST:event_MonumentActionPerformed

private void warCampGroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warCampGroundActionPerformed
// TODO add your handling code here:
    removepane();
    basepanel.add(Armory);
}//GEN-LAST:event_warCampGroundActionPerformed

private void granaryGroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granaryGroundActionPerformed
// TODO add your handling code here:
    removepane();
    basepanel.add(Granary);

}//GEN-LAST:event_granaryGroundActionPerformed

private void farmHouseMenu1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_farmHouseMenu1PropertyChange
// TODO add your handling code here:
}//GEN-LAST:event_farmHouseMenu1PropertyChange

private void subStoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subStoneActionPerformed
    // TODO add your handling code here:
    mineExtractorRemoveFlag = true;
}//GEN-LAST:event_subStoneActionPerformed

private void addStoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStoneActionPerformed
    // TODO add your handling code here:
    mineExtractorAddFlag = true;
}//GEN-LAST:event_addStoneActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
   taxRate.setText(""+(Integer.parseInt(taxRate.getText())-1));
   taxFlag=true;
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    taxRate.setText(""+(Integer.parseInt(taxRate.getText())+1));
    taxFlag=true;
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    // TODO add your handling code here:
    popRate.setText(""+(Integer.parseInt(popRate.getText())+1));
    popFlag=true;
}//GEN-LAST:event_jButton5ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    // TODO add your handling code here:
    taxRate.setText(""+(Integer.parseInt(taxRate.getText())-1));
    popFlag=true;
}//GEN-LAST:event_jButton6ActionPerformed

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    // TODO add your handling code here:
    //barrackMenu=true;
    barrackFlag=true;

}//GEN-LAST:event_jButton7ActionPerformed

private void removeFarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFarmActionPerformed
    // TODO add your handling code here:
    farmHouseRemoveFlag = true;

}//GEN-LAST:event_removeFarmActionPerformed

private void addFarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFarmActionPerformed
    // TODO add your handling code here:
    farmHouseAddFlag = true;


}//GEN-LAST:event_addFarmActionPerformed

private void arFarmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arFarmerActionPerformed
    // TODO add your handling code here:

    farmer.setText("" + (Integer.parseInt(farmer.getText()) + 1));
}//GEN-LAST:event_arFarmerActionPerformed

private void arWoodcutterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arWoodcutterActionPerformed
    // TODO add your handling code here:

    woodcutter.setText("" + (Integer.parseInt(woodcutter.getText()) + 1));
}//GEN-LAST:event_arWoodcutterActionPerformed

private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    // TODO add your handling code here:
    weaponFlag = true;
}//GEN-LAST:event_jButton8ActionPerformed

private void AttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttackActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_AttackActionPerformed

private void Attack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Attack1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Attack1ActionPerformed

private void Attack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Attack2ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Attack2ActionPerformed

private void Attack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Attack3ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Attack3ActionPerformed

private void Attack4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Attack4ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Attack4ActionPerformed

private void Attack5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Attack5ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Attack5ActionPerformed

private void Attack6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Attack6ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Attack6ActionPerformed

private void Attack7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Attack7ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_Attack7ActionPerformed

private void addPikeman1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPikeman1MouseEntered
    // TODO add your handling code here:
}//GEN-LAST:event_addPikeman1MouseEntered

private void addPikeman1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPikeman1MouseExited
    // TODO add your handling code here:
}//GEN-LAST:event_addPikeman1MouseExited

private void addPikeman1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPikeman1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_addPikeman1ActionPerformed

private void addSwordsman1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSwordsman1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_addSwordsman1ActionPerformed

private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_AddActionPerformed

private void addMuskeeter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMuskeeter1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_addMuskeeter1ActionPerformed

private void addArcher1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArcher1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_addArcher1ActionPerformed

private void addCrossbowman1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCrossbowman1MouseEntered
    // TODO add your handling code here:
}//GEN-LAST:event_addCrossbowman1MouseEntered

private void addCrossbowman1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCrossbowman1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_addCrossbowman1ActionPerformed

private void addKnight1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addKnight1MouseEntered
    // TODO add your handling code here:
}//GEN-LAST:event_addKnight1MouseEntered

private void addKnight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addKnight1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_addKnight1ActionPerformed

private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jButton11ActionPerformed

private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jButton12ActionPerformed

private void mineExtractor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mineExtractor2ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_mineExtractor2ActionPerformed

private void mineExtractor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mineExtractor3ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_mineExtractor3ActionPerformed

private void mineExtractor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mineExtractor4ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_mineExtractor4ActionPerformed

private void mineExtractor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mineExtractor1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_mineExtractor1ActionPerformed

private void castle1GroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_castle1GroundActionPerformed
    // TODO add your handling code here:
    refreshBoard();
}//GEN-LAST:event_castle1GroundActionPerformed

private void farmGroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farmGroundActionPerformed
    // TODO add your handling code here:
    removepane();
    basepanel.add(farmHouseMenu);

}//GEN-LAST:event_farmGroundActionPerformed

private void quarryGroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quarryGroundActionPerformed
    // TODO add your handling code here:
        removepane();
    basepanel.add(mineExtractorMenu);
}//GEN-LAST:event_quarryGroundActionPerformed

private void adminGroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminGroundActionPerformed
    // TODO add your handling code here:
       removepane();
    basepanel.add(administrationMenu);
}//GEN-LAST:event_adminGroundActionPerformed

    public void visibility(int a) {

        basepanel.add(menupanel1);
        basepanel.validate();
        basepanel.repaint();


    }

    public void showBarrackmenu() {

        basepanel.add(barrackMenu);
        basepanel.validate();
        basepanel.repaint();


    }

    public void information(int g, int w, int i,int s) {

        if(g>0 && w>0 && i>0 && s>0)
        {
        gold.setText(g+" Golds");
        woods.setText(w+" Woods");
        irons.setText(i+" Irons");
        stones.setText(s+" Stones");
        }
        else if(g<=0)
        {
        gold.setText(w+" Woods");
        woods.setText(i+" Irons");
        irons.setText(s+" Stones");
        stones.setText(" ");
        }
        else if(w<=0)
        {
        gold.setText(g+" Golds");
        woods.setText(i+" Irons");
        irons.setText(s+" Stones");
        stones.setText(" ");

        }
        else if(i<=0)
        {
        gold.setText(g+" Golds");
        woods.setText(w+" Woods");
        irons.setText(s+" Stones");
        stones.setText(" ");
        }
        else if(s<=0)
        {
        gold.setText(g+" Golds");
        woods.setText(w+" Woods");
        irons.setText(i+" Irons");
        stones.setText(" ");

        }

    }
 
    public void addpane() {
        basepanel.add(menupanel1);
        //basepanel.add(barrackMenu);
        basepanel.validate();
        basepanel.repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {

    public void run() {
    new frame().setVisible(true);


    }
    });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Add;
    public javax.swing.JButton Archer12;
    public javax.swing.JButton ArcherCastle;
    public javax.swing.JPanel Armory;
    public javax.swing.JButton Attack;
    public javax.swing.JButton Attack1;
    public javax.swing.JButton Attack2;
    public javax.swing.JButton Attack3;
    public javax.swing.JButton Attack4;
    public javax.swing.JButton Attack5;
    public javax.swing.JButton Attack6;
    public javax.swing.JButton Attack7;
    public javax.swing.JButton Castle;
    public javax.swing.JButton CrossbowmanCastle;
    public javax.swing.JPanel Granary;
    public javax.swing.JButton KnightCastle;
    public javax.swing.JButton Monument;
    public javax.swing.JButton MuskeeterCastle;
    public javax.swing.JButton PikemanCastle;
    public javax.swing.JButton Quarry;
    public javax.swing.JLabel Requirement;
    public javax.swing.JButton SwordsmanCastle;
    public javax.swing.JButton Trade;
    public javax.swing.JPanel WarcampMenu;
    public javax.swing.JPanel WeaponIndustry;
    public javax.swing.JButton add;
    public javax.swing.JButton addArcher;
    public javax.swing.JButton addArcher1;
    public javax.swing.JButton addBow;
    public javax.swing.JButton addCrossbow;
    public javax.swing.JButton addCrossbowman;
    public javax.swing.JButton addCrossbowman1;
    public javax.swing.JButton addFarm;
    public javax.swing.JButton addKnight;
    public javax.swing.JButton addKnight1;
    public javax.swing.JButton addMuskeeter;
    public javax.swing.JButton addMuskeeter1;
    public javax.swing.JButton addPike;
    public javax.swing.JButton addPikeman;
    public javax.swing.JButton addPikeman1;
    public javax.swing.JButton addStone;
    public javax.swing.JButton addSword;
    public javax.swing.JButton addSwordsman;
    public javax.swing.JButton addSwordsman1;
    public javax.swing.JButton adminGround;
    public javax.swing.JPanel administrationMenu;
    public javax.swing.JButton arCopper;
    public javax.swing.JButton arFarmer;
    public javax.swing.JButton arIron;
    public javax.swing.JButton arStone;
    public javax.swing.JButton arWoodcutter;
    public javax.swing.JLabel archerCastle;
    public javax.swing.JButton barrackGround;
    public javax.swing.JPanel barrackMenu;
    public javax.swing.JPanel basepanel;
    public javax.swing.JLabel bow;
    public javax.swing.JLabel bowWeapon;
    public javax.swing.JButton castle1Ground;
    public javax.swing.JPanel castleMenu;
    public javax.swing.JLabel consumptionrate;
    public javax.swing.JLabel copper;
    public javax.swing.JLabel copper1;
    public javax.swing.JLabel crossbow;
    public javax.swing.JLabel crossbowWeapon;
    public javax.swing.JLabel crossbowmanCastle;
    public javax.swing.JLabel displayArcher;
    public javax.swing.JLabel displayArcher1;
    public javax.swing.JLabel displayCopper;
    public javax.swing.JLabel displayCrossbowman;
    public javax.swing.JLabel displayCrossbowman1;
    public javax.swing.JLabel displayIron;
    public javax.swing.JLabel displayKnight;
    public javax.swing.JLabel displayKnight1;
    public javax.swing.JLabel displayMuskeeter;
    public javax.swing.JLabel displayMuskeeter1;
    public javax.swing.JLabel displayPikeman;
    public javax.swing.JLabel displayPikeman1;
    public javax.swing.JLabel displayStone;
    public javax.swing.JLabel displaySwordsman;
    public javax.swing.JLabel displaySwordsman1;
    public javax.swing.JLabel displayTax;
    public javax.swing.JButton farmGround;
    public javax.swing.JButton farmHouse;
    public javax.swing.JPanel farmHouseMenu;
    public javax.swing.JPanel farmHouseMenu1;
    public javax.swing.JLabel farmer;
    public javax.swing.JLabel food;
    public javax.swing.JLabel gold;
    public javax.swing.JButton granaryGround;
    public javax.swing.JPanel ground;
    public javax.swing.JLabel gun;
    public javax.swing.JPanel information;
    public javax.swing.JButton iron;
    public javax.swing.JLabel iron1;
    public javax.swing.JLabel iron2;
    public javax.swing.JLabel irons;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton11;
    public javax.swing.JButton jButton12;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel28;
    public javax.swing.JLabel jLabel29;
    public javax.swing.JLabel jLabel30;
    public javax.swing.JLabel jLabel31;
    public javax.swing.JLabel jLabel32;
    public javax.swing.JLabel jLabel33;
    public javax.swing.JLabel jLabel34;
    public javax.swing.JLabel jLabel35;
    public javax.swing.JLabel jLabel36;
    public javax.swing.JLabel jLabel37;
    public javax.swing.JLabel jLabel38;
    public javax.swing.JLabel jLabel39;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jobless;
    public javax.swing.JLabel knightCastle;
    public javax.swing.JPanel menupanel1;
    public javax.swing.JButton mineExtractor1;
    public javax.swing.JButton mineExtractor2;
    public javax.swing.JButton mineExtractor3;
    public javax.swing.JButton mineExtractor4;
    public javax.swing.JButton mineExtractor5;
    public javax.swing.JPanel mineExtractorMenu;
    public javax.swing.JLabel monthlyCopperExtraction;
    public javax.swing.JLabel monthlyFoodExtraction;
    public javax.swing.JLabel monthlyIronExtraction;
    public javax.swing.JLabel monthlySpending;
    public javax.swing.JLabel monthlySpendingFarm;
    public javax.swing.JLabel monthlyWoodExtraction;
    public javax.swing.JLabel muskeeterCastle;
    public javax.swing.JLabel pike;
    public javax.swing.JLabel pikeWeapon;
    public javax.swing.JLabel pikemanCastle;
    public javax.swing.JLabel popRate;
    public javax.swing.JLabel popularity;
    public javax.swing.JLabel population;
    public javax.swing.JButton quarryGround;
    public javax.swing.JButton remove;
    public javax.swing.JButton removeFarm;
    public javax.swing.JLabel statusBar;
    public javax.swing.JPanel stockpile;
    public javax.swing.JButton stone;
    public javax.swing.JLabel stone1;
    public javax.swing.JLabel stone2;
    public javax.swing.JLabel stones;
    public javax.swing.JButton subStone;
    public javax.swing.JLabel swordWeapon;
    public javax.swing.JLabel swordnarmour;
    public javax.swing.JLabel swordsmanCastle;
    public javax.swing.JLabel taxRate;
    public javax.swing.JLabel totalArcher;
    public javax.swing.JLabel totalArcher1;
    public javax.swing.JLabel totalArcherCastle;
    public javax.swing.JLabel totalBow;
    public javax.swing.JLabel totalCopper;
    public javax.swing.JLabel totalCrossbow;
    public javax.swing.JLabel totalCrossbowman;
    public javax.swing.JLabel totalCrossbowman1;
    public javax.swing.JLabel totalCrossbowmanCastle;
    public javax.swing.JLabel totalFarmer;
    public javax.swing.JLabel totalIron;
    public javax.swing.JLabel totalKnight;
    public javax.swing.JLabel totalKnight1;
    public javax.swing.JLabel totalKnightCastle;
    public javax.swing.JLabel totalMuskeeter;
    public javax.swing.JLabel totalMuskeeter1;
    public javax.swing.JLabel totalMuskeeterCastle;
    public javax.swing.JLabel totalPikeWeaponIndustry;
    public javax.swing.JLabel totalPikeman;
    public javax.swing.JLabel totalPikeman1;
    public javax.swing.JLabel totalPikemanCastle;
    public javax.swing.JLabel totalStone;
    public javax.swing.JLabel totalSwordsman;
    public javax.swing.JLabel totalSwordsman1;
    public javax.swing.JLabel totalSwordsmanCastle;
    public javax.swing.JLabel totalWoodcutter;
    public javax.swing.JLabel totalsword;
    public javax.swing.JButton warCamp;
    public javax.swing.JButton warCampGround;
    public javax.swing.JPanel warstatus;
    public javax.swing.JButton weaponindustry;
    public javax.swing.JButton wood;
    public javax.swing.JLabel wood1;
    public javax.swing.JLabel wood2;
    public javax.swing.JLabel woodcutter;
    public javax.swing.JLabel woods;
    // End of variables declaration//GEN-END:variables

    public void returnInfo(state s) {
        if(taxFlag) s.Administration.taxRate=Integer.parseInt(taxRate.getText());
        if(popFlag) s.Administration.populationGrowthRate=Integer.parseInt(popRate.getText());
        if(weaponIndustryBuildFlag) s.WeaponIndustry.construct();
        if(mineExtractorBuildFlag) s.MineExtractor.construct();
        if(quarryBuildFlag) s.Quarry.construct();
        if(monumentBuildFlag) s.Monument.construct();
        if(farmHouseBuildFlag) s.FarmHouse.construct();
        if(warCampBuildFlag) s.WarCamp.construct();
        if(tradePostBuildFlag) s.TradePost.construct();
        if (farmHouseAddFlag) {
            s.FarmHouse.addLabourer("Farmer", true, Integer.parseInt(farmer.getText()));
            s.FarmHouse.addLabourer("Woodcutter", true, Integer.parseInt(woodcutter.getText()));
        }
        if (farmHouseRemoveFlag) {
            s.FarmHouse.addLabourer("Farmer", false, Integer.parseInt(farmer.getText()));
            s.FarmHouse.addLabourer("Woodcutter", false, Integer.parseInt(woodcutter.getText()));
        }
        if (mineExtractorAddFlag) {
            s.MineExtractor.addLabourer("IronExactrators", true, Integer.parseInt(displayIron.getText()));
            s.MineExtractor.addLabourer("CopperExactrators", true, Integer.parseInt(displayCopper.getText()));
            s.Quarry.addLabourer(true, Integer.parseInt(displayStone.getText()));
        }
        if (mineExtractorRemoveFlag) {
            s.MineExtractor.addLabourer("IronExactrators", false, Integer.parseInt(displayIron.getText()));
            s.MineExtractor.addLabourer("CopperExactrators", false, Integer.parseInt(displayCopper.getText()));
            s.Quarry.addLabourer(false, Integer.parseInt(displayStone.getText()));
        }
        if (barrackFlag) {
            s.Barrack.addArmy("Archer", Integer.parseInt(displayArcher.getText()));
            s.Barrack.addArmy("CrossBowman", Integer.parseInt(displayCrossbowman.getText()));
            s.Barrack.addArmy("Muskeeter", Integer.parseInt(displayMuskeeter.getText()));
            s.Barrack.addArmy("Pikeman", Integer.parseInt(displayPikeman.getText()));
            s.Barrack.addArmy("Swordsman", Integer.parseInt(displaySwordsman.getText()));
            s.Barrack.addArmy("Knight", Integer.parseInt(displayKnight.getText()));

        }
        if (castleAddFlag) {
            s.Castle.mountArmy("Pikeman", true, Integer.parseInt(pikemanCastle.getText()));
            s.Castle.mountArmy("Archer", true, Integer.parseInt(archerCastle.getText()));
            s.Castle.mountArmy("CrossBowman", true, Integer.parseInt(crossbowmanCastle.getText()));
            s.Castle.mountArmy("Swordsman", true, Integer.parseInt(swordsmanCastle.getText()));
            s.Castle.mountArmy("Muskeeter", true, Integer.parseInt(muskeeterCastle.getText()));
            s.Castle.mountArmy("Knight", true, Integer.parseInt(knightCastle.getText()));
        }
        if (castleRemoveFlag) {
            s.Castle.mountArmy("Pikeman", false, Integer.parseInt(pikemanCastle.getText()));
            s.Castle.mountArmy("Archer", false, Integer.parseInt(archerCastle.getText()));
            s.Castle.mountArmy("CrossBowman", false, Integer.parseInt(crossbowmanCastle.getText()));
            s.Castle.mountArmy("Swordsman", false, Integer.parseInt(swordsmanCastle.getText()));
            s.Castle.mountArmy("Muskeeter", false, Integer.parseInt(muskeeterCastle.getText()));
            s.Castle.mountArmy("Knight", false, Integer.parseInt(knightCastle.getText()));
        }
        if (weaponFlag) {
        }
    }

    // end of the barrack functions/////////////
    ////////////////////////////////////////////
    public void removepane() {
        basepanel.remove(Armory);
        basepanel.remove(menupanel1);
        basepanel.remove(barrackMenu);
        basepanel.remove(castleMenu);
        basepanel.remove(WarcampMenu);
        basepanel.remove(administrationMenu);
        basepanel.remove(stockpile);
        basepanel.remove(mineExtractorMenu);
        basepanel.remove(farmHouseMenu);
        basepanel.remove(farmHouseMenu1);

        basepanel.remove(WeaponIndustry);

        basepanel.remove(Granary);
        basepanel.remove(warstatus);
        basepanel.validate();
        basepanel.repaint();
    }

    public void labourerAdded(String type,boolean added) {
        if (added) {
            statusBar.setText("Addition of Labourers Successful");
            if (type == "Farmhouse") {
                farmHouseAddFlag=false;
                farmHouseRemoveFlag=false;
                farmer.setText("");
                woodcutter.setText("");

            }
            if(type=="Mine"){
                displayIron.setText("");
                displayCopper.setText("");
                displayStone.setText("");
                mineExtractorAddFlag=false;
                mineExtractorRemoveFlag=false;
            }
            if(type=="Weapon")
            {
                weaponAddFlag=false;
                weaponRemoveFlag=false;
            }
        }
        else{
            statusBar.setText("Addition was of Labour halted due to one or more reasons");
            
        }
    }

    public void armyAdded(boolean added) {
        if (added) {
            statusBar.setText("Addition of Army Successful");
            barrackFlag = false;
            displayPikeman.setText("0");
            displayArcher.setText("0");
            displayKnight.setText("0");
            displaySwordsman.setText("0");
            displayMuskeeter.setText("0");
            displayCrossbowman.setText("0");
            
        } else {
            statusBar.setText("Addition was of Army halted due to one or more reasons");
            barrackFlag = false;
        }
    }
    public void constructionCompletion(boolean completion) {
        if(completion){
            statusBar.setText("Construction Successful");
            //f=false;
            //build=false;
        } else {
            statusBar.setText("You do not have enough resources so the construction will be halted");
            //j--;
            //f=false;
            //build=false;
        }
    }
    public boolean running()
    {
        return runFlag;
    }
    public void displayProductionHalt(String productName) {
        statusBar.setText("Production of "+productName+" halted as you do not have required fund");
    }
    public void displayStatus(String s)
    {
        statusBar.setText(s);
    }

    public void refreshBoard(){
        //System.out.println("Here");
        File empty_board=new File("c:\\imgs\\bckgrnd.jpg");
        BufferedImage i=null;
        try {
            i = ImageIO.read(empty_board);
        } catch (IOException ex) {
            Logger.getLogger(frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        Graphics g=ground.getGraphics();

        /*File tiger=new File("c:\\imgs\\tiger.gif");
        BufferedImage img_tiger=null;
        try {
        img_tiger = ImageIO.read(tiger);
        Graphics b=i.createGraphics();
        b.drawImage((Image)img_tiger, -15, 0, jPanel1);
        b.drawImage((Image)img_tiger, 525, 0, jPanel1);
        b.drawImage((Image)img_tiger, 525,550, jPanel1);
        b.drawImage((Image)img_tiger, -15,550, jPanel1);
        } catch (IOException ex) {
        Logger.getLogger(DesktopApplication3View.class.getName()).log(Level.SEVERE, null, ex);
        }*/

        g.drawImage((Image)i, ground.getX(), ground.getY(), ground);
    }

}
