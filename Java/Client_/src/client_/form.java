package client_;

import java.rmi.Naming;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import types.ListOfTovar;
import types.Tovar;
import service.endpoint.TovarServiceService;


public class form extends javax.swing.JFrame {
    public form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgAdd = new javax.swing.JDialog();
        lblName = new java.awt.Label();
        lblKol = new java.awt.Label();
        lblPrice = new java.awt.Label();
        cmbName = new javax.swing.JComboBox<>();
        spnKol = new javax.swing.JSpinner();
        btnAddTovar = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblingred = new java.awt.Label();
        lblsrok = new java.awt.Label();
        lblrec = new java.awt.Label();
        cmbingred = new javax.swing.JComboBox<>();
        cmbrec = new javax.swing.JComboBox<>();
        lblPr = new java.awt.Label();
        spnK = new javax.swing.JSpinner();
        btnPrice = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnGrp = new javax.swing.ButtonGroup();
        lbl = new java.awt.Label();
        txt = new java.awt.TextField();
        tlBar = new javax.swing.JToolBar();
        btnAdd = new javax.swing.JButton();
        spr1 = new javax.swing.JToolBar.Separator();
        btnDecide = new javax.swing.JButton();
        spr3 = new javax.swing.JToolBar.Separator();
        btnDelete = new javax.swing.JButton();
        spr4 = new javax.swing.JToolBar.Separator();
        btnExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();

        lblName.setText("Наименование");

        lblKol.setText("Количество");

        lblPrice.setText("Цена");

        cmbName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Белый", "Черный", "Ржаной" }));

        spnKol.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        spnKol.setValue(10);

        btnAddTovar.setText("Добавить");
        btnAddTovar.setEnabled(false);
        btnAddTovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTovarActionPerformed(evt);
            }
        });

        btnCancel.setText("Отменить");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblingred.setText("Ингредиенты");

        lblsrok.setText("Сроки годности");

        lblrec.setText("Рецепты");

        cmbingred.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "кунжутные семечки", "крупа гречневая", "пшеничные отруби" }));

        cmbrec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Стандартный", "Фирменный" }));

        spnK.setModel(new javax.swing.SpinnerNumberModel(1, 1, 24, 1));
        spnK.setValue(10);

        btnPrice.setText("Посчитать сумму");
        btnPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPriceActionPerformed(evt);
            }
        });

        btnClear.setText("Очистить");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgAddLayout = new javax.swing.GroupLayout(dlgAdd.getContentPane());
        dlgAdd.getContentPane().setLayout(dlgAddLayout);
        dlgAddLayout.setHorizontalGroup(
            dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblsrok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblingred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbrec, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnKol, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbingred, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnK, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(lblPr, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAddTovar)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrice)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dlgAddLayout.setVerticalGroup(
            dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbingred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblingred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsrok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblKol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(spnKol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(cmbrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrice)
                            .addComponent(btnAddTovar)
                            .addComponent(btnCancel)
                            .addComponent(btnClear))
                        .addContainerGap())
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl.setText("Общая сумма товара");

        txt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt.setEditable(false);

        tlBar.setRollover(true);

        btnAdd.setText("Добавить");
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        tlBar.add(btnAdd);
        tlBar.add(spr1);

        btnDecide.setText("Вычислить");
        btnDecide.setFocusable(false);
        btnDecide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDecide.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDecide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecideActionPerformed(evt);
            }
        });
        tlBar.add(btnDecide);
        tlBar.add(spr3);

        btnDelete.setText("Удалить");
        btnDelete.setFocusable(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        tlBar.add(btnDelete);
        tlBar.add(spr4);

        btnExit.setText("Выход");
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        tlBar.add(btnExit);

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Наименование", "Ингредиенты", "Сроки годности", "Цена", "Количество", "Рецепт", "Сумма"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tlBar, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tlBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static TovarServiceService tovarService = null;
    static DefaultTableModel model = new DefaultTableModel();
    
    static {
        tovarService = new TovarServiceService();
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        dlgAdd.setSize(445,400);
        dlgAdd.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDecideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecideActionPerformed
        try{
        txt.setText(Integer.toString(tovarService.getTovarServicePort().getSumOfTovar()));
        }
        catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером" + ex.getMessage() + ".", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDecideActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dlgAdd.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddTovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTovarActionPerformed
        dlgAdd.setVisible(false);
        Tovar el;
            el = new Tovar();
            el.setName(cmbName.getSelectedItem().toString());
            el.setIngredient(cmbingred.getSelectedItem().toString());
            el.setSrok(String.valueOf(spnK.getValue()));
            el.setKol((int) spnKol.getValue());
            el.setRecept(cmbrec.getSelectedItem().toString());
            el.setPrice(Integer.parseInt(lblPr.getText()));
            try{
                doVivod(tovarService.getTovarServicePort().setNewTovar(el));     
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером" + ex.getMessage() + ".", "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btnAddTovarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       try{
        model = (DefaultTableModel)tbl.getModel();
        doVivod(tovarService.getTovarServicePort().getAllTovar()); 
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером" + ex.getMessage() + ".", "Ошибка", JOptionPane.ERROR_MESSAGE);
       }  
    }//GEN-LAST:event_formWindowOpened

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        doDelete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPriceActionPerformed
       btnAddTovar.setEnabled(true);
       if(cmbName.getSelectedIndex() == 0 && cmbingred.getSelectedIndex() == 0 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 0)
            {
                lblPr.setText("30");
            }
             if(cmbName.getSelectedIndex() == 0 && cmbingred.getSelectedIndex() == 0 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 1)
            {
                lblPr.setText("35");
            }
            if (cmbName.getSelectedIndex() == 0 && cmbingred.getSelectedIndex() == 0 && (int)spnK.getValue() > 1 && (cmbrec.getSelectedIndex() == 0 || cmbrec.getSelectedIndex() == 1))
            {
                lblPr.setText("40");
            }
            if(cmbName.getSelectedIndex() == 0 && cmbingred.getSelectedIndex() == 1 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 0)
            {
                lblPr.setText("32");
            }
             if(cmbName.getSelectedIndex() == 0 && cmbingred.getSelectedIndex() == 1 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 1)
            {
                lblPr.setText("38");
            }
            if (cmbName.getSelectedIndex() == 0 && cmbingred.getSelectedIndex() == 1 && (int)spnK.getValue() > 1 && (cmbrec.getSelectedIndex() == 0 || cmbrec.getSelectedIndex() == 1))
            {
                lblPr.setText("42");
            }
            if(cmbName.getSelectedIndex() == 0 && cmbingred.getSelectedIndex() == 2 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 0)
            {
                lblPr.setText("33");
            }
             if(cmbName.getSelectedIndex() == 0 && cmbingred.getSelectedIndex() == 2 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 1)
            {
                lblPr.setText("39");
            }
            if (cmbName.getSelectedIndex() == 0 && cmbingred.getSelectedIndex() == 2 && (int)spnK.getValue() > 1 && (cmbrec.getSelectedIndex() == 0 || cmbrec.getSelectedIndex() == 1))
            {
                lblPr.setText("43");
            }
            if(cmbName.getSelectedIndex() == 1 && cmbingred.getSelectedIndex() == 0 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 0)
            {
                lblPr.setText("31");
            }
             if(cmbName.getSelectedIndex() == 1 && cmbingred.getSelectedIndex() == 0 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 1)
            {
                lblPr.setText("36");
            }
            if (cmbName.getSelectedIndex() == 1 && cmbingred.getSelectedIndex() == 0 && (int)spnK.getValue() > 1 && (cmbrec.getSelectedIndex() == 0 || cmbrec.getSelectedIndex() == 1))
            {
                lblPr.setText("41");
            }
            if(cmbName.getSelectedIndex() == 1 && cmbingred.getSelectedIndex() == 1 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 0)
            {
                lblPr.setText("37");
            }
             if(cmbName.getSelectedIndex() == 1 && cmbingred.getSelectedIndex() == 1 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 1)
            {
                lblPr.setText("42");
            }
            if (cmbName.getSelectedIndex() == 1 && cmbingred.getSelectedIndex() == 1 && (int)spnK.getValue() > 1 && (cmbrec.getSelectedIndex() == 0 || cmbrec.getSelectedIndex() == 1))
            {
                lblPr.setText("47");
            }
            if(cmbName.getSelectedIndex() == 1 && cmbingred.getSelectedIndex() == 2 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 0)
            {
                lblPr.setText("32");
            }
             if(cmbName.getSelectedIndex() == 1 && cmbingred.getSelectedIndex() == 2 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 1)
            {
                lblPr.setText("35");
            }
            if (cmbName.getSelectedIndex() == 1 && cmbingred.getSelectedIndex() == 2 && (int)spnK.getValue() > 1 && (cmbrec.getSelectedIndex() == 0 || cmbrec.getSelectedIndex() == 1))
            {
                lblPr.setText("40");
            }
            if(cmbName.getSelectedIndex() == 2 && cmbingred.getSelectedIndex() == 0 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 0)
            {
                lblPr.setText("36");
            }
             if(cmbName.getSelectedIndex() == 2 && cmbingred.getSelectedIndex() == 0 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 1)
            {
                lblPr.setText("43");
            }
            if (cmbName.getSelectedIndex() == 2 && cmbingred.getSelectedIndex() == 0 && (int)spnK.getValue() > 1 && (cmbrec.getSelectedIndex() == 0 || cmbrec.getSelectedIndex() == 1))
            {
                lblPr.setText("50");
            }
            if(cmbName.getSelectedIndex() == 2 && cmbingred.getSelectedIndex() == 1 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 0)
            {
                lblPr.setText("40");
            }
             if(cmbName.getSelectedIndex() == 2 && cmbingred.getSelectedIndex() == 1 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 1)
            {
                lblPr.setText("47");
            }
            if (cmbName.getSelectedIndex() == 2 && cmbingred.getSelectedIndex() == 1 && (int)spnK.getValue() > 1 && (cmbrec.getSelectedIndex() == 0 || cmbrec.getSelectedIndex() == 1))
            {
                lblPr.setText("52");
            }
            if(cmbName.getSelectedIndex() == 2 && cmbingred.getSelectedIndex() == 2 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 0)
            {
                lblPr.setText("38");
            }
             if(cmbName.getSelectedIndex() == 2 && cmbingred.getSelectedIndex() == 2 && (int)spnK.getValue() == 1 && cmbrec.getSelectedIndex()== 1)
            {
                lblPr.setText("44");
            }
            if (cmbName.getSelectedIndex() == 2 && cmbingred.getSelectedIndex() == 2 && (int)spnK.getValue() > 1 && (cmbrec.getSelectedIndex() == 0 || cmbrec.getSelectedIndex() == 1))
            {
                lblPr.setText("49");
            }
    }//GEN-LAST:event_btnPriceActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        cmbName.setSelectedIndex(-1);
        cmbingred.setSelectedIndex(-1);
        cmbrec.setSelectedIndex(-1);
        lblPr.setText("");
        btnAddTovar.setEnabled(false);
    }//GEN-LAST:event_btnClearActionPerformed
    
    private void doVivod(ListOfTovar lstTovar){
        doClearTable();
        int i = 1;
        for(Tovar tovar:lstTovar.getItem()){
            Object[] rowData = new Object[7];
            rowData[0] = tovar.getName();
            rowData[1] = tovar.getIngredient();
            rowData[2] = tovar.getSrok(); 
            rowData[3] = tovar.getPrice();
            rowData[4] = tovar.getKol();
            rowData[5] = tovar.getRecept();
            rowData[6] = tovar.getPrice() * tovar.getKol();
            model.addRow(rowData);
        }
    }
    
    private void doClearTable(){
        while (model.getRowCount()>0){
            model.removeRow(0);
        }   
    }
    
    private void doDelete(){
        if (tbl.getSelectedRow() != -1)
       {
           model.removeRow(tbl.getSelectedRow());
       }
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddTovar;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDecide;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGrp;
    private javax.swing.JButton btnPrice;
    private javax.swing.JComboBox<String> cmbName;
    private javax.swing.JComboBox<String> cmbingred;
    private javax.swing.JComboBox<String> cmbrec;
    private javax.swing.JDialog dlgAdd;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label lbl;
    private java.awt.Label lblKol;
    private java.awt.Label lblName;
    private java.awt.Label lblPr;
    private java.awt.Label lblPrice;
    private java.awt.Label lblingred;
    private java.awt.Label lblrec;
    private java.awt.Label lblsrok;
    private javax.swing.JSpinner spnK;
    private javax.swing.JSpinner spnKol;
    private javax.swing.JToolBar.Separator spr1;
    private javax.swing.JToolBar.Separator spr3;
    private javax.swing.JToolBar.Separator spr4;
    private javax.swing.JTable tbl;
    private javax.swing.JToolBar tlBar;
    private java.awt.TextField txt;
    // End of variables declaration//GEN-END:variables
}
