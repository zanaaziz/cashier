package GUI;

import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class Form extends javax.swing.JFrame {
    
    double Data;
    String Receipt = "";
    String RNG = new String("");
    
    public Form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        beefSoup = new javax.swing.JButton();
        onionSoup = new javax.swing.JButton();
        soups = new javax.swing.JLabel();
        vegSoup = new javax.swing.JButton();
        tortillaSoup = new javax.swing.JButton();
        icedTea = new javax.swing.JButton();
        prawnCurry = new javax.swing.JButton();
        chickenHouse = new javax.swing.JButton();
        bonecrusher = new javax.swing.JButton();
        famPounder = new javax.swing.JButton();
        familyMeals = new javax.swing.JLabel();
        chickenCurry = new javax.swing.JButton();
        jalfrezi = new javax.swing.JButton();
        thaiCurry = new javax.swing.JButton();
        checkout = new javax.swing.JButton();
        chickenFeasts = new javax.swing.JLabel();
        grilledChicken = new javax.swing.JButton();
        batteredChicken = new javax.swing.JButton();
        wings = new javax.swing.JButton();
        softDrinks = new javax.swing.JLabel();
        LCD = new javax.swing.JTextField();
        sideBreast = new javax.swing.JButton();
        water = new javax.swing.JButton();
        sevenUp = new javax.swing.JButton();
        breastFillets = new javax.swing.JButton();
        pepsi = new javax.swing.JButton();
        nuggets = new javax.swing.JButton();
        coke = new javax.swing.JButton();
        tea = new javax.swing.JButton();
        hotDrinks = new javax.swing.JLabel();
        beans = new javax.swing.JButton();
        chickenSoup = new javax.swing.JButton();
        fruits = new javax.swing.JButton();
        iceCream = new javax.swing.JButton();
        OreosAndMilk = new javax.swing.JButton();
        cappuchinno = new javax.swing.JButton();
        Dessert = new javax.swing.JLabel();
        hotChocolate = new javax.swing.JButton();
        late = new javax.swing.JButton();
        rice = new javax.swing.JButton();
        curryDishes = new javax.swing.JLabel();
        lightweight = new javax.swing.JButton();
        spongeMeal = new javax.swing.JButton();
        chickenSlam = new javax.swing.JButton();
        familyBargain = new javax.swing.JButton();
        peppaMeal = new javax.swing.JButton();
        kidsMeal = new javax.swing.JLabel();
        coffee = new javax.swing.JButton();
        twoChickenChips = new javax.swing.JButton();
        simplicity = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        help = new javax.swing.JMenu();
        about = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cashier");
        setResizable(false);

        Background.setBackground(new java.awt.Color(234, 221, 166));

        beefSoup.setBackground(new java.awt.Color(255, 223, 148));
        beefSoup.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        beefSoup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/soup4.png"))); // NOI18N
        beefSoup.setText("Beef Soup");
        beefSoup.setToolTipText("€3.80");
        beefSoup.setFocusable(false);
        beefSoup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beefSoupActionPerformed(evt);
            }
        });

        onionSoup.setBackground(new java.awt.Color(255, 223, 148));
        onionSoup.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        onionSoup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/soup.png"))); // NOI18N
        onionSoup.setText("French Onion Soup");
        onionSoup.setToolTipText("€3.80");
        onionSoup.setFocusable(false);
        onionSoup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onionSoupActionPerformed(evt);
            }
        });

        soups.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        soups.setForeground(new java.awt.Color(153, 0, 0));
        soups.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soups.setText("Soups");

        vegSoup.setBackground(new java.awt.Color(255, 223, 148));
        vegSoup.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vegSoup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/soup2.png"))); // NOI18N
        vegSoup.setText("Vegetable Soup");
        vegSoup.setToolTipText("€3.80");
        vegSoup.setFocusable(false);
        vegSoup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegSoupActionPerformed(evt);
            }
        });

        tortillaSoup.setBackground(new java.awt.Color(255, 223, 148));
        tortillaSoup.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tortillaSoup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/soup3.png"))); // NOI18N
        tortillaSoup.setText("Tortilla Soup");
        tortillaSoup.setToolTipText("€3.80");
        tortillaSoup.setFocusable(false);
        tortillaSoup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tortillaSoupActionPerformed(evt);
            }
        });

        icedTea.setBackground(new java.awt.Color(255, 223, 148));
        icedTea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        icedTea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ice-Tea.png"))); // NOI18N
        icedTea.setText("Iced Tea");
        icedTea.setToolTipText("€1.75");
        icedTea.setFocusable(false);
        icedTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icedTeaActionPerformed(evt);
            }
        });

        prawnCurry.setBackground(new java.awt.Color(255, 223, 148));
        prawnCurry.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        prawnCurry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prawnc.png"))); // NOI18N
        prawnCurry.setText("Prawn Curry");
        prawnCurry.setToolTipText("€4.80");
        prawnCurry.setFocusable(false);
        prawnCurry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prawnCurryActionPerformed(evt);
            }
        });

        chickenHouse.setBackground(new java.awt.Color(255, 223, 148));
        chickenHouse.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chickenHouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chicken house.png"))); // NOI18N
        chickenHouse.setText("Chicken House");
        chickenHouse.setToolTipText("€40.00");
        chickenHouse.setFocusable(false);
        chickenHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenHouseActionPerformed(evt);
            }
        });

        bonecrusher.setBackground(new java.awt.Color(255, 223, 148));
        bonecrusher.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        bonecrusher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bonecrusher.png"))); // NOI18N
        bonecrusher.setText("Bonecrusher");
        bonecrusher.setToolTipText("€25.00");
        bonecrusher.setFocusable(false);
        bonecrusher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonecrusherActionPerformed(evt);
            }
        });

        famPounder.setBackground(new java.awt.Color(255, 223, 148));
        famPounder.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        famPounder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fam pounder.png"))); // NOI18N
        famPounder.setText("Fam Pounder!");
        famPounder.setToolTipText("€25.00");
        famPounder.setFocusable(false);
        famPounder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                famPounderActionPerformed(evt);
            }
        });

        familyMeals.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        familyMeals.setForeground(new java.awt.Color(153, 0, 0));
        familyMeals.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        familyMeals.setText("Family Meals");

        chickenCurry.setBackground(new java.awt.Color(255, 223, 148));
        chickenCurry.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chickenCurry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/curry.png"))); // NOI18N
        chickenCurry.setText("Chicken Curry");
        chickenCurry.setToolTipText("€4.80");
        chickenCurry.setFocusable(false);
        chickenCurry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenCurryActionPerformed(evt);
            }
        });

        jalfrezi.setBackground(new java.awt.Color(255, 223, 148));
        jalfrezi.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jalfrezi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jalfrezi.png"))); // NOI18N
        jalfrezi.setText("Chicken Jalfrezi");
        jalfrezi.setToolTipText("€4.80");
        jalfrezi.setFocusable(false);
        jalfrezi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jalfreziActionPerformed(evt);
            }
        });

        thaiCurry.setBackground(new java.awt.Color(255, 223, 148));
        thaiCurry.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        thaiCurry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thai-curry.png"))); // NOI18N
        thaiCurry.setText("Thai Curry");
        thaiCurry.setToolTipText("€4.80");
        thaiCurry.setFocusable(false);
        thaiCurry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thaiCurryActionPerformed(evt);
            }
        });

        checkout.setBackground(new java.awt.Color(255, 223, 148));
        checkout.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkout.png"))); // NOI18N
        checkout.setText("Checkout");
        checkout.setFocusable(false);
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        chickenFeasts.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chickenFeasts.setForeground(new java.awt.Color(153, 0, 0));
        chickenFeasts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chickenFeasts.setText("Chicken Feasts");

        grilledChicken.setBackground(new java.awt.Color(255, 223, 148));
        grilledChicken.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        grilledChicken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grilled chicken.png"))); // NOI18N
        grilledChicken.setText("Grilled Chicken");
        grilledChicken.setToolTipText("€12.75");
        grilledChicken.setFocusable(false);
        grilledChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grilledChickenActionPerformed(evt);
            }
        });

        batteredChicken.setBackground(new java.awt.Color(255, 223, 148));
        batteredChicken.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        batteredChicken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bchicken.png"))); // NOI18N
        batteredChicken.setText("Battered Chicken");
        batteredChicken.setToolTipText("€12.75");
        batteredChicken.setFocusable(false);
        batteredChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batteredChickenActionPerformed(evt);
            }
        });

        wings.setBackground(new java.awt.Color(255, 223, 148));
        wings.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        wings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wings.png"))); // NOI18N
        wings.setText("Chicken Wings");
        wings.setToolTipText("€6.20");
        wings.setFocusable(false);
        wings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wingsActionPerformed(evt);
            }
        });

        softDrinks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        softDrinks.setForeground(new java.awt.Color(153, 0, 0));
        softDrinks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        softDrinks.setText("Soft Drinks");

        LCD.setBackground(new java.awt.Color(239, 239, 239));
        LCD.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        LCD.setForeground(new java.awt.Color(51, 51, 51));
        LCD.setFocusable(false);

        sideBreast.setBackground(new java.awt.Color(255, 223, 148));
        sideBreast.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sideBreast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/breast.png"))); // NOI18N
        sideBreast.setText("Side Breasts");
        sideBreast.setToolTipText("€10.20");
        sideBreast.setFocusable(false);
        sideBreast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sideBreastActionPerformed(evt);
            }
        });

        water.setBackground(new java.awt.Color(255, 223, 148));
        water.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        water.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/water.png"))); // NOI18N
        water.setText("Water");
        water.setToolTipText("€0.75");
        water.setFocusable(false);
        water.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterActionPerformed(evt);
            }
        });

        sevenUp.setBackground(new java.awt.Color(255, 223, 148));
        sevenUp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sevenUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7 Up.png"))); // NOI18N
        sevenUp.setText("7 Up");
        sevenUp.setToolTipText("€1.25");
        sevenUp.setFocusable(false);
        sevenUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenUpActionPerformed(evt);
            }
        });

        breastFillets.setBackground(new java.awt.Color(255, 223, 148));
        breastFillets.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        breastFillets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/breastfillets.png"))); // NOI18N
        breastFillets.setText("Breast Fillets");
        breastFillets.setToolTipText("€7.50");
        breastFillets.setFocusable(false);
        breastFillets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breastFilletsActionPerformed(evt);
            }
        });

        pepsi.setBackground(new java.awt.Color(255, 223, 148));
        pepsi.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pepsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pepsi.png"))); // NOI18N
        pepsi.setText("Pepsi");
        pepsi.setToolTipText("€1.25");
        pepsi.setFocusable(false);
        pepsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepsiActionPerformed(evt);
            }
        });

        nuggets.setBackground(new java.awt.Color(255, 223, 148));
        nuggets.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nuggets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Nuggets.png"))); // NOI18N
        nuggets.setText("Nuggets");
        nuggets.setToolTipText("€5.50");
        nuggets.setFocusable(false);
        nuggets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuggetsActionPerformed(evt);
            }
        });

        coke.setBackground(new java.awt.Color(255, 223, 148));
        coke.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        coke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Coca Cola.png"))); // NOI18N
        coke.setText("Coca Cola");
        coke.setToolTipText("€1.25");
        coke.setFocusable(false);
        coke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeActionPerformed(evt);
            }
        });

        tea.setBackground(new java.awt.Color(255, 223, 148));
        tea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tea.png"))); // NOI18N
        tea.setText("Tea");
        tea.setToolTipText("€1.75");
        tea.setFocusable(false);
        tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teaActionPerformed(evt);
            }
        });

        hotDrinks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hotDrinks.setForeground(new java.awt.Color(153, 0, 0));
        hotDrinks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hotDrinks.setText("Hot Drinks");

        beans.setBackground(new java.awt.Color(255, 223, 148));
        beans.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        beans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/beans.png"))); // NOI18N
        beans.setText("Beans");
        beans.setToolTipText("€2.60");
        beans.setFocusable(false);
        beans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beansActionPerformed(evt);
            }
        });

        chickenSoup.setBackground(new java.awt.Color(255, 223, 148));
        chickenSoup.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chickenSoup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/soup.png"))); // NOI18N
        chickenSoup.setText("Chicken Soup");
        chickenSoup.setToolTipText("€3.00");
        chickenSoup.setFocusable(false);
        chickenSoup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenSoupActionPerformed(evt);
            }
        });

        fruits.setBackground(new java.awt.Color(255, 223, 148));
        fruits.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fruits.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fruits.png"))); // NOI18N
        fruits.setText("Fruits");
        fruits.setToolTipText("€4.50");
        fruits.setFocusable(false);
        fruits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitsActionPerformed(evt);
            }
        });

        iceCream.setBackground(new java.awt.Color(255, 223, 148));
        iceCream.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        iceCream.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icecream.png"))); // NOI18N
        iceCream.setText("Ice Cream");
        iceCream.setToolTipText("€2.50");
        iceCream.setFocusable(false);
        iceCream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iceCreamActionPerformed(evt);
            }
        });

        OreosAndMilk.setBackground(new java.awt.Color(255, 223, 148));
        OreosAndMilk.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        OreosAndMilk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/oreos.png"))); // NOI18N
        OreosAndMilk.setText("Oreos & Milk");
        OreosAndMilk.setToolTipText("€4.00");
        OreosAndMilk.setFocusable(false);
        OreosAndMilk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OreosAndMilkActionPerformed(evt);
            }
        });

        cappuchinno.setBackground(new java.awt.Color(255, 223, 148));
        cappuchinno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cappuchinno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cappuchinno.png"))); // NOI18N
        cappuchinno.setText("Cappucinno");
        cappuchinno.setToolTipText("€1.75");
        cappuchinno.setFocusable(false);
        cappuchinno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cappuchinnoActionPerformed(evt);
            }
        });

        Dessert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Dessert.setForeground(new java.awt.Color(153, 0, 0));
        Dessert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dessert.setText("Dessert");

        hotChocolate.setBackground(new java.awt.Color(255, 223, 148));
        hotChocolate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        hotChocolate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotchoc.png"))); // NOI18N
        hotChocolate.setText("Hot Chocolate");
        hotChocolate.setToolTipText("€2.80");
        hotChocolate.setFocusable(false);
        hotChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotChocolateActionPerformed(evt);
            }
        });

        late.setBackground(new java.awt.Color(255, 223, 148));
        late.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        late.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/laté.png"))); // NOI18N
        late.setText("Laté");
        late.setToolTipText("€1.75");
        late.setFocusable(false);
        late.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lateActionPerformed(evt);
            }
        });

        rice.setBackground(new java.awt.Color(255, 223, 148));
        rice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rice.png"))); // NOI18N
        rice.setText("Rice");
        rice.setToolTipText("€8.50");
        rice.setFocusable(false);
        rice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riceActionPerformed(evt);
            }
        });

        curryDishes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        curryDishes.setForeground(new java.awt.Color(153, 0, 0));
        curryDishes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        curryDishes.setText("Curry Dishes");

        lightweight.setBackground(new java.awt.Color(255, 223, 148));
        lightweight.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lightweight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kids meal2.png"))); // NOI18N
        lightweight.setText("Light Weight");
        lightweight.setToolTipText("€5.00");
        lightweight.setFocusable(false);
        lightweight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightweightActionPerformed(evt);
            }
        });

        spongeMeal.setBackground(new java.awt.Color(255, 223, 148));
        spongeMeal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        spongeMeal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Spongebob.png"))); // NOI18N
        spongeMeal.setText("Sponge Meal");
        spongeMeal.setToolTipText("€5.00");
        spongeMeal.setFocusable(false);
        spongeMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spongeMealActionPerformed(evt);
            }
        });

        chickenSlam.setBackground(new java.awt.Color(255, 223, 148));
        chickenSlam.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        chickenSlam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/breast.png"))); // NOI18N
        chickenSlam.setText("Chicken Slam");
        chickenSlam.setToolTipText("€18.00");
        chickenSlam.setFocusable(false);
        chickenSlam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenSlamActionPerformed(evt);
            }
        });

        familyBargain.setBackground(new java.awt.Color(255, 223, 148));
        familyBargain.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        familyBargain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/family bargain.png"))); // NOI18N
        familyBargain.setText("Family Bargain");
        familyBargain.setToolTipText("€30.00");
        familyBargain.setFocusable(false);
        familyBargain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyBargainActionPerformed(evt);
            }
        });

        peppaMeal.setBackground(new java.awt.Color(255, 223, 148));
        peppaMeal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        peppaMeal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/peppa.png"))); // NOI18N
        peppaMeal.setText("Peppa Meal");
        peppaMeal.setToolTipText("€5.00");
        peppaMeal.setFocusable(false);
        peppaMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peppaMealActionPerformed(evt);
            }
        });

        kidsMeal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kidsMeal.setForeground(new java.awt.Color(153, 0, 0));
        kidsMeal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kidsMeal.setText("Kids Meal");

        coffee.setBackground(new java.awt.Color(255, 223, 148));
        coffee.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        coffee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coffee.png"))); // NOI18N
        coffee.setText("Coffee");
        coffee.setToolTipText("€2.00");
        coffee.setFocusable(false);
        coffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coffeeActionPerformed(evt);
            }
        });

        twoChickenChips.setBackground(new java.awt.Color(255, 223, 148));
        twoChickenChips.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        twoChickenChips.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bchicken.png"))); // NOI18N
        twoChickenChips.setText("2 Piece Chicken Chips");
        twoChickenChips.setToolTipText("€5.00");
        twoChickenChips.setFocusable(false);
        twoChickenChips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoChickenChipsActionPerformed(evt);
            }
        });

        simplicity.setBackground(new java.awt.Color(255, 223, 148));
        simplicity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        simplicity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kids meal.png"))); // NOI18N
        simplicity.setText("Simplicity");
        simplicity.setToolTipText("€5.00");
        simplicity.setFocusable(false);
        simplicity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simplicityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(LCD, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(icedTea, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prawnCurry, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tortillaSoup, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(twoChickenChips, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(coke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pepsi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(coffee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hotChocolate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(late, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cappuchinno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hotDrinks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(water, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(softDrinks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sevenUp, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iceCream, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OreosAndMilk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Dessert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chickenSoup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fruits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(beans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(curryDishes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chickenCurry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jalfrezi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thaiCurry, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(beefSoup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(soups, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(breastFillets, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nuggets, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wings, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(batteredChicken, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grilledChicken, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chickenFeasts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sideBreast, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vegSoup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(onionSoup, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(familyMeals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(famPounder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bonecrusher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(familyBargain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chickenHouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chickenSlam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kidsMeal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(peppaMeal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spongeMeal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lightweight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(simplicity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LCD)
                    .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(softDrinks)
                    .addComponent(Dessert)
                    .addComponent(chickenFeasts)
                    .addComponent(familyMeals))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coke, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iceCream, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grilledChicken, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(famPounder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pepsi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OreosAndMilk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batteredChicken, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bonecrusher, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(sevenUp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(water, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fruits, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sideBreast, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chickenSoup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(wings, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(beans, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nuggets, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chickenSlam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addComponent(kidsMeal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(peppaMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addComponent(curryDishes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addComponent(breastFillets, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(soups)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chickenCurry, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vegSoup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spongeMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jalfrezi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(beefSoup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lightweight, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addComponent(thaiCurry, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(icedTea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(prawnCurry, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tortillaSoup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(twoChickenChips, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(onionSoup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(simplicity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41))))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(hotDrinks)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coffee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hotChocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(late, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cappuchinno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(familyBargain, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chickenHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LCD.setBorder(BorderFactory.createLineBorder(new Color(124,91,23)));

        jMenuBar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        help.setText(" Help");
        help.setFocusable(false);
        help.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                help_clicked(evt);
            }
        });
        jMenuBar1.add(help);

        about.setText("About");
        about.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about_clicked(evt);
            }
        });
        jMenuBar1.add(about);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-799)/2, (screenSize.height-607)/2, 799, 607);
    }// </editor-fold>//GEN-END:initComponents

    private void about_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about_clicked
        JOptionPane.showMessageDialog(null, "Designed and developed by Zana Aziz.\n\nDate started: 11/07/2012\n\nDate Finished: 14/07/2012", "About", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_about_clicked

    private void simplicityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simplicityActionPerformed
        Data = Data + 5.00;
        Receipt = Receipt + "Simplicity  -  €5.00 \n";
        
        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_simplicityActionPerformed

    private void twoChickenChipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoChickenChipsActionPerformed
        Data = Data + 5.00;
        Receipt = Receipt + "2 Piece Chicken Chips  -  €5.00 \n";
        
        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_twoChickenChipsActionPerformed

    private void coffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coffeeActionPerformed
        Data = Data + 2.00;
        Receipt = Receipt + "Coffee  -  €2.00 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_coffeeActionPerformed

    private void peppaMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peppaMealActionPerformed
        Data = Data + 5.00;
        Receipt = Receipt + "Peppa Meal  -  €5.00 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_peppaMealActionPerformed

    private void familyBargainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyBargainActionPerformed
        Data = Data + 30.00;
        Receipt = Receipt + "Family Bargain  -  €30.00 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_familyBargainActionPerformed

    private void chickenSlamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenSlamActionPerformed
        Data = Data + 18.00;
        Receipt = Receipt + "Chicken Slam  -  €18.00 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_chickenSlamActionPerformed

    private void spongeMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spongeMealActionPerformed
        Data = Data + 5.00;
        Receipt = Receipt + "Sponge Meal  -  €5.00 \n";
        
        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_spongeMealActionPerformed

    private void lightweightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightweightActionPerformed
        Data = Data + 5.00;
        Receipt = Receipt + "Light Weight  -  €5.00 \n";
        
        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_lightweightActionPerformed

    private void riceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riceActionPerformed
        Data = Data + 8.50;
        Receipt = Receipt + "Rice  -  €8.50 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_riceActionPerformed

    private void lateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lateActionPerformed
        Data = Data + 1.75;
        Receipt = Receipt + "Laté  -  €1.75 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_lateActionPerformed

    private void hotChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotChocolateActionPerformed
        Data = Data + 2.80;
        Receipt = Receipt + "Hot Chocolate  -  €2.80 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_hotChocolateActionPerformed

    private void cappuchinnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cappuchinnoActionPerformed
        Data = Data + 1.75;
        Receipt = Receipt + "Cappucinno  -  €1.75 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_cappuchinnoActionPerformed

    private void OreosAndMilkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OreosAndMilkActionPerformed
        Data = Data + 4.00;
        Receipt = Receipt + "Oreos & Milk  -  €4.00 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_OreosAndMilkActionPerformed

    private void iceCreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iceCreamActionPerformed
        Data = Data + 2.50;
        Receipt = Receipt + "Ice Cream  -  €2.50 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_iceCreamActionPerformed

    private void fruitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruitsActionPerformed
        Data = Data + 4.50;
        Receipt = Receipt + "Fruits  -  €4.50 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_fruitsActionPerformed

    private void chickenSoupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenSoupActionPerformed
        Data = Data + 3.00;
        Receipt = Receipt + "Chicken Soup  -  €3.00 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_chickenSoupActionPerformed

    private void beansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beansActionPerformed
        Data = Data + 2.60;
        Receipt = Receipt + "Beans  -  €2.60 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_beansActionPerformed

    private void teaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teaActionPerformed
        Data = Data + 1.75;
        Receipt = Receipt + "Tea  -  €1.75 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_teaActionPerformed

    private void cokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeActionPerformed
        Data = Data + 1.25;
        Receipt = Receipt + "Coca Cola  -  €1.25 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_cokeActionPerformed

    private void nuggetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuggetsActionPerformed
        Data = Data + 5.50;
        Receipt = Receipt + "Chicken Nuggets  -  €5.50 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_nuggetsActionPerformed

    private void pepsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepsiActionPerformed
        Data = Data + 1.25;
        Receipt = Receipt + "Pepsi  -  €1.25 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_pepsiActionPerformed

    private void breastFilletsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breastFilletsActionPerformed
        Data = Data + 7.50;
        Receipt = Receipt + "Breast Fillets  -  €7.50 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_breastFilletsActionPerformed

    private void sevenUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenUpActionPerformed
        Data = Data + 1.25;
        Receipt = Receipt + "7 Up  -  €1.25 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_sevenUpActionPerformed

    private void waterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterActionPerformed
        Data = Data + 0.75;
        Receipt = Receipt + "Water  -  €0.75 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_waterActionPerformed

    private void sideBreastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sideBreastActionPerformed
        Data = Data + 10.20;
        Receipt = Receipt + "Side Breast  -  €10.20 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_sideBreastActionPerformed

    private void wingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wingsActionPerformed
        Data = Data + 6.20;
        Receipt = Receipt + "Chicken Wings  -  €6.20 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_wingsActionPerformed

    private void batteredChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batteredChickenActionPerformed
        Data = Data + 12.75;
        Receipt = Receipt + "Battered Chicken  -  €12.75 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_batteredChickenActionPerformed

    private void grilledChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grilledChickenActionPerformed
        Data = Data + 12.75;
        Receipt = Receipt + "Grilled Chicken  -  €12.75 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_grilledChickenActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        if (Data > 0) {
        
        Random obj = new Random();
        int nums = obj.nextInt(99);
        RNG = Integer.toString(nums);
        
            JOptionPane.showMessageDialog(null, Receipt + "\nTotal:    €" + Data + "\n\nOrder:    #" + RNG, "Receipt #"+RNG, JOptionPane.PLAIN_MESSAGE, checkout.getIcon());
            Data = 0;
            Receipt = "";
            LCD.setText("");
        } else {
        }
    }//GEN-LAST:event_checkoutActionPerformed

    private void thaiCurryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thaiCurryActionPerformed
        Data = Data + 4.80;
        Receipt = Receipt + "Thai Curry  -  €4.80 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_thaiCurryActionPerformed

    private void jalfreziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jalfreziActionPerformed
        Data = Data + 4.80;
        Receipt = Receipt + "Chicken Jalfrezi  -  €4.80 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_jalfreziActionPerformed

    private void chickenCurryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenCurryActionPerformed
        Data = Data + 4.80;
        Receipt = Receipt + "Chicken Curry  -  €4.80 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_chickenCurryActionPerformed

    private void famPounderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_famPounderActionPerformed
        Data = Data + 25.00;
        Receipt = Receipt + "Fam Pounder  -  €25.00 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_famPounderActionPerformed

    private void bonecrusherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonecrusherActionPerformed
        Data = Data + 25.00;
        Receipt = Receipt + "Bonecrusher  -  €25.00 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_bonecrusherActionPerformed

    private void chickenHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenHouseActionPerformed
        Data = Data + 40.00;
        Receipt = Receipt + "Chicken House  -  €40.00 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_chickenHouseActionPerformed

    private void prawnCurryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prawnCurryActionPerformed
        Data = Data + 4.80;
        Receipt = Receipt + "Prawn Curry  -  €4.80 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_prawnCurryActionPerformed

    private void icedTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icedTeaActionPerformed
        Data = Data + 1.75;
        Receipt = Receipt + "Iced Tea  -  €1.75 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_icedTeaActionPerformed

    private void tortillaSoupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tortillaSoupActionPerformed
        Data = Data + 3.80;
        Receipt = Receipt + "Tortilla Soup  -  €3.80 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_tortillaSoupActionPerformed

    private void vegSoupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegSoupActionPerformed
        Data = Data + 3.80;
        Receipt = Receipt + "Vegetable Soup  -  €3.80 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_vegSoupActionPerformed

    private void onionSoupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onionSoupActionPerformed
        Data = Data + 3.80;
        Receipt = Receipt + "French Onion Soup  -  €3.80 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_onionSoupActionPerformed

    private void beefSoupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beefSoupActionPerformed
        Data = Data + 3.80;
        Receipt = Receipt + "Beef Soup  -  €3.80 \n";

        LCD.setText("€" + Double.toString(Data));
    }//GEN-LAST:event_beefSoupActionPerformed

    private void help_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help_clicked
        JOptionPane.showMessageDialog(null, "- Hover over the items to view their price.\n\n- Click on the Checkout button to get the result of the order and the receipt will be displayed and printed immidiately.\n\n- Then you are ready to take the next order straight away after that!\n\nThank you for using Zana's Cashier!", "Help!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_help_clicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Form().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Dessert;
    private javax.swing.JTextField LCD;
    private javax.swing.JButton OreosAndMilk;
    private javax.swing.JMenu about;
    private javax.swing.JButton batteredChicken;
    private javax.swing.JButton beans;
    private javax.swing.JButton beefSoup;
    private javax.swing.JButton bonecrusher;
    private javax.swing.JButton breastFillets;
    private javax.swing.JButton cappuchinno;
    private javax.swing.JButton checkout;
    private javax.swing.JButton chickenCurry;
    private javax.swing.JLabel chickenFeasts;
    private javax.swing.JButton chickenHouse;
    private javax.swing.JButton chickenSlam;
    private javax.swing.JButton chickenSoup;
    private javax.swing.JButton coffee;
    private javax.swing.JButton coke;
    private javax.swing.JLabel curryDishes;
    private javax.swing.JButton famPounder;
    private javax.swing.JButton familyBargain;
    private javax.swing.JLabel familyMeals;
    private javax.swing.JButton fruits;
    private javax.swing.JButton grilledChicken;
    private javax.swing.JMenu help;
    private javax.swing.JButton hotChocolate;
    private javax.swing.JLabel hotDrinks;
    private javax.swing.JButton iceCream;
    private javax.swing.JButton icedTea;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jalfrezi;
    private javax.swing.JLabel kidsMeal;
    private javax.swing.JButton late;
    private javax.swing.JButton lightweight;
    private javax.swing.JButton nuggets;
    private javax.swing.JButton onionSoup;
    private javax.swing.JButton peppaMeal;
    private javax.swing.JButton pepsi;
    private javax.swing.JButton prawnCurry;
    private javax.swing.JButton rice;
    private javax.swing.JButton sevenUp;
    private javax.swing.JButton sideBreast;
    private javax.swing.JButton simplicity;
    private javax.swing.JLabel softDrinks;
    private javax.swing.JLabel soups;
    private javax.swing.JButton spongeMeal;
    private javax.swing.JButton tea;
    private javax.swing.JButton thaiCurry;
    private javax.swing.JButton tortillaSoup;
    private javax.swing.JButton twoChickenChips;
    private javax.swing.JButton vegSoup;
    private javax.swing.JButton water;
    private javax.swing.JButton wings;
    // End of variables declaration//GEN-END:variables
}