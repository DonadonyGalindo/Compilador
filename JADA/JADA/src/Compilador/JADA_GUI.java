package Compilador;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import static javax.swing.JOptionPane.showMessageDialog;
import org.jw.menage.ui.components.TextLineNumber;

/**
 *
 * @author DeusArcana
 */
public class JADA_GUI extends javax.swing.JFrame {
    String Tokens="";
    String Error="";
    public JADA_GUI() {
        super("Proyecto JADA");
        initComponents();
        TextLineNumber var = new TextLineNumber(CodeTextPanel, 4);
        CodePanel.add(var, BorderLayout.WEST);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CodeScrollPane = new javax.swing.JScrollPane();
        CodePanel = new javax.swing.JPanel();
        CodeTextPanel = new javax.swing.JTextPane();
        errorPanel = new javax.swing.JPanel();
        errorScrollPane = new javax.swing.JScrollPane();
        errorTextPane = new javax.swing.JTextPane();
        tokensPanel = new javax.swing.JPanel();
        tokensScrollPane = new javax.swing.JScrollPane();
        tokensTextPane = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenuItem = new javax.swing.JMenu();
        newMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        openMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        rechargeMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        propertiesMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenuItem = new javax.swing.JMenu();
        undoMenuItem = new javax.swing.JMenuItem();
        redoMenuItem = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        copyMenuItem = new javax.swing.JMenuItem();
        cutMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        commandMenu = new javax.swing.JMenu();
        copyActualLinesMenuItem = new javax.swing.JMenuItem();
        cutActualLinesMenuItem = new javax.swing.JMenuItem();
        deleteActualLinesMenuItem = new javax.swing.JMenuItem();
        duplicateActualLinesMenuItem = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        selectActualLinesMenuItem = new javax.swing.JMenuItem();
        selectActualParraphMenuItem = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        moveUpActualLinesMenuItem = new javax.swing.JMenuItem();
        moveDownActualLinesMenuItem = new javax.swing.JMenuItem();
        formatMenu = new javax.swing.JMenu();
        commentLinesMenuItem = new javax.swing.JMenuItem();
        decommentLinesMenuItem = new javax.swing.JMenuItem();
        commentDecommentLinesMenuItem = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        incrementIndentationMenuItem = new javax.swing.JMenuItem();
        decrementIndentationMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);

        CodePanel.setLayout(new java.awt.BorderLayout());
        CodePanel.add(CodeTextPanel, java.awt.BorderLayout.CENTER);

        CodeScrollPane.setViewportView(CodePanel);

        errorTextPane.setEditable(false);
        errorScrollPane.setViewportView(errorTextPane);

        javax.swing.GroupLayout errorPanelLayout = new javax.swing.GroupLayout(errorPanel);
        errorPanel.setLayout(errorPanelLayout);
        errorPanelLayout.setHorizontalGroup(
            errorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(errorScrollPane)
        );
        errorPanelLayout.setVerticalGroup(
            errorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errorPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tokensTextPane.setEditable(false);
        tokensScrollPane.setViewportView(tokensTextPane);

        jButton1.setText("Compilar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tokensPanelLayout = new javax.swing.GroupLayout(tokensPanel);
        tokensPanel.setLayout(tokensPanelLayout);
        tokensPanelLayout.setHorizontalGroup(
            tokensPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tokensPanelLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jButton1)
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(tokensPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tokensScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
        );
        tokensPanelLayout.setVerticalGroup(
            tokensPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tokensPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(tokensPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tokensPanelLayout.createSequentialGroup()
                    .addComponent(tokensScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 44, Short.MAX_VALUE)))
        );

        fileMenuItem.setText("Archivo");

        newMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newMenuItem.setText("Nuevo");
        fileMenuItem.add(newMenuItem);
        fileMenuItem.add(jSeparator1);

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem.setText("Abrir");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenuItem.add(openMenuItem);
        fileMenuItem.add(jSeparator2);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setText("Guardar");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenuItem.add(saveMenuItem);

        saveAsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAsMenuItem.setText("Guardar como...");
        fileMenuItem.add(saveAsMenuItem);

        rechargeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        rechargeMenuItem.setText("Recargar");
        fileMenuItem.add(rechargeMenuItem);
        fileMenuItem.add(jSeparator3);

        propertiesMenuItem.setText("Propiedades");
        fileMenuItem.add(propertiesMenuItem);
        fileMenuItem.add(jSeparator4);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setText("Salir");
        fileMenuItem.add(exitMenuItem);

        menuBar.add(fileMenuItem);

        editMenuItem.setText("Editar");

        undoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        undoMenuItem.setText("Deshacer");
        editMenuItem.add(undoMenuItem);

        redoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        redoMenuItem.setText("Rehacer");
        editMenuItem.add(redoMenuItem);
        editMenuItem.add(jSeparator5);

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyMenuItem.setText(" Copiar");
        editMenuItem.add(copyMenuItem);

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutMenuItem.setText("Cortar");
        editMenuItem.add(cutMenuItem);

        pasteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteMenuItem.setText("Pegar");
        editMenuItem.add(pasteMenuItem);

        deleteMenuItem.setText("Eliminar");
        editMenuItem.add(deleteMenuItem);
        editMenuItem.add(jSeparator6);

        commandMenu.setText("Comandos");

        copyActualLinesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        copyActualLinesMenuItem.setText("Copiar lineas actuales");
        commandMenu.add(copyActualLinesMenuItem);

        cutActualLinesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        cutActualLinesMenuItem.setText("Cortar lineas actuales");
        commandMenu.add(cutActualLinesMenuItem);

        deleteActualLinesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        deleteActualLinesMenuItem.setText("Borrar lineas actuales");
        commandMenu.add(deleteActualLinesMenuItem);

        duplicateActualLinesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        duplicateActualLinesMenuItem.setText("Duplicar lineas o selección");
        commandMenu.add(duplicateActualLinesMenuItem);
        commandMenu.add(jSeparator7);

        selectActualLinesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        selectActualLinesMenuItem.setText("Seleccionar lineas actuales");
        commandMenu.add(selectActualLinesMenuItem);

        selectActualParraphMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        selectActualParraphMenuItem.setText("Seleccionar parrafo actual");
        commandMenu.add(selectActualParraphMenuItem);
        commandMenu.add(jSeparator8);

        moveUpActualLinesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_PAGE_UP, java.awt.event.InputEvent.ALT_MASK));
        moveUpActualLinesMenuItem.setText("Mover linea(s) hacia arriba");
        commandMenu.add(moveUpActualLinesMenuItem);

        moveDownActualLinesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_PAGE_DOWN, java.awt.event.InputEvent.ALT_MASK));
        moveDownActualLinesMenuItem.setText("Mover linea(s) hacia abajo");
        commandMenu.add(moveDownActualLinesMenuItem);

        editMenuItem.add(commandMenu);

        formatMenu.setText("Formato");

        commentLinesMenuItem.setText("Comentar lineas");
        formatMenu.add(commentLinesMenuItem);

        decommentLinesMenuItem.setText("Descomentar lineas");
        formatMenu.add(decommentLinesMenuItem);

        commentDecommentLinesMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        commentDecommentLinesMenuItem.setText("Comentar / Descomentar lineas");
        formatMenu.add(commentDecommentLinesMenuItem);
        formatMenu.add(jSeparator9);

        incrementIndentationMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        incrementIndentationMenuItem.setText("Incrementar sangría");
        formatMenu.add(incrementIndentationMenuItem);

        decrementIndentationMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        decrementIndentationMenuItem.setText("Decrementar sangría");
        formatMenu.add(decrementIndentationMenuItem);

        editMenuItem.add(formatMenu);

        menuBar.add(editMenuItem);

        helpMenu.setText("Ayuda");
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CodeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tokensPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CodeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addComponent(tokensPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void guardarArchivo() {
         try
         {
          String nombre="";
          JFileChooser file=new JFileChooser();
          file.showSaveDialog(this);
          File guarda =file.getSelectedFile();

          if(guarda !=null)
          {
           /*guardamos el archivo y le damos el formato directamente,
            * si queremos que se guarde en formato doc lo definimos como .doc*/
            FileWriter  save=new FileWriter(guarda+".jada");
            save.write(CodeTextPanel.getText());
            save.close();
            showMessageDialog(null,"El archivo se a guardado Exitosamente");
            }
         }
          catch(IOException ex)
          {
           showMessageDialog(null,"Su archivo no se ha guardado");
          }
    }
    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
       String texto="";
    JFileChooser sa=new JFileChooser();
    sa.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    int res=sa.showOpenDialog(this);
    File archivo=sa.getSelectedFile();
    if(archivo==null || archivo.getName().equals("")){
        showMessageDialog(this,"archivo no valido");
    }
    try{
        FileReader fr=new FileReader(archivo);
        BufferedReader br=new BufferedReader(fr);
        
        String str;
        
        
        while((str=br.readLine())!=null){
            texto+=str+"\n";

        }
        br.close();
    }catch(FileNotFoundException e){
        showMessageDialog(this, "archivo no enconrado");
    }catch(IOException e1){
        showMessageDialog(this, "archivo no enconrado");
    }
    CodeTextPanel.setText(texto);
    
   
    
         // TODO add your handling code here:
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        guardarArchivo();        // TODO add your handling code here:
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                 try {
            Analisis ar = new Analisis();
            ar.probarLexerFile(CodeTextPanel);
            for(int i=0;i<ar.tam();i++){
            Tokens+=ar.v.get(i)+"\n";
          }
            for(int i=0;i<ar.tamerror();i++){
            Error+=ar.e.get(i)+"\n";
          }
           
        
        tokensTextPane.setText(Tokens);
        errorTextPane.setText(Error);
        Tokens="";
        Error="";
        ar.vaciar();
        ar.vaciarerror();// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(JADA_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JADA_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new JADA_GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CodePanel;
    private javax.swing.JScrollPane CodeScrollPane;
    private javax.swing.JTextPane CodeTextPanel;
    private javax.swing.JMenu commandMenu;
    private javax.swing.JMenuItem commentDecommentLinesMenuItem;
    private javax.swing.JMenuItem commentLinesMenuItem;
    private javax.swing.JMenuItem copyActualLinesMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutActualLinesMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem decommentLinesMenuItem;
    private javax.swing.JMenuItem decrementIndentationMenuItem;
    private javax.swing.JMenuItem deleteActualLinesMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenuItem duplicateActualLinesMenuItem;
    private javax.swing.JMenu editMenuItem;
    private javax.swing.JPanel errorPanel;
    private javax.swing.JScrollPane errorScrollPane;
    private javax.swing.JTextPane errorTextPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenuItem;
    private javax.swing.JMenu formatMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem incrementIndentationMenuItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem moveDownActualLinesMenuItem;
    private javax.swing.JMenuItem moveUpActualLinesMenuItem;
    private javax.swing.JMenuItem newMenuItem;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem propertiesMenuItem;
    private javax.swing.JMenuItem rechargeMenuItem;
    private javax.swing.JMenuItem redoMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem selectActualLinesMenuItem;
    private javax.swing.JMenuItem selectActualParraphMenuItem;
    private javax.swing.JPanel tokensPanel;
    private javax.swing.JScrollPane tokensScrollPane;
    private javax.swing.JTextPane tokensTextPane;
    private javax.swing.JMenuItem undoMenuItem;
    // End of variables declaration//GEN-END:variables
}
