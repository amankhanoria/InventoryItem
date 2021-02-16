package com.homeinventory;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.awt.print.*;

public class HomeInventory extends javax.swing.JFrame 
{
  String letterClicked;
  static final int maximumEntries = 300,entriesPerPage = 2;
  static int numberEntries,lastPage;
  static InventoryItem[] myInventory = new InventoryItem[maximumEntries];
  int currentEntry,n;
  ImageIcon image = null; 
  
  public HomeInventory()
  {
    setTitle("Home Inventory Manager");
    setResizable(false);
    addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent evt){exitForm(evt);}});
    getContentPane().setLayout(new GridBagLayout());
    GridBagConstraints gridConstraints;
    pack();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setBounds((int)(0.5 *(screenSize.width - getWidth())),(int)(0.5*(screenSize.height- getHeight())),getWidth(), getHeight()); 
    initComponents();
    try
    {
        BufferedReader inputFile = new BufferedReader(new FileReader("inventory.txt"));
        numberEntries = Integer.valueOf(inputFile.readLine()).intValue();

         if (numberEntries != 0)
         {
            for (int i=0; i<numberEntries; i++)
            {
             myInventory[i] = new InventoryItem();
             myInventory[i].description = inputFile.readLine();
             myInventory[i].location = inputFile.readLine();
             myInventory[i].serialNumber = inputFile.readLine();
             myInventory[i].marked = Boolean.valueOf(inputFile.readLine()).booleanValue();
             myInventory[i].purchasePrice = inputFile.readLine();
             myInventory[i].purchaseDate = inputFile.readLine();
             myInventory[i].purchaseLocation = inputFile.readLine();
             myInventory[i].note = inputFile.readLine();
             myInventory[i].photoFile = inputFile.readLine();}}
         
        n = Integer.valueOf(inputFile.readLine()).intValue();
        
        if (n != 0)
        {
         for(int i = 0; i < n; i++)
         {locationComboBox.addItem(inputFile.readLine());}}
        
         inputFile.close();
         
         currentEntry = 1;
         showEntry(currentEntry);}
        
        catch (Exception ex)
        { numberEntries = 0;
          currentEntry = 0; }
        
        if(numberEntries == 0)
        {
         newButton.setEnabled(false);
         deleteButton.setEnabled(false);
         nextButton.setEnabled(false);
         previousButton.setEnabled(false);
         printButton.setEnabled(false);}}

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        photoPanel = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        serialTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        itemTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        noteTextField = new javax.swing.JTextField();
        storeTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        photoTextArea = new javax.swing.JTextArea();
        locationComboBox = new javax.swing.JComboBox<>();
        markedCheckBox = new javax.swing.JCheckBox();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/homeinventory/New.png"))); // NOI18N
        newButton.setText("New");
        newButton.setFocusable(false);
        newButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(newButton);

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/homeinventory/Delete-file-icon.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setFocusable(false);
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(deleteButton);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/homeinventory/Save.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.setFocusable(false);
        saveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(saveButton);

        previousButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/homeinventory/previous.png"))); // NOI18N
        previousButton.setText("Previous");
        previousButton.setFocusable(false);
        previousButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        previousButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(previousButton);

        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/homeinventory/next.png"))); // NOI18N
        nextButton.setText("Next");
        nextButton.setFocusable(false);
        nextButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nextButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(nextButton);

        printButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/homeinventory/printer-3-512.png"))); // NOI18N
        printButton.setText("Print");
        printButton.setFocusable(false);
        printButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        printButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(printButton);

        exitButton.setText("Exit");
        exitButton.setFocusable(false);
        exitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(exitButton);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        jButton6.setText("jButton6");

        jButton7.setText("jButton7");

        jButton8.setText("jButton8");

        jButton9.setText("jButton9");

        jButton10.setText("jButton10");

        jButton11.setText("jButton11");

        jButton12.setText("jButton12");

        jButton13.setText("jButton13");

        jButton14.setText("jButton14");

        jButton15.setText("jButton15");

        jButton16.setText("jButton16");

        jButton17.setText("jButton17");

        jButton18.setText("jButton18");

        jButton19.setText("jButton19");

        jButton20.setText("jButton20");

        jButton21.setText("jButton21");

        jButton22.setText("jButton22");

        jButton23.setText("jButton23");

        jButton24.setText("jButton24");

        jButton25.setText("jButton25");

        jButton26.setText("jButton26");

        jButton27.setText("jButton27");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton13)
                                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jButton22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jButton18)
                                .addGap(2, 2, 2)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jButton23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jButton19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton21))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton27)))
                .addGap(0, 0, 0))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton15)
                        .addComponent(jButton16)
                        .addComponent(jButton17))
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jButton19)
                    .addComponent(jButton21)
                    .addComponent(jButton20))
                .addGap(9, 9, 9)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23)
                    .addComponent(jButton25)
                    .addComponent(jButton22)
                    .addComponent(jButton24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton26)
                    .addComponent(jButton27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("jLabel2");

        javax.swing.GroupLayout photoPanelLayout = new javax.swing.GroupLayout(photoPanel);
        photoPanel.setLayout(photoPanelLayout);
        photoPanelLayout.setHorizontalGroup(
            photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(photoPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel3)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        photoPanelLayout.setVerticalGroup(
            photoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(photoPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel3)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jLabel4.setText("Inventory Item");

        jLabel5.setText("Location");

        jLabel6.setText("Serial Number");

        jLabel7.setText("Purchase Price");

        jLabel8.setText("Store/Website");

        jLabel9.setText("Note");

        jLabel10.setText("Photo");

        serialTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Date Purchased");

        photoTextArea.setColumns(20);
        photoTextArea.setRows(5);
        jScrollPane1.setViewportView(photoTextArea);

        locationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        markedCheckBox.setText("jCheckBox1");

        jButton1.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(photoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(itemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(storeTextField)
                                        .addComponent(noteTextField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(locationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(markedCheckBox))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(priceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                            .addComponent(serialTextField))
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(229, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(itemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(locationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(markedCheckBox)))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(serialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)
                                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(storeTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(noteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jButton1))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(photoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showEntry(int j){
     itemTextField.setText(myInventory[j - 1].description);
     locationComboBox.setSelectedItem(myInventory[j - 1].location);
     markedCheckBox.setSelected(myInventory[j - 1].marked);
     serialTextField.setText(myInventory[j - 1].serialNumber);
     priceTextField.setText(myInventory[j - 1].purchasePrice);
     dateChooser.setDate(stringToDate(myInventory[j - 1].purchaseDate));
     storeTextField.setText(myInventory[j - 1].purchaseLocation);
     noteTextField.setText(myInventory[j - 1].note);
     showPhoto(myInventory[j - 1].photoFile);
     itemTextField.requestFocus(); 
     nextButton.setEnabled(true);
     previousButton.setEnabled(true);
     if (j == 1){ previousButton.setEnabled(false);}
     if (j == numberEntries){ nextButton.setEnabled(false);}}
    private Date stringToDate(String s){
     int m = Integer.valueOf(s.substring(0, 2)).intValue() - 1;
     int d = Integer.valueOf(s.substring(3, 5)).intValue();
     int y = Integer.valueOf(s.substring(6)).intValue() - 1900;
     return(new Date(y, m, d));}
    private String dateToString(Date dd){
     String yString = String.valueOf(dd.getYear() + 1900);
     int m = dd.getMonth() + 1;
     String mString = new DecimalFormat("00").format(m);
     int d = dd.getDate();
     String dString = new DecimalFormat("00").format(d);
     return(mString + "/" + dString + "/" + yString);}
    private void showPhoto(String photoFile){
    if (!photoFile.equals(""))
    {
     try
     { photoTextArea.setText(photoFile);}
     catch (Exception ex)
     { photoTextArea.setText("");}}
     else
     { photoTextArea.setText("Error");}
     photoPanel.repaint();
     
     try
     {  image = new ImageIcon(photoTextArea.getText());
        Image Image = image.getImage(); 
        Image newimg = Image.getScaledInstance(270,160,java.awt.Image.SCALE_SMOOTH); 
        image = new ImageIcon(newimg);
        jLabel3.setIcon(image);}
     
     catch(Exception e)
     {  System.out.println("Error: "+e); }}   
    private void locationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationComboBoxActionPerformed
        if (locationComboBox.getItemCount() != 0)
        {
         for (int i = 0; i < locationComboBox.getItemCount(); i++)
         {
         if(locationComboBox.getSelectedItem().toString().equals(locationComboBox.getItemAt(i).toString()))
         {
          serialTextField.requestFocus();
          return; }}}
         locationComboBox.addItem(locationComboBox.getSelectedItem().toString());
         serialTextField.requestFocus();
    }//GEN-LAST:event_locationComboBoxActionPerformed
    private void serialTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialTextFieldActionPerformed
    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        lastPage = (int)(1 + (numberEntries-1)/entriesPerPage);
        PrinterJob inventoryPrinterJob = PrinterJob.getPrinterJob();
        inventoryPrinterJob.setPrintable(new InventoryDocument());
        if (inventoryPrinterJob.printDialog())
        {
         try
         { inventoryPrinterJob.print();}
         catch (PrinterException ex)
         { JOptionPane.showConfirmDialog(null, ex.getMessage(), "Print Error",JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);}}
    }//GEN-LAST:event_printButtonActionPerformed
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        checkSave();
        currentEntry++;
        showEntry(currentEntry);
    }//GEN-LAST:event_nextButtonActionPerformed
    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        checkSave();
        blankValues();
    }//GEN-LAST:event_newButtonActionPerformed
    private void priceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTextFieldActionPerformed
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
      letterClicked = "P";
    }//GEN-LAST:event_jButton18ActionPerformed
    private void photoTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_photoTextAreaActionPerformed
    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        checkSave();
        currentEntry--;
        showEntry(currentEntry);
    }//GEN-LAST:event_previousButtonActionPerformed
    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
       exitForm(null);
    }//GEN-LAST:event_exitbuttonActionPerformed
    private void photoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoButtonActionPerformed
       JFileChooser openChooser = new JFileChooser();
       openChooser.setDialogType(JFileChooser.OPEN_DIALOG);
       openChooser.setDialogTitle("Open Photo File");
       openChooser.addChoosableFileFilter(new FileNameExtensionFilter("Photo Files","jpg"));
       if(openChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
       { showPhoto(openChooser.getSelectedFile().toString());}
    }//GEN-LAST:event_photoButtonActionPerformed
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    
    itemTextField.setText(itemTextField.getText().trim());
    
    if (itemTextField.getText().equals(""))
    {
     JOptionPane.showConfirmDialog(null, "Must have item description.", "Error",JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
     itemTextField.requestFocus();
     return;}
    
    if (newButton.isEnabled()){ deleteEntry(currentEntry); }
    
    String s = itemTextField.getText();
    itemTextField.setText(s.substring(0,1).toUpperCase() + s.substring(1));
    numberEntries++;

    currentEntry = 1;
    if (numberEntries != 1)
    {
     do
     {
       if(itemTextField.getText().compareTo(myInventory[currentEntry - 1].description) < 0)
       { break; }
         currentEntry++;} while (currentEntry < numberEntries); }
       
       if (currentEntry != numberEntries)
       {
        for (int i = numberEntries; i >= currentEntry + 1; i--)
        {
          myInventory[i - 1] = myInventory[i - 2];
          myInventory[i - 2] = new InventoryItem(); }}
       
        myInventory[currentEntry - 1] = new InventoryItem();
        myInventory[currentEntry - 1].description = itemTextField.getText();
        myInventory[currentEntry - 1].location = locationComboBox.getSelectedItem().toString();
        myInventory[currentEntry - 1].marked = markedCheckBox.isSelected();
        myInventory[currentEntry - 1].serialNumber = serialTextField.getText();
        myInventory[currentEntry - 1].purchasePrice = priceTextField.getText();
        myInventory[currentEntry - 1].purchaseDate =dateToString(dateChooser.getDate());
        myInventory[currentEntry - 1].purchaseLocation = storeTextField.getText();
        myInventory[currentEntry - 1].photoFile = photoTextArea.getText();
        myInventory[currentEntry - 1].note = noteTextField.getText();
        showEntry(currentEntry);
        
        if (numberEntries < maximumEntries)
        { newButton.setEnabled(true);}
        else
        { newButton.setEnabled(false);}

        deleteButton.setEnabled(true);
        printButton.setEnabled(true);
    }//GEN-LAST:event_saveButtonActionPerformed
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
    if(JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?","Delete Inventory Item", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION)
    { return; }
 
    deleteEntry(currentEntry);
    
    if(numberEntries == 0)
    {
     currentEntry = 0;
     blankValues(); }
    else
    {
     currentEntry--;
     if (currentEntry == 0)
     { currentEntry = 1;}
       showEntry(currentEntry);}
    }//GEN-LAST:event_deleteButtonActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        letterClicked = "A";
        search();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        letterClicked = "B";
        search();
    }//GEN-LAST:event_jButton3ActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       letterClicked = "C";
       search();
    }//GEN-LAST:event_jButton4ActionPerformed
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       letterClicked = "D";
       search();
    }//GEN-LAST:event_jButton5ActionPerformed
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       letterClicked = "E";
       search();
    }//GEN-LAST:event_jButton6ActionPerformed
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       letterClicked = "F";
       search();
    }//GEN-LAST:event_jButton7ActionPerformed
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       letterClicked = "G";
       search();
    }//GEN-LAST:event_jButton9ActionPerformed
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       letterClicked = "H";
       search();
    }//GEN-LAST:event_jButton10ActionPerformed
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       letterClicked = "I";
       search();
    }//GEN-LAST:event_jButton11ActionPerformed
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       letterClicked = "J";
       search();
    }//GEN-LAST:event_jButton12ActionPerformed
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       letterClicked = "K";
       search();
    }//GEN-LAST:event_jButton13ActionPerformed
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       letterClicked = "L";
       search();
    }//GEN-LAST:event_jButton14ActionPerformed
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       letterClicked = "M";
       search();
    }//GEN-LAST:event_jButton15ActionPerformed
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       letterClicked = "N";
       search();
    }//GEN-LAST:event_jButton16ActionPerformed
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       letterClicked = "O";
       search();
    }//GEN-LAST:event_jButton17ActionPerformed
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
       letterClicked = "Q";
       search();
    }//GEN-LAST:event_jButton19ActionPerformed
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
       letterClicked = "R";
       search();
    }//GEN-LAST:event_jButton20ActionPerformed
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
       letterClicked = "S";
       search();
    }//GEN-LAST:event_jButton21ActionPerformed
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
       letterClicked = "T";
       search();
    }//GEN-LAST:event_jButton22ActionPerformed
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
       letterClicked = "U";
       search();
    }//GEN-LAST:event_jButton23ActionPerformed
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
       letterClicked = "V";
       search();
    }//GEN-LAST:event_jButton24ActionPerformed
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
       letterClicked = "W";
       search();
    }//GEN-LAST:event_jButton25ActionPerformed
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
       letterClicked = "X";
       search();
    }//GEN-LAST:event_jButton26ActionPerformed
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
       letterClicked = "Y";
       search();
    }//GEN-LAST:event_jButton27ActionPerformed
    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
       letterClicked = "Z";
       search();
    }//GEN-LAST:event_jButton28ActionPerformed
    private void search(){    
     int i = 0;
     boolean found = false;

    do
    {
       if(myInventory[i].description.substring(0, 1).equals(letterClicked))
       {
        currentEntry = i + 1;
        showEntry(currentEntry);
        found = true;
        break;}
        i++; }while (i<numberEntries);
    
    if(found==false)
    { JOptionPane.showConfirmDialog(null, "No " + letterClicked + " inventory items.","None Found", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);}
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeInventory().setVisible(true);
            }
        });
    }
    private void exitForm(WindowEvent evt){
    
    if (JOptionPane.showConfirmDialog(null, "Any unsaved changes will be lost.\nAre you sure you want to exit?", "Exit Program", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION)
    { return; }    
    
    try
    {
        PrintWriter outputFile = new PrintWriter(new BufferedWriter(new FileWriter("inventory.txt")));
        outputFile.println(numberEntries);

        if (numberEntries != 0)
        {
         for (int i = 0; i < numberEntries; i++)
         {
          outputFile.println(myInventory[i].description);
          outputFile.println(myInventory[i].location);
          outputFile.println(myInventory[i].serialNumber);
          outputFile.println(myInventory[i].marked);
          outputFile.println(myInventory[i].purchasePrice);
          outputFile.println(myInventory[i].purchaseDate);
          outputFile.println(myInventory[i].purchaseLocation);
          outputFile.println(myInventory[i].note);
          outputFile.println(myInventory[i].photoFile);}}

        outputFile.println(locationComboBox.getItemCount());
        
        if(locationComboBox.getItemCount() != 0)
        {
            for (int i = 0; i < locationComboBox.getItemCount(); i++)
            { outputFile.println(locationComboBox.getItemAt(i)); }}
        
            outputFile.close(); }
        catch(Exception ex){}
       System.exit(0); }
    private void blankValues(){
       newButton.setEnabled(false);
       deleteButton.setEnabled(false);
       saveButton.setEnabled(true);
       previousButton.setEnabled(false);
       nextButton.setEnabled(false);
       printButton.setEnabled(false);
       itemTextField.setText("");
       locationComboBox.setSelectedItem("");
       markedCheckBox.setSelected(false);
       serialTextField.setText("");
       priceTextField.setText("");
       dateChooser.setDate(new Date());
       storeTextField.setText("");
       noteTextField.setText("");
       photoTextArea.setText("");
       photoPanel.repaint();
       jLabel3.setIcon(null);
       itemTextField.requestFocus();}
    private void deleteEntry(int j){
    if (j != numberEntries)
    {
     for (int i = j; i < numberEntries; i++)
     {
       myInventory[i - 1] = new InventoryItem();
       myInventory[i - 1] = myInventory[i]; }}
       numberEntries--;}
    private void checkSave(){
        
        boolean edited = false; 
        if (!myInventory[currentEntry - 1].description.equals(itemTextField.getText()))
            edited = true;
        else if (!myInventory[currentEntry -1].location.equals(locationComboBox.getSelectedItem().toString()))
            edited = true;
        else if (myInventory[currentEntry - 1].marked != markedCheckBox.isSelected())
            edited = true;
        else if (!myInventory[currentEntry - 1].serialNumber.equals(serialTextField.getText()))
            edited = true;
        else if (!myInventory[currentEntry - 1].purchasePrice.equals(priceTextField.getText()))
            edited = true;
        else if (!myInventory[currentEntry -1].purchaseDate.equals(dateToString(dateChooser.getDate())))
            edited = true;
        else if (!myInventory[currentEntry -1].purchaseLocation.equals(storeTextField.getText()))
            edited = true;
        else if (!myInventory[currentEntry - 1].note.equals(noteTextField.getText()))
            edited = true;
        else if (!myInventory[currentEntry - 1].photoFile.equals(photoTextArea.getText()))
            edited = true;
        
        if(edited)
        {
          if (JOptionPane.showConfirmDialog(null, "You have edited this item. Do you want to save the changes?", "Save Item", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
              saveButton.doClick();}}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField itemTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox<String> locationComboBox;
    private javax.swing.JCheckBox markedCheckBox;
    private javax.swing.JButton newButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextField noteTextField;
    private java.awt.Panel panel1;
    private java.awt.Panel photoPanel;
    private javax.swing.JTextArea photoTextArea;
    private javax.swing.JButton previousButton;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JButton printButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField serialTextField;
    private javax.swing.JTextField storeTextField;
    // End of variables declaration//GEN-END:variables
}

class InventoryDocument implements Printable
{
public int print(Graphics g, PageFormat pf, int pageIndex)
{
  Graphics2D g2D = (Graphics2D) g;
  
  if ((pageIndex + 1) > HomeInventory.lastPage)
  { return NO_SUCH_PAGE; }
  int i,iEnd;

  g2D.setFont(new Font("Arial", Font.BOLD, 14));
  g2D.drawString("Home Inventory Items - Page " + String.valueOf(pageIndex + 1),(int) pf.getImageableX(), (int) (pf.getImageableY() + 25));
  // get starting y
  int dy = (int) g2D.getFont().getStringBounds("S",g2D.getFontRenderContext()).getHeight();
  int y = (int) (pf.getImageableY() + 4 * dy);
  iEnd = HomeInventory.entriesPerPage * (pageIndex + 1);
  if (iEnd > HomeInventory.numberEntries)
  { iEnd = HomeInventory.numberEntries;}  

  for(i = 0+HomeInventory.entriesPerPage*pageIndex; i<iEnd; i++)
  {
   Line2D.Double dividingLine = new Line2D.Double(pf.getImageableX(), y,pf.getImageableX() + pf.getImageableWidth(), y);
   g2D.draw(dividingLine);
   y += dy;
   g2D.setFont(new Font("Arial", Font.BOLD, 12));
   g2D.drawString(HomeInventory.myInventory[i].description, (int) pf.getImageableX(),y);
   y += dy;
   g2D.setFont(new Font("Arial", Font.PLAIN, 12));
   g2D.drawString("Location: " + HomeInventory.myInventory[i].location, (int)(pf.getImageableX() + 25), y);
   y += dy;
   
   if (HomeInventory.myInventory[i].marked)
   { g2D.drawString("Item is marked with identifying information.",(int)(pf.getImageableX() + 25), y);}
   else
   { g2D.drawString("Item is NOT marked with identifying information.",(int)(pf.getImageableX() + 25), y);}
    y += dy;
    
    g2D.drawString("Serial Number: " +HomeInventory.myInventory[i].serialNumber, (int) (pf.getImageableX() + 25), y);
    y += dy;
    g2D.drawString("Price: $" + HomeInventory.myInventory[i].purchasePrice + ",Purchased on: " + HomeInventory.myInventory[i].purchaseDate, (int) (pf.getImageableX() +25), y);
    y += dy;
    g2D.drawString("Purchased at: " +HomeInventory.myInventory[i].purchaseLocation, (int) (pf.getImageableX() + 25), y);
    y += dy;
    g2D.drawString("Note: " + HomeInventory.myInventory[i].note, (int)(pf.getImageableX() + 25), y);
    y += dy;
    
    try
    {
    Image inventoryImage = new ImageIcon(HomeInventory.myInventory[i].photoFile).getImage();
    double ratio = (double) (inventoryImage.getWidth(null)) / (double)inventoryImage.getHeight(null);
    g2D.drawImage(inventoryImage, (int) (pf.getImageableX() + 25), y, (int) (100 *ratio), 100, null); }
    catch (Exception ex){}
    y += 2 * dy + 100;}
  
    return PAGE_EXISTS; }}