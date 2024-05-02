package calculadora;

/**
 *
 * @author JSBG 02220132018
*/
public class Calculadora extends javax.swing.JFrame {
     String numero1;
     String signo;
     String numero2;
 
    public Calculadora() {
        initComponents();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cero = new javax.swing.JButton();
        division = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        textoresultado = new javax.swing.JTextField();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        resultado1 = new javax.swing.JButton();
        cerocero = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 839, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(350, 520));

        cero.setBackground(new java.awt.Color(204, 204, 255));
        cero.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        cero.setForeground(new java.awt.Color(51, 0, 51));
        cero.setText("0");
        cero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });

        division.setBackground(new java.awt.Color(204, 204, 255));
        division.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        division.setForeground(new java.awt.Color(51, 0, 51));
        division.setText("/");
        division.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        uno.setBackground(new java.awt.Color(204, 204, 255));
        uno.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        uno.setForeground(new java.awt.Color(51, 0, 51));
        uno.setText("1");
        uno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        uno.setMaximumSize(new java.awt.Dimension(50, 50));
        uno.setMinimumSize(new java.awt.Dimension(50, 50));
        uno.setPreferredSize(new java.awt.Dimension(50, 50));
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        punto.setBackground(new java.awt.Color(204, 204, 255));
        punto.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        punto.setForeground(new java.awt.Color(51, 0, 51));
        punto.setText(".");
        punto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });

        tres.setBackground(new java.awt.Color(204, 204, 255));
        tres.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tres.setForeground(new java.awt.Color(51, 0, 51));
        tres.setText("3");
        tres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        tres.setMaximumSize(new java.awt.Dimension(50, 50));
        tres.setMinimumSize(new java.awt.Dimension(50, 50));
        tres.setPreferredSize(new java.awt.Dimension(50, 50));
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        multiplicacion.setBackground(new java.awt.Color(204, 204, 255));
        multiplicacion.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        multiplicacion.setForeground(new java.awt.Color(51, 0, 51));
        multiplicacion.setText("X");
        multiplicacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });

        dos.setBackground(new java.awt.Color(204, 204, 255));
        dos.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        dos.setForeground(new java.awt.Color(51, 0, 51));
        dos.setText("2");
        dos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        dos.setMaximumSize(new java.awt.Dimension(50, 50));
        dos.setMinimumSize(new java.awt.Dimension(50, 50));
        dos.setPreferredSize(new java.awt.Dimension(50, 50));
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        Resta.setBackground(new java.awt.Color(204, 204, 255));
        Resta.setFont(new java.awt.Font("Agency FB", 1, 90)); // NOI18N
        Resta.setForeground(new java.awt.Color(51, 0, 51));
        Resta.setText("-");
        Resta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });

        suma.setBackground(new java.awt.Color(204, 204, 255));
        suma.setFont(new java.awt.Font("Agency FB", 1, 60)); // NOI18N
        suma.setForeground(new java.awt.Color(51, 0, 51));
        suma.setText("+");
        suma.setToolTipText("");
        suma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        suma.setMaximumSize(new java.awt.Dimension(50, 50));
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        limpiar.setBackground(new java.awt.Color(204, 204, 255));
        limpiar.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        limpiar.setForeground(new java.awt.Color(51, 0, 51));
        limpiar.setText("AC");
        limpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        limpiar.setMaximumSize(new java.awt.Dimension(50, 50));
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        textoresultado.setBackground(new java.awt.Color(153, 153, 255));
        textoresultado.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        textoresultado.setForeground(new java.awt.Color(102, 0, 102));
        textoresultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textoresultado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));

        cuatro.setBackground(new java.awt.Color(204, 204, 255));
        cuatro.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        cuatro.setForeground(new java.awt.Color(51, 0, 51));
        cuatro.setText("4");
        cuatro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        cuatro.setMaximumSize(new java.awt.Dimension(50, 50));
        cuatro.setMinimumSize(new java.awt.Dimension(50, 50));
        cuatro.setPreferredSize(new java.awt.Dimension(50, 50));
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(204, 204, 255));
        cinco.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        cinco.setForeground(new java.awt.Color(51, 0, 51));
        cinco.setText("5");
        cinco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        cinco.setMaximumSize(new java.awt.Dimension(50, 50));
        cinco.setMinimumSize(new java.awt.Dimension(50, 50));
        cinco.setPreferredSize(new java.awt.Dimension(50, 50));
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        siete.setBackground(new java.awt.Color(204, 204, 255));
        siete.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        siete.setForeground(new java.awt.Color(51, 0, 51));
        siete.setText("7");
        siete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        siete.setMaximumSize(new java.awt.Dimension(50, 50));
        siete.setMinimumSize(new java.awt.Dimension(50, 50));
        siete.setPreferredSize(new java.awt.Dimension(50, 50));
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        ocho.setBackground(new java.awt.Color(204, 204, 255));
        ocho.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        ocho.setForeground(new java.awt.Color(51, 0, 51));
        ocho.setText("8");
        ocho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        ocho.setMaximumSize(new java.awt.Dimension(50, 50));
        ocho.setMinimumSize(new java.awt.Dimension(50, 50));
        ocho.setPreferredSize(new java.awt.Dimension(50, 50));
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        nueve.setBackground(new java.awt.Color(204, 204, 255));
        nueve.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        nueve.setForeground(new java.awt.Color(51, 0, 51));
        nueve.setText("9");
        nueve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        nueve.setMaximumSize(new java.awt.Dimension(50, 50));
        nueve.setMinimumSize(new java.awt.Dimension(50, 50));
        nueve.setPreferredSize(new java.awt.Dimension(50, 50));
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(204, 204, 255));
        seis.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        seis.setForeground(new java.awt.Color(51, 0, 51));
        seis.setText("6");
        seis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        seis.setMaximumSize(new java.awt.Dimension(50, 50));
        seis.setMinimumSize(new java.awt.Dimension(50, 50));
        seis.setPreferredSize(new java.awt.Dimension(50, 50));
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        resultado1.setBackground(new java.awt.Color(204, 204, 255));
        resultado1.setFont(new java.awt.Font("Agency FB", 1, 60)); // NOI18N
        resultado1.setForeground(new java.awt.Color(51, 0, 51));
        resultado1.setText("=");
        resultado1.setToolTipText("");
        resultado1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        resultado1.setMaximumSize(new java.awt.Dimension(50, 50));
        resultado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultado1ActionPerformed(evt);
            }
        });

        cerocero.setBackground(new java.awt.Color(204, 204, 255));
        cerocero.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        cerocero.setForeground(new java.awt.Color(51, 0, 51));
        cerocero.setText("00");
        cerocero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51), new java.awt.Color(51, 0, 51)));
        cerocero.setMaximumSize(new java.awt.Dimension(50, 50));
        cerocero.setMinimumSize(new java.awt.Dimension(50, 50));
        cerocero.setPreferredSize(new java.awt.Dimension(50, 50));
        cerocero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroceroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoresultado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cerocero, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(textoresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(punto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cerocero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
      
        textoresultado.setText(textoresultado.getText()+"3");
    }//GEN-LAST:event_tresActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        
        textoresultado.setText(textoresultado.getText()+"1");
    }//GEN-LAST:event_unoActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
      
        textoresultado.setText(textoresultado.getText()+"0");
    }//GEN-LAST:event_ceroActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        
        textoresultado.setText(textoresultado.getText()+"2");
    }//GEN-LAST:event_dosActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed

        textoresultado.setText("");
        
    }//GEN-LAST:event_limpiarActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
   
        if (!textoresultado.getText().equals("")){
            numero1=textoresultado.getText();
            signo="*";
            textoresultado.setText("");
        }
        
       
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
       
        if (!textoresultado.getText().equals("")){
            numero1=textoresultado.getText();
            signo="/";
            textoresultado.setText("");
        }
        
    }//GEN-LAST:event_divisionActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
      
        if (!textoresultado.getText().equals("")){
            numero1=textoresultado.getText();
            signo="-";
            textoresultado.setText("");
        }
        
    }//GEN-LAST:event_RestaActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        
        if (!textoresultado.getText().equals("")){
            numero1=textoresultado.getText();
            signo="+";
            textoresultado.setText("");
        }
      
    }//GEN-LAST:event_sumaActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
   
        String cadena;
        cadena=textoresultado.getText ();
        
        if (cadena.length()<=0){
            textoresultado.setText("0.");
        }
        else{
            if (!epunto(textoresultado.getText())) {
                textoresultado.setText(textoresultado.getText()+".");
            }
        }
        
    }//GEN-LAST:event_puntoActionPerformed
    public static boolean epunto(String cadena){
        boolean resultado;
        resultado=false;
        
        for (int i=0; i < cadena.length(); i++) {
            if (cadena.substring(i, i+1).equals(".")){
                resultado=true;
                break;
            }
        }
        return resultado;
    }
    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        // TODO add your handling code here:
        textoresultado.setText(textoresultado.getText()+"4");
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        // TODO add your handling code here:
        textoresultado.setText(textoresultado.getText()+"5");
    }//GEN-LAST:event_cincoActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
  
        textoresultado.setText(textoresultado.getText()+"7");
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
     
        textoresultado.setText(textoresultado.getText()+"8");
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
     
        textoresultado.setText(textoresultado.getText()+"9");
    }//GEN-LAST:event_nueveActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
    
        textoresultado.setText(textoresultado.getText()+"6");
    }//GEN-LAST:event_seisActionPerformed

    private void resultado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultado1ActionPerformed

        String resultado;
        numero2=textoresultado.getText();
        
        if (!numero2.equals("")){
            resultado=calculadora(numero1,numero2,signo);
            textoresultado.setText(resultado);       
        }
        
    }//GEN-LAST:event_resultado1ActionPerformed

    private void ceroceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroceroActionPerformed
        // TODO add your handling code here:
        textoresultado.setText(textoresultado.getText()+"00");
    }//GEN-LAST:event_ceroceroActionPerformed
    
    public static String calculadora(String memoria1,String memoria2,String signo){
    Double resultado=0.0;
    String respuesta;

    if (signo.equals("-")){
        resultado=Double.parseDouble (memoria1)-Double.parseDouble (memoria2);
    }
    if (signo.equals("+")){
        resultado=Double.parseDouble (memoria1)+Double.parseDouble (memoria2);
    }
    if (signo.equals("/")){
        resultado=Double.parseDouble (memoria1)/Double.parseDouble (memoria2);
    }
    if (signo.equals("*")){
        resultado=Double.parseDouble (memoria1)*Double.parseDouble (memoria2);
    }
     respuesta=resultado.toString();
     return respuesta;
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   
        java.awt.EventQueue.invokeLater(() -> {
            new Calculadora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Resta;
    private javax.swing.JButton cero;
    private javax.swing.JButton cerocero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton division;
    private javax.swing.JButton dos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton punto;
    private javax.swing.JButton resultado1;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton suma;
    private javax.swing.JTextField textoresultado;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
