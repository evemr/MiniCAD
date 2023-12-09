package app;

import java.awt.*;
import java.util.ArrayList;

public class main extends javax.swing.JFrame {
    int contador = 0;
    ArrayList<Polygon> formas = new ArrayList<Polygon>();
    double[][] matrix = new double[3][3];
    //Matrix m = new Matrix();
    double xp,yp,hp;


    public main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtrazonx = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtrazony = new javax.swing.JTextField();
        btnescalamiento = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtangulo = new javax.swing.JTextField();
        btnrotacion = new javax.swing.JButton();
        btnDibujar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        combopoligonos = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btntraslacion = new javax.swing.JButton();
        txtaumentox = new javax.swing.JTextField();
        txtaumentoy = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Click en la zona blanca para marcar los vertices de un polígono");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("TRANSFORMACIONES");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Escalamiento");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel4.setText("Razon X:");

        txtrazonx.setText("0");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setText("Razon Y:");

        txtrazony.setText("0");
        txtrazony.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrazonyActionPerformed(evt);
            }
        });

        btnescalamiento.setText("APLICAR");
        btnescalamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnescalamientoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Rotación");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel7.setText("Angulo:");

        txtangulo.setText("0");

        btnrotacion.setText("APLICAR");
        btnrotacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrotacionActionPerformed(evt);
            }
        });

        btnDibujar.setText("Dibujar");
        btnDibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDibujarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        combopoligonos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combopoligonosItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Traslación");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel9.setText("Desplazamiento X:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setText("Desplazamiento Y:");

        btntraslacion.setText("APLICAR");
        btntraslacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntraslacionActionPerformed(evt);
            }
        });

        txtaumentox.setText("0");

        txtaumentoy.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnDibujar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combopoligonos, 0, 165, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtaumentoy, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtaumentox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btntraslacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtangulo))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtrazony, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtrazonx, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnescalamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnrotacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtrazonx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtrazony, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnescalamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnrotacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtaumentox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtaumentoy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btntraslacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(btnDibujar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combopoligonos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(763, 763, 763))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
            if (contador == 0) {
                formas.add(new Polygon());
            }
            formas.get(formas.size() - 1).addPoint(evt.getX(), evt.getY());
            contador++;     
    }//GEN-LAST:event_formMouseClicked

        
    
    private void btnescalamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnescalamientoActionPerformed
        double sx = Double.parseDouble(txtrazonx.getText());
        double sy =  Double.parseDouble(txtrazony.getText());
        /*double[] punto = new double[3];
        double[] punto2 = new double[3];*/
        int index = combopoligonos.getSelectedIndex();
        
        int[][] matrizEscalar = escalar(generarMatriz(formas.get(index)), sx, sy);
        
        /*int[] puntosX = formas.get(index).xpoints;
        int[] puntosY = formas.get(index).ypoints;
        int[] puntosH = new int[formas.get(index).npoints];
        
        int[] puntosXp = new int[formas.get(index).npoints];
        int[] puntosYp = new int[formas.get(index).npoints];
        int[] puntosHp = new int[formas.get(index).npoints];
        
        
        for (int i = 0; i < puntosH.length; i++) {
            puntosH[i] = 1;
        }
        
        m.escalarXY(sx, sy);
        
        for (int i = 0; i < puntosX.length; i++) {
            punto[0] = puntosX[i];
            punto[1] = puntosY[i];
            punto[2] = puntosH[i];
            punto2 = m.pprima(punto);
            
            puntosXp[i] = (int)(punto2[0]);
            puntosYp[i] = (int)(punto2[1]);
        }
        
        formas.remove(index);
        formas.add(index,new Polygon(puntosXp,puntosYp,puntosXp.length));        
        repaint();
        
        int[] puntosX = formas.get(index).xpoints;
        int[] puntosY = formas.get(index).ypoints;

        int centroX = formas.get(index).getBounds().x;
        int centroY = formas.get(index).getBounds().y;

        for (int i = 0; i < puntosX.length; i++) {
            int x = puntosX[i] - centroX;
            int y = puntosY[i] - centroY;

            int newX = centroX + (int) (x * sx);
            int newY = centroY + (int) (y * sy);

            puntosX[i] = newX;
            puntosY[i] = newY;
        }*/
        formas.remove(index);
        formas.add(index,crearPolygonos(matrizEscalar));       
        repaint();
    }//GEN-LAST:event_btnescalamientoActionPerformed

    private void btnrotacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrotacionActionPerformed
        int alpha = Integer.parseInt(txtangulo.getText());        
        int index = combopoligonos.getSelectedIndex();
        int[][] matrizRotacion = rotacion(generarMatriz(formas.get(index)), alpha); 
        
        /*int[] puntosX = formas.get(index).xpoints;
        int[] puntosY = formas.get(index).ypoints;
        
        int centroX = formas.get(index).getBounds().x;
        int centroY = formas.get(index).getBounds().y;
        
        for(int i = 0; i < puntosX.length; i++){
            int x = puntosX[i] - centroX;
            int y = puntosY[i] - centroY;
            
            int newX = centroX + (int) (x * Math.cos(alpha) - y * Math.sin(alpha));
            int newY = centroY + (int) (x * Math.sin(alpha) + y * Math.cos(alpha));
            
            puntosX[i] = newX;
            puntosY[i] = newY;
        }*/
        
        formas.remove(index);
        formas.add(index,crearPolygonos(matrizRotacion));
        //formas.add(index,new Polygon(puntosX,puntosY,puntosX.length));        
        repaint();
    }//GEN-LAST:event_btnrotacionActionPerformed

    private void btnDibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDibujarActionPerformed
        draw(formas.get(formas.size() - 1));
        contador = 0;
        fillcombo();
    }//GEN-LAST:event_btnDibujarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        formas.clear();
        contador = 0;
        repaint();
        combopoligonos.removeAllItems();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void combopoligonosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combopoligonosItemStateChanged
        if(combopoligonos.getItemCount() > 0){
            Graphics g = getGraphics();
            g.drawPolygon(formas.get(combopoligonos.getSelectedIndex()));
        }
    }//GEN-LAST:event_combopoligonosItemStateChanged

    private void btntraslacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntraslacionActionPerformed
        int moveX = Integer.parseInt(txtaumentox.getText());
        int moveY = Integer.parseInt(txtaumentoy.getText());
        
        int index = combopoligonos.getSelectedIndex();
        
        int[] puntosX = formas.get(index).xpoints;
        int[] puntosY = formas.get(index).ypoints;
        
        int centroX = formas.get(index).getBounds().x;
        int centroY = formas.get(index).getBounds().y;
        
        for(int i = 0; i < puntosX.length; i++){
            int x = puntosX[i] - centroX;
            int y = puntosY[i] - centroY;
            
            int newX = centroX + x + moveX;
            int newY = centroY + y - moveY;
            
            puntosX[i] = newX;
            puntosY[i] = newY;
        }
        formas.remove(index);
        formas.add(index,new Polygon(puntosX,puntosY,puntosX.length));        
        repaint();
    }//GEN-LAST:event_btntraslacionActionPerformed

    private void txtrazonyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrazonyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrazonyActionPerformed

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for(int i = 0; i < formas.size(); i++){
            g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
            g.fillPolygon(formas.get(i));
        }
    }
    
    public void draw(Polygon p){
        Graphics g = getGraphics();
        g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
        g.fillPolygon(formas.get(formas.size() - 1));
    }
    
    public void fillcombo() {
        combopoligonos.removeAllItems();        
        for (int i = 0; i < formas.size(); i++) {
            combopoligonos.addItem("Poligono " + (i + 1) + " No. Lados: " + formas.get(i).npoints);
        }        
    }
    
    public int[][] rotacion(int[][] matriz, int alpha) {
    int xCentro = 0;
    int yCentro = 0;
    int totalPuntos = matriz[0].length;
    for (int i = 0; i < totalPuntos; i++) {
        xCentro += matriz[0][i];
        yCentro += matriz[1][i];
    }
    xCentro /= totalPuntos;
    yCentro /= totalPuntos;

    return aplicarTraslacion(
      convertirInt(
        aplicarRotacion(
          aplicarTraslacion(matriz, -xCentro, -yCentro), alpha)), xCentro, yCentro);
  }
    
    public int[][] escalar(int[][] matriz, double x, double y) {
    //Puntos en X y Y de base para llevarlo al origen
    int xBase = matriz[0][0];
    int yBase = matriz[1][0];
    return aplicarTraslacion(
      convertirInt(
        aplicarEscalado(
          aplicarTraslacion(matriz, -xBase, -yBase), x, y)), xBase, yBase);
  }
    public double[][] aplicarEscalado(int[][] matriz, double esX, double esY) {
    double[][] tmp = new double[matriz.length][matriz[0].length];
    //El orden del escalado sería
    //Devolver - Escalar - origen
    tmp = productoMatriz(generarMatrizEscalado(esX, esY), convertirDouble(matriz));
    return tmp;
  }
    
    public int[][] aplicarTraslacion(int[][] matriz, int valorX, int valorY) {

    int[][] tmpTrasladada = new int[matriz.length][matriz[0].length];

    tmpTrasladada = convertirInt(productoMatriz(convertirDouble(generarMatrizTraslacion(valorX, valorY)), convertirDouble(matriz)));

    return tmpTrasladada;
  }
    
    public double[][] aplicarRotacion(int[][] matriz, int angulo) {
    double[][] tmpRotada = new double[matriz.length][matriz[0].length]; //Matriz temporal para guardar los valores

    tmpRotada = productoMatriz(generarMatrizRotacion(angulo), convertirDouble(matriz));
    return tmpRotada; //Devolvemos la matriz
  }
    
    public Polygon crearPolygonos(int[][] matriz) {
    int[] arrX = new int[matriz[0].length];
    int[] arrY = new int[matriz[0].length];

    for (int i = 0; i < matriz[0].length; i++) {
//      tmp.addPoint((int) puntos.get(i).getX(), (int) puntos.get(i).getY());
      //Valores agregados correctamente considera que es [fila] [columna]
      arrX[i] = (int) matriz[0][i];
      arrY[i] = (int) matriz[1][i];
    }

    Polygon poligono = new Polygon(arrX, arrY, arrY.length);
    return poligono;
  }
    
    public double[][] productoMatriz(double[][] matrizA, double[][] matrizB) {
    //Filas
    //Matriz A
    int filaA = matrizA.length;
    //Matriz B
    int filaB = matrizB.length;
    //Columnas
    //Matriz A
    int columnaA = matrizA[0].length;
    //Matriz B
    int columnaB = matrizB[0].length;

    double[][] tmp = new double[filaA][columnaB];

    //Para todas las filas de A
    for (int i = 0; i < filaA; i++) {
      //Semultiplican por todas las columnas de B
      for (int j = 0; j < columnaB; j++) {
        //Obteniendo
        for (int k = 0; k < columnaA; k++) {
          tmp[i][j] += matrizA[i][k] * matrizB[k][j];
        }
      }
    }

    return tmp;
  }
    
   
    public int[][] generarMatriz(Polygon poligono) {
    int[][] matrizDelPoligono = new int[3][poligono.npoints];
    int[] pX = poligono.xpoints;
    int[] pY = poligono.ypoints;
    int total = poligono.npoints;
    
    for (int i = 0; i < total; i++) {
      matrizDelPoligono[0][i] = pX[i];
      matrizDelPoligono[1][i] = pY[i];
    }
    for (int i = 0; i < total; i++) {
      matrizDelPoligono[2][i] = 1;
    }
    return matrizDelPoligono;
  }
    
    public int[][] generarMatrizTraslacion(int trasX, int trasY) {
    int[][] tmp = new int[3][3];
    tmp[0][0] = 1;
    tmp[0][1] = 0;
    tmp[0][2] = trasX;
    tmp[1][0] = 0;
    tmp[1][1] = 1;
    tmp[1][2] = trasY;
    tmp[2][0] = 0;
    tmp[2][1] = 0;
    tmp[2][2] = 1;

    return tmp;
  }
    public double[][] generarMatrizEscalado(double escalaX, double escalaY) {
    double[][] escalado = new double[3][3];
    escalado[0][0] = escalaX;
    escalado[0][1] = 0;
    escalado[0][2] = 0;
    escalado[1][0] = 0;
    escalado[1][1] = escalaY;
    escalado[1][2] = 0;
    escalado[2][0] = 0;
    escalado[2][1] = 0;
    escalado[2][2] = 1;
    return escalado;
  }
    
    public int[][] convertirInt(double[][] matriz) {
    int[][] tmp = new int[matriz.length][matriz[0].length];
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        tmp[i][j] = (int) matriz[i][j];
      }
    }
    return tmp;
  }
    
    public double[][] convertirDouble(int[][] matriz) {
    double[][] tmp = new double[matriz.length][matriz[0].length];
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        tmp[i][j] = (double) matriz[i][j];
      }
    }
    return tmp;
  }
    
    public double[][] generarMatrizRotacion(int angulo) {
    double[][] rotacion = new double[3][3];
    rotacion[0][0] = Math.cos(Math.toRadians(angulo));
    rotacion[0][1] = -1 * Math.sin((Math.toRadians(angulo)));
    rotacion[0][2] = 0;
    rotacion[1][0] = Math.sin((Math.toRadians(angulo)));
    rotacion[1][1] = Math.cos(Math.toRadians(angulo));
    rotacion[1][2] = 0;
    rotacion[2][0] = 0;
    rotacion[2][1] = 0;
    rotacion[2][2] = 1;
    return rotacion;
  }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDibujar;
    private javax.swing.JButton btnescalamiento;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnrotacion;
    private javax.swing.JButton btntraslacion;
    private javax.swing.JComboBox<String> combopoligonos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtangulo;
    private javax.swing.JTextField txtaumentox;
    private javax.swing.JTextField txtaumentoy;
    private javax.swing.JTextField txtrazonx;
    private javax.swing.JTextField txtrazony;
    // End of variables declaration//GEN-END:variables
}
